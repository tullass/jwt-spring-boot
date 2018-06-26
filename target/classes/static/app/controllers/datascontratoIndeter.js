angular.module("JWTDemoApp").controller(
		'filltcontroller',
		function($scope,datasContrato) {
			$scope.d = new Date();
			$scope.record = [];
			$scope.de = '2017-01-05';
			$scope.ate = '2028-08-05';
			$scope.pageNumber = 5;

			$scope.prestacao = datasContrato.prestacaoe;

			listar();
			function listar() {
				datasContrato.listarPage().success(function(data) {
					$scope.record = data.content;
				});
			}
			;

			listarPronv();
			function listarPronv() {
				datasContrato.listarProvincia().then(function(resp) {
					$scope.pronviciass = resp.data;
				});
			}
			;

			$scope.limpar = function(search) {
				$scope.search = {}

			}

			$scope.exportToPdf = function() {
				datasContrato.exportPdf().then(function(resp) {
				});
			};
			

		}).filter('dateRangerrr', function() {
	return function(recor, de, ate) {
		return recor.filter(function(record) {
			return record.datafim >= de && record.datafim <= ate;
		});
	}
});
