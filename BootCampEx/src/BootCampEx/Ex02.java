package BootCampEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° �簢���� �� �𼭸� (xl1,yl1)�� (xr1,yr1)�� �Է��Ͻÿ� >>");
		int xl1 = s.nextInt(); int yl1 = s.nextInt(); int xr1 = s.nextInt(); int yr1 = s.nextInt();
		System.out.print("�� ��° �簢���� �� �𼭸� (xl2,yl2)�� (xr2,yr2)�� �Է��Ͻÿ� >>");
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
	        System.out.println("�� �簢���� ��ġ�� ������ ���̴� "+ width*height + "�Դϴ�.");
	    }
	}


