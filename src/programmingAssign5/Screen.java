package programmingAssign5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Screen extends JFrame{
	
	String s = "Hello";
	int a =  s.charAt(1);
	
	//Defining JLabel
	private JLabel lblName;
	private JLabel lblstreet;
	private JLabel lblCity;
	private JLabel lblState;
	private JLabel lblZip;
	
	//Defining JTextField
	private JTextField tfName;
	private JTextField tfstreet;
	private JTextField tfCity;
	private JTextField tfState;
	private JTextField tfZip;
	
	//Defining JButton
	private JButton btnSubmit;
	
	
	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 300;
	
public static void main(String args[]){
		
	Screen frame = new Screen();
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Screen() {
	
		super("Address Form");
		
		//Define your layout
		//setLayout(new FlowLayout());
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//change the background color of the frame
		getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);
		

		//Initialization
		lblName = new JLabel("Name");
		lblName.setBounds(20, 20,60, 20);
		lblstreet = new JLabel("Strest");
		lblstreet.setBounds(150,20,80, 20);
		lblCity = new JLabel("City");
		lblCity.setBounds(280, 20, 60, 20);
		lblState = new JLabel("State");
		lblState.setBounds(50, 80, 60, 20);
		lblZip = new JLabel("Zip");
		lblZip.setBounds(200, 80, 60, 20);
				
		tfName = new JTextField(6);
		tfName.setBounds(20,50, 120, 25);
		tfstreet = new JTextField(6);
		tfstreet.setBounds(150,50, 120, 25);
		tfCity = new JTextField(6);
		tfCity.setBounds(280,50, 120, 25);
		tfState = new JTextField(6);
		tfState.setBounds(50,110, 120, 25);
		tfZip = new JTextField(6);
		tfZip.setBounds(200,110, 120, 25);
		
		btnSubmit    = new JButton("Submit");
		btnSubmit.setBounds(160, 150, 100, 25);
				
		
		//add to the frame
		add(lblName);
		add(tfName);
		add(lblstreet);
		add(tfstreet);
		add(lblCity);
		add(tfCity);
		add(lblState);
		add(tfState);
		add(lblZip);
		add(tfZip);
		add(btnSubmit);
		
		//Event handling for Button
/*		ButtonHandler btnHandler = new ButtonHandler();
		btnAdd.addActionListener(btnHandler);
		btnSubstract.addActionListener(btnHandler);
		//
		btnMultiply .addActionListener(btnHandler);
		btnClear.addActionListener(btnHandler);
		btnExit.addActionListener(btnHandler);*/
	}
	
	//define event handling for button handler
/*	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == btnClear){
				tfAnswer.setText(null);
				tfNumber1.setText(null);
				tfNumber2.setText(null);
			}else if(event.getSource() == btnExit){
				System.exit(0);
			}else
			{
				String s1 = tfNumber1.getText();
				String s2 = tfNumber2.getText();
				
				try  
				  {  
				    n1 = Integer.parseInt(s1);  
				  }  
				  catch(NumberFormatException nfe)  
				  {  
				    n1 = 0;
				    tfNumber1.setText("0");
				  }  
			
				try  
				  {  
				    n2 = Integer.parseInt(s2);  
				  }  
				  catch(NumberFormatException nfe)  
				  {  
				    n2 = 0; 
				    tfNumber2.setText("0");
				  }  
				sum = n1 + n2;
				diff = n1 - n2;
				//
				mul=n1*n2;
				
				if(event.getSource() == btnAdd){
					//JOptionPane.showMessageDialog( null, "Sum = " + sum,
							//"", JOptionPane.PLAIN_MESSAGE );
					
					String answer =  String.format( "%d",sum);
					tfAnswer.setText(answer);
					
				}else if(event.getSource() == btnSubstract){
					//JOptionPane.showMessageDialog( null, "Difference = " + diff,
							//"", JOptionPane.PLAIN_MESSAGE );
					String answer =  String.format( "%d",diff);
					tfAnswer.setText(answer);
					}	
				//
				else if(event.getSource() == btnMultiply){
					//JOptionPane.showMessageDialog( null, "Multiplication = " + mul,
							//"", JOptionPane.PLAIN_MESSAGE );
					String answer =  String.format( "%d",mul);
					tfAnswer.setText(answer);
					}
				}
			}
		}*/
	}

