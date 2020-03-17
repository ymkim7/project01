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
			<c:forEach items="${list}" var="search">
				<tr>
					<td>${search.busiNum}</td>
					<td>${search.custom}</td>
				</tr>
		</c:forEach>
  
		</tbody>

	</table>
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script>
	
	function submit(){
		var lengthSum = 1;
		var busiNum = document.getElementsByName("busiNum")[0].value;
		var custom = document.getElementsByName("custom")[0].value;
		lengthSum *= custom.length;
	
	}
	
	</script>

</body>
</html>