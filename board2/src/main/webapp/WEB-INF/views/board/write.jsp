<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
</head>
<body>
	
		<label>사업자번호</label>
		<input type="text" name="busiNum" /><br />
	
		<label>거래처명</label>
		<input type="text" name="custom" /><br />
		
		<label>약칭</label>
		<input type="text" name="shortt" /><br />
		
		<label>대표자</label>
		<input type="text" name="ceo" /><br />
		
		<label>담당자</label>
		<input type="text" name="chargePerson" /><br />
		
		<label>업태</label>
		<input type="text" name="busiCondition" /><br />
		
		<label>종목</label>
		<input type="text" name="item" /><br />
		
		<div class="form-group">
			<label>우편번호</label>
			<input class="form-control" placeholder="우편번호" name="postNum" id="postNum" readonly="readonly" >
			<input type="button" onclick="execPostCode()" value="검색"><br />

			<label>주소1</label>
			<input class="form-control" style="width: 25%" placeholder="주소" name="addrone" id="addrone" readonly="readonly" ><br />

			<label>주소2</label>
			<input class="form-control" placeholder="상세주소" name="addrtwo" id="addrtwo" >
		</div>
		
		<label>전화번호</label>
		<input type="text" name="tel" /><br />
		
		<label>팩스번호</label>
		<input type="text" name="fax" /><br />
		
		<label>홈페이지</label>
		<input type="text" name="homepage" /><br />
		
		<label>법인여부</label>
		<input type="radio" name="coYn" value = "법인"/>법인
		<input type="radio" name="coYn" value = "개인"/>개인<br />
		
		<label>해외여부</label>
		<input type="radio" name="foreignYn" value = "국내"/>국내
		<input type="radio" name="foreignYn" value = "해외"/>해외<br />
		
		<label>과세구분</label>
   		<select class="form-control" id="taxYn" name="taxYn">
			<option value="1">과세</option>
			<option value="2">면세</option>
		</select><br />
		
		<label>국가_영문</label>
		<input type="text" name="countryEng" /><br />
		
		<label>국가_한글</label>
		<input type="text" name="countryKor" /><br />
		
		<label>특수관계자</label>
		<input type="checkbox" name="specialRelation" /><br />
		
		<label>거래중지</label>
		<input type="checkbox" name="tradeStop" /><br />
		
		<label>계약기간(시작)</label>
		<input type="text" name="contractPeriodS" id="contractPeriodS"/>
		<input type="button" value="달력" onclick="$('#contractPeriodS').datepicker('show');" /><br />
		
		<label>계약기간(종료)</label>
		<input type="text" name="contractPeriodE" id="contractPeriodE"/>
		<input type="button" value="달력" onclick="$('#contractPeriodE').datepicker('show');" /><br />
		
		<label>등록정보(등록인)</label>
		<input type="text" name="regiInfoMan" /><br />
		
		<!-- <label>등록정보(등록날짜)</label>
		<input type="text" name="regiInfoDate" /><br />
		
		<label>변경정보(변경인)</label>
		<input type="text" name="modiInfoMan" /><br />
		
		<label>변경정보(변경날짜)</label>
		<input type="text" name="modiInfoDate" /><br /> -->

		<button type="button" id="submitBtn">작성</button>
		<button type="button" id="testb">테스트데이터넣기</button>
	
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>

	<script>
	function execPostCode() {
		new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
 
                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수
 
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }
 
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                console.log(data.zonecode);
                console.log(fullRoadAddr);
                
                document.getElementById('postNum').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('addrone').value = fullRoadAddr;

            }

        }).open();
    }
	
 	$("#contractPeriodS").datepicker({
		  changeYear:true,
		  changeMonth:true

		});
	
	$("#contractPeriodE").datepicker({
		  changeYear:true,
		  changeMonth:true

		});
	
	//reference
	$("#submitBtn").on("click", function(){
		submit();
	});
	
	//reference
	function submit(){
		var lengthSum = 1;
		
		//사업자번호
		var busiNum = document.getElementsByName("busiNum")[0].value;
		if(null != busiNum && "" != busiNum && isNaN(busiNum)){
			alert("사업자번호는 숫자만 입력해 주세요.");
			return;
		}
		lengthSum *= busiNum.length;
		//거래처명
		var custom = document.getElementsByName("custom")[0].value;
		lengthSum *= custom.length;
		//약칭
		var shortt = document.getElementsByName("shortt")[0].value;
		lengthSum *= shortt.length;
		//대표자
		var ceo = document.getElementsByName("ceo")[0].value;
		lengthSum *= ceo.length;
		//담당자
		var chargePerson = document.getElementsByName("chargePerson")[0].value;
		lengthSum *= chargePerson.length;
		//업태
		var busiCondition = document.getElementsByName("busiCondition")[0].value;
		lengthSum *= busiCondition.length;
		//종목
		var item = document.getElementsByName("item")[0].value;
		lengthSum *= item.length;
		//우편번호
		var postNum = document.getElementsByName("postNum")[0].value;
		lengthSum *= postNum.length;
		//주소1
		var addrone = document.getElementsByName("addrone")[0].value;
		lengthSum *= addrone.length;
		//주소2
		var addrtwo = document.getElementsByName("addrtwo")[0].value;
		lengthSum *= addrtwo.length;
		//전화번호
		var tel = document.getElementsByName("tel")[0].value;
		lengthSum *= tel.length;
		//팩스번호
		var fax = document.getElementsByName("fax")[0].value;
		lengthSum *= fax.length;
		//홈페이지
		var homepage = document.getElementsByName("homepage")[0].value;
		lengthSum *= homepage.length;
		//법인여부
		var coYn = ""
		var coYnList = document.getElementsByName("coYn");
		for(var i=0 ; i<coYnList.length ; i++){
			if(coYnList[i].checked){
				coYn = coYnList[i].value; break;
			}
		}
		lengthSum *= coYn.length;
		//해외여부
		var foreignYn = ""
		var foreignYnList = document.getElementsByName("foreignYn");
		for(var i=0 ; i<foreignYnList.length ; i++){
			if(foreignYnList[i].checked){
				foreignYn = foreignYnList[i].value; break;
			}
		}
		lengthSum *= foreignYn.length;
		//과세구분
		var taxYn = document.getElementsByName("taxYn")[0].value;
		lengthSum *= taxYn.length;
		//국가_영문
		var countryEng = document.getElementsByName("countryEng")[0].value;
		lengthSum *= countryEng.length;
		//국가_한글
		var countryKor = document.getElementsByName("countryKor")[0].value;
		lengthSum *= countryKor.length;
		//특수관계자
		var specialRelation = document.getElementsByName("specialRelation")[0].checked;
		//거래중지
		var tradeStop = document.getElementsByName("tradeStop")[0].checked;
		//계약기간(시작)
		var contractPeriodS = document.getElementsByName("contractPeriodS")[0].value;
		lengthSum *= contractPeriodS.length;
		//계약기간(종료)
		var contractPeriodE = document.getElementsByName("contractPeriodE")[0].value;
		lengthSum *= contractPeriodE.length;
		//등록정보(등록인)
		var regiInfoMan = document.getElementsByName("regiInfoMan")[0].value;
		lengthSum *= regiInfoMan.length;
		//등록정보(등록날짜)
		/* var regiInfoDate = document.getElementsByName("regiInfoDate")[0].value;
		lengthSum *= regiInfoDate.length;
		//변경정보(변경인)
		var modiInfoMan = document.getElementsByName("modiInfoMan")[0].value;
		lengthSum *= modiInfoMan.length;
		//변경정보(변경날짜)
		var modiInfoDate = document.getElementsByName("modiInfoDate")[0].value;
		lengthSum *= modiInfoDate.length; */
		
		//데이터가 하나라도 null이면 false
		if(    null == busiNum || null == custom || null == shortt || null == ceo
			|| null == chargePerson || null == busiCondition || null == item || null == addrone
			|| null == addrtwo || null == tel || null == fax || null == homepage
			|| null == coYn || null == foreignYn || null == taxYn || null == countryEng
			|| null == countryKor || null == specialRelation || null == tradeStop || null == contractPeriodS
			|| null == contractPeriodE || null == regiInfoMan || null == postNum){
			alert("등록에 실패했습니다.\n빈 내용이 있는지 확인해주세요.\ncode: Err001]");
			return;
		}
		
		//데이터중 하나라도 공백이면 false
		if(!lengthSum > 0){
			alert("등록에 실패했습니다.\n빈 내용이 있는지 확인해주세요.\ncode: Err002");
			return;
		}
		
		$.ajax({
			type : "POST",
			url : "insertData",
			dataType : "JSON",
			async : false,
			data : {
				"busiNum" : busiNum
				,"custom" : custom
				,"shortt" : shortt
				,"ceo" : ceo
				,"chargePerson" : chargePerson
				,"busiCondition" : busiCondition
				,"item" : item
				,"postNum" : postNum
				,"addrone" : addrone
				,"addrtwo" : addrtwo
				,"tel" : tel
				,"fax" : fax
				,"homepage" : homepage
				,"coYn" : coYn
				,"foreignYn" : foreignYn
				,"taxYn" : taxYn
				,"countryEng" : countryEng
				,"countryKor" : countryKor
				,"specialRelation" : specialRelation
				,"tradeStop" : tradeStop
				,"contractPeriodS" : contractPeriodS
				,"contractPeriodE" : contractPeriodE
				,"regiInfoMan" : regiInfoMan
				/* ,"regiInfoDate" : regiInfoDate
				,"modiInfoMan" : modiInfoMan 
				,"modiInfoDate" : modiInfoDate */
			},
		success: function(data){
			var msg = data.message;
			if(null != msg && "true" == msg){
				alert("등록되었습니다.");
				location.href = "/";
			}
		},
		complete:function(data){},
		error:function(xhr,status,error){
			alert("등록에 실패했습니다.\n잠시 후 다시 시도해주세요.\ncode: Err003");
			console.log(error);
			return;
		}
		});
	};
	
	//reference
	//테스트데이터넣기
	$("#testb").on("click", function(){
		//사업자번호
		document.getElementsByName("busiNum")[0].value = '123';
		//거래처명
		document.getElementsByName("custom")[0].value = '테스트';
		//약칭
		document.getElementsByName("shortt")[0].value = '테스트';
		//대표자
		document.getElementsByName("ceo")[0].value = '테스트';
		//담당자
		document.getElementsByName("chargePerson")[0].value = '테스트';
		//업태
		document.getElementsByName("busiCondition")[0].value = '테스트';
		//종목
		document.getElementsByName("item")[0].value = '테스트';
		//주소1
		document.getElementsByName("addrone")[0].value = '테스트';
		//주소2
		document.getElementsByName("addrtwo")[0].value = '테스트';
		//전화번호
		document.getElementsByName("tel")[0].value = '테스트';
		//팩스번호
		document.getElementsByName("fax")[0].value = '테스트';
		//홈페이지
		document.getElementsByName("homepage")[0].value = '테스트';
		//과세구분
		document.getElementsByName("taxYn")[0].value = '테스트';
		//국가_영문
		document.getElementsByName("countryEng")[0].value = '테스트';
		//국가_한글
		document.getElementsByName("countryKor")[0].value = '테스트';
		//특수관계자
		document.getElementsByName("specialRelation")[0].checked = '테스트';
		//거래중지
		document.getElementsByName("tradeStop")[0].checked = '테스트';
		//계약기간(시작)
		document.getElementsByName("contractPeriodS")[0].value = '테스트';
		//계약기간(종료)
		document.getElementsByName("contractPeriodE")[0].value = '테스트';
		//등록정보(등록인)
		document.getElementsByName("regiInfoMan")[0].value = '테스트';
		//등록정보(등록날짜)
		/* document.getElementsByName("regiInfoDate")[0].value = '테스트';
		//변경정보(변경인)
		document.getElementsByName("modiInfoMan")[0].value = '테스트';
		//변경정보(변경날짜)
		document.getElementsByName("modiInfoDate")[0].value = '테스트'; */
	});

	</script>

</body>
</html>