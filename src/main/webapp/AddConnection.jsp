<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Connection</title>
</head>
<body>
    <h1>Add Connection</h1>
    <form action="processAddConnection.jsp" method="post">
        <label for="station1">Station 1:</label>
        <input type="text" name="station1" id="station1" required>
        <br>
        <label for="station2">Station 2:</label>
        <input type="text" name="station2" id="station2" required>
        <br>
        <label for="distance">Distance (in KM):</label>
        <input type="number" name="distance" id="distance" required>
        <br>
        <input type="submit" value="Add Connection">
    </form>
</body>
</html>