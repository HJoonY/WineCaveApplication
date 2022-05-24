$(document).ready(function(){
    $.getJSON("http://localhost:8082/wines", function(result){
        console.log(result);
        $.each(result, function(key,value) {
            $("#WineList").append('<h3>'+'User id : '+value.user_id +'</h3>')
            $("#WineList").append('<div>'+ 'wine id : '+value.wine_id +'</div>')
            $("#WineList").append('<div>'+ 'wine name : '+value.Wine_name+'</div>')
            $("#WineList").append('<div>'+ 'wine type : '+value.wine_type+'</div>')
            $("#WineList").append('<div>'+ 'wine color : '+value.wine_Color+'</div>')
            $("#WineList").append('<div>'+ 'wine Millesime : '+value.wine_Millesime+'</div>')
            $("#WineList").append('<div>'+ 'wine Region : '+value.wine_Region+'</div>')
        });
    });
});