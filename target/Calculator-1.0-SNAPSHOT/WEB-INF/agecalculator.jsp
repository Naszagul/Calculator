<%-- 
    Document   : agecalculator
    Created on : Jan 12, 2022, 12:40:04 PM
    Author     : Regan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="styles/style.css" rel="stylesheet"></link>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label for="age">Enter your age: </label><p>${message}</p>
            <input type="number" name="age" id="age"><br>
            <button type="submit">Age next Birthday!</button>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
