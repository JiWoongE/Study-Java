package BootCampEx;

import java.util.Scanner;

public class Prac01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
	    char c = s.next().charAt(0);

	    for (; c >= 'a'; c--) {
	        for (char i = 'a'; i <= c; i++) {
	            System.out.print(i);
	        }
	        System.out.println(); 
	        }

	}

}
