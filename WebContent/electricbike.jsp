<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
     <%@ include file="header.jsp" %> 
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:black;">

<div class="container">


<br>
<c:forEach var="i" items="${list}">

 <div class="card-deck">
 <div class="card" style="border: none; background-color:black; color:white;">
    <img src=${i.img} class=tiny class="card-img-top" alt="AverageBike" height="400px"  width="700px">
    <div class="card-body">
      <h5 class="card-title">${i.name}</h5>
      <p class="card-text">${i.description}</p>
      <p class="card-text"><small class="text-muted">On road price ${i.price}</small>
       <form action="Addcart" method="get">
     
      <input type="hidden" name="product" value="${i.productId}">      
   
            <button type="submit" class="btn btn-dark"style="margin-left:300px;">Add to Cart</button> 
            
            </form>
        
    </div>
  </div>
 </div>

 </c:forEach>
 
 </div>

</body>
</html>