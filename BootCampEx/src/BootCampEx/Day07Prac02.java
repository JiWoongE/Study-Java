package BootCampEx;

import java.util.*;

public class Day07Prac02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        System.out.println("나라 이름과 인구를 입력하세요(예:Korea 5000)");
        String country;
        int population;

        while (true) {
            System.out.print("나라 이름,인구>>");
            country = s.next();
            if (country.equals("그만")) break;
            population = s.nextInt();
            hm.put(country, population);
        }

        while (true) {
            System.out.print("인구 검색>>");
            String searchCountry = s.next();
            if (searchCountry.equals("그만")) break;

            if (hm.containsKey(searchCountry)) {
                population = hm.get(searchCountry);
                System.out.println(searchCountry + "의 인구는 " + population);
            } else {
                System.out.println(searchCountry+" 나라는 없습니다.");
            }
        }
        s.close();
    }
}
