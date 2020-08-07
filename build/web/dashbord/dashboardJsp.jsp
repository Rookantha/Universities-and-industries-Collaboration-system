<%-- 
    Document   : dashboardJsp
    Created on : Apr 1, 2019, 12:21:12 AM
    Author     : ISURU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <title>Main Dashboard</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}

body, html {
  height: 120%;
  line-height: 1.8;
}

/* Full height image header */
.bgimg-1 {
  background-position: center;
  background-size: cover;
  
  background-image: url("../image/dashbord.jpg");
  min-height: 65%;
}

.w3-bar .w3-button {
  padding: 16px;
}
</style>
<body>

<!-- Navbar (sit on top) -->
<div class="w3-top">
  <div class="w3-bar w3-white w3-card" id="myNavbar">
    <a href="#home" class="w3-bar-item w3-button w3-wide">HOME</a>
  <!-- Right-sided navbar links -->
    <div class="w3-right w3-hide-small">
      <a href="#about" class="w3-bar-item w3-button">ABOUT</a>
      <a href="#work" class="w3-bar-item w3-button"><i class="fa fa-group"></i> WORK </a>
      <a href="#pricing" class="w3-bar-item w3-button"><i class="fa fa-th"></i>  EVENTS </a>
      <a href="#team" class="w3-bar-item w3-button"><i class="fa fa-universal-access"></i>  REGISTER </a>
      <a href="http://localhost:8080/plymouthapp/user/userLog.jsp" class="w3-bar-item w3-button"><i class="fa fa-user"></i>  LOGIN </a>
      <a href="#contact" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i>  CONTACT </a>
    </div>
    <!-- Hide right-floated links on small screens and replace them with a menu icon -->
    
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
  </div>
</div>

<!-- Sidebar on small screens when clicking the menu icon -->
<nav class="w3-sidebar w3-bar-block w3-black w3-card w3-animate-left w3-hide-medium w3-hide-large" style="display:none" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button w3-large w3-padding-16">Close ×</a>
  <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button">ABOUT</a>
  <a href="#team" onclick="w3_close()" class="w3-bar-item w3-button">TEAM</a>
  <a href="#work" onclick="w3_close()" class="w3-bar-item w3-button">WORK</a>
  <a href="#pricing" onclick="w3_close()" class="w3-bar-item w3-button">PRICING</a>
  <a href="#contact" onclick="w3_close()" class="w3-bar-item w3-button">CONTACT</a>
</nav>

<!-- Header with full-height image -->
<header class="bgimg-1 w3-display-container w3-grayscale-min" id="home">
  <div class="w3-display-left w3-text-white" style="padding:48px">
    <span class="w3-jumbo w3-hide-medium">U-I-S COLLABORATION </span><br>
    
 
       <span class="w3-xxlarge w3-hide-large w3-high">U-I-S COLLABORATION </span><br>
    
    <span class="w3-xlarge">We Are Making University - Industry - Student and Society Professional Partnerships</span>
    <p><a href="#about" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off">Learn more and start today</a></p>
  </div> 
  <div class="w3-display-bottomleft w3-text-grey w3-large" style="padding:24px 48px">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-github w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
</header>

<!-- About Section -->
<div class="w3-container" style="padding:128px 16px" id="about">
  <h2 class="w3-center"> About  University - Industry - Student - Society collaboration</h2>
  <p class="w3-center w3-large">University-Industrial Collaboration - Advantages of the Collaborative Relationships</p>
  <div class="w3-row-padding w3-center" style="margin-top:64px">
    <div class="w3-quarter">
      <i class="fa fa-globe w3-margin-bottom w3-jumbo w3-center"></i>
      <p class="w3-large">Social benefits</p>
      <p>Society benefits from university-industry relationships through innovative products and technologies.</p>
    </div>
    <div class="w3-quarter">
      <i class="fa fa-graduation-cap w3-margin-bottom w3-jumbo"></i>
      <p class="w3-large">University benefits</p>
      <p> Interactions with industry are clearly thought out with attention paid to the benefits that will accrue to the university</p>
    </div>
    <div class="w3-quarter">
      <i class="fa fa-archive w3-margin-bottom w3-jumbo"></i>
      <p class="w3-large">Company benefits.</p>
      <p>University-industry collaborations can stimulate companies' internal research and development programs.</p>
    </div>
    <div class="w3-quarter">
      <i class="fa fa-child w3-margin-bottom w3-jumbo"></i>
      <p class="w3-large">Students</p>
      <p>workshops introduce students to industry professional equipment,Animation and Game Development software and much more.</p>
    </div>
  </div>
</div>

<!-- Promo Section - "We know design" -->
<div class="w3-container w3-light-grey" style="padding:128px 16px">
  <div class="w3-row-padding">
    <div class="w3-col m6">
      <h3>Collaborative Professional Skills</h3>
      <p>Inspires Critical Thinking,Improves Social Interactions and Supports Diversity, Aid the Development of Self-management Skills....
          <br>Development of Oral Communication Skills,Fosters the Development of Interpersonal Relationships....</p>
      <p><a href="#pricing" class="w3-button w3-black"><i class="fa fa-th"> </i> View Our Events Near By You.... </a></p>
    </div>
    <div class="w3-col m6">
      <img class="w3-image w3-round-large" src="../image/Professional_Development.jpg" alt="Buildings" width="700" height="394">
    </div>
  </div>
</div>

<!-- Team Section -->
<div class="w3-container" style="padding:128px 16px" id="team">
  <h3 class="w3-center">Register With Us</h3>
  <p class="w3-center w3-large">Get More Benefits</p>
  <div class="w3-row-padding w3-grayscale" style="margin-top:64px">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-card">
        <img src="../image/robot.jpg" alt="John" style="width:100%; height: 210px">
        <div class="w3-container">
          <h3>Students</h3>
          <p class="w3-opacity"> Students Register </p>
          <p>Improve your communication skills, gaining expert knowledge, networking with others and renewing motivation and confidence....</p>
          
          <p><a href="http://localhost:8080/plymouthapp/user/studentRegisterJsp.jsp" class="w3-button w3-light-grey w3-block" ><i class="fa fa-user"></i>Register</a></p>
        </div>
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-card">
        <img src="../image/Peradeniya.jpg" alt="Jane" style="width:100%; height: 210px">
        <div class="w3-container">
          <h3>University</h3>
          <p class="w3-opacity">Register Your University</p>
          <p>Enhance opportunities to find future employment for undergraduate and graduate students through university-industry connections and much more.....</p>
          
          <p><a href="http://localhost:8080/plymouthapp/user/UnivercityRegisterJsp.jsp" class="w3-button w3-light-grey w3-block" ><i class="fa fa-user"></i>Register</a></p>
           
        </div>
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-card">
        <img src="../image/workshop.jpg.jpg" alt="Mike" style="width:100%;height: 210px">
        <div class="w3-container">
          <h3>Company</h3>
          <p class="w3-opacity">Register Your Company</p>
          <p>University researchers also help industry scientists to solve problems. And , company employees new techniques with their university partners </p>
          <p><a href="http://localhost:8080/plymouthapp/user/industryRegisterJsp.jsp" class="w3-button w3-light-grey w3-block" ><i class="fa fa-user"></i>Register</a></p>
          
        </div>
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-card">
        <img src="../image/Industry.jpg.jpg" alt="Dan" style="width:100%;height: 210px">
        <div class="w3-container">
          <h3>Public</h3>
          <p class="w3-opacity">Public Member</p>
          <p> Get knowledge Industry-sponsored university research is often developed into practical applications that benefit society and much more.....</p>
          
          <p><a href="http://localhost:8080/plymouthapp/user/memberRegisterJsp.jsp" class="w3-button w3-light-grey w3-block" ><i class="fa fa-user"></i>Register</a></p>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Promo Section "Statistics" -->
<div class="w3-container w3-row w3-center w3-dark-grey w3-padding-64">
  <div class="w3-quarter">
    <span class="w3-xxlarge">700000+</span>
    <br>Students
  </div>
  <div class="w3-quarter">
    <span class="w3-xxlarge">55+</span>
    <br>Universities 
  </div>
  <div class="w3-quarter">
    <span class="w3-xxlarge">100+</span>
    <br>Companies 
  </div>
  <div class="w3-quarter">
    <span class="w3-xxlarge">8900+</span>
    <br>Events
  </div>
</div>

<!-- Work Section -->
<div class="w3-container" style="padding:128px 16px" id="work">
  <h3 class="w3-center">OUR WORK</h3>
  <p class="w3-center w3-large">What we have done for you</p>

  <div class="w3-row-padding" style="margin-top:64px">
    <div class="w3-col l3 m6">
      <img src="../image/aiImages.jpeg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A microphone">
    </div>
    <div class="w3-col l3 m6">
      <img src="../image/medicine.jpg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A phone">
    </div>
    <div class="w3-col l3 m6">
      <img src="../image/Businesss.png" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A drone">
    </div>
    <div class="w3-col l3 m6">
      <img src="../image/dataScience.jpeg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="Soundbox">
    </div>
  </div>

  <div class="w3-row-padding w3-section">
    <div class="w3-col l3 m6">
      <img src="../image/robotWorkshop.jpg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A tablet">
    </div>
    <div class="w3-col l3 m6">
      <img src="../image/art.jpg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A camera">
    </div>
    <div class="w3-col l3 m6">
      <img src="../image/iot.jpg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A typewriter">
    </div>
    <div class="w3-col l3 m6">
      <img src="../image/engineering.jpg" style="width:100%;height: 210px" onclick="onClick(this)" class="w3-hover-opacity" alt="A tableturner">
    </div>
  </div>
</div>

<!-- Modal for full size images on click-->
<div id="modal01" class="w3-modal w3-black" onclick="this.style.display='none'">
  <span class="w3-button w3-xxlarge w3-black w3-padding-large w3-display-topright" title="Close Modal Image">×</span>
  <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
    <img id="img01" class="w3-image">
    <p id="caption" class="w3-opacity w3-large"></p>
  </div>
</div>

<!-- Skills Section -->
<div class="w3-container w3-light-grey w3-padding-64">
  <div class="w3-row-padding">
    <div class="w3-col m6">
      <h3>Computer.</h3>
      <p>You can find here</p>
      <p>Digital Image/ Sound,Artificial Intelligence,Microprogramming,Bioinformatics,Networks And Administration,Computer Architecture Networks,Cryptography,
,Computer Engineering,Operating Systems,Computer Game Development,Robotics,Computer Graphics,Simulation And Modeling,Computer Programming,Software Development,
Software Systems,Data Management,Web Development,Design Databases,Parallel Programming,iOS Development,Mobile Development,
Memory Systems,Computational Physics</p>
    </div>
    <div class="w3-col m6">
      <p class="w3-wide"><i class="fa fa-desktop w3-margin-right"></i>Software Engineering </p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:90%">90%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-desktop w3-margin-right"></i>Computer Security</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:85%">85%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-desktop w3-margin-right"></i>Network Engineer</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:75%">75%</div>
      </div>
      
    </div>
  </div>
</div>
<div class="w3-container w3-light-grey w3-padding-64">
  <div class="w3-row-padding">
    <div class="w3-col m6">
      <h3>Business </h3>
      <p>An organization or economic system where goods and services are exchanged for one another or for money.</p>
      <p>Every business requires some form of investment and enough customers to whom its output can be sold on a consistent basis in order to make a profit.</p>
    </div>
    <div class="w3-col m6">
      <p class="w3-wide"><i class="fa fa-globe w3-margin-right"></i>Management information systems</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:90%">90%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-globe w3-margin-right"></i>Economics</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:85%">85%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-globe w3-margin-right"></i>Accounting & Finance</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:75%">75%</div>
      </div>
      
    </div>
  </div>
</div>
<div class="w3-container w3-light-grey w3-padding-64">
  <div class="w3-row-padding">
    <div class="w3-col m6">
      <h3>Other Subjects.</h3>
      <p>
          Medical Sciences is a "first-entry" program into the Faculty of Science at Western. 
          High school students interested in studying the basic medical sciences (human biology) 
          modules at an advanced level in the BMSc Program should select MEDICAL SCIENCES on the 
          Ontario Universities' Application Center (OUAC). 
      </p>
      <p>
          Admission to Medical Sciences is not admission to the BMSc Program. 
          Students are registered as Medical Sciences students in Years 1 and 2, 
          and apply to the BMSc Program when they enter Year 3.   
      </p>
    </div>
    <div class="w3-col m6">
      <p class="w3-wide"><i class="fa fa-flask w3-margin-right"></i>Medicine</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:85%">85%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-wrench w3-margin-right"></i>Engineering</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:75%">75%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-cubes w3-margin-right"></i>Architecture</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:75%">75%</div>
      </div>
      
    </div>
  </div>
</div>
<!-- Pricing Section -->
<div class="w3-container w3-center w3-dark-grey" style="padding:128px 16px" id="pricing">
  <h3>UP COMING EVENTS</h3>
  <p class="w3-large">Get Register to Your Events. Select your University or Industry or as your Favorite</p>
  <div class="w3-row-padding" style="margin-top:64px">
    <div class="w3-third w3-section">
      <ul class="w3-ul w3-white w3-hover-shadow">
        <li class="w3-black w3-xlarge w3-padding-32">Universities</li>
        <li class="w3-padding-16"><b>University of Colombo</b> Computer Game Development </li>
        <li class="w3-padding-16"><b>Moratuwa University</b> Artificial Intelligent  </li>
        <li class="w3-padding-16"><b>University of Sri Jayewardenepura</b> Accounting & Finance</li>
        <li class="w3-padding-16"><b>University of Ruhuna </b> Medicine</li>
        <li class="w3-padding-16">
        <h2 class="w3-wide"></h2> 
        <span class="w3-opacity">much more...</span>
         
        </li>
        <li class="w3-light-grey w3-padding-24">
           <a href="http://localhost:8080/plymouthapp/user/userLog.jsp" class="w3-button w3-black w3-padding-large">Login</a>
        </li>
      </ul>
    </div>
    <div class="w3-third">
      <ul class="w3-ul w3-white w3-hover-shadow">
        <li class="w3-red w3-xlarge w3-padding-48">Events near by you</li>
        <li class="w3-padding-16"><b>Artificial Intelligence </b> J-boss Enterprises</li>
        <li class="w3-padding-16"><b>Programming Java </b> University of Peradeniya</li>
        <li class="w3-padding-16"><b>Mobile Application </b>NSBM University</li>
        <li class="w3-padding-16"><b>IOT Development </b>APIIT University</li>
        <li class="w3-padding-16">
          <h2 class="w3-wide"></h2>
          <span class="w3-opacity">much more...</span>
        </li>
        <li class="w3-light-grey w3-padding-24">
          <a href="http://localhost:8080/plymouthapp/user/userLog.jsp" class="w3-button w3-black w3-padding-large">Login</a>
        </li>
      </ul>
    </div>
    <div class="w3-third w3-section">
      <ul class="w3-ul w3-white w3-hover-shadow">
        <li class="w3-black w3-xlarge w3-padding-32">Companies</li>
        <li class="w3-padding-16"><b>Google Sri Lanka</b> Google Developer</li>
        <li class="w3-padding-16"><b>Zebra Technologies Lanka</b> Business Management</li>
        <li class="w3-padding-16"><b>W3C Sri Lanka</b> Frameworks</li>
        <li class="w3-padding-16"><b>Microsoft Sri Lanka</b> Visual Studio </li>
        <li class="w3-padding-16">
          <h2 class="w3-wide"></h2>
          <span class="w3-opacity">much more..</span>
        </li>
        <li class="w3-light-grey w3-padding-24">
         
          <a href="http://localhost:8080/plymouthapp/user/userLog.jsp" class="w3-button w3-black w3-padding-large">Login</a>
        </li>
      </ul>
    </div>
  </div>
</div>

<!-- Contact Section -->
<div class="w3-container w3-light-grey" style="padding:128px 16px" id="contact">
  <h3 class="w3-center">CONTACT</h3>
  <p class="w3-center w3-large">Lets get in touch. Send us a message:</p>
  <div style="margin-top:48px">
    <p><i class="fa fa-map-marker fa-fw w3-xxlarge w3-margin-right"></i> NSBM - Software Engineering - Team - Together</p>
    <p><i class="fa fa-phone fa-fw w3-xxlarge w3-margin-right"></i> Phone: 077-48726231</p>
    <p><i class="fa fa-envelope fa-fw w3-xxlarge w3-margin-right"> </i> Email: mail@mail.com</p>
    <br>
    <form action="/action_page.php" target="_blank">
      <p><input class="w3-input w3-border" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-border" type="text" placeholder="Email" required name="Email"></p>
      <p><input class="w3-input w3-border" type="text" placeholder="Subject" required name="Subject"></p>
      <p><input class="w3-input w3-border" type="text" placeholder="Message" required name="Message"></p>
      <p>
        <button class="w3-button w3-black" type="submit">
          <i class="fa fa-paper-plane"></i> SEND MESSAGE
        </button>
      </p>
    </form>
    <!-- Image of location/map -->
    
    <img src="../image/NSBM-Green-University.jpg" alt="" style="width:100%;margin-top:48px"/>
  </div>
</div>

<!-- Footer -->
<footer class="w3-center w3-black w3-padding-64">
  <a href="#home" class="w3-button w3-light-grey"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  <div class="w3-xlarge w3-section">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-github w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
  <p>Powered by <a href="https://www.plymouth.ac.uk/" title="Plymouth" target="_blank" class="w3-hover-text-green">University OF Plymouth</a></p>
</footer>
 
<script>
// Modal Image Gallery
function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
}


// Toggle between showing and hiding the sidebar when clicking the menu icon
var mySidebar = document.getElementById("mySidebar");

function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
  } else {
    mySidebar.style.display = 'block';
  }
}

// Close the sidebar with the close button
function w3_close() {
    mySidebar.style.display = "none";
}
</script>

</body>
</html>
