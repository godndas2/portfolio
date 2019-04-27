package com.halfdev.study.member.vo;

import java.util.Date;

public class JoinVO {

private String userid;
    
private String signUpUserId;

private String signUpUserPwd;

private String signUpUserCompanyName;

private String signUpUserTelNo;

private String signUpUserEmail;

private String signUpUserCompanyNo;

private String signUpUserPostNo;

private String signUpUserCompanyAddress;

private String signUpUserCompanyAddressDetail;

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getSignUpUserId() {
	return signUpUserId;
}

public void setSignUpUserId(String signUpUserId) {
	this.signUpUserId = signUpUserId;
}

public String getSignUpUserPwd() {
	return signUpUserPwd;
}

public void setSignUpUserPwd(String signUpUserPwd) {
	this.signUpUserPwd = signUpUserPwd;
}

public String getSignUpUserCompanyName() {
	return signUpUserCompanyName;
}

public void setSignUpUserCompanyName(String signUpUserCompanyName) {
	this.signUpUserCompanyName = signUpUserCompanyName;
}

public String getSignUpUserTelNo() {
	return signUpUserTelNo;
}

public void setSignUpUserTelNo(String signUpUserTelNo) {
	this.signUpUserTelNo = signUpUserTelNo;
}

public String getSignUpUserEmail() {
	return signUpUserEmail;
}

public void setSignUpUserEmail(String signUpUserEmail) {
	this.signUpUserEmail = signUpUserEmail;
}

public String getSignUpUserCompanyNo() {
	return signUpUserCompanyNo;
}

public void setSignUpUserCompanyNo(String signUpUserCompanyNo) {
	this.signUpUserCompanyNo = signUpUserCompanyNo;
}

public String getSignUpUserPostNo() {
	return signUpUserPostNo;
}

public void setSignUpUserPostNo(String signUpUserPostNo) {
	this.signUpUserPostNo = signUpUserPostNo;
}

public String getSignUpUserCompanyAddress() {
	return signUpUserCompanyAddress;
}

public void setSignUpUserCompanyAddress(String signUpUserCompanyAddress) {
	this.signUpUserCompanyAddress = signUpUserCompanyAddress;
}

public String getSignUpUserCompanyAddressDetail() {
	return signUpUserCompanyAddressDetail;
}

public void setSignUpUserCompanyAddressDetail(String signUpUserCompanyAddressDetail) {
	this.signUpUserCompanyAddressDetail = signUpUserCompanyAddressDetail;
}

@Override
public String toString() {
	return "JoinVO [userid=" + userid + ", signUpUserId=" + signUpUserId + ", signUpUserPwd=" + signUpUserPwd
			+ ", signUpUserCompanyName=" + signUpUserCompanyName + ", signUpUserTelNo=" + signUpUserTelNo
			+ ", signUpUserEmail=" + signUpUserEmail + ", signUpUserCompanyNo=" + signUpUserCompanyNo
			+ ", signUpUserPostNo=" + signUpUserPostNo + ", signUpUserCompanyAddress=" + signUpUserCompanyAddress
			+ ", signUpUserCompanyAddressDetail=" + signUpUserCompanyAddressDetail + "]";
}


 
}
