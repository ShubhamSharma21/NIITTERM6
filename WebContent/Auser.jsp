<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
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
    
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

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
<body style="background:url(images/mypatner.jpg) height="200px" width="200px"> 

<div class="wrapper">
    <div class="sidebar" data-color="blue" data-image="assets/img/sidebar-5.jpg">

    <!--   you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" -->


    	<div class="sidebar-wrapper">
            <div class="logo">
                <a class="simple-text">
                    	MOTOR CLUB
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
		
  
       <div class="container">

<nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                
                <div class="collapse navbar-collapse">
                   

                    <ul class="nav navbar-nav navbar-right">
                       
                        <li>
                             <a href="logout"> <img src="images/logout.png">Log out </a>
                        </li>
						
                    </ul>
                </div>
            </div>
        </nav>

<img alt="hi" src="images/thnxpage.jpg" width="100%" height="500px">
       
       
       
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
