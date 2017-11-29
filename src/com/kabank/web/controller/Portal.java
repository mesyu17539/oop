package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while (true) {
			System.out.println("[MENU] [0] 종료 [1] 회원가입 [2] 계좌계설");
			switch (scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				MemberService memberService = new MemberService();
				System.out.println("이름");
				memberService.setName(scanner.next());
				System.out.println("주민번호");
				memberService.setSsn(scanner.next());
				memberService.setCustomNum();
				memberService.setGender();
				memberService.setAge();
				System.out.printf(
						"[고객번호] %d [이름] %s [성별] %s [나이] %d \n"
						, memberService.getCustomNum() 
						,memberService.getName()
						,memberService.getGender()
						,memberService.getAge()
						);
				break;
			case 2:
				AccountService accountService = new AccountService();
				accountService.setAccountNum();
				System.out.println(accountService.getAccountNum());
				break;
			}
		}
	}
}
