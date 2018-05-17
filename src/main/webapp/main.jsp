<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>----------------------</title>

    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">

    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

  </head>

  <body>
	<%@ include file="/layOut/header.jsp" %>
    
    <div class="container-fluid">
      <div class="row">
		<%@ include file="/layOut/left.jsp" %>
            
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="sub-header">게시판관리</h1><Br>
          		<div class="table-responsive">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>게시판번호</th>
								<th>게시판이름</th>
								<th>활성여부</th>
								<th>아이디</th>
							</tr>
						</thead>
						<tbody id="panList">
							<c:forEach items="${panList }" var="panVO">
								<tr>
									<td>${pan.pan_num}</td>
									<td>${pan.pan_nm}</td>
									<td>${pan.pan_yn}</td>
									<td>${pan.pan_mem_id}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
        <button class="btn" id="addbtn" type="submit">게시판추가</button>
          
        </div>
      </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="../../assets/js/vendor/holder.js"></script>
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
</html>
