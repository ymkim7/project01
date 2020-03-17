<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>사업자번호</th>
				<th>거래처명</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.busiNum}</td>
					<td>
						<a href="/board/view?busiNum=${list.busiNum}">${list.custom}</a>
					</td>
				</tr>
		</c:forEach>
  
		</tbody>
		
		<!-- search{s} -->
		<div class="form-group">
			<div class="w100" style="padding-right:10px">
				<select class="form-control form-control-sm" name="searchType" id="searchType">
					<option value="busiNum">사업자번호</option>
				</select>
			</div>
			<div class="w300" style="padding-right:10px">
				<input type="text" class="form-control form-control-sm" name="keyword" id="keyword" value="${pagination.keyword}">
				<button class="btn btn-sm btn-primary" name="btnSearch" id="btnSearch">검색</button>
			</div>
		</div>
		<!-- search{e} -->

	</table>
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
	
	$("#btnSearch").on("click",function(){
		var url = "${pageContext.request.contextPath}/board/listPage";
		url = url + "?searchType=" + $('#searchType').val();
		url = url + "&keyword=" + $('#keyword').val();
		location.href = url;
	});	

	</script>

</body>
</html>