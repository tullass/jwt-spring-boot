angular.module('JWTDemoApp').service('apagarrService',function($http){
	var urlb = 'http://localhost:8080/listaa';
	var pageNumber=0;

	this.listarPage = function() {
		return $http.get( urlb+ '/listarV?page='+pageNumber);
	};
	
	
	this.salvar = function(contrato) {
		if (contrato.id) {
			return $http.put(urlb, contrato);
		} else {
			return $http.post(urlb + '/inativa', contrato);
		}
	};
});