package com.niit.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Dao.CustomerDao;
import com.niit.Dao.CustomerDaoImpl;
import com.niit.Model.CustomerDetails;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
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
		
		String id=request.getParameter("id");
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		String username=request.getParameter("username");
		
		String password=request.getParameter("passward");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
        CustomerDao dao = new CustomerDaoImpl();
		int dataid= Integer.parseInt(id.trim());
		
		CustomerDetails lcd =new CustomerDetails();
		
		lcd.setId(dataid);
		lcd.setFirstname(firstname);
		lcd.setLastname(lastname);
		lcd.setUsername(username);
		lcd.setPassword(password);
		lcd.setEmail(email);
		lcd.setPhone(phone);
		
		if(dao.updateCustomerDetail(lcd));
		List<CustomerDetails> cdList = dao.getAllUser();
		if(cdList != null)
		{
			request.setAttribute("list", cdList);
			rd=request.getRequestDispatcher("output.jsp");
			rd.forward(request, response);
			
		}
		else {
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}
		
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
