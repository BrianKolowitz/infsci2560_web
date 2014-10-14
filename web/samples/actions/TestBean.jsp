<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Using JavaBeans in JSP</title>
</head>
<body>
<center>
<h2>Using JavaBeans in JSP</h2>
 
<jsp:useBean id="test" class="edu.pitt.infsci2560.samples.beans.basics.TestBean" />
 
<jsp:setProperty name="test" 
                    property="setMessage" 
                    value="Hello JSP..." />
 
<p>Got message....</p>
 
<jsp:getProperty name="test" property="getMessage" />
 
</center>
</body>
</html>
