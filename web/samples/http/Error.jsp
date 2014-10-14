<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Setting HTTP Status Code</title>
    </head>
    <body>
        <%
            // Set error code and reason.
            response.sendError(407, "Need authentication!!!");
        %>
    </body>
</html>
