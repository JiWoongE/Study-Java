package BootCampEx;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
}
class Student extends Person {
	public void set() {
		age=30;
		name="ȫ�浿";
		height=175;
		setWeight(99);
	}
	public void show() {
		System.out.println(age+name+height+getWeight());
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.show();
	}

}
