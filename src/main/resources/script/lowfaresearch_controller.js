/**
 * Created by sungji on 2017-06-02.
 */

var myApp = angular.module('myApp',[]);

myApp.controller('LowFareSearchController', ['$scope', function($scope) {
    var app = this;
    $scope.testmsg = "angularjs msg 노출 테스트";
    app.model = {
        "OriginDestinationInformation":[
            {
                "DepartureDateTime":"20170701",
                "OriginLocation":"ICN",
                "DestinationLocation":"NRT",
                "PPH":"1"
            },
            {
                "DepartureDateTime":"20170701",
                "OriginLocation":"NRT",
                "DestinationLocation":"ICN",
                "PPH":"2"
            }
        ],
        "PassengerTypeQuantity":[
            {
                "Code":"ADT",
                "Quantit":"1"
            },
            {
                "Code":"CHD",
                "Quantit":"1"
            }
        ]
    };
    app.search = function(){


        $.ajax({
            type:'POST',
            url:'/flight/lowFareSearch',
            data:model,
            contentType: 'application/json',
            dataType: 'json',
        });
    };
}]);

