<%-- 
    Document   : colUniCalenderPost
    Created on : Apr 7, 2019, 9:39:08 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calender</title>
          <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}
input[type=date] {
  width: 40%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}


input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
    </style>
    </head>
    <body>
          <%
String id = request.getParameter("uniEventID");

String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "plymouth";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center" style="color: #009900"> <font><strong>Add Activities to Academic Calendar</strong></font></h2>
 
<h3 align="left" style="color: #009900">Fill with Relevant Details</h3>

<div class="container">
  <form action="../ColUniCalenderPostSevlet" method="post">
    <div class="row">
      <div class="col-25">
        <label for="country">University</label>
      </div>
      <div class="col-75">
        <select id="country" name="name" required> 
          <option value="">Select Your University</option>
          <option value="University of Colombo">University of Colombo (Western Province)</option>
          <option value="University of Peradeniy">University of Peradeniya (Central Province)</option>
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
    <label for="fname">Faculty</label>
    <input type="text" id="fname" name="faculty" placeholder="Faculty Name..">

    <label for="lname">Activity</label>
    <input type="text" id="lname" name="activity" placeholder="Activity Name..">

    <label for="country">Activity</label>
    <label for="country">Start Date</label><br>
    <input type="date" name="sday" ><br><br>
    
    <label for="country">End Date</label><br>
    <input type="date" name="eday" ><br><br>
    
    <label for="subject">Subject</label>
    <textarea id="subject" name="discription" placeholder="Description here.." style="height:200px"></textarea>
    
    <label for="uName">Username</label>
    <input type="text" id="fname" name="uni_username" placeholder="University registered Username.." required="">
    
    <label for="Pass">Password</label><br>
    <input type="password" id="fname" name="uni_password" style="height:40px; width: 200px" placeholder="   University registered Password.." required="">
    <br>
    <br>
    <br>

    <input type="submit" value="Submit">
  </form>
</div>
    </body>
</html>
