$(document).ready(function(){
    $.getJSON("http://localhost:8082/users", function(result){
        console.log(result);
        $.each(result, function(key,value) {
            $("#UserList").append('<h3>'+'User id : '+value.user_id +'</h3>')
            $("#UserList").append('<div>'+'user name: '+value.User_Fname+' ' +value.User_Lname+'</div>')
            $("#UserList").append('<div>'+ 'user email: '+value.User_Email+'</div>')

        });
    });
});