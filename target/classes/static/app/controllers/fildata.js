angular.module("JWTDemoApp").controller(
		'fillpcontroller',
		function($scope, datasPrestacaoo) {
			$scope.d = new Date();
			$scope.prestacao=[];
			$scope.de = '2017-01-05';
			$scope.ate = '2028-08-05';
			$scope.pageNumber=5;	

			$scope.prestacao=datasPrestacaoo.prestacaoe;

			
			
			
			listar();
		function listar() {
			datasPrestacaoo.listarPage().success(function(data) {
				$scope.record = data.content;
			});
		}; 
		
		listarPronv();
		function listarPronv() {
			datasPrestacaoo.listarProvincia().then(function(resp) {
				$scope.pronviciass = resp.data;
			});
		};

			$scope.limpar = function(search) {
				$scope.search = {}

			}
			
			$scope.exportToPdf=function() {
				datasPrestacaoo.exportPdf().then(function(resp) {
				});
			};

		}).filter('dateRangerrr', function() {

	return function(record, de, ate) {
		if (de && ate) {
			var filtered = [];
			angular.forEach(record, function(items) {
				if (items.datainicio >= de && items.datainicio <= ate)
					filtered.push(items);
			});
			return filtered;
		} else
			return record;

	}
});
