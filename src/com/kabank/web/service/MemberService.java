package com.kabank.web.service;

public class MemberService {
	private int customNum;
	private String Name;
	private int age;
	private String gender;
	private String ssn;
	private int count;

	public MemberService() {
		this.customNum = 0; // constuct this 입니다. 만들어질때 0 이 올라간다 this is construct
		this.Name = ""; // 기본적으로 갖고 죽을때까지 갖고 있는 값들
		this.age = 0;
		this.gender = "";
		this.ssn = "";
		this.count=100;
	}
	
	public void setCount(int count) {
		this.count=count++;
	}
	
	public int getCount() {
		return this.count;
	}

	public void setCustomNum() {// setter 저장하기
		this.customNum = getCount();
		// 맴버변수 전역변수
	}

	public int getCustomNum() {// getter 부르기
		return this.customNum;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge() {
		this.age = 118 - Integer.parseInt(this.ssn.charAt(0) + "" + this.ssn.charAt(1));
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender() {
		switch (this.ssn.charAt(7)) {
		case '1': case '3':
			this.gender="남자";
			break;
		case '2': case '4':
			this.gender="여자";
			break;
		case '5' : case '6':
			this.gender="외국인";
		}
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return this.ssn;
	}
}
