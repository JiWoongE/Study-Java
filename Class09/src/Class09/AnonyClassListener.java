package Class09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonyClassListener extends JFrame{
	public AnonyClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() { //�͸� Ŭ������ Action ������ �ۼ�
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
				setTitle(b.getText()); //AnonyClassListener�� ����� JFrame �� ��� ȣ�� ����
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonyClassListener();

	}

}
