package com.niit.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.niit.Dao.ProductDao;
import com.niit.Dao.ProductDaoImpl;
import com.niit.Model.Product;
import com.niit.service.MailSendService;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
@MultipartConfig(fileSizeThreshold=1024*1024*2,
maxFileSize=1024*1024*10,
maxRequestSize=1024*1024*50)
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String img = "images/";
		String Category= request.getParameter("category");
		System.out.println("______________________________________\n"+Category);
		
		int qty = Integer.parseInt(request.getParameter("qty"));
		int price = Integer.parseInt(request.getParameter("price"));
		 
		int catid = Integer.parseInt(Category);
		
		
		
		
		Product pro = new Product();
		
		Part part =request.getPart("image");
		InputStream fis=part.getInputStream();
		byte[] bytes = IOUtils.toByteArray(fis);
		String path = request.getServletContext().getRealPath("")+"images";
		String fileName = path+File.separator+name+".jpg";
		img= img.concat(name+".jpg");
		System.out.println(fileName);
		FileOutputStream fos =new FileOutputStream(fileName);
		fos.write(bytes);
		fos.close();
		
		pro.setImg(img);
	
		pro.setName(name);
		pro.setDescription(desc);
		pro.setQty(qty);
		pro.setPrice(price);
		pro.setCatid(catid);
		
		
		ProductDao pdao = new ProductDaoImpl();
		RequestDispatcher rd = null;
		if(pdao.addProduct(pro))
		{System.out.println("data added");

		
	rd=request.getRequestDispatcher("GetAllProduct");
	rd.forward(request, response);
}
else {
	System.out.println("there is something error pls fill the form again");
	rd=request.getRequestDispatcher("Registration.jsp");
	rd.include(request, response);
}
	}

	}
