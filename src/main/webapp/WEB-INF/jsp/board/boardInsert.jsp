<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
<script type="text/javascript">
function fn_MoveToUrl(url, msg){
	
    var ntitle = $("#ntitle").val();
    var ncontent = $("#ncontent").val();
    
    if(ntitle.length == 0){
         alert("제목을 입력해 주세요");  
        $("#ntitle").focus();
        return false;

    }
    
    if(ncontent.length == 0){
         alert("내용을 입력해 주세요");  
        $("#ncontent").focus();
        return false;
    }
    
    if(msg){
        if(confirm(msg + "하시겠습니까???"))
        $("#boardFrm").submit();
        return;
    }
    
    location.href=url;
}
</script>
</head>
<body>
<%@include file="../include/plugin_js.jsp" %>
<div class="page-wrapper">
    <div class="container-fluid">
        <div class="col-lg-8"><!--게시판 넓이 -->
            <div class="col-lg-12">
                <h1 class="page-header">게시글 작성</h1>
            </div>
            <div class="row">
                  <div class="col-lg-12">
                  
                  </div>
              </div>
            <div class="panel panel-default">
                <div class="panel-heading">글쓰기 </div>
                <div class="panel-body">
                    <form id="boardFrm" name="boardFrm" action="/board/boardInsert" method="post">
                        <div class="row form-group">
                            <label class="col-lg-2">제목</label>
                            <div class="col-lg-8">
                                <input type="text" class="form-control" id="ntitle" name="ntitle" min="1" max="3">
                             </div>
                        </div>
                           <div class="row form-group">
                           <label class="col-lg-2">내용</label>
                           <div class="col-lg-8">
                               <textarea class="form-control" id="ncontent" name="ncontent"></textarea>
                           </div>
                       </div>
                  </form>
                       <button class="btn btn-outline btn-info" onclick="fn_MoveToUrl('/board/boardInsert','저장')">저장</button>
                          <button class="btn btn-outline btn-primary" onclick="location.href='/board/boardList'">게시글 목록..</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>