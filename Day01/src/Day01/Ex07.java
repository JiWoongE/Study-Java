package Day01;

class Point {
	private int x,y;
	public Point(int x,int y) {
		this.x=x; this.y=y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public void move(int x,int y) {
		this.x=x; this.y=y;
	}
}

class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x,int y) {
		super(x,y);
		if(x<0 || y<0) 
			super.move(0,0);
	}
	public void move(int x,int y) {
		if(x>0 && y>0)
			super.move(x, y);
		else 
			return;
	}
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
}
public class Ex07 {

	public static void main(String[] args) {
		PositivePoint p1 = new PositivePoint();
		p1.move(10,10);
		System.out.println(p1.toString()+"입니다.");
		
		p1.move(-5,5);
		System.out.println(p1.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다.");
		
	}

}
