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
                <ul>
                    <li>City Id:<c:out value="${requestScope.current.getCity().getId()}"></c:out></li>
                    <li>City Name:<c:out value="${requestScope.current.city.name}"></c:out></li>
                    <li>
                        <ul>
                            <li>Longitude:<c:out value="${requestScope.current.city.coord.lon}"></c:out></li>
                            <li>Latitude<c:out value="${requestScope.current.city.coord.lat}"></c:out></li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
    </body>
</html>
