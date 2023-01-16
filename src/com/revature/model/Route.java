package com.revature.model;



public class Route {

	
	private String source;
	private String destination;
	public Route(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	
	public Route() {
		// TODO Auto-generated constructor stub
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Route [source=" + source + ", destination=" + destination + "]";
	}
	
	
	
	
	
	
    
  

}
