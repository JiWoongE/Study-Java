package BAEKJOONEx;
//단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오
import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int i = sc.nextInt();

        char c[] = s.toCharArray();
        System.out.println(c[i-1]);
	}

}
