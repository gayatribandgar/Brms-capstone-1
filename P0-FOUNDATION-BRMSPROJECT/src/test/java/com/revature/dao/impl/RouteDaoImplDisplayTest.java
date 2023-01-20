package com.revature.dao.impl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.SQLException;

import org.junit.Test;
public class RouteDaoImplDisplayTest {
//@Test
//public void testDisplayRoute() throws SQLException {
//	RouteDaoImpl rd=new RouteDaoImpl();
//	
//		rd.displayRoute();
//		int r=9;
//	assertEquals(r,RouteDaoImpl.count);
//	
//}
@Test
public void testDisplayRoute2() throws SQLException {
	RouteDaoImpl rd=new RouteDaoImpl();
	
		rd.displayRoute();
		int r=2;
	assertNotEquals(r,RouteDaoImpl.count);
	
}
}
