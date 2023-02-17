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

import com.revature.config.ConnectionFactory;
import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.RouteDao;
import com.revature.model.Route;
import com.revature.model.User;
import com.revature.util.DbUtil;


public class RouteDaoImpl implements RouteDao
{
	private Connection connection;
	private PreparedStatement preparedStatment;
	public static final Logger logger=Logger.getLogger(RouteDaoImpl.class);
	 private static Connection con=DatabaseConnection.getConnection();
	public static int count;
	Route route=new Route();
			Scanner sc=new Scanner(System.in);
			public RouteDaoImpl() {
			}
   
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
		
//		
		ResultSet rs = null;
		List<Route> foundList = new ArrayList<Route>();
		Route currentRoute = null;
		try {
			connection = ConnectionFactory.getConnection();
			preparedStatment = connection.prepareStatement(Constant.SELECT_ALL_QUERY);
			rs = preparedStatment.executeQuery();
			while (rs.next()) {
				currentRoute = new Route(rs.getString(1), rs.getString(2), rs.getString(3));
				foundList.add(currentRoute);
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQLException in get() method");
			e.printStackTrace();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}
		return foundList;
		
	}

	

	@Override
	public void updateRoute(String routeId, Route newRoute)throws SQLException {

		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(Constant.UPDATE_QUERY);

			preparedStatment.setString(3, newRoute.getRouteId());
			preparedStatment.setString(1, newRoute.getSource());
			preparedStatment.setString(2, newRoute.getDestination());
			//preparedStatment.setString(4, userId.toUpperCase());

			// Execute statement.
			int rowsUpdated = preparedStatment.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("Route " + routeId + " was updated successfully!");
				connection.commit();
			}

		} catch (SQLException e) {
			System.out.println("SQLException in update() method");
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Rollback Exception in update() method");
				e1.printStackTrace();
			}
		} finally {
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}

	}

	@Override
	public Route getRoute( String routeId) throws SQLException {

		ResultSet rs = null;
		Route found = null;

		try {
			connection = ConnectionFactory.getConnection();
			preparedStatment = connection.prepareStatement(Constant.SELECT_SPECIFIC_QUERY);
			preparedStatment.setString(1, routeId.toUpperCase());
			
			rs = preparedStatment.executeQuery();
			if (rs.next()) {
				found = new Route(rs.getString(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			System.out.println("SQLException in get() method");
			e.printStackTrace();
		} finally {
			DbUtil.close(rs);
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}
		return found;
			
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
	public void delete(String routeId) throws SQLException {
		
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(Constant.DELETE_SPECIFIC_QUERY);
			preparedStatment.setString(1, routeId);

			// Execute statement.
			int rowsDeleted = preparedStatment.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("Route " + routeId + " was removed successfully!");
				connection.commit();
			}

		} catch (SQLException e) {
			System.out.println("SQLException in remove() method");
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Rollback Exception in remove() method");
				e1.printStackTrace();
			}
		} finally {
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}
		
	}

	@Override
	public void addRoute(Route route) throws SQLException {
		// TODO Auto-generated method stub
		try {
			connection = ConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			preparedStatment = connection.prepareStatement(Constant.INSERT_QUERY);

			preparedStatment.setString(1, route.getRouteId().toUpperCase());
			preparedStatment.setString(2, route.getSource());
			preparedStatment.setString(3, route.getDestination());

			// Execute statement.
			int rowsInserted = preparedStatment.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("A new account was saved successfully!");
				connection.commit();
			}

		} catch (SQLException e) {
			System.out.println("SQLException in save() method");
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Rollback Exception in save() method");
				e1.printStackTrace();
			}
		} finally {
			DbUtil.close(preparedStatment);
			DbUtil.close(connection);
		}
	}

	@Override
	public void updateRoute() throws SQLException {
		// TODO Auto-generated method stub
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
		
		
		
		
		
		
	}



