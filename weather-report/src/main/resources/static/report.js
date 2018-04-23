$(function () {

    $("#selectCityName").change(function () {
        var cityName = $("#selectCityName").val();
        $.ajax({
            type: "GET",
            url: "/report/listCounty/"+cityName,
            dataType: "json",
            success: function(data){
                var url = '/report/'+cityName+'/'+cityName;
                window.location.href = url;
            }
        });
    });

    $("#selectCountyName").change(function () {
        var cityName = $("#selectCityName").val();
        var countyName = $("#selectCountyName").val();
        var url = '/report/'+cityName+'/'+countyName;
        window.location.href = url;
    })
})