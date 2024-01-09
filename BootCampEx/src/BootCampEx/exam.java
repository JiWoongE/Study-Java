package BootCampEx;

import java.util.*;

public class exam {

	public static void main(String[] args) {
		System.out.println("학번 : 202014906");
		Scanner s = new Scanner(System.in);
		int count=0;
        while (true) {
            System.out.print("입력>> ");
            int num = s.nextInt();
            
            if (num == 0) break;
            else {
                ArrayList<Integer> numbers = new ArrayList<>();

                for (int i = 0; i < num; i++) {
                    numbers.add(i);
                }

                Collections.shuffle(numbers);

                for (int i = 0; i < num; i++) {
                    System.out.print(numbers.get(i) + " ");
                }

                System.out.println();      
                
            }
        }
    }

}
