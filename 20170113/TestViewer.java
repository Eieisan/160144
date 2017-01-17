import java.awt.*;
import	javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class TestViewer{
	public static void main(String[] args) {
		TestViewerMan man=new TestViewerMan();
	}
}
class TestViewerMan implements ActionListener{
		JFrame frame;
		JButton button1;
		JButton button2;
		JTextField fileName;
		JPanel fieldPanel;
		JTextArea textArea;
		JScrollPane scrollPane;


		public TestViewerMan() {
			frame = new JFrame("TestViewer");
			frame.setLocation(400, 400);
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			button1 = new JButton("HELLO");
			button1.addActionListener(this);
			button1.setActionCommand("btn1");

			button2 = new JButton("あおき！");
			button2.addActionListener(this);
			button2.setActionCommand("btn2");

			fileName = new JTextField("ALOHA", 20);		
			fieldPanel = new JPanel();				
			textArea = new JTextArea(10, 30);		
			scrollPane = new JScrollPane(textArea);	

			
			fieldPanel.add(fileName);	
			fieldPanel.add(button1);	
			fieldPanel.add(button2);

			Container con = frame.getContentPane();
			con.setLayout(new GridLayout(2, 1));
			con.add(fieldPanel);	
			con.add(scrollPane);	

			
			frame.setVisible(true);
		}
	public void actionPerformed(ActionEvent ae){
		String btn=ae.getActionCommand();

		if(btn.equals("btn1")){
			String file=fileName.getText();
			FileReader fr;
			BufferedReader br;

			try{
				fr=new FileReader(file);
				br=new BufferedReader(file);

				String data;
				while((data = br.readLine()) != null) {
					textArea.append(data+'\n');
				}
				textArea.setText(data);
			}catch(IOException e){
				System.out.println("IO error.");
			}
			
		}
	}
}