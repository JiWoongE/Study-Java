package Day01;
import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 실수 저장
	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
	}

class StringStack implements Stack {
	private String[] element; // 스택의 저장 메모리
	private int tos; // index, top of stack
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}
	
	public int length() { // 현재 스택에 저장된 개수 리턴
		return tos+1;
	}

	public int capacity() { // 현재 스택에 저장된 개수 리턴
		return element.length;
	}

	public String pop() {
		if(tos == -1) // 스택이 비었음
			return null;
		String s = element[tos]; // 톱에 있는 값
		tos--; // 스택 포인터 감소
		return s;
	}

	public boolean push(String str) {
		if(tos == element.length-1)
			return false; // 스택이 다 찼음
		else {
			tos++;
			element[tos] = str; // 요소 스택에 저장 후 스택 포인터 증가
			return true;
		}
	}
}
public class StackApp {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = scanner.nextInt();
		StringStack ss = new StringStack(n); // n개의 문자열이 저장 가능한 스택 생성
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.next();
			if(str.equals("그만"))
				break;
			boolean res = ss.push(str); // 스택에 저장
			if(res == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = ss.length(); // 현재 스택에 저장된 문자열 개수
		for(int i=0; i<len; i++) { // 스택에 저장된 개수만큼 루프
			System.out.print(ss.pop() + " "); // 스택에서 팝하여 출력
		}
		scanner.close();
	}
}