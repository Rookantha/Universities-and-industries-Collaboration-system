<%-- 
    Document   : addResearch
    Created on : Apr 17, 2019, 11:08:23 PM
    Author     : ISURU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Add Research</title>
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
        <h1 style="color: #4d88ff">Upload Research Paper </h1>
        <h3 style="color: #a6a6a6;"> Fill with Actual Details</h3> 

    <%
        String UserName = session.getAttribute("UserName").toString();
        String UserType = session.getAttribute("UserType").toString();
    %>
        
<div class="container">
  <form  method="post" action="../AddResearchServlet" enctype="multipart/form-data">
    <div class="row">
      <div class="col-25">
        <label for="industryName"> University , Industry or Student Name</label>
      </div>
      <div class="col-75">
          <input type="text" id="fname" name="name" placeholder="Your Full Name ..." readonly="true" value="<%=UserName%>"/>
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="country">User Type</label>
      </div>
      <div class="col-75">
        <input type="text" id="fname" name="userType" placeholder="Your Full Name ..." readonly="true" value="<%=UserType%>"/>
        </div>
    </div> 
    <div class="row">
      <div class="col-25">
        <label for="eventVenue">Research Headline</label>
      </div>
      <div class="col-75">
        <input type="text" id="eventVenue" name="headline" placeholder="Enter Heading.." required>
      </div>
    </div>
    
    <div class="row">
      <div class="col-25">
        <label for="Subjects">Research Subject </label>
      </div>
      <div class="col-75">
         <input type="checkbox" name="interestingSubjects" value="Computer Science"> Computer Science<br>
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
        <label for="country">Tag University</label>
      </div>
      <div class="col-75">
        <select id="country" name="tagUnivercity" >
          <option value="">Tag University</option>  
          <option value="University of Colombo">University of Colombo (Western Province)</option>
          <option value="University of Peradeniy">University of Peradeniya (Central Province)</option>
          <option value="University of Ruhuna ">University of Ruhuna (Southern Province)</option>
           <option value="NSBM">NSBM(Western Province)</option>
          <option value="University of Peradeniya ">University of Peradeniya (Central Province)</option>
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
        <label for="eventVenue">Email</label>
      </div>
      <div class="col-75">
        <input type="text" id="eventVenue" name="email" placeholder="Enter your Email.." required>
      </div>
    </div>
    
      <div class="row">
      <div class="col-25">
        <label for="text">PDF File</label>
      </div>
      <div class="col-75">
          <input type="file" accept="application/pdf" id="eventTime" name="pdf" style="margin-top:10px" placeholder="Select PDF File.." required>
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
      <input type="submit" value="Upload Article">
    </div>
  </form>
</div>

</body>
    
</html>
