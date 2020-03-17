<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>

	<label>사업자번호</label>
	${view.busiNum}<br />
	
	<label>거래처명</label>
	${view.custom}<br />

	<label>약칭</label>
	${view.shortt}<br />
	
	<label>대표자</label><br />
	${view.ceo}<br />
	
	<label>담당자</label><br />
	${view.chargePerson}<br />
	
	<label>업태</label><br />
	${view.busiCondition}<br />
	
	<label>종목</label><br />
	${view.item}<br />
	
	<label>우편번호</label><br />
	${view.postNum}<br />
	
	<label>주소1</label><br />
	${view.addrone}<br />
	
	<label>주소2</label><br />
	${view.addrtwo}<br />
	
	<label>전화번호</label><br />
	${view.tel}<br />
	
	<label>팩스번호</label><br />
	${view.fax}<br />
	
	<label>홈페이지</label><br />
	${view.homepage}<br />
	
	<label>법인여부</label><br />
	${view.coYn}<br />
	
	<label>해외여부</label><br />
	${view.foreignYn}<br />
	
	<label>과세구분</label><br />
	<c:choose>
          <c:when test="${view.taxYn==1}">
              <span>과세</span>
          </c:when>
          <c:when test="${view.taxYn==2}">
              <span>면세</span>
          </c:when>
      </c:choose><br />
	
	<label>국가_영문</label><br />
	${view.countryEng}<br />
	
	<label>국가_한글</label><br />
	${view.countryKor}<br />
	
	<label>특수관계자</label><br />
		<c:choose>
			<c:when test="${view.specialRelation==true}">
	              <span>해당</span>
	    	</c:when>
	    	<c:when test="${view.specialRelation==false}">
	              <span>해당없음</span>
	    	</c:when>
    	</c:choose>
    <br />
	
	<label>거래중지</label><br />
	<c:choose>
		<c:when test="${view.tradeStop==true}">
              <span>해당</span>
    	</c:when>
    	<c:when test="${view.tradeStop==false}">
              <span>해당없음</span>
    	</c:when>
   	</c:choose>
	<br />
	
	<label>계약기간(시작)</label><br />
	${view.contractPeriodS}<br />
	
	<label>계약기간(종료)</label><br />
	${view.contractPeriodE}<br />
	
	<label>등록정보(등록인)</label><br />
	${view.regiInfoMan}<br />
	
	<label>등록정보(등록날짜)</label><br />
	${view.regiInfoDate}<br />
	
	<label>변경정보(변경인)</label><br />
	${view.modiInfoMan}<br />
	
	<label>변경정보(변경날짜)</label><br />
	${view.modiInfoDate}<br />
		
	<div>
		<a href="/board/modify?busiNum=${view.busiNum}">게시물 수정</a>
		<a href="/board/delete?busiNum=${view.busiNum}">게시물 삭제</a>
		<a href="/board/account?busiNum=${view.busiNum}">거래처 계좌정보</a>
	</div>

</body>
</html>