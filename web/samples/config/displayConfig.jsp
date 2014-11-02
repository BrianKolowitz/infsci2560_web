<%-- 
    Document   : loadConfig
    Created on : Oct 29, 2014, 7:59:14 PM
    Author     : kolowitzbj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <p>Main Email:<c:out value="${requestScope.mainEmail}"></c:out></p>
        <p>Admin Email<c:out value="${requestScope.adminEmail}"></c:out></p>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
