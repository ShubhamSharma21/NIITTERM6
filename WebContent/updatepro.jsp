<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="header.jsp" %>
    
    <%@page import="com.niit.Dao.ProductDao" %>
		  <%@page import="com.niit.Dao.ProductDaoImpl" %>
	      <%@page import="com.niit.Model.Product" %> 
	      <%@page import="com.niit.Model.Category" %>
	      <%@page import="com.niit.Dao.CategoryDao" %>
	      <%@page import="com.niit.Dao.CategoryDaoimpl" %>
	      <%@page import="java.util.List" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product</title>



<style>



body{
	 background-image:url(bikepic/bp4.jpg);
	 background-repeat:no-repeat;
	 background-size:cover;
	 width:100%;
	 height:100vh;
	 overflow:auto;
	 
}


option{
color:white;
background-color:black;
}

.container11{
	font-family:Roboto,sans-serif;
	  background-image:url(https://image.freepik.com/free-vector/dark-blue-blurred-background_1034-589.jpg) ;
    text-align:center;
     border-style: 1px solid grey;
     margin: 0 auto;
     text-align: center;
     opacity: 0.8;
     margin-top: 67px;
   box-shadow: 2px 5px 5px 0px #eee;
     max-width: 500px;
     padding-top: 10px;
     height: 420px;
     margin-top: 100px;
}

.description{
	 margin-left: 60px;
	 text-align:center;
     font-family: sans-serif;
     font-size: 18px;
     color: #ff9;
     margin-top: 5px;
}
.name{
	 margin-left: 95px;
     font-family: sans-serif;
     font-size: 18px;
    color: #ff9;
     margin-top: 5px;
}

#name{
	 margin-top:10px;
}

#description{
	 margin-top:5px;
}
	  

.heading{
	 text-decoration:bold;
	 text-align : center;
	 font-size:30px;
	 color:#F96;
	 padding-top:10px;
}

.input-menu {background-color:black;
color:red;}



#qty{
	  margin-top: 5px;
}


.qty{
	 margin-left: 80px;
     font-family: sans-serif;
    color: #ff9;
     font-size: 18px;
     margin-top: 5px;
}
.price{
	color: #ff9;
   
     font-size: 18px;
     font-family: sans-serif;
     margin-left: 108px;
     margin-top: 5px;
}
#price{
 margin-top: 5px;
}

      
.image{
	 font-size: 18px;
     margin-left: 102px;
     margin-top: 5px;
     color: #ff9;
	
}

#image{
 margin-top: 5px;
}	

.category{
	 font-size: 18px;
     margin-left: 78px;
     margin-top: 5px;
     color: #ff9;
	
}

#category{
 margin-top: 5px;
}

.submit{

margin-left:100px;

}

}	



</style>

</head>
<body>
<form method="post" action="UpdateProduct" enctype="multipart/form-data">
   <%String str = request.getParameter("update");
System.out.println("update is " + str);

ProductDao dao = new ProductDaoImpl();
int dataid= Integer.parseInt(str.trim());
Product lcd = dao.getProductById(dataid);
%>

    <% CategoryDao cdao = new CategoryDaoimpl();
				List<Category> categoryList = cdao.getAllCategory(); %>

 <div class="container11">

     <header class="heading">Add Product</header><hr></hr>
<input type="hidden" name="productId" value="<%=lcd.getProductId() %>" />
	<div class="row ">

         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="name">Name :</label> </div>
		         <div class="col-xs-8">
		             <input type="text" name="name" placeholder="Enter your product" class="form-control " value="<%=lcd.getName() %>" style="background:transparent; color:white; border:none; margin-left: 16px;">
             </div>
		      </div>
		 </div>
		 <br>


            
		 
		 
         <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
                     <label class="description"> Description:</label></div>
				<div class ="col-xs-8">	 
		             <input type="text" name="description"  placeholder="Enter Description " class="form-control last" value="<%=lcd.getDescription() %>" style="background:transparent; color:white; border:none; margin-left: 14px;">
                </div>
		     </div>
		 </div>
  
  
		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="qty" >Quantity :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="number" name="qty"  placeholder="Enter your Quantity" class="form-control" value="<%=lcd.getQty() %>"  style="background:transparent; color:white; border:none; margin-left: 14px;" >
		         </div>
		     </div>
		 </div>

          <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="price">Price :</label></div>
				  <div class="col-xs-8">
			             <input type="number" name="price" placeholder="Enter price" class="form-control" value="<%=lcd.getPrice() %>" style="background:transparent; color:white; border:none; margin-left: 14px;">
				 </div>
          </div>
		  </div>
		  
		  <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="category">Category :</label></div>
				  <div class="col-xs-8">
			            <select id="cat" name="category" class="form-control" style="background:transparent; color:grey; border:none; margin-left: 10px; ">
  
  <% for(Category cat:categoryList){
	   out.print("<option value='"+cat.getCatid()+"'>"+cat.getCatname()+"</option>");
   } %>
   
  </select>
				 </div>
          </div>
		  </div>
		  
		   <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="image">Image</label></div>
				  <div class="col-xs-8">
			             <input type="file" name="image"  class="form-control" value="<%=lcd.getImg()%>" style="background:transparent; color:white; border:none; margin-left: 10px;">
				 </div>
          </div>
		  </div>
		
 <div class="form-group">
		    
        <button type="submit" class="btn btn-danger btn-block" style="margin-left:140px;" > Update Product  </button>
    </div>
		   </div>
		 </div>

		 		 
		 

</form>

</body>
</html>