<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert title here</title>
</head>
<body>

	<label>사업자번호</label>
	${voTwo.busiNum}<br />

	<label>사무소</label>
	${voTwo.factory}<br />
	
	<label>은행</label>
	${voTwo.tradeBank}<br />
	
	<label>계좌번호</label>
	${voTwo.accountNum}<br />

</body>
</html>