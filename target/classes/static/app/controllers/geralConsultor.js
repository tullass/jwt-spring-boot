var app = angular.module('JWTDemoApp');
		app.controller('listacController', function($scope,datasConsultor)  {
			$scope.d=new Date();	
			$scope.pageNumber=5;	
			$scope.prestacao=[];
			
			$scope.prestacao=datasConsultor.prestacaoe;
				
				listar();
				function listar() {
					datasConsultor.listarPage().success(function(data) {
						$scope.items = data.content;

					});
				}; 
				
				listarPronv();
				function listarPronv() {
					datasConsultor.listarDepartament().then(function(resp) {
						$scope.depart = resp.data;
					});
				};
				$scope.limpar = function(search) {
					$scope.search = {}

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
										.download("Gerais_Consultor_Report.pdf");
							}
						});
					};

				});

