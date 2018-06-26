angular.module('JWTDemoApp').service('inativePrestaaService',function($http){
	var urlb = 'http://localhost:8080/prestainative';

	this.listar = function() {
		return $http.get(urlb + '/listarinat');
	};
	
	this.salvar = function(prestacao) {
		if (prestacao.id) {
			return $http.put(urlb, prestacao);
		} else {
			return $http.post(urlb + '/', prestacao);
		}
	};
});