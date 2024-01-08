package BootCampEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 사각형의 두 모서리 (xl1,yl1)과 (xr1,yr1)을 입력하시오 >>");
		int xl1 = s.nextInt(); int yl1 = s.nextInt(); int xr1 = s.nextInt(); int yr1 = s.nextInt();
		System.out.print("두 번째 사각형의 두 모서리 (xl2,yl2)과 (xr2,yr2)을 입력하시오 >>");
		int xl2 = s.nextInt(); int yl2 = s.nextInt(); int xr2 = s.nextInt(); int yr2 = s.nextInt();
		
		
		int width, height;
	        if (xr1 < xl2 || xr2 < xl1) {
	            width = 0;
	        } else {
	            width = xl2-xr1;
	        }

	        if (yr1 < yl2 || yr2 < yl1) {
	            height = 0;
	        } else {
	            height = yl2-yr1;
	        }
	        System.out.println("두 사각형이 겹치는 영역의 넓이는 "+ width*height + "입니다.");
	    }
	}


