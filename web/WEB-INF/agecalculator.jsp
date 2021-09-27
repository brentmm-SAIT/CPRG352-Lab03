<%-- 
    Document   : agecalculator
    Created on : Sep 25, 2021, 5:43:28 PM
    Author     : 771684
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brent's Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="user_age" value="">
            <p>
                ${message}
            </p>          
            <input type="submit" value="Age next birthday">
        </form>
        <br>
         <a href="arithmetic">Arithmetic Calculator</a>

    </body>
</html>