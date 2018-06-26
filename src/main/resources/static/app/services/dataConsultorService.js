angular.module('JWTDemoApp').service('datasConsultor', function($http) {
	var urlb = 'http://localhost:8080/consultor';
	var pageNumber=0;
	    
	
	this.listarPage = function() {
		return $http.get( urlb+ '/listarB?page='+pageNumber);
	};
	
	this.listarDepartament = function() {
		return $http.get(urlb + '/departamento');
	};
	
	this.listarProvincia = function() {
		return $http.get(urlb + '/userr/pronvicia');
	};
	
	this.prestacaoe = [ {
		nome : '5',
		pageNumber : 5
	}, {
		nome : '10',
		pageNumber : 10
	}, {
		nome : '20',
		pageNumber : 20
	}, {
		nome : '50',
		pageNumber : 50
	}, {
		nome : '100',
		pageNumber : 100
	}];
	
	this.exportPdf = function() {
		html2canvas(document.getElementById('customers'), {
			onrendered : function(canvas) {
				var data = canvas.toDataURL();
				var docDefinition = {
					content : [ {
						image : data,
						width : 500,
					} ]
				};
				pdfMake.createPdf(docDefinition)
						.download("datas_contrato_indeterminado.pdf");
			}
		});
	}
});