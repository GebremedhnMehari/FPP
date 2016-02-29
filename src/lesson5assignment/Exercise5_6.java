/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson5assignment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Exercise5_6 {

	private JLabel lblInput;
	private JTextField tfInput;
	
	private JLabel lblName;
	private JTextField tfName;
	private JLabel lblId;
	private JTextField tfId;
	private JLabel lblSubject;
	private JLabel lblMark;
	private JLabel lblFpp;
	private JTextField tfFpp;
	private JLabel lblMpp;
	private JTextField tfMpp;
	
	private JLabel lblTMark;
	private JTextField tfTMark;
	private JLabel lblGrade;
	private JTextField tfGrade;
	
	
	
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;
	
	public static void main(String[] args) {
		Exercise5_6 frame = new Exercise5_6();
		
		//frame.setVisible(true);
	}
	
	 public Exercise5_6() {
			
			JFrame frame=new JFrame();
			frame.setTitle("Marksheet");
			frame.setVisible(true);
			
			//Define your layout
			//setLayout(new FlowLayout());
			frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//change the background color of the frame
			//frame.getContentPane().setBackground(Color.blue);
			frame.getContentPane().setLayout(null);
			
			Date d = new Date();
	    
			//Initialization
			lblName = new JLabel("Name ");
			lblName.setBounds(100, 30, 160, 40);
			tfName = new JTextField(8);
			tfName.setBounds(180, 35, 160, 25);	
			
			lblId = new JLabel("ID ");
			lblId.setBounds(100, 60, 160, 40);
			tfId = new JTextField(8);
			tfId.setBounds(180, 65, 160, 25);	
			
			lblSubject = new JLabel("Subject");
			lblSubject.setBounds(100, 100, 160, 40);
			
			lblMark = new JLabel("Mark");
			lblMark.setBounds(220, 100, 160, 40);
			
			lblFpp = new JLabel("FPP");
			lblFpp.setBounds(100, 140, 160, 40);
			
			tfFpp = new JTextField(8);
			tfFpp.setBounds(180, 145, 160, 25);	
			
			lblMpp = new JLabel("MPP");
			lblMpp.setBounds(100, 170, 160, 40);
			tfMpp = new JTextField(8);
			tfMpp.setBounds(180, 175, 160,25);	
			
			
			lblTMark = new JLabel("Total Mark");
			lblTMark.setBounds(100, 200, 160, 40);
			tfTMark = new JTextField(8);
			tfTMark.setBounds(180, 205, 160, 25);	
			
			
			lblGrade = new JLabel("Grade ");
			lblGrade.setBounds(100, 230, 160, 40);
			tfGrade = new JTextField(8);
			tfGrade.setBounds(180, 235, 160, 25);	
			
			
			
						
			//add to the frame
			frame.add(lblName);
			frame.add(tfName);
			frame.add(lblId);
			frame.add(tfId);
			frame.add(lblSubject);
			
			frame.add(lblMark);
			frame.add(lblFpp);
			frame.add(lblMpp);
			frame.add(lblTMark);
			frame.add(lblGrade);
			
			//frame.add(tfMark);
			frame.add(tfFpp);
			frame.add(tfMpp);
			frame.add(tfTMark);
			frame.add(tfGrade);
			
			//frame.add(btnNPR);
			/**/	
			//Event handling for Submit Button	
			/*	ButtonHandler btnHandler = new ButtonHandler();
			btnUs.addActionListener(btnHandler);
			btnEuro.addActionListener(btnHandler);
			btnRupee.addActionListener(btnHandler);
			btnPound.addActionListener(btnHandler);
			btnRupia.addActionListener(btnHandler);
			btnNPR.addActionListener(btnHandler);	
			*/	
			
			tfFpp.getDocument().addDocumentListener(new DocumentListener() {
				  public void changedUpdate(DocumentEvent e) {
					  generate();
				  }
				  public void removeUpdate(DocumentEvent e) {
					  generate();
				  }
				  public void insertUpdate(DocumentEvent e) {
					  generate();
				  }
			
	 });
			
			tfMpp.getDocument().addDocumentListener(new DocumentListener() {
				  public void changedUpdate(DocumentEvent e) {
					  generate();
				  }
				  public void removeUpdate(DocumentEvent e) {
					  generate();
				  }
				  public void insertUpdate(DocumentEvent e) {
					  generate();
				  }
			
	 });
	 }    
	 public void generate() {
		 double fpp=0.;
		 double mpp=0;
		 if(tfFpp.getText().isEmpty()) 
			 fpp=0.0;
		 else
			 fpp=Double.parseDouble(tfFpp.getText());
		 if( tfMpp.getText().isEmpty())
		     mpp=0.0;
		 else
		   mpp=Double.parseDouble(tfMpp.getText());
		
		 
	     if (fpp<0 || fpp>100 || mpp<0 || mpp>100){
	       JOptionPane.showMessageDialog(null,
	          "Error: Please enter correct number between 0 and 100", "Error Massage",
	          JOptionPane.ERROR_MESSAGE);
	     }
	     else{
	    	 // if(fpp>=0 && fpp<=100)
	    	 double tmark=fpp+mpp;
	      tfTMark.setText(String.valueOf(tmark));
	      
	      if(tmark/2.0>=93)
	    	  tfGrade.setText("A");
	      else if(tmark/2.0>=90)
	    	  tfGrade.setText("A-");
	      else if(tmark/2.0>=87)
	    	  tfGrade.setText("B+");
	      else if(tmark/2.0>=83)
	    	  tfGrade.setText("B");
	      else if(tmark/2.0>=80)
	    	  tfGrade.setText("B-");
	      else if(tmark/2.0>=77)
	    	  tfGrade.setText("C+");
	      else if(tmark/2.0>=73)
	    	  tfGrade.setText("C");
	      else if(tmark/2.0>=70)
	    	  tfGrade.setText("C-");
	      else if(tmark/2.0>=0)
	    	  tfGrade.setText("NC");
	      
	     }
	  
	 }
	
}
