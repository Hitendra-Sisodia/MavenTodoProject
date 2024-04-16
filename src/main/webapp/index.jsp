<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Menu</title>
</head>
<body>
    <form action="processInput.jsp" method="post">
        <h1>Menu</h1>
        <p>1. Shortest path by Dijkstra's algorithm</p>
        <p>2. Display stations</p>
        <p>3. Display metro map</p>
        <p>4. Add Station</p>
        <p>5. Add Connection</p>
        <p>6. Exit</p>
        
        <label for="choice">Enter Your Choice from (1 to 6):</label>
        <input type="text" name="choice" id="choice" required pattern="[1-6]">
        
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
