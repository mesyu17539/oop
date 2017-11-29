package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int number = 101;
		while (true) {
			System.out.println("[MENU] [0] 종료 [1] 회원가입 [2] 계좌계설");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("이름");
				name = scanner.next();
				MemberService memberService = new MemberService();
				String ssn="";
				System.out.println("주민번호");
				boolean bool = true;
				while (bool) {
					ssn = scanner.next();
					if (ssn.charAt(7) == '0' || ssn.charAt(7) == '1') {
						String[] str = memberService.createAge(ssn, number);
						System.out.printf("[고객번호] %s [이름] %s [성별] %s [나이] %s", str[0], name, str[1], str[2]);
						number = Integer.parseInt(str[0])+1;
						bool = false;
					}else {
						System.out.println("다시입력하세요");
					}
				}
				break;
			case 2:
				AccountService accountService = new AccountService();
				System.out.println(accountService.createAccount());
				break;
			}
		}
	}
}
