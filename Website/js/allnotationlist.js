$(document).ready(function(){

    $.getJSON("http://localhost:8082/notations", function(Notation){

        console.log(Notation);
        $.each(Notation, function(key,value) {

            $("#NotationList").append('<h3>'+ 'User id : ' +value.user_id +' & '+ 'wine id : '+value.wine_id +'</h3>')
            $("#NotationList").append('<div>'+ 'notation id : '+value.notation_id +'</div>')
            $("#NotationList").append('<div>'+ 'Notation date : '+value.Notation_date +'</div>')
            $("#NotationList").append('<div>'+ 'Notation Smell : '+value.Notation_Smell +'</div>')
            $("#NotationList").append('<div>'+ 'Notation Taste : '+value.Notation_Taste +'</div>')
            $("#NotationList").append('<div>'+ 'Notation Note : '+value.Notation_Note +'</div>')
        });
    });
});