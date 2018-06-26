angular.module("JWTDemoApp").controller("apagarPrestaController",
		function($scope, apagarPrestaaService) {

			function novo() {
				$scope.prestacao = {};
			}
		
			listar();
			function listar() {
				apagarPrestaaService.listar().then(function(resp) {
					$scope.listaa = resp.data;
				});
			}
			;
			$scope.create = function(prestacao) {
				apagarPrestaaService.salvar(prestacao).then(listar);
				novo();
			};

			$scope.alterar = function(prestacao) {
				$scope.prestacao = prestacao;
			};

		});
