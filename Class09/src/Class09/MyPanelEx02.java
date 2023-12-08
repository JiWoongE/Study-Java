package Class09;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Calendar;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
class myth extends Thread{
	JFrame jf;
	int x=300;
	public myth(JFrame jf) {
		this.jf=jf;
	}
	
	public void run() {
		while(true) {
			try {
				if(x==300) x=330;
				else x=300;
				jf.setLocation(x,x);
				sleep(100);
			}catch(Exception e) {
				return;
			}
		}
	}
}
 
class myFrame extends JFrame{
	public myFrame() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		myth th=new myth(this);
		th.start();
		setVisible(true);
		setSize(500,500);
	}
}
 
public class MyPanelEx02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myFrame();
	}
}
 