import java.awt.*;
import javax.swing.*;

public class AlohaWindow{
	public static void main(String[] args) {
		JFrame frame= new JFrame();	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setSize(400,400);
		frame.setTitle("ｱｵｷ!");
		frame.setLayout(new FlowLayout());

		JLabel label=new JLabel("HELLO");
		Container ctnr=frame.getContentPane();
		ctnr.add(label);
		JButton button=new JButton ("Click me!");
		Container ctnr2=frame.getContentPane();
		ctnr2.add(button);
		frame.setVisible(true);
	}
}