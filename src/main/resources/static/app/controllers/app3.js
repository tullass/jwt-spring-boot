angular.module("JWTDemoApp").controller("apagarController",
		function($scope, apagarService) {

			function novo() {
				$scope.contrato = {};
			}
			listar();
			function listar() {
				apagarService.listar().then(function(resp) {
					$scope.listaa = resp.data;
				});
			}
			;
			$scope.create = function(contrato) {
				apagarService.salvar(contrato).then(listar);
				novo();
			};

			$scope.alterar = function(contrato) {
				$scope.contrato = contrato;
			};

		});
