package com.niit.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Dao.ProductDao;
import com.niit.Dao.ProductDaoImpl;
import com.niit.Model.Product;

/**
 * Servlet implementation class Categoryimg
 */
@WebServlet("/Categoryimg")
public class Categoryimg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Categoryimg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
RequestDispatcher rd = null;
		int cat= Integer.parseInt(request.getParameter("cat"));
		ProductDao pdao = new ProductDaoImpl();
		List<Product> productList = pdao.getCategoryimg(cat);
		if(productList !=null)
		{
			request.setAttribute("list", productList);
			if(cat==7) 
			{
			rd=request.getRequestDispatcher("averagebike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==8)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("cruiserbike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==9)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("offroadbike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==10)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("sportbike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==11)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("superbike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==12)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("touringbike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==13)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("scooter110cc.jsp");
			rd.forward(request, response);
		}
		
		if(cat==14)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("scooter125cc.jsp");
			rd.forward(request, response);
		}
		
		if(cat==15)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("scooter150cc.jsp");
			rd.forward(request, response);
		}
		
		if(cat==16)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("electricbike.jsp");
			rd.forward(request, response);
		}
		
		if(cat==17)
		{
			request.setAttribute("list", productList);
			rd=request.getRequestDispatcher("electricscooter.jsp");
			rd.forward(request, response);
		}
	}
		
		else 
			
		
		
		{
			
			rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
	}
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
