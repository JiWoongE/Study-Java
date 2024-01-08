package BootCampEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum =0 , n=0;
		for (int i=0;i<3;i++ ) {
			System.out.println(i+">>");
			try {
				n = s.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				s.next(); //입력 스트림에 있는 정수가 아닌 토큰을 버린다
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은" + sum);
	}

}
