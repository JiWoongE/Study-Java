package Class09;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
class myth1 extends Thread{
	JLabel jf;
	int x=300;
	public myth1(JLabel jf) {
		this.jf=jf;
	}
	
	public void run() {
		while(true) {
			try {
				if(x==100) x=130;
				else x=100;
				jf.setLocation(x,x);
				sleep(100);
			}catch(Exception e) {
				return;
			}
		}
	}
}
 
class myFrame1 extends JFrame{
	JLabel jl=new JLabel("진동 레이블");
	public myFrame1() {
		setTitle("진동하는 레이블 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		jl.setBounds(100,100,200,300);
		add(jl);
		myth1 th=new myth1(jl);
		th.start();
		setVisible(true);
		setSize(500,500);
	}
}
 
public class MyPanelEx03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myFrame1();
	}
}
 
