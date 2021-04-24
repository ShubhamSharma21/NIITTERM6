package com.niit.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Dao.CategoryDao;
import com.niit.Dao.CategoryDaoimpl;
import com.niit.Dao.CustomerDao;
import com.niit.Dao.CustomerDaoImpl;
import com.niit.Model.Category;

/**
 * Servlet implementation class AddCategory
 */
@WebServlet("/addCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        String catdesc = request.getParameter("desc");
        String catname = request.getParameter("name");
      
        
        
       Category ct = new Category();
        
     ct.setCatdesc(catdesc);
     ct.setCatname(catname);
     
     
   CategoryDao dao = new CategoryDaoimpl();
   RequestDispatcher rd = null;
        
        	
        if(dao.addCategory(ct))
		{
			rd=request.getRequestDispatcher("GetAllCategory");
			rd.forward(request, response);
		}   
        

	}

}
