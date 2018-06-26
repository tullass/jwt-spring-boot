angular.module("JWTDemoApp").controller("supervisorController",
		function($scope, $http) {
	var urlb = 'http://localhost:8080/supervisor';


	$scope.supervisor = {};
	var novo = function() {
		$scope.supervisor = {};
	}
	$scope.create = function() {
		var metodo = 'POST';
		if ($scope.supervisor.id) {
			metodo = 'PUT';
		}
		$http({
			method : metodo,
			url : urlb + '/',
			data : $scope.supervisor
		}).then(function successCallback(response) {
			alert("Sucesso");
			$scope.supervisorlista();
			novo();

		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.alterar = function(supervisor) {
		$scope.supervisor = supervisor;
	};

	$scope.deletar = function(supervisor) {
		$scope.supervisor = supervisor;

		$http({
			method : 'DELETE',
			url : urlb + '/delete/' + $scope.supervisor.id,
		}).then(function successCallback(response) {
			alert("deletado");
			$scope.supervisorlista();
			novo();
		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.supervisorlista = function() {
		$http({
			method : 'GET',
			url : urlb + '/listar',
		}).then(function successCallback(response) {
			$scope.lista = response.data;
		}, function errorCallback(response) {
		});
	};
	$scope.supervisorlista();

		});