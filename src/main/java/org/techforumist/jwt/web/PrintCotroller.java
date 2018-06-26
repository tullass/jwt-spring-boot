package org.techforumist.jwt.web;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;
import org.techforumist.jwt.service.PrintService;

@RestController
@RequestMapping("/p")
public class PrintCotroller {
	@Autowired
	private PrintService carService;

	@Autowired
	private DataSource dbsoruce;

	@Autowired
	private ApplicationContext applicationContext;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public Object index() {
		return carService.findAll();
	}

	@RequestMapping(value = "/pdf/{id}", method = RequestMethod.GET)
	public ModelAndView report(@PathVariable("id") Long id) {
		Long s = carService.find(id).getId().longValue();

		JasperReportsPdfView view = new JasperReportsPdfView();
		view.setUrl("classpath:/report/educacaoo.jrxml");
		view.setApplicationContext(applicationContext);
		view.setExposePathVariables(true);

		Map<String, Object> params = new HashMap<>();
		params.put("datasource", dbsoruce);
		params.put("whereParam",
				"SELECT contrato.`id`,\n" + "\tcontrato.`nome`,\n" + "\tcontrato.`apelido`\n"
						+ "\tINNER JOIN educacao ON contrato.educacao.`id`=educacao_id,\n"
						+ "\tINNER JOIN endereco ON contrato.endereco.`id`=endereco_id,\n"

						+ "FROM contrato WHERE contrato.`id` = " + s);
		System.out.println(s);
		System.out.println("parametros: " + params);

		return new ModelAndView(view, params);
	}

	// @RequestMapping(value = "reports/{id}", method = RequestMethod.GET)
	// @ResponseBody
	// public ModelAndView report1(@PathVariable("id") Long id) {
	// Long s = carService.find(id).getId();
	//
	// JasperReportsPdfView view = new JasperReportsPdfView();
	// view.setUrl("classpath:/report/reportxls.jrxml");
	// view.setApplicationContext(applicationContext);
	// Map<String, Object> params = new HashMap<>();
	// params.put("datasource", dbsoruce);
	// params.put("whereParam",
	// "SELECT contrato.`id` AS contrato_ID,\n"+
	// "\tcontrato.educacao.`descricao` AS contrato.educacao_DESCRICAO\n"
	// + "\tcontrato.`apelido` AS contrato_APELIDO\n"
	// + "FROM contrato WHERE contrato.`id` = " + s);
	// System.out.println(s);
	// return new ModelAndView(view, params);
	// }

	// @RequestMapping(path = "/pdf/{id}", method = RequestMethod.GET)
	// public ModelAndView report(@PathVariable("id") Integer id) {
	//
	// JasperReportsPdfView view = new JasperReportsPdfView();
	// view.setUrl("classpath:/report/report3.jrxml");
	// view.setApplicationContext(applicationContext);
	// view.setExposePathVariables(true);
	//
	// Map<String, Object> params = new HashMap<>();
	// params.put("datasource", dbsoruce);
	// params.put("whereParam", "SELECT cars.`ID` AS cars_ID,\n" +
	// "\tcars.`Name` AS cars_Name,\n"
	// + "\tcars.`PRICE` AS cars_PRICE\n" + "FROM cars WHERE cars.`ID` = id");
	// ;
	// return new ModelAndView(view, params);
	//
	// // return new ModelAndView(view);
	// }

}
