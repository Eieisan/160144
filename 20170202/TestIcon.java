
import java.awt.*;
import javax.swing.*;

public class TestIcon {
	public static void main(String[] args) {
		Iconman man = new Iconman();
	}
}



class Iconman implements ActionListener{

	ImageIcon img;
	ImageIcon img2;
	JFrame frame;
	JPanel panel;
	JLabel label;
	JPanel panel2;
	JLabel label2;
	JButton button;


	public Iconman(){
		
		frame = new JFrame("Iconman");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_256.png");
		img2 = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_016.png");

		label = new JLabel(img);
		panel = new JPanel();
		label2 = new JLabel(img2);
		panel2 = new JPanel();
		button=new JButton("Click me!");
		button.addActionListener(this);

		
		panel.add(label);
		panel2.add(label2);
		panel.add(button);
		Container con = frame.getContentPane();
		con.add(panel);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		label.setIcon(img2);
	}
}