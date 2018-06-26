angular.module("JWTDemoApp").controller("contratoController",
		function($scope, serviceContrato, $state, $stateParams) {

			$scope.contrato = {};
			$scope.stage = "";
			$scope.birthdate = new Date();
			$scope.contrato.datanascimento = new Date('yyyy/MM/dd');
			$scope.birthdate = new Date('yyyy/MM/dd');
			$scope.ches = function ches(myVar) {
				if ($scope.myVar == false) {
					$scope.myVar = true;
				} else {
					$scope.myVar = false;
				}

			}
			
			var id = $stateParams.contratoId;
			if (id) {
				serviceContrato.getContrato(id).then(function(response) {
					$scope.contrato = response.data;
				});
			} else {
				$scope.contrato = {};

			}
			
			$scope.dd = function() {
				$scope.contrato.datainiciostring=$scope.contrato.datainicio;		
			};
			
			$scope.add=function(){if($scope.contrato.datafim!=null||$scope.contrato.datafim!=0){
				$scope.contrato.datainiciostring=$scope.contrato.datainicio;
				$scope.contrato.datafimstring=$scope.contrato.datainiciostring
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
			console.log($stateParams.contratoId);
			$scope.calculateAge = function calculateAge(birthday) { // birthday
				// is a date
				try{
				var ageDifMs = Date.now() - birthday.getTime();
				var ageDate = new Date(ageDifMs); // miliseconds from epoch
				var s = Math.abs(ageDate.getUTCFullYear() - 1970);

				var msg = 'anos de Idade';

				$scope.contrato.idade = s;
				$scope.contrato.datanascimento = $scope.birthdate;

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
				$scope.contrato = {};
				$scope.stage = "";
			}
			function novo() {
				$scope.contrato = {};
				$scope.birthdate='';
			}
			
			$scope.create = function(contrato) {
				serviceContrato.salvar(contrato).then(function(resp){	

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
				serviceContrato.listar().then(function(resp) {
					$scope.listaa = resp.data;
				});
			};
			
			listarSup();
			function listarSup() {
				serviceContrato.listarSupervisor().then(function(resp) {
					$scope.supervisores = resp.data;
				});
			};
			
			listarGest();
			function listarGest() {
				serviceContrato.listarGestor().then(function(resp) {
					$scope.gestores = resp.data;
				});
			};
			
			listarPosi();
			function listarPosi() {
				serviceContrato.listarPosiccao().then(function(resp) {
					$scope.posicaoes = resp.data;
				});
			};
			
			listarEduc();
			function listarEduc() {
				serviceContrato.listarEducacao().then(function(resp) {
					$scope.educacaoes = resp.data;
				});
			};
			
			listarDep();
			function listarDep() {
				serviceContrato.listarDepartamento().then(function(resp) {
					$scope.departamentos = resp.data;
				});
			};
			
			listarProg();
			function listarProg() {
				serviceContrato.listarPrograma().then(function(resp) {
					$scope.programass = resp.data;
				});
			};
			listarCi();
			function listarCi() {
				serviceContrato.listarCivil().then(function(resp) {
					$scope.ecivil = resp.data;
				});
			};
			listarCat();
			function listarCat() {
				serviceContrato.listarCategoria().then(function(resp) {
					$scope.cats = resp.data;
				});
			};
			listarPar();
			function listarPar() {
				serviceContrato.listarParentes().then(function(resp) {
					$scope.pars = resp.data;
				});
			};
			listarNiv();
			function listarNiv() {
				serviceContrato.listarNivel().then(function(resp) {
					$scope.sals = resp.data;
				});
			};
			listarPronv();
			function listarPronv() {
				serviceContrato.listarProvincia().then(function(resp) {
					$scope.pronvicias = resp.data;
				});
			};
				$scope.limpar = function() {
				$scope.contrato.programa.p1 = "";
						$scope.contrato.programa.p2 = "";
						$scope.contrato.programa.p3 = "";
						$scope.contrato.programa.p4 = "";
						$scope.contrato.programa.p5 = "";
						$scope.contrato.programa.p6 = "";
				
			}
			

		});