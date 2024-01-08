package Day01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		
		int fiftyThousand = money/50000;
		money %= 50000;
		
		int tenThousand = money/10000;
		money %= 10000;
		
		int oneThousand = money/1000;
		money %= 1000;
		
		int fiveHundred = money/500;
		money %= 500;
		
		int oneHundred = money/100;
		money %= 100;
		
		int fifty = money/50;
		money %= 50;
		
		int ten = money/10;
		money %= 10;
		
		int one = money;
		
		System.out.println("오만원권 " + fiftyThousand + "매");
		System.out.println("만원권 " + tenThousand + "매");
		System.out.println("천원권 " + oneThousand + "매");
		System.out.println("오백 " + fiveHundred + "매");
		System.out.println("백원 " + oneHundred + "매");
		System.out.println("오십원 " + fifty + "매");
		System.out.println("십원 " + ten + "매");
		System.out.println("일원 " + one + "매");
		
	}

}
