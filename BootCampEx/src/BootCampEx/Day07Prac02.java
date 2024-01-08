package BootCampEx;

import java.util.*;

public class Day07Prac02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        System.out.println("���� �̸��� �α��� �Է��ϼ���(��:Korea 5000)");
        String country;
        int population;

        while (true) {
            System.out.print("���� �̸�,�α�>>");
            country = s.next();
            if (country.equals("�׸�")) break;
            population = s.nextInt();
            hm.put(country, population);
        }

        while (true) {
            System.out.print("�α� �˻�>>");
            String searchCountry = s.next();
            if (searchCountry.equals("�׸�")) break;

            if (hm.containsKey(searchCountry)) {
                population = hm.get(searchCountry);
                System.out.println(searchCountry + "�� �α��� " + population);
            } else {
                System.out.println(searchCountry+" ����� �����ϴ�.");
            }
        }
        s.close();
    }
}
