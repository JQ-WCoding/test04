<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form action="joinPro" method="post">
		ID : <input type="text" name="id" >				<br>
		PW : <input type="password" name="pw" >			<br>
		NAME : <input type="text" name="name" >			<br>
		<input type="submit" value="회원가입" >&nbsp;&nbsp;
	</form>
	<br>
	<br>
	<a href="login">로그인</a> &nbsp;&nbsp; 
	<a href="home">메인</a>
</body>
</html>