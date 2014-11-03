<%-- 
    Document   : weather
    Created on : Nov 2, 2014, 2:59:16 PM
    Author     : kolowitzbj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INFSCI 2560 Weather Bug - Current Weather</title>
    </head>
    <body>
        <h1>Current Weather</h1>
        <ul>
            <li>
                City Id: ${requestScope.current.city.id}, Name: ${requestScope.current.city.name}
                <ul>
                    <li>Coord Long: ${requestScope.current.city.coord.lon}, Lat: ${requestScope.current.city.coord.lat}</li>
                    <li>Country: </li>
                    <li>Sun Rise: ${requestScope.current.city.sun.rise}, Set: ${requestScope.current.city.sun.set}</li>
                </ul>
            </li>
            <li>Temperature ${requestScope.current.temperature.value} ${requestScope.current.temperature.unit}
                <ul>
                    <li>Min ${requestScope.current.temperature.value} ${requestScope.current.temperature.unit}</li>
                    <li>Max ${requestScope.current.temperature.value} ${requestScope.current.temperature.unit}</li>
                </ul>
            </li>
        </ul>
                <div>Last Updated at ${requestScope.current.lastupdate.value}</div>
    </body>
</html>
