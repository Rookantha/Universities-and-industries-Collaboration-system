<%-- 
    Document   : studentHome
    Created on : Apr 4, 2019, 7:41:38 PM
    Author     : ISURU
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
        <title>Student Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}


.sidebar 
{
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidebar a 
{
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidebar a:hover {
  color: #f1f1f1;
}

.sidebar .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.openbtn {
  font-size: 20px;
  cursor: pointer;
  background-color: #111;
  color: white;
  padding: 10px 15px;
  border: none;
}

.openbtn:hover {
  background-color: #444;
}

#main {
  transition: margin-left .5s;
  padding: 16px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.form-inline {  
  display: flex;
  flex-flow: row wrap;
  align-items: center;
}

.form-inline label,select {
  margin: 5px 10px 5px 0;
}

.form-inline input,select {
  vertical-align: middle;
  margin: 5px 10px 5px 0;
  padding: 10px;
  background-color: #fff;
  border: 1px solid #ddd;
}

.form-inline button {
  padding: 10px 20px;
  background-color: #009900;
  border: 1px solid #ddd;
  color: white;
  cursor: pointer;
}

.form-inline button:hover {
  background-color: #ff0000;
}

div#select {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
@media (max-width: 800px) {
  .form-inline input {
    margin: 10px 0;
  }
  
  .form-inline {
    flex-direction: column;
    align-items: stretch;
  }
}

</style>
</head>
<body>
<div id="mySidebar" class="sidebar">
    <%
        String UserName = session.getAttribute("UserName").toString();
        String UserType = session.getAttribute("UserType").toString();
    %>
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
  <a href="#" style="color:yellow"><%=UserName%></a>
  <a href="http://localhost:8080/plymouthapp/events/retrieveIndustyPostJsp.jsp">Corporate Events</a>
  <a href="http://localhost:8080/plymouthapp/events/retrieveUniPostJsp.jsp">Professional Events</a>
  <a href="http://localhost:8080/plymouthapp/research/researchHome.jsp">Research</a>
  <a onclick="Navigate()" style="cursor: pointer;">Logout</a>
  

  <script type="text/javascript">
    function Navigate()
    {   
         window.location.replace('http://localhost:8080/plymouthapp/user/userLog.jsp');
        return false;
    }
   </script>
  
</div>

<div id="main">
      <button class="openbtn" onclick="openNav()">☰ Students</button>  
     <h3>Sharing With University and Industry Talks , Workshops , Events , Research Mach more ....</h3>
     <br>
<div id = "select">      
     <h4>Check the Activities by Category...</h4>
     
<form class="form-inline" action="../studentHomeServlet" method="post">
    
    <label for="uni">Category</label>
        <select id="country" name="event"required>
        <option value="professional">Professional</option>
        <option value="corporate">Corporate</option>    
    </select> 
    
    <input type="hidden" name="UName" value="<%=UserName%>"/>
    <input type="hidden" name="UType" value="<%=UserType%>"/>
 
<label for="uni">University</label>

        <select id="country" name="univercity"required>
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
<br>
 
<button type="submit">Enter</button>
</form>
<br>
<br>
<br>     
</div>  
</div>   
    
    <br>
    <h3> All Industrial Events .......</h3>
    
<table align="center" style="border:1px solid #000000;">


<script>
function openNav() {
  document.getElementById("mySidebar").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
  document.getElementById("mySidebar").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}

</script>
<div style="margin-top:25px;padding:8px 8px 8px;font-size:18px">
      <%
String id = request.getParameter("userId");
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
<table align="center" cellpadding="10" cellspacing="10" border="0">
<tr>

</tr>
<tr bgcolor="#009900">
<td><b><font color="White">Industry Name</font></b></td>
<td><b><font color="White">Event Category</font></b></td> 
<td><b><font color="White">Event Name</font></b></td>
<td><b><font color="White">Selected Universities</font></b></td> 
<td><b><font color="White">Selected Subjects</font></b></td>
<td><b><font color="White">Event Venue</font></b></td> 
<td><b><font color="White">Event Time</font></b></td>
<td><b><font color="White">Description</font></b></td> 

</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName , userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM industry_post_events ORDER BY eventTime DESC";



resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#e6ffe6">


<td><%=resultSet.getString("industryName") %></td>
<td><%=resultSet.getString("eventCategory") %></td>
<td><%=resultSet.getString("eventName") %></td>
<td><%=resultSet.getString("tagUnivercity") %></td>
<td><%=resultSet.getString("tagCategory") %></td>
<td><%=resultSet.getString("eventVenue") %></td>
<td><%=resultSet.getString("eventTime") %></td>
<td><%=resultSet.getString("discription") %></td>


</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
    </body>
</html>
