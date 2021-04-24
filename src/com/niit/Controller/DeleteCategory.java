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

/**
 * Servlet implementation class DeleteCategory
 */
@WebServlet("/DeleteCategory")
public class DeleteCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCategory() {
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
		
		String st = request.getParameter("catid");
		int id=Integer.parseInt(st);
	
		
		CategoryDao dao=new CategoryDaoimpl();
		
		if(dao.deleteCategory(id)) 
			
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

			
		}
		else {
			
			rd = request.getRequestDispatcher("addingcategory.jsp");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
