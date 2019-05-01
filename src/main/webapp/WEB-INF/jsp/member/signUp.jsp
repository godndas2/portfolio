<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../include/head.jsp" %>

<script type="text/javascript">
	var isCheckId = 0; // fasle
	function duplicationId () {
		var inputId = $("#signUpUserId").val();
		
		$.ajax({
			async: false,
			type: "post",
			url: "dupliCheckId",
			data: inputId,
			success: function (data) {
				if(data == "success") {
					alert("사용가능한 아이디입니다.");
					
					$("#divInputId").addClass("has-success")
					$("#divInputId").removeClass("has-error")
					
					$("#signUpUserPwd").focus();
					isCheckId = 1; // true
				} else {
					alert("이미 존재하는 아이디입니다.");
					
					$("#divInputId").addClass("has-error")
					$("#divInputId").removeClass("has-success")
					
					$("#signUpUserId").focus();
				}
			}, // success function end
			error: function(req, status, errThrown) {
				alert("아이디를 입력해주세요.");
			}
		}); // ajax end
		
	}
	
	function dosignUp() {
		
		var inputId = $("#signUpUserId").val();
		var inputPwd = $("#signUpUserPwd").val();
		var inputPwdCfm = $("#signUpUserPwdCfm").val();
		var inputCpnName = $("#signUpUserCompanyName").val();
		var inputCpnTelNo = $("#signUpUserTelNo").val();
		var inputCpnEmail = $("#signUpUserEmail").val();
		var inputCpnAddr1 = $("#signUpUserPostNo").val();
		var inputCpnAddr2 = $("#signUpUserCompanyAddress").val();
		var inputCpnAddr3 = $("#signUpUserCompanyAddressDetail").val();
		
		if(inputId.length == 0) { alert("아이디를 입력해 주세요."); $("#signUpUserId").focus(); return; }
		if(isCheckId == 0) { alert("아이디 중복 체크를 해주세요."); $("#signUpUserId").focus(); return; }
		
		if(inputPwd.length == 0) { alert("비밀번호를 입력해 주세요."); $("#signUpUserPwd").focus(); return; }
		if(inputPwd != inputPwdCfm) { alert("비밀번호가 서로 다릅니다. 비밀번호를 확인해 주세요."); $("#signUpUserPwd").focus(); return; }
		
		if(inputCpnName.length == 0) { alert("회사명을 입력해 주세요."); $("#signUpUserCompanyName").focus(); return; }
		
		if(inputCpnTelNo.length == 0) { alert("전화번호를 입력해 주세요."); $("#signUpUserTelNo").focus(); return; }
		
		if(inputCpnEmail.length == 0) { alert("이메일을 입력해 주세요."); $("#signUpUserEmail").focus(); return; }
		
		if(inputCpnAddr1.length == 0 || inputCpnAddr2.length == 0 || inputCpnAddr3.length == 0) { 
			alert("주소를 입력해 주세요."); $("#signUpUserCompanyAddressDetail").focus();  return;
		}
		
		if(confirm("회원가입을 하시겠습니까?")) {
			alert("가입완료!");
			
			location.href= "/main";
			
			
		}
	}
	
	function checkPassword(id,password){

		if(!/^[a-zA-Z0-9]{10,15}$/.test(password)){
		alert('숫자와 영문자 조합으로 10~15자리를 사용해야 합니다.');
		return false;
		}

		var checkNumber = password.search(/[0-9]/g);
		var checkEnglish = password.search(/[a-z]/ig);

		if(checkNumber <0 || checkEnglish <0){
		alert("숫자와 영문자를 혼용하여야 합니다.");
		return false;
		}
		if(/(\w)\1\1\1/.test(password)){
		alert('연속되는 문자를 4번 이상 사용하실 수 없습니다.');
		return false;
		}
		if(password.search(id) > -1){
		alert("비밀번호에 아이디가 포함되었습니다.");
		return false;
		}
		return true;
		}
</script>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-3" style="width: 50%">
                <div class="login-panel panel panel-default" style="margin-top: 10%; margin-bottom: 10%;">
                    <div class="panel-heading">
                        <h3 class="panel-title">회원가입</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="memberJoin" method="post">
                            <fieldset>
                            	<div class="form-group" id="divInputId">
                            		<label>아이디</label>
                            		<input class="form-control" style="margin-bottom: 5px;" placeholder="아이디" name="signUpUserId" id="signUpUserId" type="text" />
                            		<input type="button" class="btn btn-default" style="width: 30%;" value="중복확인" onclick="duplicationId();" />
                            	</div>
                            	<div class="form-group">
                            		<label>비밀번호</label>
                            		<input class="form-control" placeholder="비밀번호" name="signUpUserPwd" id="signUpUserPwd" type="password" onclick="checkPassword();"/>
                            	</div>
                            	<div class="form-group">
                            		<label>비밀번호 확인</label>
                            		<input class="form-control" placeholder="비밀번호 확인" name="signUpUserPwdCfm" id="signUpUserPwdCfm" type="password" />
                            	</div>
                            	<div class="form-group">
                            		<label>회사명</label>
                            		<input class="form-control" placeholder="회사명" name="signUpUserCompanyName" id="signUpUserCompanyName" type="text" />
                            	</div>
                            	<div class="form-group">
                            		<label>전화번호</label>
                            		<input class="form-control" placeholder="전화번호" name="signUpUserTelNo" id="signUpUserTelNo" type="text" />
                            	</div>
                            	<div class="form-group">
                            		<label>이메일</label>
                            		<input class="form-control" placeholder="이메일" name="signUpUserEmail" id="signUpUserEmail" type="text" />
                            	</div>
                            	<div class="form-group">
                            		<label style="display: block;" >회사주소</label>
                            		<input class="form-control" style="width: 40%; display: inline;" placeholder="우편번호" name="signUpUserPostNo" id="signUpUserPostNo" type="text" readonly="readonly" >
                            		<button type="button" class="btn btn-default" onclick="execPostCode();"><i class="fa fa-search"></i> 우편번호 찾기</button>
                            		
                            	</div>
                            	<div class="form-group">
                            		<input class="form-control" style="top: 5px;" placeholder="도로명 주소" name="signUpUserCompanyAddress" id="signUpUserCompanyAddress" type="text" readonly="readonly" />
                            	</div>
                            	<div class="form-group">
                            		<input class="form-control" placeholder="상세주소" name="signUpUserCompanyAddressDetail" id="signUpUserCompanyAddressDetail" type="text"  />
                            	</div>
                            	<input type="button" value="회원가입" onclick="dosignUp();" />
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

 <%@include file="../include/plugin_js.jsp" %>
 <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
 <script type="text/javascript">
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
                
                
                $("[name=signUpUserPostNo]").val(data.zonecode);
                $("[name=signUpUserCompanyAddress]").val(fullRoadAddr);
                
                /* document.getElementById('signUpUserPostNo').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('signUpUserCompanyAddress').value = fullRoadAddr;
                document.getElementById('signUpUserCompanyAddressDetail').value = data.jibunAddress; */
            }
 		}).open();
 	}
 </script>

</body>
