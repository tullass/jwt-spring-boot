angular.module("JWTDemoApp").controller("areaaController",
		function($scope, $http) {
			var urlb = 'http://localhost:8080/areaa';

			$scope.areaa = {};
			var novo = function() {
				$scope.areaa = {};
			}
			$scope.create = function() {
				var metodo = 'POST';
				if ($scope.areaa.id) {
					metodo = 'PUT';
				}
				$http({
					method : metodo,
					url : urlb + '/',
					data : $scope.areaa
				}).then(function successCallback(response) {
					alert("Sucesso");
					$scope.areaalista();
					novo();

				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
			$scope.alterar = function(areaa) {
				$scope.areaa = areaa;
			};

			$scope.deletar = function(areaa) {
				$scope.areaa = areaa;

				$http({
					method : 'DELETE',
					url : urlb + '/delete/' + $scope.areaa.id,
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