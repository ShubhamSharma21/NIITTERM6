<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="header.jsp" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Motor Club</title>
</head>

<body style="background-color:black;">


<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" style="height:700px;">
    <div class="carousel-item active">
      <img src="images/b2.jpg" class="d-block w-100" Width="50%" height="700px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Own your dream bike</h5>
        <p>Yesterday is history; tomorrow is a mystery, ride like a hero.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="images/b1.jpg" class="d-block w-100" Width="50%" height="700px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Adventures Made Better</h5>
        <p>A long ride can clear your mind, restore your faith and use up a lot.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="images/bike5.jpg" class="d-block w-100" Width="50%" height="700px">
      <div class="carousel-caption d-none d-md-block">
        <h5>Ride And Live Today</h5>
        <p>Faster, faster, until the thrill of speed overcomes the fear of death.</p>
      </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div><br>



<div class="container">

<div class="card-deck">


 <div class="card" style="border:1px solid black;">
    <img src="AverageBike/livo.jpg" class="card-img-top" alt="AverageBike" height="400px">
    <div class="card-body"  style="background-color: #99ffcc;">
      <h5 class="card-title">Honda Livo</h5>
      <p class="card-text">By MotorClub</p>
      <p class="card-text"><small class="text-muted">On road price 83263</small>
       <form action="Addcart" method="get">
       </form>
        
    </div>
  </div>
  
  <!-- next product -->

<div class="card" style="border:1px solid black;">
    <img src="CruiserBike/harley.jpg" class="card-img-top" alt="AverageBike" height="400px">
    <div class="card-body"  style="background-color: #99ffcc;">
      <h5 class="card-title">HARLEY</h5>
      <p class="card-text">by MotorClub</p>
      <p class="card-text"><small class="text-muted">On road price 1800000</small>
       <form action="Addcart" method="get">
 
            </form>
      
    </div>
  </div>
  
  <div class="card" style="border:1px solid black;">
    <img src="AverageBike/shine.jpg" class="card-img-top" alt="CruiserBike" height="400px">
    <div class="card-body" style="background-color: #99ffcc;">
      <h5 class="card-title">Honda Shine</h5>
      <p class="card-text">by MotorClub</p>
      <p class="card-text"><small class="text-muted">On road price 76000 </small>
       <form action="Addcart" method="get">
	 </form>
      
    </div>
  </div>
  
    
</div> <br>

</div>



<img alt="dekhte h" src="images/bajaj1.jpg" height="600px;" width="100%;">

<br><br>
<div class="card-deck"><br>


  <div class="card" style="border:1px solid black;">
    <img src="TouringBike/Avenchura.jpg" class="card-img-top" alt="CruiserBike" height="400px">
    <div class="card-body" style="background-color: #99ffcc;">
      <h5 class="card-title">SUZUKI Avenchura</h5>
      <p class="card-text">by MotorClub</p>
      <p class="card-text"><small class="text-muted">On road price 1250000</small>
       <form action="Addcart" method="get">
	 </form>
      
    </div>
  </div>
  
    <div class="card" style="border:1px solid black;">
    <img src="ElectricBike/eb2.jpg" class="card-img-top" alt="CruiserBike" height="400px">
    <div class="card-body" style="background-color: #99ffcc;">
      <h5 class="card-title">E90</h5>
      <p class="card-text">by MotorClub</p>
      <p class="card-text"><small class="text-muted">On road price 670000</small>
       <form action="Addcart" method="get">
	 </form>
      
    </div>
  </div>


</div><br>


<img alt="dekhte h" src="images/bp1.jpg" height="600px;" width="100%;" style="border:3px solid black;">

<%@ include file="footer.jsp" %> 

</body>

 
</html>