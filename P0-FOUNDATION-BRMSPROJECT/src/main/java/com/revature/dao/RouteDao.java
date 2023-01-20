package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Route;

public interface RouteDao {
   public void addRoute() throws SQLException;
   public void deleteRoute()throws SQLException ;
   public List<Route> displayRoute()throws SQLException ;
   public void updateRoute()throws SQLException ;
   public Route getRoute(String routeId)throws SQLException;
  public Route getRouteTest(String toBeAdded)throws SQLException;
  public void addRouteTest(Route toBeAdded) throws SQLException;
  public int delete(String loginId) throws SQLException;
   
}
