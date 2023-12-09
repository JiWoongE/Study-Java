package Class09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); //btn에 액션리스너 등록
		c.add(btn);
	
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener();

	}
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) { //버튼클릭시 호출되는 메소드
		JButton b = (JButton)e.getSource(); // 클릭된 버튼 알아내기
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
		}
	}
}