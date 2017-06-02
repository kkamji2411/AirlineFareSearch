/**
 * Created by sungji on 2017-06-02.
 */

var myApp = angular.module('myApp',[]);

myApp.controller('LowFareSearchController', ['$scope', function($scope) {
    var app = this;
    $scope.testmsg = "angularjs msg 노출 테스트";
    app.test = function(){
      console.log("test")
    };
}]);

