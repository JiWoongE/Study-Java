package BootCampEx;
import java.util.*;

public class Day07Prac03 {

	public static void main(String[] args) {
		HashMap<String,Double> h = new HashMap<String,Double>();
		Scanner s = new Scanner(System.in);
		String name;
		double grade;
		for (int i=0;i<5;i++) {
			System.out.print("�̸��� ����>>");
			name = s.next();
			grade = s.nextDouble();
			h.put(name, grade);
		}
		System.out.print("���л� ���� ���� ���� �Է�>>");
		double norGrade = s.nextDouble();
		System.out.print("���л� ��� : ");
		for (String studentName : h.keySet()) {
            if (h.get(studentName) >= norGrade) {
                System.out.print(studentName + " ");
            }
        }

			
		}
	}


