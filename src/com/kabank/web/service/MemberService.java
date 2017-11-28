package com.kabank.web.service;

public class MemberService {
	public String[] createAge(String ssn) {
		String[] str = new String[3];
		
		switch (ssn.charAt(7)) {
		case '1':
			str[1] = "남자";
			break;
		case '2':
			str[1] = "여자";
			break;
		default:
			str[1] = "잘못됬어";
			break;
		}
		str[0]="101";
		str[2]=ssn.charAt(0)+""+ssn.charAt(1);
		return str;
	}
}
