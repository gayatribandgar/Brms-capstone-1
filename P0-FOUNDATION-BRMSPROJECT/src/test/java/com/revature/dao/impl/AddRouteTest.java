package com.revature.dao.impl;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.revature.dao.RouteDao;
import com.revature.model.Route;
public class AddRouteTest {
	

	



		

		

		
	

			@Test
			public void testAddRoute() throws SQLException {
				
				Route route = new Route();
				
				route.setRouteId("R025");
				
				route.setSource("Delhi");
				route.setDestination("Shridi");
				
				RouteDao routeDao = new RouteDaoImpl();
				routeDao.addRouteTest(route);	
				assertEquals(routeDao.getRoute("R008").getSource(), "Delhi");
//				Route toBeAdded = new Route("R0010","p","q");
//				RouteDao r=new RouteDaoImpl();
//				Route added = null;
//				try {
//					r.addRouteTest(toBeAdded);
//					added = r.getRouteTest(toBeAdded.getRouteId());
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}	assertEquals(toBeAdded.getRouteId(), added.getRouteId());
//				
//			}
		
			}
			
}





