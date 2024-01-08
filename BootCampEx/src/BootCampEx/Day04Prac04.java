package BootCampEx;

class Rectangle {
	int x,y,width,height;
	public Rectangle(int x,int y,int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	public Boolean contains(Rectangle r) {
	   
	    boolean containsX = (this.x >= r.x) && ((this.x + this.width) >= (r.x + r.width));
	    boolean containsY = (this.y >= r.y) && ((this.y + this.height) >= (r.y + r.height));

	    return containsX && containsY;
	}

}

public class Day04Prac04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}

}
