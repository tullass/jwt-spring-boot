angular.module("JWTDemoApp").controller("prograController",
		function($scope, $http) {
			var urlb = 'http://localhost:8080/programaaa';
			$scope.d=new Date();

			$scope.programaa = {};
			var novo = function() {
				$scope.programaa = {};
			}
			$scope.create = function() {
				var metodo = 'POST';
				if ($scope.programaa.id) {
					metodo = 'PUT';
				}
				$http({
					method : metodo,
					url : urlb + '/',
					data : $scope.programaa
				}).then(function successCallback(response) {
					alert("Sucesso");
					$scope.programaalista();
					novo();

				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
			$scope.alterar = function(programaa) {
				$scope.programaa = programaa;
			};

			$scope.deletar = function(programaa) {
				$scope.programaa = programaa;

				$http({
					method : 'DELETE',
					url : urlb + '/delete/' + $scope.programaa.id,
				}).then(function successCallback(response) {
					alert("deletado");
					$scope.programaalista();
					novo();
				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
			$scope.programaalista = function() {
				$http({
					method : 'GET',
					url : urlb + '/listar',
				}).then(function successCallback(response) {
					$scope.lista = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.programaalista();

		});