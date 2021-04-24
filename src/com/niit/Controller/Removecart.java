package com.niit.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Dao.CartDAO;
import com.niit.Dao.CartDaoImpl;
import com.niit.Model.CustomerDetails;


@WebServlet("/Removecart")
public class Removecart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Removecart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product = request.getParameter("product");
        int productId= Integer.parseInt(product);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		CustomerDetails cd=(CustomerDetails)session.getAttribute("currentUser");
		RequestDispatcher rd=null;
		
		CartDAO cc = new CartDaoImpl();
		
		if(cd==null) 
		{
		
		response.sendRedirect("login.jsp");
		}
		else {
			cc.removeproduct(productId, cd.getId());
			
		response.sendRedirect("index.jsp");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
