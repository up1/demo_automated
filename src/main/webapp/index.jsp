<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo</title>
</head>
<body>

   <h1>Login คือ ระบบที่ทุกระบบต้องมี</h1>

	<form action="/demo/login">
		<table>
		<tr>
		    <td>Username</td>
		    <td><input type="text" id="username" name="username"></td>
		</tr>
		<tr>
            <td>Password</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
		 <tr>
		    <td></td>
		    <td>
		    <input type="submit" id="login" value="เข้าสิจ๊ะ">
		    </td>
		</tr>
		</table>
	</form>

</body>
</html>