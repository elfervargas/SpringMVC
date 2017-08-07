<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.google.gson.Gson" %> 
<%@page import="com.google.gson.GsonBuilder" %> 
<%@page import="com.google.gson.reflect.TypeToken" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.lang.reflect.Type" %>
<%@page import="com.spring.pojo.*" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Spring Web MVC project</title>

<link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap.min.css") %>'>
<link rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("css/bootstrap-theme.min.css") %>'>
<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("jquery.min.js") %>'></script>
<script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/bootstrap.min.js") %>'></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
	<jsp:include page ="components/navBar.jsp" />
</body>
</html>