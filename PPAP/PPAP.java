import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;


public class PPAP{
	public static void main(String[] args) {
		
		PPAPMan man=new PPAPMan();
	}
}
	class PPAPMan implements ActionListener{
		JFrame frame;
		JButton buttonSave;
		JButton buttonNext;
		JPanel buttonPanel;
		JLabel word1;
		JLabel word2;
		JPanel wordPanel;
		JTextArea memo;
		JScrollPane memoPane;
		String[] words=new String[23];

		public PPAPMan(){
		frame=new JFrame("PPAP");
		frame.setLocation(400,400);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonSave=new JButton("Save");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");
		buttonNext=new JButton("Next");
		buttonNext.addActionListener(this);
		buttonNext.setActionCommand("next");
		memo=new JTextArea(5,20);
		word1=new JLabel("ALOHA");
		word2=new JLabel("HELLO");
		

		buttonPanel=new JPanel();
		wordPanel=new JPanel();
		wordPanel.add(word1);
		wordPanel.add(word2);
		memoPane=new JScrollPane(memo);

		Container con=frame.getContentPane();
		con.setLayout(new GridLayout(2,1));		
		

		buttonPanel.add(buttonSave);
		buttonPanel.add(buttonNext);
		con.add(buttonPanel);	

		con.add(wordPanel);
		con.add(memoPane);
		
		
		frame.setVisible(true);

		}
		public void actionPerformed(ActionEvent ae){
			String cmd=ae.getActionCommand();
			if(cmd.equals("save")){
				FileWriter fw=null;
				PrintWriter pw=null;
				try{
					fw=new FileWriter("memo.txt");
					pw=new PrintWriter(fw);

					String data=memo.getText();
					pw.println(data);

				}catch(IOException e){
					System.out.println("IO error");
				}finally{
					try{
						fw.close();
						pw.close();
					}catch(IOException e){
					System.out.println("IO error");
				}
			}
			}else if(cmd.equals("next")){
				FileReader fr;
				BufferedReader br;
				try{
					fr=new FileReader("words.txt");
					br=new BufferedReader(fr);

					String data;
					int i=0;
					while((data=br.readLine())!=null){
						System.out.println(data);
						words[i]=data;						
					}
					int rdm1=(int)(Math.random()*23);
					int rdm2=(int)(Math.random()*23);

					word1.setText(words[rdm1]);
					word2.setText(words[rdm2]);

		} catch(IOException e) {
			System.out.println("IO Error.");
		}
				}
			}			
		
	}

	

	

	