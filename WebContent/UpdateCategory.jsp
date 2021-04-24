<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ include file="header.jsp" %>
       
     <%@page import="com.niit.Dao.CategoryDao" %>
      <%@page import="com.niit.Dao.CategoryDaoimpl" %>
       <%@page import="com.niit.Model.Category" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
      
      
      
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Category</title>

<style>



body{
	 background-image:url(bikepic/bp1.jpg);
	 background-repeat:no-repeat;
	 background-size:cover;
	 width:100%;
	 height:100vh;
	 overflow:auto;
	 
}


.container{
	font-family:Roboto,sans-serif;
	  background-image:url(https://image.freepik.com/free-vector/dark-blue-blurred-background_1034-589.jpg) ;
    
     border-style: 1px solid grey;
     margin: 0 auto;
     text-align: center;
     opacity: 0.7;
     margin-top: 67px;
   box-shadow: 2px 5px 5px 0px #eee;
     max-width: 500px;
     padding-top: 10px;
     height: 300px;
     margin-top: 166px;
}

.description{
	 margin-left: 75px;
     font-family: sans-serif;
     font-size: 18px;
     color: #ff9;
     margin-top:5px;
     
}
.name{
	 margin-left: 110px;
     font-family: sans-serif;
     font-size: 18px;
    color: #ff9;
     margin-top: 5px;
}

#name{
	 margin-top:5px;
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






</style>

</head>
<body>


<form action="UpdateCategory" method="post">

  <%String str = request.getParameter("update");
System.out.println("update is " + str);

CategoryDao dao = new CategoryDaoimpl();
int dataid= Integer.parseInt(str.trim());
Category lcd = dao.getCategoryById(dataid);
%>


<div class="container">

     <header class="heading">Add Category</header><hr></hr>
<input type="hidden" name="catid" value="<%=lcd.getCatid() %>" />
	<div class="row ">

         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="name">Name :</label> </div>
		         <div class="col-xs-8">
		           <input type="text" name="name" placeholder="Enter your category" class="form-control " value="<%=lcd.getCatname()  %>" style="background:transparent; color:white; border:none; margin-left: 50px;"><br>
             </div>
		      </div>
		 </div>
		 
		 
         <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
                     <label class="description"> Description:</label></div>
				<div class ="col-xs-8">	 
		             <input type="text" name="desc"  placeholder="Enter Description " class="form-control last" value="<%=lcd.getCatdesc()  %>" style="background:transparent; color:white; border:none; margin-left: 50px;">
                </div>
		     </div>
		 </div>
  
		  <div class="form-group">
		    
        <button type="submit" class="btn btn-danger " style="margin-left:180px; margin-top:18px;" > Update Category  </button>
		
		</div>
</div>
</div>

</form>
</body>
</html>