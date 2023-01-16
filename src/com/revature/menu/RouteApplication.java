package com.revature.menu;

import java.util.Scanner;

import com.revature.dao.impl.RouteDaoImpl;

public class RouteApplication {
	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter the details:");
		System.out.println("1.Add Route ");
		System.out.println("2.Update Route ");
		System.out.println("3.Delete Route ");
		System.out.println("4.Display Route ");
		RouteDaoImpl route=new RouteDaoImpl();
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
		
			route.addRoute();
		
		break;
		case 2:route.updateRoute();break;
		case 3:route.deleteRoute();break;
		case 4:route.displayRoute();
			break;
		default:System.out.println("Invalid Choice");
		}
		}
	}
	

}
