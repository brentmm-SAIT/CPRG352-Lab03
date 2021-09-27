<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2021, 5:49:08 PM
    Author     : 771684
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brent's Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first_num" value="${first_num}">
            <br>
            <label>Last:</label>
            <input type="text" name="last_num" value="${last_num}">
            <br><br>
            <input type="submit" name ="calc" value="+">
            <input type="submit" name ="calc" value="-">
            <input type="submit" name ="calc" value="*">
            <input type="submit" name ="calc" value="%">
        </form>
        <p>
            ${message}
        </p>
         <a href="age">Age Calculator</a>

    </body>
</html>
