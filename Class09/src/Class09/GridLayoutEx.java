package Class09;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	GridLayoutEx() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);
		GridLayout grid = new GridLayout(4,4);
	
		Container c = getContentPane();
		c.setLayout(grid);
		
		for(int i=0;i<16;i++) {
			Color [] color = {  Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
								Color.PINK, Color.LIGHT_GRAY,Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA };
			JLabel label = new JLabel(i+"");
			label.setBackground(color[i]);
			label.setOpaque(true);
			c.add(label);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
	
}
