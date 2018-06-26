angular.module("JWTDemoApp");
angular.module("JWTDemoApp").controller("departamentoController",
		function($scope, $http) {
			var urlb = 'http://localhost:8080/departamento';

			$scope.departamento = {};
			var novo = function() {
				$scope.departamento = {};
			}
			$scope.create = function() {
				var metodo = 'POST';
				if ($scope.departamento.id) {
					metodo = 'PUT';
				}
				$http({
					method : metodo,
					url : urlb + '/',
					data : $scope.departamento
				}).then(function successCallback(response) {
					alert("Sucesso");
					$scope.areaalista();
					novo();

				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
			$scope.alterar = function(departamento) {
				$scope.departamento = departamento;
			};

			$scope.deletar = function(departamento) {
				$scope.departamento = departamento;

				$http({
					method : 'DELETE',
					url : urlb + '/delete/' + $scope.departamento.id,
				}).then(function successCallback(response) {
					alert("deletado");
					$scope.areaalista();
					novo();
				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
			$scope.areaalista = function() {
				$http({
					method : 'GET',
					url : urlb + '/listar',
				}).then(function successCallback(response) {
					$scope.lista = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.areaalista();

		});