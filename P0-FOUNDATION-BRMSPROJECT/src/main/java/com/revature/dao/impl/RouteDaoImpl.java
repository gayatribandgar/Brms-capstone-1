package com.revature.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.RouteDao;
import com.revature.model.Route;


public class RouteDaoImpl implements RouteDao
{
	public static final Logger logger=Logger.getLogger(RouteDaoImpl.class);
	 private static Connection con=DatabaseConnection.getConnection();
	public static int count;
	Route route=new Route();
			Scanner sc=new Scanner(System.in);
    
   
	@Override
	public void addRoute() throws SQLException {
		// TODO Auto-generated method stub
		
		String insertQuery = Constant.INSERT_QUERY;
		PreparedStatement ps = con.prepareStatement(insertQuery);
		logger.info("enter Route Id");
		String routeId=sc.next();
		logger.info("enter  Source");
		String source=sc.next();
		logger.info("enter Destination");
		String destination=sc.next();
		
	    ps.setString(1,routeId);
    	ps.setString(2,source);
        ps.setString(3,destination);
		logger.debug("I want to inspect PreparedStatement Object: " +ps);
		int n = ps.executeUpdate();
		ps.close();
		logger.info("Added Route Details");
		if(n>0)
			logger.info("Values inserted Successfully");
		//routeDetails.add(route1);
		
		
	}

	@Override
	public void deleteRoute() throws SQLException {
		// TODO Auto-generated method stub
		String deleteQuery = Constant.DELETE_QUERY;
		PreparedStatement ps = con.prepareStatement(deleteQuery);
		logger.info("Enter Source to Delete");
		String source=sc.next();
		
		logger.info("Enter Destination to Delete");
		String destination=sc.next();
		ps.setString(1, source);
		ps.setString(2, destination);
		int n=ps.executeUpdate();
		if(n>0)
			logger.info("Values Deleted Sucessfully");

	}
		
		
		
		
	

	@Override
	public List<Route> displayRoute()throws SQLException {
		// TODO Auto-generated method stub
		
		String selectAllQuery = Constant.SELECT_ALL_QUERY;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs=ps.executeQuery();
		List<Route> routes=new ArrayList<Route>();
		logger.info("Enter the Route Id");
		count=0;
		while(rs.next()) {
			Route route=new Route();
			String routeId=rs.getString(1);
			String source=rs.getString(2);
			String destination=rs.getString(3);
			
			
			route.setRouteId(routeId);
			route.setSource(source);
			route.setDestination(destination);
			
			routes.add(route);
			count++;
		}
		for(Route r:routes) {
			logger.info(r);
		}
		return routes;
		
	}

	

	@Override
	public void updateRoute()throws SQLException {
		Route route=new Route();
		String updateQuery = Constant.UPDATE_QUERY;
		PreparedStatement ps = con.prepareStatement(updateQuery);
		logger.info("Enter Source to Update");
		String source=sc.next();
		logger.info("Enter Destination to Update");
		String destination=sc.next();
		logger.info("Enter RouteId");
		String routeId=sc.next();
		
		ps.setString(1, source);
		ps.setString(2, destination);
		ps.setString(3, routeId);
		int n = ps.executeUpdate();
		logger.info("Values Updated Sucessfully");
	}

	@Override
	public Route getRoute( String routeId) throws SQLException {
		String selectAllQuery = Constant.SELECT_SPECIFIC_QUERY;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ps.setString(1,routeId);
		Route route=new Route();
		ResultSet rs=ps.executeQuery();
		boolean found=false;
		while(rs.next()) {
			found=true;
			route.setRouteId(rs.getString("Route_Id"));
			route.setSource(rs.getString("S_source"));
			route.setDestination(rs.getString("Destination"));
		}
		if(found==true) {
			return route;
		}
		else
			return null;
			
	}

	@Override
	public void addRouteTest(Route toBeAdded)throws SQLException {
		String insertQuery = Constant.INSERT_QUERY;
		System.out.println(toBeAdded.getRouteId());
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, toBeAdded.getRouteId());
		ps.setString(2, toBeAdded.getSource());
		ps.setString(3, toBeAdded.getDestination());
		ps.executeUpdate();
		
			}


	@Override
	public Route getRouteTest(String toBeAdded) throws SQLException{
		// TODO Auto-generated method stub
	String sql="SELECT * FROM `brms`.`Route` where Route_Id='+R0010'";
//		String sql="SELECT `Route_Id`,`S_source`,`Destination` FROM `brms`.`Route` WHERE `Route_Id`="+ String.valueOf(toBeAdded) ;
		Statement stmt;
		Route route=new Route();
		
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				if(rs.getString(1).equals(toBeAdded)) {
					
					route.setRouteId(rs.getNString("Route_Id")); 
					route.setSource(rs.getString("S_source"));
					route.setDestination(rs.getString("Destination"));
				}
				
			}
			
			
			return route;
	} 
	
	@Override
	public int delete(String routeId) throws SQLException {
		// TODO Auto-generated method stub
		String deleteQquery = Constant.DELETE_QUERY;
		PreparedStatement ps = con.prepareStatement(deleteQquery);
		ps.setString(1, routeId);
		int n = ps.executeUpdate();
		return n;
	}
		
		
		
		
		
		
	}



