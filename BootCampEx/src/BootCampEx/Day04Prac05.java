package BootCampEx;

import java.util.Scanner;

class Day {
	private String work;
	public void get(String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if (work==null) System.out.println("�����ϴ�.");
		else System.out.println(work+"�Դϴ�.");
	}
}
class MonthSchedule extends Day {
	private String [] schedule = new String[30];
	int day;
	
	public void addSchedule(int day,String work) {
		if (day>=1 && day<=30) {
			schedule[day-1] = work;
		}
		else System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");
	}
	
	public void show(int day) {
		System.out.println(day+"���� �� ���� "+schedule[day-1]+"�Դϴ�.");
	}
}

public class Day04Prac05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MonthSchedule monthschedule = new MonthSchedule();
		System.out.println("�̹��� ������ ���� ���α׷�");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)>>");
			int choice = s.nextInt();
			int day=0;
			
			switch (choice) {
				case 1:
					System.out.print("��¥(1~30)?");
					day = s.nextInt();
					System.out.print("����(��ĭ�����Է�)?");
					String work = s.next();
					monthschedule.addSchedule(day,work);
					System.out.println();
					break;
				case 2:
					System.out.print("��¥(1~30)?");
					day = s.nextInt();
					monthschedule.show(day);
					System.out.println();
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
	}

}
