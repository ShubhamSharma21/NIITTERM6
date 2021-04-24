package com.niit.Controller;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.niit.Dao.CustomerDao;
import com.niit.Dao.CustomerDaoImpl;
import com.niit.Model.CustomerDetails;
import com.niit.service.MailSendService;



/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/Register")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50) 

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	
	String username=request.getParameter("username");
	
	String password=request.getParameter("passward");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");
	
	System.out.println("password is________________________________-"+password);
	
	CustomerDetails cd=new CustomerDetails();
    cd.setFirstname(firstname);
    cd.setLastname(lastname);
    cd.setUsername(username);
    cd.setPassword(password);
    cd.setPhone(phone);
    cd.setEmail(email);
    
	System.out.println("data is going to add");
	CustomerDao dao=new CustomerDaoImpl();
	RequestDispatcher rd;
	if(dao.addcustomerDetails(cd))
	{
		System.out.println("data added");
		try{
			

			
			MailSendService.sendMail(email);
			
			
	
			
			
		}
		catch(Exception e)
		{
			System.out.println("__________________________\n"+e.toString());
		}
		HttpSession session=request.getSession();
		session.setAttribute("currentUser", cd);
		response.sendRedirect("index.jsp");
	}
	else
	{
		out.println("there is some error please fill frorm again");
		rd=request.getRequestDispatcher("error.jsp");
		rd.include(request, response);
	
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