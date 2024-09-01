<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<%@include file="Links.jsp" %>
<style>

.banner{
    background-image: url("Images/welcome.jpg");
    background-size: cover;
    background-position: center;
    color: white;
    object-fit: contain;
    height: 37.8rem;
}
h1{

 	font-size: 3rem;
    margin-left: 20px;
    padding-top:500px;
    padding-left:50px;
    padding-right:30px;
    font-family: 'Poppins', sans-serif;
    font-weight: 800;
    color: white;
    text-shadow:  3px 3px 9px black;
}

</style>
</head>
<body>
<%@include file="Navbar.jsp" %>

<div class="banner">
<div class ="banner-title">

<h1>Welcome To Student Management System</h1>

</div>
</div>
</body>
</html>