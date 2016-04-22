package entities;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	// private int id;
	// other characteristics
	// ...

	private List<Vertex> vertecies;
	private List<Edge> edges;
	private GraphEdgeType directional;
	private Double clusteringCoefficient;

	// Primary Graph Properties////////////////////////////////////////
	// structural properties of a Graph are not changeable
	public List<Vertex> getVertecies() {
		return vertecies;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	// this property must define for Graph, not Edge
	public GraphEdgeType getDirectional() {
		return directional;
	}

	// ////////////////////////////////////////////////////////////////

	// Secondary Graph Properties//////////////////////////////////////

	// lazy initialization
	public Double getClusteringCoefficient() {
		if (clusteringCoefficient != null) {
//			this.clusteringCoefficient = calculateSecondaryProperties();;
		}
		return this.clusteringCoefficient;

	}

	// ////////////////////////////////////////////////////////////////

	public Graph(int vertecies, int edges, GraphEdgeType directional) {
		this.edges = new ArrayList<Edge>();
		this.vertecies = new ArrayList<Vertex>();
		this.directional = directional;
	}

	public void addVertex(Vertex v) {
		this.vertecies.add(v);
	}

	public void addEdge(Vertex sourceVertex, Vertex destVertex) {
		this.edges.add(new Edge(sourceVertex, destVertex));
	}
	
	
	private void calculateSecondaryProperties()
	{
		
	}

}
