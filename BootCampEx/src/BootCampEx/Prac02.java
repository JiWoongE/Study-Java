package BootCampEx;

import java.util.Scanner;

public class Prac02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수 몇개? ");
        int a = s.nextInt();
        int[] ia = new int[a];

        for (int i = 0; i < ia.length; i++) {
            int ran;
            boolean tf=false;

            do {
                ran = (int) (Math.random() * 100 + 1);
                tf = false;

                for (int j = 0; j < i; j++) {
                    if (ia[j] == ran) {
                        tf = true;
                        break;
                    }
                }
            } while (tf);

            ia[i] = ran;
            System.out.print(ran + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
