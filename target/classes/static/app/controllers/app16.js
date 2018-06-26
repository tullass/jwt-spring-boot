angular.module("JWTDemoApp").controller("consultorController",
		function($scope, servicesConsultor, $state, $stateParams) {

			$scope.consultor = {};
			$scope.stage = "";
			$scope.birthdate = new Date();
			$scope.consultor.datanascimento = new Date('yyyy/MM/dd');
			$scope.birthdate = new Date('yyyy/MM/dd');
			$scope.ches = function ches(myVar) {
				if ($scope.myVar == false) {
					$scope.myVar = true;
				} else {
					$scope.myVar = false;
				}

			}
			
			var id = $stateParams.consultorId;
			if (id) {
				servicesConsultor.getConsultor(id).then(function(response) {
					$scope.consultor = response.data;
				});
			} else {
				$scope.consultor = {};

			}
//			$scope.dd = function() {
//				$scope.consultor.datafim = new Date();
//
//				$scope.consultor.datainicio = $scope.consultor.datafim.setDate($scope.consultor.datafim.getDate() * 1
//						+ $scope.consultor.periodo * 1);
//			}
			$scope.add=function(){if($scope.consultor.datafim!=null||$scope.consultor.datafim!=0){
				$scope.consultor.datainiciostring=$scope.consultor.datainicio;
				$scope.consultor.datafimstring=$scope.consultor.datainiciostring
				}else{
						
					}
					};
			$scope.prestacao = [ {
				nome : '3 Meses',
				valuei : 90
			}, {
				nome : '6 Meses',
				valuei : 180
			}];
			console.log($stateParams.consultorId);
			$scope.calculateAge = function calculateAge(birthday) { // birthday
				// is a date
				try{
				var ageDifMs = Date.now() - birthday.getTime();
				var ageDate = new Date(ageDifMs); // miliseconds from epoch
				var s = Math.abs(ageDate.getUTCFullYear() - 1970);

				var msg = 'anos de Idade';

				$scope.consultor.idade = s;
				$scope.consultor.datanascimento = $scope.birthdate;

				if (s < 2) {
					return "verifique a idade";
				}
				return s + ' ' + msg;
			
				}catch(err){
					console.log('somethings wont wrong but we got  this');
				}
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
				$scope.consultor = {};
				$scope.stage = "";
			}
			function novo() {
				$scope.consultor = {};
				$scope.birthdate='';
			}
			
			$scope.create = function(consultor) {
				servicesConsultor.salvar(consultor).then(function(resp){	

					alert("Sucess");			
					novo();
					$scope.reset();
				},
					function errorCallback(response) {
					alert("Houve um erro ao cadastratar");
					
				});
			};

			

			listar();
			function listar() {
				servicesConsultor.listar().then(function(resp) {
					$scope.listaa = resp.data;
				});
			};
			
			listarSup();
			function listarSup() {
				servicesConsultor.listarSupervisor().then(function(resp) {
					$scope.supervisores = resp.data;
				});
			};
			
			listarGest();
			function listarGest() {
				servicesConsultor.listarGestor().then(function(resp) {
					$scope.gestores = resp.data;
				});
			};
			
			listarPosi();
			function listarPosi() {
				servicesConsultor.listarPosiccao().then(function(resp) {
					$scope.posicaoes = resp.data;
				});
			};
			
			listarEduc();
			function listarEduc() {
				servicesConsultor.listarEducacao().then(function(resp) {
					$scope.educacaoes = resp.data;
				});
			};
			
			listarDep();
			function listarDep() {
				servicesConsultor.listarDepartamento().then(function(resp) {
					$scope.departamentos = resp.data;
				});
			};
			
			listarProg();
			function listarProg() {
				servicesConsultor.listarPrograma().then(function(resp) {
					$scope.programass = resp.data;
				});
			};
			listarCi();
			function listarCi() {
				servicesConsultor.listarCivil().then(function(resp) {
					$scope.ecivil = resp.data;
				});
			};
			listarCat();
			function listarCat() {
				servicesConsultor.listarCategoria().then(function(resp) {
					$scope.cats = resp.data;
				});
			};
			listarPar();
			function listarPar() {
				servicesConsultor.listarParentes().then(function(resp) {
					$scope.pars = resp.data;
				});
			};
			listarNiv();
			function listarNiv() {
				servicesConsultor.listarNivel().then(function(resp) {
					$scope.sals = resp.data;
				});
			};
			listarPronv();
			function listarPronv() {
				servicesConsultor.listarProvincia().then(function(resp) {
					$scope.pronvicias = resp.data;
				});
			};
				$scope.limpar = function() {
				$scope.consultor.programa.p1 = "";
						$scope.consultor.programa.p2 = "";
						$scope.consultor.programa.p3 = "";
						$scope.consultor.programa.p4 = "";
						$scope.consultor.programa.p5 = "";
						$scope.consultor.programa.p6 = "";
				
			}
			

		});