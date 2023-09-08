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
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("username")) {
					username = cookie.getValue();
				}
				if (cookie.getName().equals("JSESSIONID")) {
					sessionID = cookie.getValue();
				}
			}
		}
		if (sessionID == null || username == null) {
			response.sendRedirect("login.jsp");
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






