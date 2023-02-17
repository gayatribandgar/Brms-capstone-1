package com.revature.service.impl;


	


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	import org.apache.log4j.Logger;

	import com.revature.config.DatabaseConnection;
	import com.revature.constants.Constant;
	import com.revature.menu.RouteApplication;
	import com.revature.model.User;
	import com.revature.service.Login;

	public class LoginImplementation implements Login {
		Scanner sc = new Scanner(System.in);
	    RouteApplication m = new RouteApplication();
	    Connection con=null;
	    private static final Logger logger = Logger.getLogger(LoginImplementation.class);
		@Override
		public void adminLogin() throws SQLException {
			// TODO Auto-generated method stub
			
				con = DatabaseConnection.getConnection();
				int loggoff=0;
				do {
					logger.info("\n########## ENTER LOGIN DETAILS ########### ");
					logger.info("\nEnter your USERNAME  :-");
					String username = sc.next();
					
					
					logger.info("\nEnter your PASSWORD :-");
					String password = sc.next();
//					
//					java.sql.Statement stms=con.createStatement();
//					ResultSet rs = stms.executeQuery("SELECT `userName`,`P_password`,`R_role` from `brms`.`registration`");
//					System.out.println(rs.getString(1));
//					System.out.println(rs.getString(2));
//					System.out.println(rs.getString(3));
//					
					PreparedStatement ps = con.prepareStatement("SELECT `userName`,`P_password`,`R_role` from `brms`.`registration` where userName = ? and P_password=?");
				    ps.setString(1,username);
				    ps.setString(2, password);
				    
				   
				    ResultSet rs = ps.executeQuery();
				    if(rs.next()) {
				    	
				    	
				    				logger.info("\n########### WELCOME ###########\n");
									m.menu();
				    		
				    	}
				    	
					
						else {
							logger.info("\nEnter correct details\n");
							logger.info("\nWant to enter again press-1\n");
							int again=sc.nextInt();
							loggoff=again;
						}
					

					}while(loggoff==1);
			}
		@Override
		public User getUserForTest(User u) {
			// TODO Auto-generated method stub
			Connection con=null;
			con=DatabaseConnection.getConnection();
			try {
				java.sql.Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT *FROM `brms`.`registration`");
				while(rs.next()) {
					if(u.getUserLogin().equals(rs.getString(1)) &&u.getUserPass().equals(rs.getString(2))) {
						u.setUserLogin(rs.getString(1));
						u.setUserPass(rs.getString(2));
						u.setRole(rs.getString(3));
					}
				}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				con.close();
			}catch(SQLException e) {
				
			}
			return u;
		}
		@Override
		public User getUser(User u) {
			// TODO Auto-generated method stub
			return null;
		}
		
		}
		
		
			
		
		
		
		
		




