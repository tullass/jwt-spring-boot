//package org.techforumist.jwt.web;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;
//
//import com.Sample.Service.CarService;
//
//@RestController
//@RequestMapping("t")
//public class CarCtrl {
//
//	@Autowired
//	private CarService carService;
//
//	@Autowired
//	private ApplicationContext applicationContext;
//
//	@RequestMapping(value = "reports", method = RequestMethod.GET)
//	@ResponseBody
//	public ModelAndView report1() {
//		JasperReportsPdfView view = new JasperReportsPdfView();
//		view.setUrl("classpath:/report/teste2.jrxml");
//		view.setApplicationContext(applicationContext);
//		Map<String, Object> params = new HashMap<>();
//		params.put("datasource", carService.report());
//		return new ModelAndView(view, params);
//	}
//
//}
