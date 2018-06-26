angular.module('JWTDemoApp').service('apagaInativorService',function($http){
	var urlb = 'http://localhost:8080/apagar';

	this.listar = function() {
		return $http.get(urlb + '/listarinat');
	};
	
	this.salvar = function(contrato) {
		if (contrato.id) {
			return $http.put(urlb, contrato);
		} else {
			return $http.post(urlb + '/', contrato);
		}
	};
});