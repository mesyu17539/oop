package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "", sex = "",ssn="";
		int number = 0,age=0;
		while (true) {
			System.out.println("[MENU] [0] 종료 [1] 회원가입 [2] 계좌계설");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("이름");
				name = scanner.next();
				System.out.println("주민번호");
				MemberService memberService = new MemberService();
				String[] str= memberService.createAge(scanner.next());
				System.out.printf("[고객번호] %s" + "[이름] %s" + "[성별] %s [나이] %s",str[0], name, str[1], str[2]);
				number++;
				break;
			case 2:
				AccountService accountService = new AccountService();
				System.out.println(accountService.createAccount());
				break;
			}
		}
	}
}
