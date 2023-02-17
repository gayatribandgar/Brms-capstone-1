package com.revature.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.RouteDao;
import com.revature.dao.impl.RouteDaoImpl;
import com.revature.model.Route;





@WebServlet(urlPatterns = { "/doEditRoute" })
public class DoEditRoute extends HttpServlet {
	private static final long serialVersionUID = 4645721142572801104L;
	private RouteDao routeDao = new RouteDaoImpl();

	public DoEditRoute() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String routeId = (String) request.getParameter("routeId");
		String source = (String) request.getParameter("source");
		String destination = (String) request.getParameter("destination");

		Route editRoute = new Route(routeId, source, destination);
		System.out.println(routeId+" "+source+" "+destination);
		try {
			routeDao.updateRoute(routeId, editRoute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		response.sendRedirect(request.getContextPath() + "/routeList");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}