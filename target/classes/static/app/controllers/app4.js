angular.module("JWTDemoApp").controller("educacaoController",
		function($scope, $http) {
	var urlb = 'http://localhost:8080/educacao';

	$scope.educacao = {};
	var novo = function() {
		$scope.educacao = {};
	}
	$scope.create = function() {
		var metodo = 'POST';
		if ($scope.educacao.id) {
			metodo = 'PUT';
		}
		$http({
			method : metodo,
			url : urlb + '/',
			data : $scope.educacao
		}).then(function successCallback(response) {
			alert("Sucesso");
			$scope.educacaolista();
			novo();

		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.alterar = function(educacao) {
		$scope.educacao = educacao;
	};

	$scope.deletar = function(educacao) {
		$scope.educacao = educacao;

		$http({
			method : 'DELETE',
			url : urlb + '/delete/' + $scope.educacao.id,
		}).then(function successCallback(response) {
			alert("deletado");
			$scope.educacaolista();
			novo();
		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.educacaolista = function() {
		$http({
			method : 'GET',
			url : urlb + '/listar',
		}).then(function successCallback(response) {
			$scope.lista = response.data;
		}, function errorCallback(response) {
		});
	};
	$scope.educacaolista();
		});