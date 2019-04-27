<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">검색하기</h4>
			</div>
			<form action="notice.do" id="form1" method="post">
				<div class="modal-body">
					<div class="form-group">
						<label for="sel1">검색 항목</label> <select class="form-control"
							name="searchType" id="searchType">
							<option value="ntitle">제목</option>
							<option value="ncontent">내용</option>
						</select>
					</div>
					<div class="input-group custom-search-form">
						<input type="text" name="searchText" class="form-control"
							placeholder="Search..."> <span class="input-group-btn">
							<button class="btn btn-default" onclick="fn_formSubmit()">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</div>
			</form>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>

		</div>
	</div>
</div>