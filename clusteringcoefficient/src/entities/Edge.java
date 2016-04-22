package entities;

public class Edge {

	private Vertex sourceVertex;
	private Vertex destVertex;
	
	//structural properties of an edge are not changeable
	public Vertex getSourceVertex() {
		return sourceVertex;
	}
	
	public Vertex getDestVertex() {
		return destVertex;
	}
	
	
	public Edge(Vertex sourceVertex,Vertex destVertex)
	{
		this.sourceVertex = sourceVertex;
		this.destVertex = destVertex;
	}
	
	
}
