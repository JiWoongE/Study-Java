package BootCampEx;
import java.util.*;

public class Day07Prac03 {

	public static void main(String[] args) {
		HashMap<String,Double> h = new HashMap<String,Double>();
		Scanner s = new Scanner(System.in);
		String name;
		double grade;
		for (int i=0;i<5;i++) {
			System.out.print("이름과 학점>>");
			name = s.next();
			grade = s.nextDouble();
			h.put(name, grade);
		}
		System.out.print("장학생 선발 학점 기준 입력>>");
		double norGrade = s.nextDouble();
		System.out.print("장학생 명단 : ");
		for (String studentName : h.keySet()) {
            if (h.get(studentName) >= norGrade) {
                System.out.print(studentName + " ");
            }
        }

			
		}
	}


