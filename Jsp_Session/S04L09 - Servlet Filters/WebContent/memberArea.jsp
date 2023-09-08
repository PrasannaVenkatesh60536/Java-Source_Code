<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Member Area</title>
</head>
<body>
	<%
		String username = null, sessionID = null;
	    if(request.getSession().getAttribute("username") == null){
	    	response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
	    }else{
	    	username = request.getSession().getAttribute("username").toString();
	    	sessionID = request.getSession().getId();
	    }
	 
	%>
	Username:
	<%=username%><br /> Current session:
	<%=sessionID%><br /> memberArea!!
    <form action="<%= request.getContextPath()%>/MemberAreaController" method="get">
    <input type="hidden" name="action" value="destroy">
    <input type="submit" value="logout">
    </form>
</body>
</html>






