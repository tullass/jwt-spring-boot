angular.module("JWTDemoApp").controller("prestacaoController",
		function($scope, $http) {
			var urlb = 'http://localhost:8080/prestacao';
			$scope.prestacao = {};
			$scope.stage = "";
			$scope.birthdate = new Date();
			$scope.prestacao.datanascimento = new Date('yyyy/MM/dd');

			$scope.birthdate = new Date('yyyy/MM/dd');
			$scope.ches = function ches(myVar) {
				if ($scope.myVar == false) {
					$scope.myVar = true;
				} else {
					$scope.myVar = false;
				}

			}
			$scope.calculateAge = function calculateAge(birthday) { // birthday
				// is a date
				var ageDifMs = Date.now() - birthday.getTime();
				var ageDate = new Date(ageDifMs); // miliseconds from epoch
				var s = Math.abs(ageDate.getUTCFullYear() - 1970);

				var msg = 'anos de Idade';

				$scope.prestacao.idade = s;
				$scope.prestacao.datanascimento = $scope.birthdate;

				if (s < 2) {
					return "verifique a idade";
				}
				return s + ' ' + msg;
			}
			$scope.next = function(stage) {
				// $scope.direction = 1;
				// $scope.stage = stage;

				$scope.formValidation = false;

				if ($scope.multiStepForm.$valid) {
					$scope.direction = 1;
					$scope.stage = stage;
					$scope.formValidation = false;
				}
			};

			$scope.back = function(stage) {
				$scope.direction = 0;
				$scope.stage = stage;
			};
			$scope.reset = function() {
				// Clean up scope before destorying
				$scope.prestacao = {};
				$scope.stage = "";
			}

			$scope.create = function() {
				var metodo = 'POST';
				if ($scope.prestacao.id) {
					metodo = 'PUT';
					$scope.prestacao = {};
				}
				$http({
					method : metodo,
					url : urlb + '/',
					data : $scope.prestacao
				}).then(function successCallback(response) {
					alert("sUCCESs");

					$scope.reset();
				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};

			$scope.suplistae = function() {
				$http({
					method : 'GET',
					url : urlb + '/supervisor',
				}).then(function successCallback(response) {
					$scope.supervisores = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.suplistae();
			$scope.ssuplistae = function() {
				$http({
					method : 'GET',
					url : urlb + '/gestor',
				}).then(function successCallback(response) {
					$scope.gestores = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.ssuplistae();
			$scope.departamentolistae = function() {
				$http({
					method : 'GET',
					url : urlb + '/departamento',
				}).then(function successCallback(response) {
					$scope.departamentos = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.departamentolistae();
			$scope.departamentolistaer = function() {
				$http({
					method : 'GET',
					url : urlb + '/posiccao',
				}).then(function successCallback(response) {
					$scope.posicaoes = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.departamentolistaer();

			$scope.areaalistae = function() {
				$http({
					method : 'GET',
					url : urlb + '/educacao',
				}).then(function successCallback(response) {
					$scope.educacaoes = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.areaalistae();

			$scope.areaalistadd = function() {
				$http({
					method : 'GET',
					url : urlb + '/programaaaa',
				}).then(function successCallback(response) {
					$scope.programass = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.areaalistadd();

			$scope.limpar = function() {
				$scope.prestacao = {};
			}

			$scope.genlista = function() {
				$http({
					method : 'GET',
					url : urlb + '/user/civil',
				}).then(function successCallback(response) {
					$scope.ecivil = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.genlista();
			$scope.catlista = function() {
				$http({
					method : 'GET',
					url : urlb + '/userc/categotia',
				}).then(function successCallback(response) {
					$scope.cats = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.catlista();
			$scope.parlista = function() {
				$http({
					method : 'GET',
					url : urlb + '/userp/parentes',
				}).then(function successCallback(response) {
					$scope.pars = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.parlista();
			$scope.sallista = function() {
				$http({
					method : 'GET',
					url : urlb + '/users/salarial',
				}).then(function successCallback(response) {
					$scope.sals = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.sallista();

			$scope.sallistas = function() {
				$http({
					method : 'GET',
					url : urlb + '/userr/pronvicia',
				}).then(function successCallback(response) {
					$scope.pronvicias = response.data;
				}, function errorCallback(response) {
				});
			};
			$scope.sallistas();

		});