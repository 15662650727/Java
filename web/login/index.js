$(function () {             //等价$(document).ready(function(){});  $().ready(function(){});
    
});


function login() {
    var user = $('#user').val();
    var pwd = $('#pwd').val();
    console.log()
    $.ajax({
        url : "../login/go",
        type : "get",
        data : {'user' : user ,'pwd': pwd},
        dataType : 'JSON',
        success : function(data){

        },
    });

}