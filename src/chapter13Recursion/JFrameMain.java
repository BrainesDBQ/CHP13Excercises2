/* 
 * Brandon Raines
 * 2018 - Braines@DBQ.edu
 * CHp13Excercises
 * Various Recursion Excercises from the Java Programming book
 * 
 */


package chapter13Recursion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFrameMain extends JFrame {
	int level = 8;
	private JPanel contentPane;
	private JTextField textFieldInput;
	private JTextField textFieldEx1;
	private JTextField textFieldVowels;
	private JTextField textFieldpal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setTitle("Recursion Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldInput = new JTextField();
		textFieldInput.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInput.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldInput.setBounds(23, 11, 198, 56);
		contentPane.add(textFieldInput);
		textFieldInput.setColumns(10);

		
		Label labelAnswer = new Label("See answer here");
		labelAnswer.setBackground(Color.LIGHT_GRAY);
		labelAnswer.setFont(new Font("Dialog", Font.PLAIN, 26));
		labelAnswer.setAlignment(Label.CENTER);
		labelAnswer.setBounds(445, 11, 444, 56);
		contentPane.add(labelAnswer);
		
		
		JButton btnFactorial = new JButton("factorial");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//  Button clicked - calculate Factorial!
				
				// calculate value, then show int the Label
				double n = Double.parseDouble(textFieldInput.getText());
				double answer = Recursion.factorial(n);
				
				// show the answer
				labelAnswer.setText("" + answer);
			}
		});
		

		btnFactorial.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnFactorial.setBounds(245, 11, 176, 56);
		contentPane.add(btnFactorial);
		
		textFieldEx1 = new JTextField();
		textFieldEx1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEx1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldEx1.setColumns(10);
		textFieldEx1.setBounds(23, 101, 198, 56);
		contentPane.add(textFieldEx1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(445, 101, 444, 230);
		contentPane.add(scrollPane);
		
		JTextArea txtAnswer13_1 = new JTextArea();
		txtAnswer13_1.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtAnswer13_1.setText("Answer13_1");
		scrollPane.setViewportView(txtAnswer13_1);
		
		JButton button = new JButton("13-1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// generate a string of stars and new lines
				// append this string to txtAnswer13_1
				// read the size value from txtFieldEx1
				int nStars = Integer.parseInt(textFieldEx1.getText());
				String sPattern = Recursion.strWedge(nStars);
				txtAnswer13_1.append("\n\n" + sPattern);
			}
		});
		
		//me Vowels checks each letter and counts the vowels
		button.setFont(new Font("Tahoma", Font.PLAIN, 26));
		button.setBounds(245, 101, 176, 56);
		contentPane.add(button);
		
		JButton btnVowels = new JButton("Vowels");
		btnVowels.setFont(new Font("Tahoma", Font.PLAIN, 26));
		//Button being used
		
		btnVowels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String strVowel = textFieldVowels.getText();
				strVowel.toLowerCase();
				int VowelCount = Vowels.count_Vowels(strVowel);			
				textFieldVowels.setText("\n\n" + VowelCount);
				
				
			}
		});
		btnVowels.setBounds(245, 174, 176, 48);
		contentPane.add(btnVowels);
		
		textFieldVowels = new JTextField();
		textFieldVowels.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldVowels.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldVowels.setColumns(10);
		textFieldVowels.setBounds(23, 171, 198, 56);
		contentPane.add(textFieldVowels);
		
		textFieldpal = new JTextField();
		textFieldpal.setText("FirstWord");
		textFieldpal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldpal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldpal.setColumns(10);
		textFieldpal.setBounds(23, 238, 198, 56);
		contentPane.add(textFieldpal);
		
		JButton btnPal = new JButton("Palindrome");
		btnPal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String Pal = textFieldpal.getText();
				int lengthPal  = Pal.length();
			    int iPal;
			    int beginPal; 
			    int endPal; 
			    int middlePal;
			 
			    beginPal  = 0;
			    endPal    = lengthPal - 1;
			    middlePal = (beginPal + endPal)/2;
			 
			    for (iPal = beginPal; iPal <= middlePal; iPal++) {
			      if (Pal.charAt(beginPal) == Pal.charAt(endPal)) {
			        beginPal++;
			        endPal--;
			      }
			      else {
			        break;
			      }
			    }
			    if (iPal == middlePal + 1) {
			    	textFieldpal.setText("Palindrome");
			    }
			    else {
			    	textFieldpal.setText("Not");
			      
			    }
			   
			    
			    
			    /*	 String revPal = textFieldpal2.getText();
				 String orgPal = textFieldpal.getText();
				 int Pallength = orgPal.length();
				  
				 for ( int i = Pallength - 1; i >= 0; i-- )
				         revPal = revPal + orgPal.charAt(i);
				 
				      if (orgPal.equals(revPal))
				    	  textFieldpal.setText("True");
				      else
				    	  textFieldpal.setText("False");
				    	  Original Test code
				    	  */ 
			      
			      
				      
					
				 
			      
			}
		});
		btnPal.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnPal.setBounds(245, 246, 176, 48);
		contentPane.add(btnPal);
	}
}
