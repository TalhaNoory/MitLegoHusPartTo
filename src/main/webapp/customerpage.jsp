<%-- 
    Document   : customerpage
    Created on : Mar 21, 2019, 1:53:14 PM
    Author     : Talha Noory
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%= request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
    </body>
</html>
