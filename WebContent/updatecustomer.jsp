<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import="com.niit.Dao.CustomerDao" %>
       <%@page import="com.niit.Dao.CustomerDaoImpl" %>
       <%@page import="com.niit.Model.CustomerDetails" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<title>Update User</title>


<style>

.divider-text {
    position: relative;
    text-align: center;
    margin-top: 15px;
    margin-bottom: 15px;
}
.divider-text span {
    padding: 7px;
    font-size: 12px;
    position: center;   
    z-index: 2;
}
.divider-text:after {
    content: "";
    position: absolute;
    width: 100%;
    border-bottom: 1px solid #ddd;
    top: 55%;
    left: 0;
    z-index: 1;
}

.btn-facebook {
    background-color: #405D9D;
    color: #fff;
}
.btn-twitter {
    background-color: #42AEEC;
    color: #fff;
}

</style>

</head>
<body style="background-color:#6C7A5E;">
<form action="UpdateUser" method="post">

<%String str = request.getParameter("update");
System.out.println("update is " + str);

CustomerDao dao = new CustomerDaoImpl();
int dataid= Integer.parseInt(str.trim());
CustomerDetails lcd = dao.getCustomerById(dataid);
System.out.println(lcd.getPassword()); %>

<div class="container" style="background-color:#FFE95C;">



<div class="card bg-light" ><center>

<article class="card-body mx-auto" style="max-width:400px;">
	<h4 class="card-title mt-3 text-center">Update Account</h4>

	
	
    
	<form action="UpdateUser" method="post">

	
	
	<Input type="hidden" value=<%=lcd.getId() %> name="id">
	
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input name="firstname" class="form-control" placeholder="Enter first name" type="text" value=<%=lcd.getFirstname() %>>
    </div> <!-- form-group// -->
    
    	<div class="form-group input-group">
    	
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input name="lastname" class="form-control" placeholder="Enter last name" type="text" value=<%=lcd.getLastname() %> >
    </div>
    
    <div class="form-group input-group">
    	
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input name="username" class="form-control" placeholder="Enter user name" type="text"  value=<%=lcd.getUsername() %>>
    </div>
    
    
    
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-envelope"></i> </span>
		 </div>
        <input name="email" class="form-control" placeholder="Email address" type="email" value=<%=lcd.getEmail() %>>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
		</div>
		
    	<input name="phone" class="form-control" placeholder="Phone number" type="text" value=<%=lcd.getPhone() %>>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	
		
	</div> <!-- form-group end.// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" name="passward" placeholder="Enter password" type="password" value=<%=lcd.getPassword() %>>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		  
		</div>
       
    </div> <!-- form-group// -->                                      
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Update Account  </button>
    </div> <!-- form-group// -->      
                                                                    
</form>
</article>
</div> 

</div> 
</form>
</body>
</html>