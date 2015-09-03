<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo Automated Testing</title>
</head>
<body>

	<h1>Demo Automated Testing</h1>

	<form action="<%=getServletContext().getContextPath()%>/grade/convert">
		Score :: <input type="text" id="score" name="score"> <input
			type="submit" id="convert_button" value="O.K.">
	</form>

</body>
</html>