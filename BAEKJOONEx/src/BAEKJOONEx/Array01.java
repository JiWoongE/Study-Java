package BAEKJOONEx;
//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int [] arr = new int[a];
		for (int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int count = 0;
		int b = s.nextInt();
		for (int i=0;i<arr.length;i++) {
			if (b==arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
