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


public class Adress_Form extends JFrame{
	
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
		
	Adress_Form frame = new Adress_Form();
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Adress_Form() {
	
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
		ButtonHandler btnHandler = new ButtonHandler();
		btnSubmit.addActionListener(btnHandler);
	}
	
	//define event handling for button handler
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			 if(event.getSource() == btnSubmit){
				 //System.out.println(tfName.getText().toString());
				 System.out.println(tfName.getText());
				 System.out.println(tfstreet.getText());
				 System.out.print(tfCity.getText()+","+ tfState.getText()+" "+tfZip.getText());
				 /*System.out.println(tfState.getText());
				 System.out.println(tfZip.getText());*/
				 
					
					}
				}
			}
		
	}

