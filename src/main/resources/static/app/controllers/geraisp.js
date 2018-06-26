var app = angular.module('JWTDemoApp');
app.controller('listapController',
		function($scope,  PrestacaoService) {
			$scope.d=new Date();	
			$scope.pageNumber=5;	
				
			$scope.prestacao = PrestacaoService.prestacaoe;
				
				
				
				listar();
			function listar() {
				PrestacaoService.listarPage().success(function(data) {
					$scope.itemsps = data.content;

				});
			}; 
			
			listarPronv();
			function listarPronv() {
				PrestacaoService.listae().then(function(resp) {
					$scope.progr = resp.data;
				});
			};
			
			$scope.limpar=function(){
				$scope.search='';
			}
			
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
								pdfMake.createPdf(docDefinition).download("Gerais_Prestacao_Report.pdf");
							}
						});
					}

				});

		angular.module('JWTDemoApp').service('PrestacaoService',['$http', function ($http) {
			var urlb = 'http://localhost:8080/prestacao';
		var pageNumber=0;
		    
		    this.listarPage = function() {
				return $http.get(urlb+'/listarB?page='+pageNumber);
			};
			
			 this.listae = function() {
					return $http.get(urlb + '/programaaaa');
				};
				
				this.prestacaoe = [ {
					nome : '5',
					pageNumber : 5
				}, {
					nome : '10',
					pageNumber : 10
				}, {
					nome : '20',
					pageNumber : 20
				}, {
					nome : '50',
					pageNumber : 50
				}, {
					nome : '100',
					pageNumber : 100
				}];
				
				
		}]);
