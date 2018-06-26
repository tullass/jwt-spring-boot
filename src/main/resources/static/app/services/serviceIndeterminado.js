angular.module('JWTDemoApp').service('serviceContrato', function($http) {
	var urlb = 'http://localhost:8080/contrato';

	this.salvar = function(contrato) {
		if (contrato.id) {
			return $http.put(urlb, contrato);
		} else {
			return $http.post(urlb + '/', contrato);
		}
	};

	this.getContrato = function(id) {
		return $http.get(urlb + '/a/' + id);
	};
	this.listar = function() {
		return $http.get(urlb + '/listar');
	};
	this.listarSupervisor = function() {
		return $http.get(urlb + '/supervisor');
	};

	this.listarGestor = function() {
		return $http.get(urlb + '/gestor');
	};
	this.listarPosiccao = function() {
		return $http.get(urlb + '/posiccao');
	};
	this.listarEducacao = function() {
		return $http.get(urlb + '/educacao');
	};
	this.listarPrograma = function() {
		return $http.get(urlb + '/programa');
	};
	this.listarDepartamento = function() {
		return $http.get(urlb + '/departamento');
	};

	this.listarProvincia = function() {
		return $http.get(urlb + '/userr/pronvicia');
	};

	this.listarCivil = function() {
		return $http.get(urlb + '/user/civil');
	};
	this.listarCategoria = function() {
		return $http.get(urlb + '/userc/categotia');
	};
	this.listarParentes = function() {
		return $http.get(urlb + '/userp/parentes');
	};
	this.listarNivel = function() {
		return $http.get(urlb + '/users/salarial');
	};

});