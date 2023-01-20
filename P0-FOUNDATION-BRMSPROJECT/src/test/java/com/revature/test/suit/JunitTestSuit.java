package com.revature.test.suit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.revature.dao.impl.DatabaseConnectionTest;
import com.revature.dao.impl.RouteDaoImplDeleteTest;
import com.revature.dao.impl.RouteDaoImplDisplayTest;
import com.revature.dao.impl.UserDaoImplTest;



@RunWith(Suite.class)
@Suite.SuiteClasses({ DatabaseConnectionTest.class,RouteDaoImplDeleteTest.class,RouteDaoImplDisplayTest.class,UserDaoImplTest .class })
public class JunitTestSuit {
	

	

	
	
}
