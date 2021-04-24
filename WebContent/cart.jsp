<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         
           <%@ include file="header.jsp" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

<h3 align="center">CART</h3>

<table class="table table-hover table-dark">
<c:forEach var="i" items="${ca}">

  <thead>
    <tr class="bg-warning">
     <th scope="col" >Product Image</th>
      <th scope="col" >Product Name</th>
      <th scope="col">Quantity</th>
      <th scope="col">Price of a product</th>
      <th scope="col">Total Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    <tr tar="${i.cartItemId}"><form action="Removecart" method="get">
      <th scope="row"><img src="${i.product.img}" height="300px" width="300px"></th>
      <td>${i.product.name}</td>
      
      <td><input type="number" name="qty" min="1" max="10" value="${i.quantity}"/></td>
      <td>${i.product.price}</td>
      <td class ="agreegate" id="${i.cartItemId}">${i.product.price*i.quantity}</td>
      <td>
<input type="hidden" name="product" value="${i.productId}">
<button type="submit" class="btn btn-danger">Remove</button>
<a href="index.jsp"><button type="button"class="btn btn-success">Add more</button></a>

</td>

</form>
    </tr>
    
  </tbody>
  </c:forEach>

</table>
<script>
$(document).ready(function(){
	$("input").change(function(){
		var data=parseInt($(this).val());
		var price=parseInt($(this).parent().next().html());
		var p=$(this).parent().parent();
		var target=p.attr("tar");
		p.find("#"+target).html(data*price);
		
	
	});
	var d=document.getElementsByClassName("agreegate");
	var total=0;
	var i=0;var x="1";
	for(; i<d.length; i++){
		x=d[i].innerHTML;
		total+=parseInt(x);
	}
	$("[name=grandtotal]").attr("value",total);
});


</script>

<form action="Shipping.jsp" method="post">
<input type="hidden" value="" name="grandtotal">
  <button type="submit" class="btn btn-primary" style=" width:100%;" > Purchase  </button>
 
 </form>
</body>
</html>