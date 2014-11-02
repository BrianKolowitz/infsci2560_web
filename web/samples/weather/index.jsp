<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="../../favicon.ico">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" >
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

        <title>INFSCI 2560 Weather Bug</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="jumbotron">
                <h1>INFSCI 2560 Weather Bug</h1>
                <p class="lead">Today's weather now!</p>
            </div>
            <form class="form-horizontal" role="form" action="/infsci2560_web/Weather" method="post">
                <div class="form-group" name='locaitonGroupGeo'>
                    <label for="longitude" class="col-sm-2 control-label">Longitude</label>
                    <div class="col-sm-10">
                        <input type="number" step="any" class="form-control" name="longitude" placeholder="Longitude">
                    </div>
                    <label for="latitude" class="col-sm-2 control-label">Latitude</label>
                    <div class="col-sm-10">
                        <input type="number" step="any" class="form-control" name="latitude" placeholder="Latitude">
                    </div>
                </div>

                <div class="radio">
                    <label>
                        <input type="radio" name="unitRadios" id="unitRadioCelsius" value="celsius">
                        Celsius
                    </label>
                </div>
                <div class="radio">
                    <label>
                        <input type="radio" name="unitRadios" id="unitRadioFahrenheit" value="fahrenheit" checked>
                        Fahrenheit
                    </label>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                </div>
            </form>
        </div>

        <!-- 
         
         String cityType = null; -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script>
            $(function () {
                getLocation();
            });
            
            function getLocation() {
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(function(position){
                        $("input[name='longitude']").val(position.coords.longitude);
                        $("input[name='latitude']").val(position.coords.latitude);
                    });
                }
            }            
        </script>

    </body>
</html>
