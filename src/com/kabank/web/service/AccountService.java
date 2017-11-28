package com.kabank.web.service;

import java.util.Random;
import java.util.Scanner;

public class AccountService {
	public int createAccount() {
		Random random = new Random();
		int account = 0;
		boolean flag = true;
		while (flag) {
			account = random.nextInt(1000000);
			if (account > 100000) {
				flag = false;				
			}
		}
		return account;
	}
}
