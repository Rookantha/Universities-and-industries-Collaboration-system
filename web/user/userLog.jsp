<%-- 
    Document   : userLog
    Created on : Mar 29, 2019, 7:34:19 PM
    Author     : ISURU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

/* style the container */
.container {
  position: relative;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px 0 30px 0;
} 

/* style inputs and link buttons */
input,select,option ,
.btn {
  width: 100%;
  padding: 12px;
  border: none;
  border-radius: 4px;
  margin: 5px 0;
  opacity: 0.85;
  display: inline-block;
  font-size: 17px;
  line-height: 20px;
  text-decoration: none; /* remove underline from anchors */
}

input:hover,
.btn:hover {
  opacity: 1;
}

/* add appropriate colors to fb, twitter and google buttons */
.fb {
  background-color: #3B5998;
  color: white;
}

.twitter {
  background-color: #55ACEE;
  color: white;
}

.github {
  background-color: #000066;
  color: white;
}

/* style the submit button */
input[type=submit] 
{
  background-color: #595959;
  color: white;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #ff0000;
}

/* Two-column layout */
.col {
  float: left;
  width: 50%;
  margin: auto;
  padding: 0 50px;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* vertical line */
.vl {
  position: absolute;
  left: 50%;
  transform: translate(-50%);
  border: 2px solid #ddd;
  height: 175px;
}

/* text inside the vertical line */
.vl-innertext {
  position: absolute;
  top: 50%;
  transform: translate(-50%, -50%);
  background-color: #f1f1f1;
  border: 1px solid #ccc;
  border-radius: 50%;
  padding: 8px 10px;
}

/* hide some text on medium and large screens */
.hide-md-lg {
  display: none;
}

/* bottom container */
.bottom-container 
{
  width: 600px;
  text-align: center;
  background-color: #737373;
  border-radius: 4px 4px 4px 4px;
}

/* Responsive layout - when the screen is less than 650px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 650px) {
  .col {
    width: 100%;
    margin-top: 0;
  }
  /* hide the vertical line */
  .vl {
    display: none;
  }
  /* show the hidden text on small screens */
  .hide-md-lg {
    display: block;
    text-align: center;
  }
}
</style>  

    </head>
    <body>
         <h1 style="color: #4d88ff" > Connect with.....  </h1>
         <h2 style="color: #a6a6a6;" >700000+ Students , 58+ Universities , 100+ Companies , 8900+ Events islandwide ....<h2/>

<div class="container">
  <form   method="post" action="../LoginServlet" >
    <div class="row">
      <h2 style="text-align:center">Login </h2>
      <div class="vl">
        <span class="vl-innertext">or</span>
      </div>

      <div class="col">
        <a href="https://www.facebook.com/" class="fb btn">
          <i class="fa fa-facebook fa-fw"></i> Login with Facebook
         </a>
        <a href="https://twitter.com/" class="twitter btn">
          <i class="fa fa-twitter fa-fw"></i> Login with Twitter
        </a>
        <a href="https://github.com/login" class="github btn"><i class="fa fa-github fa-fw">
          </i> Login with GitHub
        </a>
      </div>

      <div class="col">
        <div class="hide-md-lg">
          <p>Or sign in manually:</p>
        </div>

        <input type="text" name="username" placeholder="Username" required>
        
        <select name="userType" required>
                <option value="">User Type</option>
                <option value="student">student</option>
                <option value="univercity">university</option>
                <option value="industry">industry</option>
                <option value="member">member</option>
                <option value="administrator">administrator</option>
                
        </select>
  
        <input type="password" name="password" placeholder="Password" pattern=".{3,}" title="Six or more characters" required/>
        <input type="submit" value="Login" />
        
      </div>
      
    </div>
  </form>
</div>
             <input type="submit" value="Forgot Password..?"/>
             <input type="submit" value="Back to Home Page" onclick="window.location='http://localhost:8080/plymouthapp/dashbord/dashboardJsp.jsp';"/>                    
           
</body>
</html>
