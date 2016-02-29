

/**
 * @author Gebremedhn Mehari, ID: 985113
 */

package lesson5assignment;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercise5_5 {
	
	private JButton btnUs;
	private JButton btnEuro;
	private JButton btnRupee;
	private JButton btnPound;
	private JButton btnRupia;
	private JButton btnNPR;
	private JButton btnDate;
	
	private JTextField tfInput;
	private JLabel lbOutput;
	
	private JLabel lblInput;
	//private JLabel lblOutput;
	
	public static final int DEFAULT_WIDTH = 700;
	public static final int DEFAULT_HEIGHT = 400;
	
	public static void main(String[] args) {
		Exercise5_5 frame = new Exercise5_5();
		
		//frame.setVisible(true);
	}
	
	 public Exercise5_5() {
			
			JFrame frame=new JFrame();
			frame.setTitle("Currency Converter");
			frame.setVisible(true);
			
			//Define your layout
			//setLayout(new FlowLayout());
			frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//change the background color of the frame
			frame.getContentPane().setBackground(Color.lightGray);
			frame.getContentPane().setLayout(null);
			
			Date d = new Date();
	    
			//Initialization
			lblInput = new JLabel(d.toString());
			lblInput.setBounds(100, 90, 260, 20);
			lblInput.setForeground(Color.BLUE);
		    
			btnDate = new JButton("Current Date and Time");
			btnDate.setBounds(430, 90, 200, 20);
			
			tfInput = new JTextField(12);
			tfInput.setBounds(100, 20, 300, 50);	
			
			
			
			lbOutput = new JLabel("<======== Enter Value Here");
			lbOutput.setBounds(430, 20, 200, 50);
			
			
			btnUs= new JButton("US Dollar $ ");
			btnUs.setBounds(100, 120, 120, 55);
			
			btnRupee= new JButton("Indian Rupee ");
			btnRupee.setBounds(250, 120, 120, 55);
			btnRupia= new JButton("Bang. Rupia");
			btnRupia.setBounds(380, 120, 120, 55);
			btnNPR= new JButton("Nepal NPR");
			btnNPR.setBounds(510, 120, 120, 55);
			btnEuro= new JButton("Europe Euro ");
			btnEuro.setBounds(100, 200, 120, 55);
			
			btnPound= new JButton("UK Pound");
			btnPound.setBounds(250, 200, 120, 55);
						
			//add to the frame
			frame.add(lblInput);
			frame.add(tfInput);
			frame.add(btnDate);
			frame.add(lbOutput);
			
			frame.add(btnUs);
			frame.add(btnEuro);
			frame.add(btnRupee);
			frame.add(btnPound);
			frame.add(btnRupia);
			frame.add(btnNPR);
			/**/	
			//Event handling for Submit Button	
			ButtonHandler btnHandler = new ButtonHandler();
			btnUs.addActionListener(btnHandler);
			btnEuro.addActionListener(btnHandler);
			btnRupee.addActionListener(btnHandler);
			btnPound.addActionListener(btnHandler);
			btnRupia.addActionListener(btnHandler);
			btnNPR.addActionListener(btnHandler);
			btnDate.addActionListener(btnHandler);	
				
		}
	 
	 
	//define event handling for button handler
	 	private class ButtonHandler implements ActionListener{
	 		public void actionPerformed(ActionEvent event){
	 			double d;
	 			try{
	 			    d=Double.parseDouble( tfInput.getText());
	 			    }  
				  catch(NumberFormatException nfe)  
				  {  
				    d = 0;   
				  } 
	 			
	 			if(event.getSource() == btnUs){
	 				tfInput.setText(String.valueOf(d));
	
	 			}
	 			else if(event.getSource() == btnEuro){
	 				
	 			     d=d*0.914785;
	 			    tfInput.setText(String.valueOf(d));

	 			}
	 			else if(event.getSource() == btnRupee){
	 					 					
		 			     d=d*68.8000;
	 					tfInput.setText(String.valueOf(d));
	 					
	 				}
	 			else if(event.getSource() == btnPound){
	 					 					
		 			     d=d*0.7212;
	 					tfInput.setText(String.valueOf(d));
	 					}
	 				 else if(event.getSource() == btnRupia){
	 					
		 			     d=d*79.001;
	 					tfInput.setText(String.valueOf(d));
	 					
	 				}
	 				
    	 		  else if(event.getSource() == btnNPR){

	 			     d=d*110.2019;
	 				 tfInput.setText(String.valueOf(d));
	 			}
    	 		 else if(event.getSource() == btnDate){

    	 			Date date = new Date();
    	 			SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy,EEEE :  H:m:s");
    	 			String Date2 = sdf2.format(date);
	 				lblInput.setText(String.valueOf(Date2)); 
	 				lblInput.setForeground(Color.BLUE);
	 				 
	 			}
	 			}
	 		}
	
}
