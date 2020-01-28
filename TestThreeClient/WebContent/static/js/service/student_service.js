'use strict';

angular.module('studentRegistryApp').factory('StudentService', ['$http', function($http){

    var REST_SERVICE_URI = '/TestThreeClient/';

    var factory = {
        fetchAllStudents: fetchAllStudents,
    	createStudent: createStudent,
        updateStudent: updateStudent,
        deleteStudent: deleteStudent,
        editStudent: editStudent
        
    };
    return factory;

    function fetchAllStudents() {
       return $http.get(REST_SERVICE_URI+'getAllStudents');
    }

    function createStudent(student) {
    	console.log("STARTUNG FROM JS SERVICE");
        return $http.post(REST_SERVICE_URI+'addStudent', student);
    }

    function updateStudent(selectedStudent, id) {
    	console.log(id + " IN service update");
        return $http.put(REST_SERVICE_URI+'studentRegistry/updateStudent/'+id, selectedStudent);
    }
    
    function deleteStudent(id) {
        return $http.delete(REST_SERVICE_URI+'studentRegistry/deleteStudent/'+id); 
    }
    
    function editStudent(id) {
        return $http.put(REST_SERVICE_URI+'studentRegistry/editAStudent'+id);
    }
    
}]);
