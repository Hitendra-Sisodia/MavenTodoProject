<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Station</title>
</head>
<body>
    <h1>Add Station</h1>
    <form action="processAddStation.jsp" method="post">
        <label for="stationName">Station Name:</label>
        <input type="text" name="stationName" id="stationName" required>
        <br>
        <input type="submit" value="Add Station">
    </form>
</body>
</html>
