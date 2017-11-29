package com.kabank.web.service;

public class MemberService {
	public String[] createAge(String ssn, int number) {
		String[] str = new String[3];
		switch (ssn.charAt(7)) {
		case '1':
			str[1] = "남자";
			break;
		case '2':
			str[1] = "여자";
			break;
		}
		str[0]=number+"";
		str[2]=118-Integer.parseInt(ssn.charAt(0)+""+ssn.charAt(1))+"\n";
		return str;
	}
}
