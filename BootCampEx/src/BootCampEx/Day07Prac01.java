package BootCampEx;

import java.util.*;

public class Day07Prac01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.print("����(-1�� �Էµ� ������)>>");
		while(true) {
			int a = s.nextInt();
			v.add(a);
			if(a==-1) break;
		}
		int max=0;
		for(int i=0;i<v.size();i++) {
			if (max<v.get(i)) max = v.get(i);
		}
		System.out.println("���� ū ����"+max);
	}

}
