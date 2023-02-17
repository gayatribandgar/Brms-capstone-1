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



/**
 * Servlet implementation class EditRoute
 */
@WebServlet("/editRoute")
public class EditRoute extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RouteDao routeDao = new RouteDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditRoute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String routeId = (String) request.getParameter("id");
		

		Route editRoute = null;
		try {
			editRoute = routeDao.getRoute(routeId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("editRoute", editRoute);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/routes/editRouteView.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
