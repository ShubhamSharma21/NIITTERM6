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


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Cart() {
        super();
       
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		CustomerDetails cd=(CustomerDetails)session.getAttribute("currentUser");
		RequestDispatcher rd=null;
		
		CartDAO cc = new CartDaoImpl();
		
		if(cd==null) 
		{
		rd=request.getRequestDispatcher("login.jsp");
		response.sendRedirect("login.jsp");
		}
		else {
			request.setAttribute("ca", cc.getCart(cd.getId()).getCartItem());
			rd=request.getRequestDispatcher("cart.jsp");
			rd.forward(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
