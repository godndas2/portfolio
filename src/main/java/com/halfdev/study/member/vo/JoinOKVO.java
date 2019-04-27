package com.halfdev.study.member.vo;

/**
 * @author HalfDev
 * comment : 회원가입 성공
 *
 */
public class JoinOKVO {

	private String signInUserId;
	
	private String signInUserPwd;

	public String getSignInUserId() {
		return signInUserId;
	}

	public void setSignInUserId(String signInUserId) {
		this.signInUserId = signInUserId;
	}

	public String getSignInUserPwd() {
		return signInUserPwd;
	}

	public void setSignInUserPwd(String signInUserPwd) {
		this.signInUserPwd = signInUserPwd;
	}

	@Override
	public String toString() {
		return "JoinOKVO [signInUserId=" + signInUserId + ", signInUserPwd=" + signInUserPwd + ", getSignInUserId()="
				+ getSignInUserId() + ", getSignInUserPwd()=" + getSignInUserPwd() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
