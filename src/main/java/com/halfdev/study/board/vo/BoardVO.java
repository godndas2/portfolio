package com.halfdev.study.board.vo;

public class BoardVO {

	 	private Integer nno;
	    //  제목
	    private String ntitle;
	    //  내용
	    private String ncontent;
	    //  작성자
	    private String nwriter;
	    //  작성일
	    private String nrdate;
	    //  조회수
	    private Integer nviewcnt;
	    //  삭제여부
	    private String nisdelete;
	    
		public Integer getNno() {
			return nno;
		}
		public void setNno(Integer nno) {
			this.nno = nno;
		}
		public String getNtitle() {
			return ntitle;
		}
		public void setNtitle(String ntitle) {
			this.ntitle = ntitle;
		}
		public String getNcontent() {
			return ncontent;
		}
		public void setNcontent(String ncontent) {
			this.ncontent = ncontent;
		}
		public String getNwriter() {
			return nwriter;
		}
		public void setNwriter(String nwriter) {
			this.nwriter = nwriter;
		}
		public String getNrdate() {
			return nrdate;
		}
		public void setNrdate(String nrdate) {
			this.nrdate = nrdate;
		}
		public Integer getNviewcnt() {
			return nviewcnt;
		}
		public void setNviewcnt(Integer nviewcnt) {
			this.nviewcnt = nviewcnt;
		}
		public String getNisdelete() {
			return nisdelete;
		}
		public void setNisdelete(String nisdelete) {
			this.nisdelete = nisdelete;
		}
		@Override
		public String toString() {
			return "BoardVO [nno=" + nno + ", ntitle=" + ntitle + ", ncontent=" + ncontent + ", nwriter=" + nwriter
					+ ", nrdate=" + nrdate + ", nviewcnt=" + nviewcnt + ", nisdelete=" + nisdelete + "]";
		}
	    
}
