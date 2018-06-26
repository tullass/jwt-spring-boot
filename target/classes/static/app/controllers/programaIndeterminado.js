var app = angular.module('JWTDemoApp');
app.controller('listaaController', function($scope,StudentService) {
	$scope.d=new Date();	
	$scope.pageNumber=5;	
		$scope.prestacao = [ {
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
		
		$scope.limpar = function(search) {
			$scope.search = {}

		};
		
		listar();
	function listar() {
		StudentService.listarPage().success(function(data) {
			$scope.items = data.content;

		});
	}; 
	
	

	
	$scope.exportToPdf = function() {	$scope.d=new Date();	

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
								.download("Programas_Indeterminado_Report.pdf");
					}
				});
			}

		});

angular.module('JWTDemoApp').service('StudentService',['$http', function ($http) {
	var urlb = 'http://localhost:8080/contrato';
var pageNumber=0;
    
    this.listarPage = function() {
		return $http.get(urlb+'/listarB?page='+pageNumber);
	};
	 
}]);
