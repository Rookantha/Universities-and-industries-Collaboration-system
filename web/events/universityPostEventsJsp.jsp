<%-- 
    Document   : universityPostEventsJsp
    Created on : Apr 3, 2019, 10:16:04 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Events</title>
<style>
* {
  box-sizing: border-box;
}

input[type=text],select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color:#595959 ;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #ff0000;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 8px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
    </head>
    <body>
        <h1 style="color: #4d88ff;">University Events Post Form</h1>
        <h3 style="color: #a6a6a6;"> Fill with Your Event Details</h3> 
        
<div class="container">
  <form  method="post" action="../UniversityPostEventServlet">
    <div class="row">
      <div class="col-25">
        <label for="country">University</label>
      </div>
      <div class="col-75">
        <select id="country" name="name">
          <option value="University of Colombo">University of Colombo (Western Province)</option>
          <option value="University of Peradeniya">University of Peradeniya (Central Province)</option>
           <option value="NSBM">NSBM(Western Province)</option>
          <option value="University of Ruhuna ">University of Ruhuna (Southern Province)</option>
          <option value="University of Sri Jayewardenepura">University of Sri Jayewardenepura (Western Province)</option>
           <option value="University of Kelaniya">University of Kelaniya (Western Province)</option>
          <option value="University of Moratuwa">University of Moratuwa (Western Province)</option>
          <option value="University of Jaffna ">University of Jaffna (Northern Province)</option>
           <option value="Eastern University">Eastern University, Sri Lanka (Eastern Province)</option>
          <option value="South Eastern University">South Eastern University of Sri Lanka, Oluvil (Eastern Province)</option>
          <option value="Open University of Sri Lanka">Open University of Sri Lanka(distance education)</option>
        </select>
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="country">Professional Events</label>
      </div>
      <div class="col-75">
        <select id="country" name="eventCategory">
          <option value="">Select Event Category </option>
          <option value="meetUps">Meet Ups</option>
          <option value="competitions">Competitions</option>
           <option value="hackathons ">Hackathons </option>
          <option value="workShop">Workshops</option>
          <option value="other">Other</option>
          
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">Event Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="lname" name="eventName" placeholder="Your Event Name.."required>
      </div>
    </div>
          <hr>
       <div class="row">
      <div class="col-25">
        <label for="country"> Select Other Universities</label>
      </div>
      <div   class="col-75">
         <input type="checkbox" id="myCheck" name="university" value="University of Colombo"> University of Colombo (Western Province)<br>
         <input type="checkbox" id="myCheck" name="university" value="University of Peradeniya"> University of Peradeniya (Central Province)<br>
         <input type="checkbox" id="myCheck" name="university" value="NSBM" > NSBM(Western Province)  <br>
         <input type="checkbox" id="myCheck" name="university" value="University of Ruhuna "> University of Ruhuna (Southern Province)<br>    
         <input type="checkbox" id="myCheck" name="university" value="University of Sri Jayewardenepura " > University of Sri Jayewardenepura (Western Province)<br>    
         <input type="checkbox" id="myCheck" name="university" value="University of Kelaniya "> University of Kelaniya (Western Province)<br>
         <input type="checkbox" id="myCheck" name="university" value="University of Moratuwa "> University of Moratuwa (Western Province)<br>
         <input type="checkbox" id="myCheck" name="university" value="University of Jaffna "> University of Jaffna (Northern Province)<br>    
          <input type="checkbox" id="myCheck" name="university" value="University of Peradeniya"> University of Peradeniya (Central Province)<br>
         <input type="checkbox" id="myCheck" name="university" value="University of Sri Jayewardenepura "> University of Sri Jayewardenepura (Western Province)<br>    
         <input type="checkbox"id="myCheck" name="university" value="Eastern University Sri Lanka ">South Eastern University Sri Lanka (Eastern Province)<br>
         <input type="checkbox" id="myCheck" name="university" value="Open University of Sri Lanka"> Open University of Sri Lanka(distance education)<br>    
  
      </div>
    </div>
      <hr>
      <div class="row">
      <div class="col-25">
        <label for="country">Category</label>
      </div>
      <div class="col-75">
        <input type="checkbox" name="subjects" value="Software Engineering" > Software Engineering<br>
         <input type="checkbox" name="subjects" value="Network Engineer" > Network Engineer<br>    
         <input type="checkbox" name="subjects" value="Computer Security" > Computer Security<br>
         <input type="checkbox" name="subjects" value="Medicine" > Medicine<br>
         <input type="checkbox" name="subjects" value="Accounting & Finance" > Accounting & Finance<br>    
         <input type="checkbox" name="subjects" value="Business & Management" > Business & Management<br>
         <input type="checkbox" name="subjects" value="Medicine" > Medicine<br>
         <input type="checkbox" name="subjects" value="Law" > Law<br>    
         <input type="checkbox" name="subjects" value="Architecture" > Architecture<br>
        
         
      </div>
    </div>
      <br>
      <div class="row">
      <div class="col-25">
        <label for="eventVenue">Event Venue</label>
      </div>
      <div class="col-75">
        <input type="text" id="eventVenue" name="eventVenue" placeholder="Your Event  Venue.."required>
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="datetime-local">Event Date And Time</label>
      </div>
      <div class="col-75">
        <input type="datetime-local" id="eventTime" name="eventTime" placeholder="Your Event  Venue.."required>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="subject">Event Description</label>
      </div>
      <div class="col-75">
        <textarea id="subject" name="discription" placeholder="Description here.." style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Submit" >
    </div>
  </form>
</div>

</body>
    
</html>
