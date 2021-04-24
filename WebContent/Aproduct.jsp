<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
    
    <%@page import="com.niit.Dao.CategoryDao" %>
    <%@page import="com.niit.Dao.CategoryDaoimpl" %>
    <%@page import="com.niit.Model.Category" %>
    <%@page import="java.util.List" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Admin</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />



    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

   
    <link href="assets/css/animate.min.css" rel="stylesheet"/>


    <link href="assets/css/light-bootstrap-dashboard.css?v=1.4.0" rel="stylesheet"/>


   
    <link href="assets/css/demo.css" rel="stylesheet" />


    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
    
    <style>


.mydiv{
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





</style>
</head>
<body>

<div class="wrapper">
    <div class="sidebar" data-color="orange" data-image="assets/img/sidebar-5.jpg">

    	<div class="sidebar-wrapper">
            <div class="logo">
                <a class="simple-text">
                   Motor Club
                </a>
            </div>

            <ul class="nav">
                <li>
                    <a href="Auser.jsp">
                        <i class="pe-7s-graph"></i>
                        <p>Hello Admin</p>
                    </a>
                </li>
                <li>
                    <a href="getAllUser">
                        <i class="pe-7s-graph"></i>
                        <p>User Data</p>
                    </a>
                </li>
                <li>
                    <a href="Acategory.jsp">
                        <i class="pe-7s-user"></i>
                        <p>Category</p>
                    </a>
                </li>
                <li>
                    <a href="GetAllCategory">
                        <i class="pe-7s-note2"></i>
                        <p>Category Data</p>
                    </a>
                </li>
                <li>
                    <a href="Aproduct.jsp">
                        <i class="pe-7s-news-paper"></i>
                        <p>Product</p>
                    </a>
                </li>
                <li>
                    <a href="GetAllProduct">
                        <i class="pe-7s-science"></i>
                        <p>Product Data</p>
                    </a>
                </li>
               
             
                
            </ul>
    	</div>
    </div>

    <div class="main-panel">
		<nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Product</a>
                </div>
                <div class="collapse navbar-collapse">
                   
                        <ul class="nav navbar-nav navbar-right">
                       
                        <li>
                             <a href="logout"> <img src="images/logout.png">Log out </a>
                        </li>
						
                    </ul>
                </div>
            </div>
        </nav>


       
       <div class="mydiv">
       <form method="post" action="AddProduct" enctype="multipart/form-data">

 <div class="container11">

     <header class="heading">Add Product</header><hr></hr>

	<div class="row ">

         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="name">Name</label> </div>
		         <div class="col-xs-8">
		             <input type="text" name="name" placeholder="Enter your product" class="form-control " style="background:transparent; color:white; border:none; margin-left: 3px;" required autofocus>
             </div>
		      </div>
		 </div>
		 <br>


                <% CategoryDao cdao = new CategoryDaoimpl();
				List<Category> categoryList = cdao.getAllCategory(); %>
		 
		 
         <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
                     <label class="description"> Description</label></div>
				<div class ="col-xs-8">	 
		             <input type="text" name="desc"  placeholder="Enter Description " class="form-control last" style="background:transparent; color:white; border:none; margin-left: 3px;">
                </div>
		     </div>
		 </div>
  
  
		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="qty" >Quantity</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="number" name="qty"  placeholder="Enter your Quantity" class="form-control" style="background:transparent; color:white; border:none; margin-left: 3px;" >
		         </div>
		     </div>
		 </div>

          <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="price">Price</label></div>
				  <div class="col-xs-8">
			             <input type="number" name="price" placeholder="Enter price" class="form-control" style="background:transparent; color:white; border:none; margin-left: 3px;">
				 </div>
          </div>
		  </div>
		  
		  <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="category">Category</label></div>
				  <div class="col-xs-8">
			            <select id="cat" name="category" class="form-control" style="background:transparent; color:grey; border:none; margin-left: 3px; ">
  
   <% for(Category cat:categoryList){
	   out.print("<option  value='"+cat.getCatid()+"'>" +cat.getCatname()+"</option>");}
    %>
   
  </select>
				 </div>
          </div>
		  </div>
		  
		   <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="image">Image</label></div>
				  <div class="col-xs-8">
			             <input type="file" name="image"  class="form-control" style="background:transparent; color:white; border:none; margin-left: 3px;"><br>
				 </div>
          </div>
		  </div>
		
		  
		  
	
 
		  
  
        
		 <div class="form-group">
		    
        <button type="submit" class="btn btn-danger btn-block" style="margin-left:180px; width:200px;" > Add Product  </button>
    </div>
		   </div>
		 </div>

		 		 
		 

</form>
       
           </div> 
       
       
       

        <footer class="footer">
            <div class="container-fluid">
               
                <p class="copyright pull-right">
                    &copy; <script>document.write(new Date().getFullYear())</script> <a href="index.jsp">Motor Club</a>, made with love for a better web
                </p>
            </div>
        </footer>

    </div>
</div>


</body>

    <script src="assets/js/jquery.3.2.1.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

	<script src="assets/js/chartist.min.js"></script>

    <script src="assets/js/bootstrap-notify.js"></script>

    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>

	<script src="assets/js/light-bootstrap-dashboard.js?v=1.4.0"></script>

	<script src="assets/js/demo.js"></script>

</html>
