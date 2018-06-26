angular.module("JWTDemoApp").controller("gestorController", function($scope, $http) {
	var urlb = 'http://localhost:8080/gestor';

	$scope.gestor = {};
	var novo = function() {
		$scope.gestor = {};
	}
	$scope.create = function() {
		var metodo = 'POST';
		if ($scope.gestor.id) {
			metodo = 'PUT';
		}
		$http({
			method : metodo,
			url : urlb + '/',
			data : $scope.gestor
		}).then(function successCallback(response) {
			alert("Sucesso");
			$scope.gestorlista();
			novo();

		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.alterar = function(gestor) {
		$scope.gestor = gestor;
	};

	$scope.deletar = function(gestor) {
		$scope.gestor = gestor;

		$http({
			method : 'DELETE',
			url : urlb + '/delete/' + $scope.gestor.id,
		}).then(function successCallback(response) {
			alert("deletado");
			$scope.gestorlista();
			novo();
		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.gestorlista = function() {
		$http({
			method : 'GET',
			url : urlb + '/listar',
		}).then(function successCallback(response) {
			$scope.lista = response.data;
		}, function errorCallback(response) {
		});
	};
	$scope.gestorlista();
});