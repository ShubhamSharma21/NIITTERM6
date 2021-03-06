package com.niit.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Dao.CustomerDao;
import com.niit.Dao.CustomerDaoImpl;
import com.niit.Model.CustomerDetails;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		CustomerDetails c=null;
		String e=request.getParameter("email");
		String p=request.getParameter("password");
		
		
		CustomerDao dao=new CustomerDaoImpl();
		c=dao.validate(e, p);
		RequestDispatcher rd=null;
		if(c!=null) 
		{
		HttpSession session=request.getSession();
		session.setAttribute("currentUser", c);
			if(c.getRoll().equals("ADMIN")) {
				System.out.println("_____________\n"+c.getRoll()+"\n____________________");
		response.sendRedirect("Auser.jsp");
		}else {
		
		response.sendRedirect("index.jsp");
		}
		}
		else {
			
			rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}}
