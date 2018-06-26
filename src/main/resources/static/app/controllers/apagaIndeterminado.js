angular.module("JWTDemoApp").controller("apagarIndeterminadoController",
		function($scope, apagarrService) {

			function novo() {
				$scope.contrato = {};
			}
			listar();
			function listar() {
				apagarrService.listarPage().success(function(data) {
					$scope.activoscontratos = data.content;

				});
			}; 
			
			$scope.alterar=function(contrato){
				$scope.contrato=contrato;
			};
			$scope.create = function(contrato) {
				apagarrService.salvar(contrato).then(function(resp){	

					alert("Sucess");			
					novo();
				},
					function errorCallback(response) {
					alert("Houve um erro");
					console.log(response);
					
				});
			};
		});
