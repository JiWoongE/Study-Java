package BootCampEx;

import java.util.*;

public class Day07Ex08 {
	static void printList(LinkedList<String> l) {
		Iterator<String> it = l.iterator();
		String e,sep;
		while(it.hasNext()) {
			e = it.next();
			if(it.hasNext())
				sep = "->";
			else
				sep = "\n";
			System.out.print(e+sep);
		}
	}
	public static void main(String[] args) {
		LinkedList <String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ")+1;
		System.out.println("�ƹ�Ÿ��"+index+"��° ����Դϴ�.");
		
	}

}
