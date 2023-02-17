package com.revature.constants;

public class Constant {
	
		public static final String SELECT_ALL_QUERY="SELECT  * FROM `brms`.`route` ";
	public static final String SELECT_SPECIFIC_QUERY="SELECT `Route_Id`,`S_source`,`Destination` FROM `brms`.`Route` WHERE `Route_Id`=? ";		
	public static final String INSERT_QUERY="INSERT INTO `brms`.`route` VALUES(?,?,?)";		
	public static final String UPDATE_QUERY="UPDATE `brms`.`Route` SET `S_source`=? , `Destination`=? WHERE `Route_Id`=? ";
		public static final String DELETE_SPECIFIC_QUERY="DELETE FROM `brms`.`route` WHERE `Route_Id`=? ";
	
		public static final String DELETE_QUERY="DELETE FROM `brms`.`Route` WHERE `S_source`=? and `Destination`=?";
		public static final String INSERT_USER = "INSERT INTO `brms`.`registration` VALUES(?,?,?)";
		public static final String UPDATE_USER = "UPDATE `brms`.`registration` SET LOGIN_ID=?,PASSWORD=?,ROLE=? WHERE  LOGIN_ID=?";
		public static final String DELETE_USER= "DELETE FROM `brms`.`registration` WHERE LOGIN_ID=?";
		public static final String SELECT_USER = "SELECT * FROM `brms`.`registration` WHERE LOGIN_ID=? AND PASSWORD=?";
		public static final String SELECT_USER_BY_ID = "SELECT * FROM `brms`.`registration` WHERE LOGIN_ID=?";
		public static final String SELECT_ALL_USER = "SELECT * FROM `brms`.`registration` ORDER BY ROLE";
		public static final String SELECT_USERS_BY_ID_PATTERN = "SELECT * FROM `brms`.`registration` WHERE LOGIN_ID LIKE ?";
		
		public static String  HEADER_MSG = "*~*~*~*~*~*~* Welcome *~*~*~*~*~*~*"
				+ "\n*~*~*~*~*~*~*~*...To...*~*~*~*~*~*~*~*"
				+ "\n Our Bus Reservation Application";
		
	
		
	


}
