package com.revature.model;



public class Route {

	private String routeId;
	private String source;
	private String destination;
	public Route(String routeId ,String source, String destination) {
		super();
		this.routeId=routeId;
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

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + "]";
	}

	
	
	
	
	
	
	
    
  

}
