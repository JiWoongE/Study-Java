package Day01;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for (int i=0;i<kor.length;i++) {
			if (word.equals(kor[i])) {
				System.out.print(word+"은(는) ");
				return eng[i];
			}
		}
		return "false";
	}
			}

public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String searchKor = s.next();
			if (searchKor.equals("그만")) break;
			String eng = Dictionary.kor2Eng(searchKor);
			if (eng.equals("false")) System.out.println(searchKor+"은(는) 저의 사전에 없습니다.");
			else System.out.println(eng);
		}
		s.close();
	}

}
