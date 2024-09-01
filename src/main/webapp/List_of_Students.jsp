<%@page import="Models.student_models"%>
<%@page import="java.util.List"%>
<%@page import="DBConnection.student_db"%>
<%@page import="Services.student_services"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Students</title>
<%@include file="Links.jsp" %>
</head>
<style>
tbody {
      display:block;
      max-height:500px;
      overflow-y:auto;

  }
  thead, tbody tr {
      display:table;
      width:2000px;
      table-layout:fixed;
  }
  thead {
      width: calc( 2000px - 1em )
  } 
</style>
<body>
<%@include file="Navbar1.jsp"  %>
<div class="content">
        <nav class="navbar container fixed-top navbar-expand-lg navbar-light bg-light sticky-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Dashboard</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Profile</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Logout</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
       
            


<div class="container text-center"> 
        <h1 class="text-success"> 
            Students Details
        </h1> 
        <h2></h2> 
        <div class="table-responsive"> 
    <table class="table table-striped">
       
                <thead> 
<tr class="table-dark">

<th>Pinnum</th>
<th>Firstname</th>
<th>Lastname</th>
<th>Section</th>
<th>Branch</th>
<th>Fathername</th>
<th>Mothername</th>
<th>Email</th>
<th>Password</th>
<th>Action</th>

</tr>

</thead>

<tbody>

<%
student_services ser = new student_services(student_db.getConn());

List<student_models> list = ser.getAllStudents();

for(student_models s : list)
{
	%>

	<tr>
	

	<td><%=s.getPinnum()%></td>
	<td><%=s.getFirstname()%></td>
	<td><%=s.getLastname()%></td>
	<td><%=s.getSection()%></td>
	<td><%=s.getBranch()%></td>
	<td><%=s.getFathername()%></td>
	<td><%=s.getMothername()%></td>
	<td><%=s.getEmail()%></td>
	<td><%=s.getPassword()%></td>
	
	<td>
	<a href="Update_Students.jsp?Pinnum=<%=s.getPinnum()%>"> <button class="btn btn-outline-success btn-sm">UPDATE</button></a>
	<a href="delete1?Pinnum=<%=s.getPinnum()%>"><button class="btn btn-outline-danger btn-sm">DELETE</button></a>
	</td>

	</tr>

	<%
}
%>

 </tbody> 
            </table> 
        </div> 
    </div> 
</div>



</body>
</html>