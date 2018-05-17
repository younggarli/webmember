<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>board</title>

<link href="bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">
</head>

<%@ include file="/include/jquery.jsp" %>

<script >
	$(function(){
		$("#modifyBoard").click(function(){
			$("#frm").attr("action" , "${pageContext.request.contextPath}/BoardModifyServlet}")
			$("#frm").attr("method" , "get");
			$("#frm").submit();	
		})
	})
</script>

<body>
<%@ include file="/layOut/header.jsp" %>
	<div class="container-fluid">
		<div class="row">

	<%@ include file="/layOut/left.jsp" %>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				
				<form id="frm" class="form-horizontal" role="form" method="post">
					<input type="hidden" name="board_num" value="${boardVO.board_num }">
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">게시판 번호</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_num}</label>
						</div>
					</div>

					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">상위글 번호</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_ppnum}</label>
						</div>
					</div>
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">제목</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_title}</label>
						</div>
					</div>
					
					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">내용</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_content}</label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">작성일시</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_day}</label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">게시판 번호</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_pan_num }</label>
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">작성자 아이디</label>
						<div class="col-sm-10">
							<label class="control-label">${boardVO.board_mem_id }</label>
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button id="modifyBoard" type="button" class="btn btn-default">게시글 수정</button>
							<button id="deleteBorad" type="button" class="btn btn-default">게시글 삭제</button>
							<button id="dat" type="button" class="btn btn-default">댓글</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>s
</body>
</html>
