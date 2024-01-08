package BootCampEx;

import java.util.Scanner;

public class Day06Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");

        int[] histogram = new int[26]; // ���ĺ� ������ �ش��ϴ� �迭

        while (true) {
            String inputLine = scanner.nextLine();

            if (inputLine.equals(";")) {
                break;
            }

            processLine(inputLine, histogram);
        }

        System.out.println("���ĺ� ������׷�:");
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
