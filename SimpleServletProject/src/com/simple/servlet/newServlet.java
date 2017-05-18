package com.simple.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newServlet
 */
@WebServlet(description = "New Servlet using annotations", urlPatterns = { "/newServlet" ,"/new servlet"})
public class newServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        System.out.println(request.getAttribute("name"));
        response.getWriter().println("New Servlet");
        response.getWriter().println("New Servlet");
/*        response.getOutputStream().println("New Servlet");
        response.getOutputStream().println("New Servlet");*/
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
	    System.out.println(request.getAttribute("name"));
        response.getWriter().println("New Servlet");
    }

}
