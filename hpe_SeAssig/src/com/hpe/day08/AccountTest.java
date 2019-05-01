package com.hpe.day08;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account(123,100.5);
		System.out.println("用户"+a.getUser()+"请存款：");
		a.deposit(sc.nextDouble());
		System.out.println("用户"+a.getUser()+"请取款：");
		a.withdrawa(sc.nextDouble());
		a.query();
	}
}
