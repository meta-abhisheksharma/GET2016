<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CarBecho</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="myStyle.css">
</head>


<body>
<%@include file="header.jsp" %>

<ul class="">
      
      <li class="active"><a href="#">Home</a></li>
      <li><a href="CarFacade?job=detail">List</a></li>
      <li><a href="CarFacade?job=add">Create Car</a></li>
      <li><a href="#">Search</a></li>
    </ul>
</body>
</html>