<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.niit.Model.CustomerDetails" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Motor_Club</title>

<!-- drop down list -->

<style>
.dropdown:hover>.dropdown-menu {
  display: block;
}

.dropdown>.dropdown-toggle:active {
  
    pointer-events: none;
}
</style>

</head>
<body>

<%HttpSession sc= request.getSession();
CustomerDetails c=null;
if(sc.getAttribute("currentUser")!=null){
	 c=(CustomerDetails)sc.getAttribute("currentUser");
	System.out.println(c.getEmail());	
}

%>



<nav class="navbar navbar-expand-sm bg-dark navbar-dark">  


  <a class="navbar-brand" href="#"><img src="images/logo.png" height="35px"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
     

      <!-- drop down list -->
      
<div class="dropdown">
  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="border:none; background:transparent;">
    Bike Category
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="Categoryimg?cat=7">Average Bike</a>
    <a class="dropdown-item" href="Categoryimg?cat=8">Cruiser Bike</a>
    <a class="dropdown-item" href="Categoryimg?cat=9">Off-road Bike</a>
    <a class="dropdown-item" href="Categoryimg?cat=10">Sport Bike</a>
    <a class="dropdown-item" href="Categoryimg?cat=11">Super Bike</a>
    <a class="dropdown-item" href="Categoryimg?cat=12">Touring Bike</a>
  
          
  </div>
</div>
     
     <div class="dropdown">
  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="border:none; background:transparent;">
    Scooter
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="Categoryimg?cat=13">Scooter 110cc</a>
    <a class="dropdown-item" href="Categoryimg?cat=14">Scooter 125cc</a>
    <a class="dropdown-item" href="Categoryimg?cat=15">Scooter 150cc</a>
  </div>
</div>
  
     <div class="dropdown">
  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="border:none; background:transparent;">
    Electric Vehicles
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="Categoryimg?cat=16">Electric Bike</a>
    <a class="dropdown-item" href="Categoryimg?cat=17">Electric Scooter</a>

</div>
    
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
      
   <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
      
       <li class="nav-item">
        <a class="nav-link" href="Cart"><img src="images/cart.png">Cart</a>
      </li>
      
      <%if(c==null){
    	  out.print("<a class=\"nav-link\" href=\"register.jsp\"> Sign up <span class=\"sr-only\">(current)</span></a></li><li class=\"nav-item\"> <a class=\"nav-link\" href=\"login.jsp\">Login</a>");
      } 
      else
      {
    	out.print("<a class=\"nav-link\" href=\"logout\">Logout <span class=\"sr-only\">(current)</span></a>");  
    	 
      }
      %>
      </li>  
      </ul>
      
    </form>
  </div>
</nav>

</body>
</html>