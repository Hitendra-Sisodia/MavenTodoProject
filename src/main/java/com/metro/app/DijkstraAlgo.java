package com.metro.app;

import java.util.*;

public class DijkstraAlgo {
    public Map<String, Integer> dijkstra(Map<String, List<Pair<String, Integer>>> adj, String source) {
        Map<String, Integer> dist = new HashMap<>();
        for (String station : adj.keySet()) {
            dist.put(station, Integer.MAX_VALUE);
        }
        dist.put(source, 0);
        PriorityQueue<Pair<Integer, String>> pq = new PriorityQueue<>(Comparator.comparing(Pair::getFirst));
        pq.add(new Pair<>(0, source));
        while (!pq.isEmpty()) {
            int dis = pq.peek().getFirst();
            String node = pq.poll().getSecond();
            for (Pair<String, Integer> it : adj.get(node)) {
                String adjNode = it.getFirst();
                int edgeWeight = it.getSecond();
                if (dis + edgeWeight < dist.get(adjNode)) {
                    dist.put(adjNode, dis + edgeWeight);
                    pq.add(new Pair<>(dist.get(adjNode), adjNode));
                }
            }
        }
        return dist;
    }
}

class Pair<K, V> {
    private K first;
    private V second;

    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}