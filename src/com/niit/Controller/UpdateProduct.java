package com.niit.Controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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



/**
 * Servlet implementation class UpdateProduct
 */
@WebServlet("/UpdateProduct")

@MultipartConfig(fileSizeThreshold=1024*1024*2,
maxFileSize=1024*1024*10,
maxRequestSize=1024*1024*50)
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProduct() {
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
		
		 String productId=request.getParameter("productId");
		 String name=request.getParameter("name");
		 String description=request.getParameter("description");
		 String qty=request.getParameter("qty");
		 String price=request.getParameter("price");
		 String category=request.getParameter("category");
		 String img = "images/";
		 System.out.println("___________________________\n"+productId+":"+name+":"+description+":"+qty+":"+price);

		 ProductDao dao=new ProductDaoImpl();
		 int dataid= Integer.parseInt(productId.trim());
		 int qt=Integer.parseInt(qty.trim());
		 int pr=Integer.parseInt(price.trim());
		 int cid=Integer.parseInt(category.trim());
		 
		 Product p=new Product();
		 
		 Part part =request.getPart("image");
			InputStream fis=part.getInputStream();
			byte[] bytes = IOUtils.toByteArray(fis);
			String path = request.getServletContext().getRealPath("")+"images";
			String fileName = path+name+".jpg";
			img = img.concat(name+ ".jpg");
			System.out.println(fileName);
			FileOutputStream fos =new FileOutputStream(fileName);
			fos.write(bytes);
			fos.close();
		 
		 p.setProductId(dataid);
		 p.setName(name);
		 p.setDescription(description);
		 p.setQty(qt);
		 p.setPrice(pr);
		p.setImg(img);
		 p.setCatid(cid);
		 
		 if(  dao.updateProduct(p));
		 {
			 List<Product> productList = dao.getAllproduct();
			 if(productList !=null)
			 {
			 	request.setAttribute("list", productList);
			 	rd=request.getRequestDispatcher("Aproductdata.jsp");
			 	rd.forward(request, response);
			 }

			 else {
			 	
			 	rd=request.getRequestDispatcher("error.jsp");
			 	rd.forward(request, response);
			 }

		 }
		     


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
