package BootCampEx;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String grape = s.next();
		int money=0;
		
		switch(grape) {
			case "mango":
				money = 1500;
				break;
			case "apple":
				money = 1000;
				break;
			case "banana":
				money = 500;
				break;
			case "orange":
				money = 100;
				break;
		}
		System.out.println(grape+"�� ������ " + money + "�� �Դϴ�.");
	}

}
