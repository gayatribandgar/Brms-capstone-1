package com.revature.servlet;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.revature.dao.RouteDao;
import com.revature.dao.impl.*;
/**
 * Servlet implementation class DeleteRoute
 */
@WebServlet("/deleteRoute")
public class DeleteRoute extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RouteDao routeDao = new RouteDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRoute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String routeId = (String) request.getParameter("id");
	   try {
		routeDao.delete(routeId);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		response.sendRedirect(request.getContextPath() + "/routeList");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
