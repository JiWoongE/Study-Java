package Day01;
import java.util.Scanner;

class Phone {
	String name;
	String number;
	public Phone(String name,String number) {
		this.name=name;
		this.number=number;
	}
	public String getName() {return name;}
	public String getNumber() {return number;}
}
public class Ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		System.out.print("인원수>>");
		int num = s.nextInt();
		Phone [] phone = new Phone[num];
		for(i=0;i<phone.length;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = s.next();
			String number = s.next();
			phone[i] = new Phone(name,number);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String name = s.next();
			for(i=0;i<num;i++) {
				if(name.equals(phone[i].getName())) {
					System.out.println(name+"의 번호는 "+phone[i].getNumber()+" 입니다.");
					i--;
					break;
				}
			}
			if(name.equals("그만")) break;
			if(i==num) System.out.println(name + " 이 없습니다.");
		}
	}

}
