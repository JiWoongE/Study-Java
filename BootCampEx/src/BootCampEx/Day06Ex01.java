package BootCampEx;

import java.util.Scanner;

public class Day06Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");

        int[] histogram = new int[26]; // 알파벳 개수에 해당하는 배열

        while (true) {
            String inputLine = scanner.nextLine();

            if (inputLine.equals(";")) {
                break;
            }

            processLine(inputLine, histogram);
        }

        System.out.println("알파벳 히스토그램:");
        printHistogram(histogram);

        scanner.close();
    }

    private static void processLine(String line, int[] histogram) {
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercase = Character.toLowerCase(c);
                int index = lowercase - 'a';
                histogram[index]++;
            }
        }
    }

    private static void printHistogram(int[] histogram) {
        for (char c = 'A'; c <= 'Z'; c++) {
            int index = c - 'A';
            int count = histogram[index];
            System.out.print(c + ": ");
            printHyphens(count);
            System.out.println();
        }
    }

    private static void printHyphens(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("-");
        }
    }
}
