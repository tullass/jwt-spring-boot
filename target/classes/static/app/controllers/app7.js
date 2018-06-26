angular.module("JWTDemoApp").controller("programaController",
		function($scope, $http) {
	var urlb = 'http://localhost:8080/programa';

					
	$scope.programa = {};
			var novo = function() {
				$scope.programa = {};
			}
			$scope.create = function() {
				var metodo = 'POST';
				if ($scope.programa.id) {
					metodo = 'PUT';
				}
				$http({
					method : metodo,
					url : urlb + '/',
					data : $scope.programa
				}).then(function successCallback(response) {
					alert("Sucesso");
					$scope.programalista();
					novo();

				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
	$scope.alterar = function(programa) {
		$scope.programa = programa;
	};

	$scope.deletar = function(programa) {
		$scope.programa = programa;

		$http({
			method : 'DELETE',
			url : urlb + '/delete/' + $scope.programa.id,
		}).then(function successCallback(response) {
			alert("deletado");
			$scope.programalista();
			novo();
		}, function errorCallback(response) {
			alert("Erro");
			console.log(response);
		});
	};
	$scope.programalista = function() {
		$http({
			method : 'GET',
			url : urlb + '/listar',
		}).then(function successCallback(response) {
			$scope.lista = response.data;
		}, function errorCallback(response) {
		});
	};
	$scope.programalista();

		});