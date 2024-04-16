<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.metro.app.MetroMap" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Stations</title>
</head>
<body>
    <h1>Stations in the Metro Map</h1>
    <table>
        <tr>
            <th>Station Number</th>
            <th>Station Name</th>
        </tr>
        <%
            MetroMap metroMap = (MetroMap) application.getAttribute("metroMap"); // Get the MetroMap from application scope
            int count = 1;
            for (String station : metroMap.getAdj().keySet()) {
        %>
        <tr>
            <td><%= count %></td>
            <td><%= station %></td>
        </tr>
        <%
                count++;
            }
        %>
    </table>
</body>
</html>