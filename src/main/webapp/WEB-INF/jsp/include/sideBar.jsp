<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Search...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
			<li><a href="#"><i class="fa fa-files-o fa-fw"></i>페이지 관리<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="index.do"><i class="fa fa-columns"></i> 홈페이지</a>
					</li>
					<li><a href="dashboard.do"><i class="fa fa-columns"></i>사용자
							대시보드</a></li>
				</ul></li>
			<!-- 페이지 관리 -->

			<li><a href="companyinfo.do"><i class="fa fa-table fa-fw"></i>업체
					정보</a></li>
			<!-- 업체 정보 관리  -->

			<li><a href="#"><i class="fa fa-files-o fa-fw"></i>고객센터 관리<span
					class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="notice.do"><i class="fa fa-columns"></i>공지사항</a>
					</li>
					<li><a href="dashboard.do"><i class="fa fa-columns"></i>고객센터
							관리</a></li>
				</ul></li>
			<!-- 공지사항 및 고객문의 관리 -->

			<!-- 멀티 드롭다운
                        <li>
                            <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#">Second Level Item</a>
                                </li>
                                <li>
                                    <a href="#">Second Level Item</a>
                                </li>
                                <li>
                                    <a href="#">Third Level <span class="fa arrow"></span></a>
                                    <ul class="nav nav-third-level">
                                        <li>
                                            <a href="#">Third Level Item</a>
                                        </li>
                                        <li>
                                            <a href="#">Third Level Item</a>
                                        </li>
                                        <li>
                                            <a href="#">Third Level Item</a>
                                        </li>
                                        <li>
                                            <a href="#">Third Level Item</a>
                                        </li>
                                    </ul>
                                    /.nav-third-level
                                </li>
                            </ul>
                            /.nav-second-level
                        </li>
                         -->


		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->