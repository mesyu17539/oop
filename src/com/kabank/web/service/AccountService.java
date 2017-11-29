package com.kabank.web.service;

import java.util.Random;
import java.util.Scanner;

public class AccountService {
	private String name;
	private int accountNum;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAccountNum() {
		Random random = new Random();
		int account = 0;
		boolean flag = true;
		while (flag) {
			account = random.nextInt(1000000);
			if (account > 100000) {
				flag = false;
				this.accountNum = account;
			}
		}
	}

	public int getAccountNum() {
		return this.accountNum;
	}
}
