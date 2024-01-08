package BootCampEx;

import java.util.Scanner;

class Day {
	private String work;
	public void get(String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if (work==null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}
class MonthSchedule extends Day {
	private String [] schedule = new String[30];
	int day;
	
	public void addSchedule(int day,String work) {
		if (day>=1 && day<=30) {
			schedule[day-1] = work;
		}
		else System.out.println("유효한 날짜가 아닙니다.");
	}
	
	public void show(int day) {
		System.out.println(day+"일의 할 일은 "+schedule[day-1]+"입니다.");
	}
}

public class Day04Prac05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MonthSchedule monthschedule = new MonthSchedule();
		System.out.println("이번달 스케줄 관리 프로그램");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int choice = s.nextInt();
			int day=0;
			
			switch (choice) {
				case 1:
					System.out.print("날짜(1~30)?");
					day = s.nextInt();
					System.out.print("할일(빈칸없이입력)?");
					String work = s.next();
					monthschedule.addSchedule(day,work);
					System.out.println();
					break;
				case 2:
					System.out.print("날짜(1~30)?");
					day = s.nextInt();
					monthschedule.show(day);
					System.out.println();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
	}

}
