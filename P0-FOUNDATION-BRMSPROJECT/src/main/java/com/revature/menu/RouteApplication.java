package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.config.DatabaseConnection;
import com.revature.dao.impl.RouteDaoImpl;
import com.revature.service.impl.LoginImplementation;

public class RouteApplication {
	public static void main(String[] args) throws SQLException {
		LoginImplementation login=new LoginImplementation();
		RouteApplication routeApplication=new RouteApplication();
		login.adminLogin();
		routeApplication.menu();
	}

	public  void menu() throws SQLException {
		DatabaseConnection.getConnection();
		while (true) {

			System.out.println("Enter the details:");
			System.out.println("1.Add Route ");
			System.out.println("2.Update Route ");
			System.out.println("3.Delete Route ");
			System.out.println("4.Display Route ");
			System.out.println("5.Show Route");
			RouteDaoImpl route = new RouteDaoImpl();
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				route.addRoute();
				break;
			case 2:route.updateRoute();break;
			case 3:route.deleteRoute();break;
			 case 4:route.displayRoute();break;
			 case 5:
				 System.out.println(route.getRoute(scanner.next()));break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}

}
