angular.module('JWTDemoApp').service('apagarPrestaaService',function($http){
	var urlb = 'http://localhost:8080/apagar';

	this.listar = function() {
		return $http.get(urlb + '/listar');
	};
	
	this.salvar = function(prestacao) {
		if (prestacao.id) {
			return $http.put(urlb, prestacao);
		} else {
			return $http.post(urlb + '/', prestacao);
		}
	};
});