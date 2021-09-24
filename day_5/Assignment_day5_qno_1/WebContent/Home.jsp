<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
Object obj=request.getAttribute("msg");
List<String>list=null;
if(obj!=null){
	list=(List<String>)obj;
}
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red" align="center">Welcome In LTI </h1>
</br>
<%if(obj==null){ %>
<a href="HomeControler">Click here</a>
<%}else{
for(String s:list){
%>
<%=s%> , 
<%}} %>
</body>
</html>