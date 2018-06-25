/**
 * Created by khush on 6/18/2018.
 */


var myApp = angular.module('TwitterCloneApp',['ngRoute', 'ngResource']);

myApp.config(['$routeProvider', function($locationProvider,$routeProvider,$httpProvider){
    $routeProvider
        .when('/login',{
            templateUrl: 'pages/home.html',
            controller : 'homeController'
        })
        .when('/login1',{
           templateUrl: 'pages/login.html',
           controller : 'homeController'
        })

        .when('/userProfile',{
            templateUrl: 'pages/userProfile.html',
            controller : 'userController'
        })

        .otherwise({redirectTo: '/'});

        $locationProvider.html5Mode(true);
}]);

myApp.controller('homeController', ['$scope', '$http', function($scope, $http) {

    console.log("inside the home controller");
    $scope.submit = function(){

        console.log("Hola from uicontroller home!", $scope.userInfo);

        $http({
            method: "post",
            header:{
                'Accept':'application/json',
                'Content-Type': 'application/json'
            },
            url:'http://localhost:8080/login',
            data: JSON.stringify({
                "userInfo":$scope.userInfo,
                "password":$scope.password
            })
        }).success(function (data) {
            console.log("inside success");
            window.location.href = 'http://localhost:8080/userProfile';
        }).error(function (error) {
            console.log("inside error");
            console.log(error);
            console.log("unexpected_error");
        });
    };
}]);


    myApp.controller('userController', ['$scope', '$http', function($scope, $http) {

        Console.log("In User Controller!");

    }]);


