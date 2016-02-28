package demo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class HelloWorld extends JFrame{

	String s = "Hello";
	int a =  s.charAt(1);
	
	//Defining JLabel
	private JLabel lblMyText;
	
	//Defining JTextField
	private JTextField tfMyText;
	
	//Defining JButton
	private JButton btnMyButton;
	
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 300;
	
public static void main(String args[]){
		
	   HelloWorld frame = new HelloWorld();
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public HelloWorld() {
	
		super("Hello world");
		
		//Define your layout
		//setLayout(new FlowLayout());
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//change the background color of the frame
		getContentPane().setBackground(Color.lightGray);
		getContentPane().setLayout(null);
		

		//Initialization
		lblMyText = new JLabel("MyTex");
		lblMyText.setBounds(20, 20, 100, 20);
		
				
		tfMyText = new JTextField(6);
		tfMyText.setBounds(110, 15, 100, 25);
		
		btnMyButton   = new JButton("My Button");
		btnMyButton.setBounds(50, 110, 100, 25);
		
		//add to the frame
		add(lblMyText);
		add(tfMyText);
		add(btnMyButton);
		
		//Event handling for Button
		ButtonHandler btnHandler = new ButtonHandler();
		btnMyButton.addActionListener(btnHandler);
	}
	
	//define event handling for button handler
	private class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
				
				if(event.getSource() == btnMyButton){
					
				//	String answer =  String.format( "%d",lblMyText);
					tfMyText.setText(lblMyText.getText().toString());
					
			}
		}
	}
}

