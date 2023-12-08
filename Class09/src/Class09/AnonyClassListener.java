package Class09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonyClassListener extends JFrame{
	public AnonyClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() { //익명 클래스로 Action 리스너 작성
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				setTitle(b.getText()); //AnonyClassListener의 멤버나 JFrame 의 멤버 호출 가능
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonyClassListener();

	}

}
