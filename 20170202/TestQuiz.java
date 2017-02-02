
import java.awt.*;
import javax.swing.*;

public class TestQuiz {
	public static void main(String[] args) {
		TestQuiz man = new Quizman();
	}
}



class Quizman {

	
	JFrame frame;
	JPanel panel;
	JLabel label;
	String[ ] quiz;
	int num=3;


	public Quizman(){
		
		frame = new JFrame("Quizman");
		frame.setLocation(400, 400);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//img = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_256.png");
		//img = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_016.png");
		quiz=new String[num*3];
		label = new JLabel(img);
		panel = new JPanel();
		getQuiz();
		
		label.setText(quiz[0]);

		
		panel.add(label);		
		Container con = frame.getContentPane();
		con.add(panel);

		frame.setVisible(true);
	}
	private void getQuiz(){
		FileInputStream fis;
		InputStreamReader isr;
		BufferredReader br;
		try{
			fis=new FileInputStream("quiz.txt");
			isr=new InputStreamReader(fis,"UTF8");
			br=new BufferredReader("isr");
			String str;
			while ((str=br.readLine()) !=null){
		quiz[i]=str;
		i++;
	}
}catch (IOException e){

		System.out.println("IO error");

		}
	}
}
