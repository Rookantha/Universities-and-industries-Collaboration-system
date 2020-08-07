<%-- 
    Document   : researchHome
    Created on : Apr 17, 2019, 11:05:52 PM
    Author     : ISURU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" meta name="viewport">
        <title>Research Home</title>
        
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

/* Create a column layout with Flexbox */
.row {
  display: flex;
}

/* Left column (menu) */
.left {
  flex: 35%;
  padding: 15px 0;
}

.left h2 {
  padding-left: 8px;
}

/* Right column (page content) */
.right {
  flex: 65%;
  padding: 15px;
}

/* Style the search box */
#mySearch {
  width: 100%;
  font-size: 18px;
  padding: 11px;
  border:1px solid #ddd;
}

/* Style the navigation menu inside the left column */
#myMenu {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

#myMenu li a {
  backgrxound-color: #009900;
  padding: 12px;
  text-decoration: none;
  font-size: 20px;
  color: White;
  display: block
}

#myMenu li a:hover {
  background-color: #000;
}
</style>
 
    </head>
    <body>
        
<h1> Research Collaboration </h1>
<h3>Academic , industry Students Research collaboration.</h3>
<div class="row">
  <div class="left" style="background-color:#009900;">
    <h2 style="color:white;" >Research Topics</h2>
    <input type="text" id="mySearch" onkeyup="myFunction()" placeholder="Search.." title="Type in a category">
    <ul id="myMenu">
      <li><a href="http://localhost:8080/plymouthapp/research/computerScience.jsp">Computer Science</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/medicineResearch.jsp">Medicine</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/SEResearch.jsp">Software Engineering</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/NEResearch.jsp">Network Engineer</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/EResearch.jsp">Engineering</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/AFResearch.jsp">Accounting & Finance</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/BMResearch.jsp">Business & Management</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/LResearch.jsp">Law</a></li>
      <li><a href="http://localhost:8080/plymouthapp/research/AResearch.jsp">Architecture</a></li>
    </ul>
  </div>
  
  <div class="right" style="background-color:#e6ffe6;">
    <h2>About Research Collaboration</h2>
    
    <h4>Benefits of Academic , industry and Students research collaboration. </h2>

    <p> Academic and research collaboration is a very valuable tool that not only accelerates the progress but 
        also enhances the quality of the work and extends the repertoire of the partners. Academic collaboration 
        is beneficial to the faculty in learning new teaching tools, and to the students in increasing the breadth
        of their knowledge and learning different approaches to solving a problem</p>
    
    <p>Several benefits of collaborative research and guidelines for strengthening collaborative mechanisms have been 
        described here, but the impetus for research and development of competent research teams must come 
        from health professionals themselves. The literature makes it apparent that allied health professionals 
        need to devote a considerable amount of energy and resources to develop a knowledge base for the 
        health-related professions, similar to those in medicine and the biological sciences. Research projects, 
        particularly collaborative ones, can make significant contributions to the body of professional knowledge, 
        the knowledge-generation process, the health care practitioner, and the patient. The results of research 
        should not be judged successful until its ultimate goal (ie, impact on patients and practice) has been measured. 
        In collaborative research, relationships should be based on systems thinking, making networking into a scientific
        approach--a true partnership approach--which is crucial in dealing with the problems of health care today.
    </p>
    <br>
    <br>
    <a href="addResearch.jsp">Insert Research Papers here</a>
 
  </div>
</div>

<script>
function myFunction() {
  var input, filter, ul, li, a, i;
  input = document.getElementById("mySearch");
  filter = input.value.toUpperCase();
  ul = document.getElementById("myMenu");
  li = ul.getElementsByTagName("li");
  for (i = 0; i < li.length; i++) {
    a = li[i].getElementsByTagName("a")[0];
    if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
      li[i].style.display = "";
    } else {
      li[i].style.display = "none";
    }
  }
}
</script>


    </body>
</html>
