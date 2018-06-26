angular.module("JWTDemoApp").controller(
		"periodoController",
		function($scope, $http, $filter) {
			var urlb = 'http://localhost:8080/periodo';

			$scope.produceList=[];
			$scope.d=new Date();
			$scope.contratolista = function() {
				$http({
					method : 'GET',
					url : urlb + '/listar',
				}).then(function successCallback(response) {
					$scope.produceList = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.contratolista();
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
					message =days + ' diassss ';
				} else if (years < 0 && months < 0) {
					message = "passado";
				} else {
					message = "futuro";

				}
			    return message
			};
			$scope.getExp = function(date) {
				date = new Date($filter('date')(date, "yyyy/MM/dd"));
				var currdate = new Date($filter('date')(new Date(), "yyyy/MM/dd"));
				new Date().getFullYear()
				var exp = $scope.CalDate(date, currdate);
				console.log(exp);
				return exp;
			}
		 });