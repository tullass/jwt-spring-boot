angular.module("JWTDemoApp").controller("inativePrestaaController",
		function($scope, inativePrestaaService) {

			function novo() {
				$scope.Prestacao = {};
			}
			listar();
			function listar() {
				inativePrestaaService.listar().then(function(resp) {
					$scope.listaa = resp.data;
				});
			}
			;
			$scope.create = function(Prestacao) {
				inativePrestaaService.salvar(Prestacao).then(listar);
				novo();
			};

			$scope.alterar = function(Prestacao) {
				alert("Opssss: Funcionalidade nao Implementada");
			};

		});
