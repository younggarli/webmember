<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>----------------------</title>

    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">
	
	<%@ include file="/include/commonCss.jsp"%>
	<%@ include file="/include/jquery.jsp" %>
  <script>
  	$(function(){
  		
  		//tr태그 click이벤트 처리
  		$("#boardList tr").click(function(){
  			var board_num = $(this).find("td:eq(0)").text();
  			$("#board_num").val(board_num);
  			$("#frm").submit();
  		});
  		//새글 추가
  		$("#boardAdd").click(function(){
  			document.location = "${pageContext.request.contextPath}/board/BoardAdd.jsp"
  		})
 	});

  	</script>
  </head>
<body>
	<%@ include file="/layOut/header.jsp"%>

	<!-- tr태그 선택시 상세정보로 이동 -->
	
	<form id="frm" method="get"
		action="${pageContext.request.contextPath }/getBoardServlet">
		<input type="hidden" id="board_num" name="board_num">
	</form>

	<div class="container-fluid">
		<div class="row">
			<%@ include file="/layOut/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h2 class="sub-header">댓글게시판</h2>
				<div class="table-responsive">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>글번호</th>
								<th>제목</th>
								<th>내용</th>
								<th>등록자 아이디</th>
							</tr>
						</thead>
						<tbody id="boardList">
							<c:forEach items="${boardList }" var="board">
								<tr>
									<td>${board.board_num}</td>
									<td>${board.board_title}</td>
									<td>${board.board_content}</td>
									<td>${board.board_mem_id}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<button id="boardAdd" type="button" class="btn btn-default">새글작성</button>

				<!--  -->
				${pageNav }

			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>