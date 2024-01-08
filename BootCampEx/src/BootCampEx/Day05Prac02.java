package BootCampEx;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; //����
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(getSrcString() + "�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ��� >>");
		double val = s.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���:"+res+getDestString()+"�Դϴ�.");
	}
}

class Won2Dollar extends Converter {
	int won2dollar;
	public Won2Dollar(int won2dollar) {
		this.won2dollar=won2dollar;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/won2dollar;
	}
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}
class Km2Mile extends Converter {
	double km2mile;
	public Km2Mile(double km2mile) {
		this.km2mile=km2mile;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/km2mile;
	}
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "Mile";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}

public class Day05Prac02 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
