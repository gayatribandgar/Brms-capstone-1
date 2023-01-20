package com.revature.dao.impl;

import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.revature.dao.RouteDao;
import com.revature.model.Route;

public class RouteDaoImplDeleteTest {
	RouteDao routeDao;

	
	

	

	@Before
	public void setUp() throws Exception {
		System.out.println("---------RouteDaoImplTest before every test---------");
		routeDao = new RouteDaoImpl();

	}

	@Test
	public void testDeleteRoute() {
	Route toBeDeleted =null;
	

	try {
		routeDao.delete("R0012");
		toBeDeleted = routeDao.getRouteTest("R0001");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	assertNull(toBeDeleted);
		
}
}
