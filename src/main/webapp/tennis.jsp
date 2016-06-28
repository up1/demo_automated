<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tennis score</title>
</head>
<style>
body{
    font: 50px Arial, sans-serif;
}
</style>
<body>
<center>

   <h1>Tennis Score</h1>

	<form action="/demo/tennis">
		<table>
		<tr>
            <td align="center">ALICE</td>
            <td align="center">BOB</td>
        </tr>
		<tr>
		    <td><div align="center" id="first_player_score"><%=request.getAttribute("first_player_score")%></div></td>
		    <td><div align="center" id="second_player_score"><%=request.getAttribute("second_player_score")%></div></td>
		</tr>
		<tr>
            <td align="center"><input type="submit" id="first_player_win" name="first_player_win" value="ALICE Win"></td>
            <td align="center"><input type="submit" id="second_player_win" name="second_player_win" value="BOB Win"></td>
        </tr>
		</table>
	</form>

	<h3 id="result"><%=request.getAttribute("result")%></h1>
</center>
</body>
</html>