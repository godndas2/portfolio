<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
</head>
<body>
<%@include file="../include/plugin_js.jsp" %>
<div class="page-wrapper">
    <div class="container-fluid">
        <div class="col-lg-8"><!--게시판 넓이 -->
            <div class="col-lg-12">
                <h1 class="page-header">자유게시판</h1>
            </div>
            <div class="row">
                  <div class="col-lg-12">
                      <button type="button" class="btn btn-outline btn-primary pull-right" onclick="location.href='/board/boardWrite'">
                          <i class="fa fa-edit fa-fw">글쓰기</i> 
                      </button>
                  </div>
              </div>
            <div class="panel panel-default">
                <div class="panel-heading">목록</div>
                <div class="panel-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>No</th>
                                <th>제목</th>
                                <th>작성자</th>
                                <th>작성일</th>
                                <th>조회수</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="boardVO">
                            <tr>
                                <td>${boardVO.nno}</td>
                                <td>${boardVO.ntitle}</td>
                                <td>${boardVO.nwriter}</td>
                                <fmt:parseDate pattern="yyyy-MM-dd" value="${boardVO.nrdate}" scope="page" var="nrdate"/>
                                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${nrdate}"/></td>
                                <td>${boardVO.nviewcnt}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
