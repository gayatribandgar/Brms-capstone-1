package com.revature.dao.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.model.User;
import com.revature.service.Login;
import com.revature.service.impl.LoginImplementation;

public class UserDaoImplTest {
    Login l=new LoginImplementation();
    User result=new User();
    @Test
    public void testUserAuthentication() {
    	User u=new User("arv","123@","");
    	result=l.getUserForTest(u);
    	assertEquals(result.getUsername(),u.getUsername());
    }
    
}
