angular.module("JWTDemoApp").controller("apagarInativoController",
		function($scope, inativeContratoService) {

			function novo() {
				$scope.contrato = {};
			}
			listar();
			function listar() {
				inativeContratoService.listarPage().success(function(data) {
					$scope.inativocontratos = data.content;

				});
			}; 
			;
			$scope.create = function(contrato) {
				inativeContratoService.salvar(contrato).then(listar());
				novo();
			};

			$scope.salvaInativa = function(contrato) {
				inativeContratoService.salvarInativa(contrato).then(listar);
				novo();
			};

			$scope.prestacao=inativeContratoService.prestacaoe;

		});
