package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import functionalities.GraphCalculator;

public class Vertex {

	private int name;
	private List<Vertex> adjacencies;
	private HashMap<Vertex, Integer> shortestPaths;


	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public List<Vertex> getAdjacencies() {
		return adjacencies;
	}

//	public void setAdjacencies(List<Vertex> adjacencies) {
//		if(adjacencies.isEmpty())
//			adjacencies = GraphCalculator.findAdjacencies(this);
//		this.adjacencies = adjacencies;
//	}	
//	
//	public HashMap<Vertex, Integer> getShortestPaths() {
//		if(shortestPaths.isEmpty())
//			shortestPaths = GraphCalculator.findShortestPath(this);
//		return shortestPaths;
//	}
//
//	public void setShortestPaths(HashMap<Vertex, Integer> shortestPaths) {
//		this.shortestPaths = shortestPaths;
//	}

	public Vertex() {
		adjacencies = new ArrayList<Vertex>();
	}
	
	
}
