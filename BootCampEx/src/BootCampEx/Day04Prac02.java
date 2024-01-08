package BootCampEx;

import java.util.Scanner;

class Grade {
	int math;
	int sci;
	int eng;
	public Grade(int math,int sci,int eng) {
		this.math=math; this.sci=sci; this.eng=eng;
	}
	public double average() {
		return (math+sci+eng)/3;
	}
}

public class Day04Prac02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력 >>");
		int math = s.nextInt();
		int sci = s.nextInt();
		int eng = s.nextInt();
		
		Grade me = new Grade(math,sci,eng);
		System.out.println("평균은"+me.average()+"입니다.");
	}

}
