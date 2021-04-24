<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
           <%@ include file="header.jsp" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shipping</title>
</head>
<body style="background:url(images/bb4.jpg)">

<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4" style="color:#F7FF7F">Email</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email"style="background:transparent; color:#F17638;">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4" style="color:#F7FF7F">Name</label>
      <input type="name" class="form-control" id="inputPassword4" placeholder="Name" style="background:transparent; color:#F17638;">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress" style="color:#F7FF7F">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Enter address" style="background:transparent; color:#F17638;">
  </div>
  <div class="form-group">
    <label for="inputAddress2" style="color:#F7FF7F">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor" style="background:transparent; color:#F17638;">
  </div>
  <div class="form-row">
  
    <div class="form-group col-md-6">
      <label for="inputCity" style="color:#F7FF7F">City</label>
      <input type="text" class="form-control" id="inputCity" style="background:transparent; color:#F17638; ">
    </div>
    
    <div class="form-group col-md-4">
      <label for="inputState" style="color:#F7FF7F">State</label>
      <select id="inputState" class="form-control" style="background:transparent; color:#F17638; ">
        <option selected>Choose State..</option>
        <option>Andhra Pradesh</option>
        <option>Arunachal Pradesh </option>
        <option>Ahmedabad </option>
        <option>Assam</option>
        <option>Bihar</option>
        <option>Bangalore</option>
        <option>Chennai </option>
        <option>Chhattisgarh</option>
        <option>Delhi</option>
        <option>Goa</option>
        <option>Gujarat </option>
        <option>Haryana </option>
        <option>Himachal Pradesh </option>
        <option>Hyderabad </otion>
        <option>Jharkhand</option>
        <option>Karnataka</option>
        <option>Chennai </option>
        <option>Kerala</option>
  		<option>Mumbai</option>
        <option>Madhya Pradesh</option>
        <option>Maharashtra</option>
        <option>Manipur</option>
        <option>Meghalaya</option>
        <option>Mizoram</option>
        <option>Nagaland</option>
        <option>Odisha </option>
        <option>Punjab</option>
        <option>Rajasthan</option>
        <option>Seemandhras</option>
        <option>Sikkim </option>
        <option>Tamil Nadu</option>
        <option>Telangana</option>
        <option>Tripura</option>
        <option>Uttar Pradesh</option>
        <option>Uttarakhand</option>
        <option>West Bengal</option>
      
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip" style="color:#F7FF7F">Zip</label>
      <input type="text" class="form-control" id="inputZip" style="background:transparent;  color:#F17638; ">
    </div>
  </div>
  
 
  
  
   <div class="form-row">
  
  
        <legend class="col-form-label col-sm-2 pt-0" style="color:#F7FF7F"><h3>Total Ammount:-</h3></legend>
         <div class="col-sm-10" style="color:#EF0C0C">
                      
           <h3>  <%=request.getParameter("grandtotal") %>    </h3>
                      
                </div>
                            
  </div>
  
  <br>
  
  
  <div class="form-row">
  
     <legend class="col-form-label col-sm-2 pt-0" style="color:#F7FF7F">Payment Method:</legend>
          <div class="col-sm-10">
               <div class="form-check">
                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
   <label class="form-check-label" for="gridRadios1" style="color:#F7FF7F">  Cash on delievery </label>
                               
   </div>
   
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
            <label class="form-check-label" for="gridRadios2" style="color:#F7FF7F">  E-wallets  </label>
             
             </div>                    
                               
               </div>                  

  </div>
  <div class="form-group">
  
  
   
  </div>
  <a href="thankyou.jsp"> <button type="button" class="btn btn-primary" style=" width:100%;" > Purchase </button> </a> 

</form>

</body>
</html>