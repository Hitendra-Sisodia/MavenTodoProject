<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Processing Choice</title>
</head>
<body>
    <%
        String choice = request.getParameter("choice");
    %>
    <h1>Processing Choice</h1>
    <p>You selected choice: <%= choice %></p>
    
    <%-- Add logic to perform actions based on the choice --%>
    
    <%
        if (choice.equals("1")) {
            // Redirect to shortestPath.jsp for choice 1
            response.sendRedirect("shortestPath.jsp");
        } else if (choice.equals("2")) {
            // Redirect to DisplayStations.jsp for choice 2
            response.sendRedirect("DisplayStations.jsp");
        } else if (choice.equals("3")) {
            // Redirect to DisplayMetroMap.jsp for choice 3
            response.sendRedirect("DisplayMetroMap.jsp");
        } else if (choice.equals("4")) {
            // Redirect to AddStation.jsp for choice 4
            response.sendRedirect("AddStation.jsp");
        } else if (choice.equals("5")) {
            // Redirect to AddConnection.jsp for choice 5
            response.sendRedirect("AddConnection.jsp");
        } else if (choice.equals("6")) {
            // Exit or perform other actions for choice 6
            // You can add specific logic here if needed.
            out.println("You chose to exit or perform other actions for choice 6.");
        } else {
            out.println("Invalid choice. Please select a valid option.");
        }
    %>
</body>
</html>
