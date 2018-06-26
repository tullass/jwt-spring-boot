angular.module('JWTDemoApp').controller('listaController',
		function($scope,datasContrato) {
	$scope.d=new Date();	
	$scope.pageNumber=5;	
	$scope.prestacao=[];
	
	$scope.prestacao=datasContrato.prestacaoe;
		
		listar();
		function listar() {
			datasContrato.listarPage().success(function(data) {
				$scope.items = data.content;

			});
		}; $scope.limpar = function(search) {
			$scope.search = {}

		}
		
		listarPronv();
		function listarPronv() {
			datasContrato.listarDepartament().then(function(resp) {
				$scope.depart = resp.data;
			});
		};
		
	$scope.exportToPdf = function() {	
				html2canvas(document.getElementById('customers'), {
					onrendered : function(canvas) {
						var data = canvas.toDataURL();
						var docDefinition = {
							content : [ {
								image : data,
								width : 550,
							} ]
						};
						pdfMake.createPdf(docDefinition)
								.download("Gerais_Indeterminado_Report.pdf");
					}
				});
			};

		});

