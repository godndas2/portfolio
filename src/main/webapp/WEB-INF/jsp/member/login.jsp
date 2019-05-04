<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Login Form</title>
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Welcome</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="memberJoinOk" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="아이디" name="userId" id="userId" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="비밀번호" name="userPwd" id="userPwd" type="password" value="">
                                </div>
                                <div class="form-group">
                                	<button type="button" class="btn btn-outline btn-info" style="float: right;" onclick="location.href='join'" >회원가입</button>
                                	<button type="button" style="float: right;" class="btn btn-outline btn-warning">비밀번호 찾기</button>
                                </div>
                                <div class="col-xs-8">
                                	<div class="form-group">
                                		<label>
                                			<input type="checkbox" name="useCookie"> 자동로그인
                                		</label>
                                	</div>
                                </div>
                               
                                	<button class="btn btn-md btn-success btn-block" >Login</button>
                                
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

 <%@include file="../include/plugin_js.jsp" %>

<script type="text/javascript">
	$(document).ready(function(){
		 
	});
</script>



</body>
</html>