angular.module('student', []).controller('indexController', function ($scope, $http) {

$scope.loadStudent = function(){
    $http.get('http://localhost:8080/students/api/v1/studentslist').then(function (response) {
        $scope.studentsList = response.data;
        });
}

   $scope.deleteStudentById = function (studentId){
        $http.delete('http://localhost:8080/students/api/v1/studentslist/delete/' + studentId).then(function (response) {
            $scope.loadStudent();
            });
   }

    $scope.addToList = function (name, age){
        $http.get('http://localhost:8080/students/api/v1/studentslist/add/' + name + age).then(function(response){
        $scope.loadStudent();
        });
    }

$scope.loadStudent();

});