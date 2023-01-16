package com.revature.dao.impl;

import java.util.ArrayList;

import java.util.Scanner;

import com.revature.dao.RouteDao;
import com.revature.model.Route;

public class RouteDaoImpl implements RouteDao
{
    Scanner sc=new Scanner(System.in);
    private static ArrayList<Route> routeDetails;
    static {
    	routeDetails=new ArrayList<Route>();
    }
    Route route1=new Route();
	@Override
	public void addRoute() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Source to Add ");
		
		route1.setSource(sc.next());
		System.out.println("Enter Destination to Add ");
		route1.setDestination(sc.next());
		
		routeDetails.add(route1);
		
		
	}

	@Override
	public void deleteRoute() {
		// TODO Auto-generated method stub
		System.out.println("Enter Source to Delete");
		String source=sc.next();
		
		System.out.println("Enter Destination to Delete");
		String destination=sc.next();
		Route obj=new Route();
		for(Route r:routeDetails) {
			if(r.getSource().equals(source)&& r.getDestination().equals(destination)) 
			{
				obj=r;
				
			}
			
		}
		routeDetails.remove(obj);

	}
		
		
		
		
	

	@Override
	public void displayRoute() {
		// TODO Auto-generated method stub
		for(Route r:routeDetails) {
			System.out.println(r);
		}
	}

	

	@Override
	public void updateRoute() {
		
	    System.out.println("Enter Route Where to Update Source and Destination");
	    System.out.println("Enter Source");
	    String source=sc.next();
	    System.out.println("Enter Destination");
	    String destination=sc.next();
	    
		System.out.println("Select from below options to Update  ");
		System.out.println("1.Source");
		System.out.println("2.Destination");
		System.out.println("3.Both");
		int choice=sc.nextInt();
		if(choice==1) {
		System.out.println("Enter Source to update:");
		
		for(Route i:routeDetails) {
			if(i.getSource().equals(source) && i.getDestination().equals(destination)) {
				i.setSource(sc.next());
				
			}
		}
		}
		else if(choice==2) {
			System.out.println("Enter Destination to update:");
			for(Route i:routeDetails) {
				if(i.getSource().equals(source) && i.getDestination().equals(destination)) {
					i.setDestination(sc.next());
					
				}
	     	}
		}
		else if(choice==3) {
			System.out.println("Enter Source to update:");
			System.out.println("Enter Destination to update:");
			for(Route i:routeDetails) {
				if(i.getSource().equals(source) && i.getDestination().equals(destination)) {
					i.setSource(sc.next());
					i.setDestination(sc.next());
					
				}
			
	       	}
		
		
	    }
	}

}
