package com.metro.app;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class MetroAppServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET requests if needed.
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("choice");
        MetroMap metroMap = (MetroMap) getServletContext().getAttribute("metroMap");
        // Handle user choices and perform actions based on the choice.
        if (choice.equals("1")) {
            // Handle choice 1 (Shortest path by Dijkstra's algorithm).
            // Perform Dijkstra's algorithm and display the result.
            String source = request.getParameter("source"); // Get the source station
            DijkstraAlgo dijkstraAlgo = new DijkstraAlgo();
            Map<String, Integer> distances = dijkstraAlgo.dijkstra(metroMap.getAdj(), source);
            request.setAttribute("distances", distances);
            request.getRequestDispatcher("/shortestPath.jsp").forward(request, response);
        } else if (choice.equals("2")) {
            // Handle choice 2 (Display stations).
            // Display the list of stations.
            request.setAttribute("metroMap", metroMap);
            request.getRequestDispatcher("/DisplayStations.jsp").forward(request, response);
        }
        // Handle other choices and forward to respective JSP pages.
    }
}
