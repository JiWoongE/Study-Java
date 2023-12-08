package Class09;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent; 

import javax.swing.JFrame;
import javax.swing.JPanel; 

public class MyPanelEx01 extends JFrame{

	private MyPanel panel = new MyPanel();
	
	public MyPanelEx01() {
		super("원을 0.5초 간격으로 이동");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
		
		Container c = getContentPane();
		
		MyThread th = new MyThread(panel);
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				th.start();
				}
			});
		
		setFocusable(true);
		requestFocus();	
	}
	class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			int x = (int)(Math.random()*300);
			int y = (int)(Math.random()*300);
			g.drawOval(x, y, 50, 50);
			}
		}
	
	class MyThread extends Thread {
		private MyPanel panel;
		public MyThread(MyPanel panel) {
			this.panel = panel;
			}
		
		public void run() {
			while(true) {
				panel.repaint();
				try {
					sleep(400);
					}
				catch (InterruptedException e) {
					return;
					}
				}
			}
		}
	public static void main(String[] args) {
		new MyPanelEx01();
		}
	}
