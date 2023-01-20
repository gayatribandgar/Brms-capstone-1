package com.revature.constants;

public class Constant {
	
		public static final String SELECT_ALL_QUERY="SELECT  `Route_Id`,`S_source`,`Destination` FROM `brms`.`Route` ";
	public static final String SELECT_SPECIFIC_QUERY="SELECT `Route_Id`,`S_source`,`Destination` FROM `brms`.`Route` WHERE `Route_Id`=? ";		
	public static final String INSERT_QUERY="INSERT INTO `brms`.`Route` VALUES (?,?,?) ";		
	public static final String UPDATE_QUERY="UPDATE `brms`.`Route` SET `S_source`=? , `Destination`=? WHERE `Route_Id`=? ";
		public static final String DELETE_QUERY="DELETE FROM `brms`.`Route` WHERE `S_source`=? and `Destination`=?";
	
		
		public static String  HEADER_MSG = "*~*~*~*~*~*~* Welcome *~*~*~*~*~*~*"
				+ "\n*~*~*~*~*~*~*~*...To...*~*~*~*~*~*~*~*"
				+ "\n Our Bus Reservation Application";
		
	
		
	


}
