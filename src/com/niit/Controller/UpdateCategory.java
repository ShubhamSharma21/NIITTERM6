package com.niit.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Dao.CategoryDao;
import com.niit.Dao.CategoryDaoimpl;
import com.niit.Model.Category;
import com.niit.Model.Product;

/**
 * Servlet implementation class UpdateCategory
 */

@WebServlet("/UpdateCategory")
public class UpdateCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd=null;
		
		 String catid=request.getParameter("catid");
		 String catdesc = request.getParameter("desc");
	     String catname = request.getParameter("name");
		
	     CategoryDao dao=new CategoryDaoimpl();
	     int dataid= Integer.parseInt(catid.trim());
	     
	     Category c=new Category();
	     c.setCatid(dataid);
	     c.setCatname(catname);
	     c.setCatdesc(catdesc);
	     
	    if( dao.updateCategory(c))
	    {
	     
	    	List<Category> categoryList = dao.getAllCategory();
	    
		if(categoryList !=null)
		{
			request.setAttribute("list", categoryList);
			rd=request.getRequestDispatcher("Acategorydata.jsp");
			rd.forward(request, response);
		}
		
		else {
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
			
		}}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


