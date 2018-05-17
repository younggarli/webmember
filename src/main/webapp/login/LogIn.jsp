<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEn	coding="utf-8"%>
<!DOCTYPE html >
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<%@ include file="/include/jquery.jsp" %>
</head>
<body>
	<div class="container">
		<form class="form-sign" id= "frm" action="<%=request.getContextPath() %>/LoginServlet" method="get">
			<h1 class="form-sign-head">로그인 고고</h1>
			
			<laber for="userId" class="sr">아    이    디</laber>
			<input type="text" id="userId" name="userId" class="form-control" placeholder="아이디를 입력 하시오" required autofocus><br>
			
			<laber for="password" class="sr">비밀번호</laber>
			<input type="password" id="password" name="password" class="form-control" placeholder="비밀번호를 입력 하시오" required >

			<button class="btn" id="logbtn" type="submit">로그인</button>
		</form>
	</div>

</body>
</html>