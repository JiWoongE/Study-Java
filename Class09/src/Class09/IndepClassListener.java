package Class09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); //btn�� �׼Ǹ����� ���
		c.add(btn);
	
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener();

	}
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) { //��ưŬ���� ȣ��Ǵ� �޼ҵ�
		JButton b = (JButton)e.getSource(); // Ŭ���� ��ư �˾Ƴ���
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
		}
	}
}