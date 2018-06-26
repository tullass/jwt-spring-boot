angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller(
		'HomeController',
		function($filter, $scope, datasPrestacaoo, datasConsultor, AuthService,
				datasContrato) {
			$scope.user = AuthService.user;
$scope.maximo=6;
			listarr();
			function listarr() {
				datasContrato.listarPage().success(function(data) {
					$scope.records = data.content;
				});
			}
			;
			listarPre();
			function listarPre() {
				datasPrestacaoo.listarPage().success(function(data) {
					$scope.presta = data.content;
				});
			}
			;

			listar();
			function listar() {
				datasConsultor.listarPage().success(function(data) {
					$scope.record = data.content;

				});
			}
			;
			$scope.dateFilter = function ($scope) {
		        var d = new Date();
				futureTime = new Date(Date.now() + 1000 * 60 * 60 * 24 * 33);
		        return (Date.parse($scope.datafim) > Date.parse(d)&&Date.parse($scope.datafim)<futureTime);
			}	

			$scope.CalDate = function(date1, date2) {

				var diff = Math.floor(date1.getTime() - date2.getTime());
				var secs = Math.floor(diff / 1000);
				var mins = Math.floor(secs / 60);
				var hours = Math.floor(mins / 60);
				var days = Math.floor(hours / 24);

				var months = Math.floor(days / 31);
				var years = Math.floor(months / 12);
				months = Math.floor(months % 12);
				days = Math.floor(days % 31);
				hours = Math.floor(hours % 24);
				mins = Math.floor(mins % 60);
				secs = Math.floor(secs % 60);
				var message = "";
				if (years === 0 && months === 0) {
					message = days + ' dias ';
				} else if (years < 0 && months < 0) {
					message = "passado";
				} else {
					message = "futuro";

				}
				return message
			};
			$scope.getExp = function(date) {
				date = new Date($filter('date')(date, "yyyy/MM/dd"));
				var currdate = new Date($filter('date')(new Date(),
						"yyyy/MM/dd"));
				new Date().getFullYear()
				var exp = $scope.CalDate(date, currdate);
				console.log(exp);
				return exp;
			}

		});
