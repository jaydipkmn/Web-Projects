package com.simple.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServletExample
 */
@WebServlet(urlPatterns = { "/sayHello" },
initParams={@WebInitParam(name = "myInItparams", value = "Default User")}
)
public class FirstServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session =  request.getSession();
		ServletContext context =  request.getServletContext();
		if(userName!="" && userName!=null)
		{
		    session.setAttribute("name", userName);
		    context.setAttribute("name", userName);
		}
		writer.println("<h2> Request Says hello to " + userName  + " </h3>");
		writer.println("<h2> Session Says hello to " + session.getAttribute("name")  + " </h3>");
		writer.println("<h2> Application Says hello to " + context.getAttribute("name")  + " </h3>");
		writer.println("<h2> "+ this.getServletConfig().getInitParameter("myInItparams")  + " says hello to you </h3>");
		
		
		
	}

}
