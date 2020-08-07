<%-- 
    Document   : UnivercityRegisterJsp
    Created on : Apr 1, 2019, 8:06:30 PM
    Author     : ISURU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>University Registration</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}    



input[type=text], select, textarea {
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
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #009933;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
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
        <h1 style="color: #4d88ff">University Register </h1>
        <h3 style="color: #a6a6a6;"> Fill with University Details</h3> 

<div class="container">
  <form  method="post" action="../universityRegisterServlet" enctype="multipart/form-data">
    <div class="row">
      <div class="col-25">
        <label for="country">University</label>
      </div>
      <div class="col-75">
        <select id="country" name="name" required>
          <option value="">Select Your University</option>  
          <option value="University of Colombo">University of Colombo (Western Province)</option>
          <option value="University of Peradeniy">University of Peradeniya (Central Province)</option>
          <option value="University of Ruhuna ">University of Ruhuna (Southern Province)</option>
           <option value="NSBM">NSBM(Western Province)</option>
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
        <label for="Subjects">Subjects </label>
      </div>
      <div class="col-75">
         <input type="checkbox" name="interestingSubjects" value="Law" > All<br>
         <input type="checkbox" name="interestingSubjects" value="Software Engineering" > Software Engineering<br>
         <input type="checkbox" name="interestingSubjects" value="Network Engineer" > Network Engineer<br>    
         <input type="checkbox" name="interestingSubjects" value="Computer Security" > Computer Security<br>
         <input type="checkbox" name="interestingSubjects" value="Medicine" > Medicine<br>
         <input type="checkbox" name="interestingSubjects" value="Accounting & Finance" > Accounting & Finance<br>    
         <input type="checkbox" name="interestingSubjects" value="Business & Management" > Business & Management<br>
         <input type="checkbox" name="interestingSubjects" value="Medicine" > Medicine<br>
         <input type="checkbox" name="interestingSubjects" value="Law" > Law<br>    
         <input type="checkbox" name="interestingSubjects" value="Architecture" > Architecture<br>
        
      </div>
    </div>
      
      <div class="row">
      <div class="col-25">
        <label for="eventVenue">Email</label>
    </div>
      <div class="col-75">
        <input type="text" id="eventVenue" name="email" placeholder="We will Send your Account Details via This Email.."required>
      </div>
    </div>
      <div class="row">
      <div class="col-25">
          <label for="lname">Legal Document For Verification</label>
      </div>
      <div class="col-75">
          <input type="file" accept="application/pdf" id="eventVenue" name="emaile" style="margin-top:10px" placeholder="University ID"required> 
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="subject">Other Details</label>
      </div>
      <div class="col-75">
        <textarea id="subject" name="discription" placeholder="Description here.." style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Register">
    </div>
  </form>
</div>

</body>
    
</html>
