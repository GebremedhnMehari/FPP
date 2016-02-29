
/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson5assignment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Exercise5_2 {
	
	private int n1;
	private int n2;
	private int sum;
	private int diff;
	private int mult;
	String s = "Hello";
	int a =  s.charAt(1);
	
	//Defining JLabel
	private JLabel lblInput;
	private JLabel lblOutput;
	
	
	//Defining JTextField
	private JTextField tfInput;
	private JTextField tfOutput;
	
	
	//Defining JButton
	private JButton btnCount;
	private JButton btnReverse;
	private JButton btnRemove;
	private JButton btnClear;
	private JButton btnExit;
	
	public static final int DEFAULT_WIDTH = 700;
	public static final int DEFAULT_HEIGHT = 400;
	
	public static void main(String[] args) {
		Exercise5_2 frame = new Exercise5_2();
		
		//frame.setVisible(true);
	}
	
    public Exercise5_2() {
		
		JFrame frame=new JFrame();
		frame.setTitle("Address Form");
		frame.setVisible(true);
		
		//Define your layout
		//setLayout(new FlowLayout());
		frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//change the background color of the frame
		frame.getContentPane().setBackground(Color.lightGray);
		frame.getContentPane().setLayout(null);
		
   
		//Initialization
		lblInput = new JLabel("Input");
		lblInput.setBounds(275, 30, 160, 20);
		
	
		lblOutput = new JLabel("Output");
		lblOutput.setBounds(275, 75, 160, 20);
		
		tfInput = new JTextField(12);
		tfInput.setBounds(275, 50, 160, 25);	
		
		
		
		tfOutput = new JTextField(6);
		tfOutput.setBounds(275, 95, 160, 25);
		
		
		btnCount= new JButton("Count Letters ");
		btnCount.setBounds(100, 20, 160, 35);
		btnReverse= new JButton("Reverse Letters");
		btnReverse.setBounds(100, 60, 160, 35);
		btnRemove= new JButton("Remove Letters");
		btnRemove.setBounds(100, 100, 160, 35);
		
		//add to the frame
		frame.add(lblInput);
		frame.add(tfInput);
		frame.add(lblOutput);
		frame.add(tfOutput);
		
		frame.add(btnCount);
		frame.add(btnReverse);
		frame.add(btnRemove);		
		
		ButtonHandler btnHandler = new ButtonHandler();
		btnCount.addActionListener(btnHandler);
		btnReverse.addActionListener(btnHandler);
		btnRemove.addActionListener(btnHandler);
		btnClear.addActionListener(btnHandler);
		btnExit.addActionListener(btnHandler);
		
		//Event handling for Submit Button
		
			
	}
    
    
  //define event handling for button handler
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == btnClear){
				tfInput.setText(null);
				tfOutput.setText(null);
				
			}else if(event.getSource() == btnExit){
				System.exit(0);
			}else
			{
							  
				 				
				if(event.getSource() == btnCount){
					 					
					int answer =  tfInput.getText().length();
					tfOutput.setText(String.valueOf(answer));
					
				}else if(event.getSource() == btnReverse){
					 					
					String answer = tfInput.getText().toString() ;
					String t="";
					for(int i=answer.length()-1;i>=0;i--)
					   t=t + answer.charAt(i);
					tfOutput.setText(t.toString());
					}
				 else if(event.getSource() == btnRemove){
					
					int n = tfInput.getText().length();
					String str = tfInput.getText().toString() ;
					String newlist =" ";
					int k = 0;
					for (int i = 0; i < n; i++) {
						int f = 1;
						for (int j = 0; j < newlist.length(); j++) {
							if (str.charAt(i) == newlist.charAt(j)) {
								f = 0;
								
							}
						 
						}
						if (f != 0) {
							
							newlist=newlist+str.charAt(i);
						//	newlist.copyValueOf(str.charAt(i))
						//	newlist.charAt(k) = str;
						//	k++;
						}
					}
					
					tfOutput.setText(newlist);
					
				}
				}
			}
		}
	

}
