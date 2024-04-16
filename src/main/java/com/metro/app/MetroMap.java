package com.metro.app;

import java.util.*;

public class MetroMap {
	public MetroMap() {
	    addNode("CLOCK TOWER");
	    addNode("DILARAM CHOWK");
	    addNode("BB");
	    addNode("CENTERIO MALL");
	    addNode("KRISHAN NAGAR CHOWK");
	    addNode("RAJ BHAWAN");
	    addNode("ISBT");
	    addNode("BALLUPUR CHOWK");
	    addNode("ONGC");
	    addNode("VASANT VIHAR");
	    addNode("PANDITWADI");
	    addNode("IMA");
	    addNode("MB");
	    addNode("PREM NAGER");
	    addNode("PHULSANI");
	    addNode("NANDA KI CHOWKI");
	    addNode("PONDHA");
	    addNode("KANDOLI");
	    addNode("UPES");
	    addEdge("CLOCK TOWER", "BB", 10);  // Multiply by 10
	    addEdge("CLOCK TOWER", "DILARAM CHOWK", 19);  // Multiply by 10
	    addEdge("BB", "KRISHAN NAGAR CHOWK", 13);  // Multiply by 10
	    addEdge("KRISHAN NAGAR CHOWK", "BALLUPUR CHOWK", 19);  // Multiply by 10
	    addEdge("BALLUPUR CHOWK", "ISBT", 75);  // Multiply by 10
	    addEdge("BALLUPUR CHOWK", "VASANT VIHAR", 25);  // Multiply by 10
	    addEdge("VASANT VIHAR", "PANDITWADI", 22);  // Multiply by 10
	    addEdge("PANDITWADI", "IMA", 18);  // Multiply by 10
	    addEdge("IMA", "MB", 10);  // Multiply by 10
	    addEdge("MB", "PREM NAGER", 5);  // Multiply by 10
	    addEdge("IMA", "PREM NAGER", 23);  // Multiply by 10
	    addEdge("PREM NAGER", "NANDA KI CHOWKI", 24);  // Multiply by 10
	    addEdge("NANDA KI CHOWKI", "PHULSANI", 50);  // Multiply by 10
	    addEdge("DILARAM CHOWK", "CENTERIO MALL", 28);  // Multiply by 10
	    addEdge("CENTERIO MALL", "RAJ BHAWAN", 13);  // Multiply by 10
	    addEdge("RAJ BHAWAN", "ONGC", 42);  // Multiply by 10
	    addEdge("ONGC", "BALLUPUR CHOWK", 25);  // Multiply by 10
	    addEdge("ONGC", "PHULSANI", 40);  // Multiply by 10
	    addEdge("PHULSANI", "PONDHA", 20);  // Multiply by 10
	    addEdge("NANDA KI CHOWKI", "PONDHA", 36);  // Multiply by 10
	    addEdge("PONDHA", "KANDOLI", 30);  // Multiply by 10
	    addEdge("KANDOLI", "UPES", 30);  // Multiply by 10

	}
    private Map<String, List<Pair<String, Integer>>> adj = new HashMap<>();

    public void addNode(String stationName) {
        adj.put(stationName, new ArrayList<>());
    }

    public void addEdge(String station1, String station2, int distance) {
        adj.get(station1).add(new Pair<>(station2, distance));
        adj.get(station2).add(new Pair<>(station1, distance));
    }

    public void displayStations() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Stations in the metro map:");
        int count = 0;
        for (String station : adj.keySet()) {
            System.out.println(count + ". " + station);
            count++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void displayMetroMap() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Metro Map:");
        for (Map.Entry<String, List<Pair<String, Integer>>> entry : adj.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Pair<String, Integer> connection : entry.getValue()) {
                System.out.print(connection.getFirst() + " (" + connection.getSecond() + " KM) ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }

    public Map<String, List<Pair<String, Integer>>> getAdj() {
        return adj;
    }
}