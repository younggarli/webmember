package user.model;

import java.util.Date;

public class UserVO {

	private String mem_id;			//아이디
	private String mem_pass;		//비밀번호
	private String mem_add1;		//주소
	private String mem_add2;		//상세주소
	private String mem_zip;			//우편번호
	private Date mem_bir;			//생일
	private String mem_profile;		//프로필사진
	private String mem_alias;		//별명
	
	
	public String getMem_id() {
		return mem_id;
	}


	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}


	public String getMem_pass() {
		return mem_pass;
	}


	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}


	public String getMem_add1() {
		return mem_add1;
	}


	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}


	public String getMem_add2() {
		return mem_add2;
	}


	public void setMem_add2(String mem_add2) {
		this.mem_add2 = mem_add2;
	}


	public String getMem_zip() {
		return mem_zip;
	}


	public void setMem_zip(String mem_zip) {
		this.mem_zip = mem_zip;
	}


	public Date getMem_bir() {
		return mem_bir;
	}


	public void setMem_bir(Date mem_bir) {
		this.mem_bir = mem_bir;
	}


	public String getMem_profile() {
		return mem_profile;
	}


	public void setMem_profile(String mem_profile) {
		this.mem_profile = mem_profile;
	}


	public String getMem_alias() {
		return mem_alias;
	}


	public void setMem_alias(String mem_alias) {
		this.mem_alias = mem_alias;
	}


	@Override
	public String toString() {
		return "UserVO [mem_id=" + mem_id + ", mem_pass=" + mem_pass
				+ ", mem_add1=" + mem_add1 + ", mem_add2=" + mem_add2
				+ ", mem_zip=" + mem_zip + ", mem_bir=" + mem_bir
				+ ", mem_profile=" + mem_profile + ", mem_alias=" + mem_alias
				+ "]";
	}


	public UserVO(String mem_id, String mem_pass, String mem_add1,
			String mem_add2, String mem_zip, Date mem_bir, String mem_profile,
			String mem_alias) {
		this.mem_id = mem_id;
		this.mem_pass = mem_pass;
		this.mem_add1 = mem_add1;
		this.mem_add2 = mem_add2;
		this.mem_zip = mem_zip;
		this.mem_bir = mem_bir;
		this.mem_profile = mem_profile;
		this.mem_alias = mem_alias;
	}


	public UserVO() {
	}
	
	
	//생성자

}
