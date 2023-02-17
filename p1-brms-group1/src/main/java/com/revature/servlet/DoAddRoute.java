package com.revature.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.RouteDao;
import com.revature.dao.impl.RouteDaoImpl;
import com.revature.model.Route;





@WebServlet(urlPatterns = { "/doAddRoute" })
public class DoAddRoute extends HttpServlet {
	private static final long serialVersionUID = 4645721142572801105L;
	private RouteDao routeDao = new RouteDaoImpl();

	public DoAddRoute() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String routeId = (String) request.getParameter("routeId");
		String source = (String) request.getParameter("source");
		String destination = (String) request.getParameter("destination");

		Route newRoute = new Route(routeId,source,destination);
		String errorString = null;

		

		if (routeId == null ) {
			errorString = "Login ID is the string literal ^[a-zA-Z][0-9]{3}$ !";
		}

		if (errorString == null) {
			try {
				routeDao.addRoute(newRoute);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}

		// Store infomation to request attribute, before forward to views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("newRoute", newRoute);

		// If error, forward to Edit page.
		if (errorString != null) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/routes/addRouteView.jsp");
			dispatcher.forward(request, response);
		}

		// If everything nice.
		// Redirect to the product listing page.
		else {
			response.sendRedirect(request.getContextPath() + "/routeList");
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}