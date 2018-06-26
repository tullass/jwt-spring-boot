angular.module("JWTDemoApp").controller("posiccaoController",
		function($scope, $http) {
	var urlb = 'http://localhost:8080/posiccao';

	$scope.posiccao = {};
	var novo = function() {
		$scope.posiccao = {};
	}
	$scope.create = function() {
		var metodo = 'POST';
		if ($scope.posiccao.id) {
			metodo = 'PUT';
		}
		$http({
			method : metodo,
			url : urlb + '/',
			data : $scope.posiccao
		}).then(function successCallback(response) {
			alert("Sucesso");
			$scope.posiccaolista();
			novo();

		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.alterar = function(posiccao) {
		$scope.posiccao = posiccao;
	};

	$scope.deletar = function(posiccao) {
		$scope.posiccao = posiccao;

		$http({
			method : 'DELETE',
			url : urlb + '/delete/' + $scope.posiccao.id,
		}).then(function successCallback(response) {
			alert("deletado");
			$scope.posiccaolista();
			novo();
		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.posiccaolista = function() {
		$http({
			method : 'GET',
			url : urlb + '/listar',
		}).then(function successCallback(response) {
			$scope.lista = response.data;
		}, function errorCallback(response) {
		});
	};
	$scope.posiccaolista();

		});