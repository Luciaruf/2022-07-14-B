package it.polito.tdp.nyc.model;

import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import it.polito.tdp.nyc.db.NYCDao;

public class Model {
	
	NYCDao dao;
	Graph<NTA, DefaultWeightedEdge> graph;
	
	public Model() {
		this.dao=new NYCDao();
		this.graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);
	}
	
	public Graph creaGrafo(String borough) {
		this.graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);
		
		Graphs.addAllVertices(this.graph, this.dao.getVertices(borough));
		
		return this.graph;
	}
	
	
	public List<String> getBoroughs(){
		return this.dao.getBoroughs();
	}
	
}
