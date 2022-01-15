<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 14, 2022, 6:23:51 PM
    Author     : Regan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        <link href="styles/style.css" rel="stylesheet"></link>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first">First: </label>
            <input type="number" name="first" id="first"><br>
            <label for="second">Second: </label>
            <input type="number" name="second" id="second"><br>
            <button type="submit" name="calc" value="+">+</button>
            <button type="submit" name="calc" value="-">-</button>
            <button type="submit" name="calc" value="*">*</button>
            <button type="submit" name="calc" value="/">/</button>
        </form>
        <p>${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
