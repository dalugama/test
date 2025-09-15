angular.module('helloApp', [])
.controller('HelloController', function($scope, $http) {
    $scope.name = '';
    $scope.response = '';
    
    $scope.callHello = function() {
        var url = 'http://localhost:8080/hello';
        if ($scope.name) {
            url += '?name=' + encodeURIComponent($scope.name);
        }
        $http.get(url)
            .then(function(response) {
                $scope.response = response.data.message;
            })
            .catch(function(error) {
                console.log('Error:', error);
                $scope.response = 'Error: ' + (error.statusText || 'Connection failed');
            });
    };
});