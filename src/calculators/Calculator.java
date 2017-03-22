package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private static JLabel textField;
	
	private static double firstNum = 0.0;
	private static double secondNum = 0.0;
	private static double result = 0.0;
	private static String operator = "";
	private static String answer;
	
	public static String FindResult (){
		//secondNum = Double.parseDouble(textField.getText());
		switch(operator){
			case("+"): 	result = Maths.add(firstNum, secondNum);
						break;
			case("-"): 	result = Maths.subtract(firstNum, secondNum);
						break;
			case("*"): 	result = Maths.multiply(firstNum, secondNum);
						break;
			case("/"): 	result = Maths.divide(firstNum, secondNum);
						break;
			case("%"): 	result = Maths.modulus(firstNum, secondNum);
			break;
			case("^"): 	result = Maths.power(firstNum, secondNum);
			break;
		}
		answer = String.format("%.2f", result);
		textField.setText(answer);
		return answer ;
	}
		
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 340, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		textField = new JLabel();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 11, 300, 89);
		textField.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		//textField.setColumns(10);
		
		/* **************** Row 1 **************** */
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setBackground(SystemColor.menu);
		btnBackSpace.setBounds(10, 120, 108, 50);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String backspace = null;
				
				if(textField.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(SystemColor.menu);
		btnClear.setBounds(128, 120, 50, 50);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum=0;
				secondNum=0;
				operator="";
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(SystemColor.menu);
		btnEqual.setBounds(128, 362, 50, 50);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    if (!operator.equals(""))
				secondNum = Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));
				switch(operator){
					case("+"): 	result = Maths.add(firstNum, secondNum);
								break;
					case("-"): 	result = Maths.subtract(firstNum, secondNum);
								break;
					case("*"): 	result = Maths.multiply(firstNum, secondNum);
								break;
					case("/"): 	result = Maths.divide(firstNum, secondNum);
								break;
					case("%"): 	result = Maths.modulus(firstNum, secondNum);
					break;
					case("^"): 	result = Maths.power(firstNum, secondNum);
					break;
					case(""): break ;
				}
				answer = String.format("%.2f", result);
				textField.setText(answer);
				firstNum=0;
				secondNum=0;
				operator="";
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 2 **************** */
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(SystemColor.menu);
		btn7.setBounds(12, 181, 50, 50);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(SystemColor.menu);
		btn8.setBounds(70, 181, 50, 50);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(SystemColor.menu);
		btn9.setBounds(128, 181, 50, 50);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(SystemColor.menu);
		btnPlus.setBounds(202, 241, 50, 50);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if (operator.equals("")){
				
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operator = "+";
					}
				else {
					if (textField.getText().contains("+")){
							secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));
				 	        }

					
					else {
						secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));}
					textField.setText("");
					result=Double.parseDouble(FindResult());

					firstNum=result ;
					operator="+";
					textField.setText(result+operator);
				}
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 3 **************** */
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(SystemColor.menu);
		btn4.setBounds(12, 241, 50, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(SystemColor.menu);
		btn5.setBounds(70, 241, 50, 50);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(SystemColor.menu);
		btn6.setBounds(128, 241, 50, 50);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(SystemColor.menu);
		btnMinus.setBounds(260, 241, 50, 50);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if (operator.equals("")){
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operator = "-";
					}
				else {
					if (textField.getText().contains("-")){
							secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));
				 	        }

					
					else {secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));}
					textField.setText("");
					result=Double.parseDouble(FindResult());

					firstNum=result ;
					operator="-";
					textField.setText(result+operator);
				}
				
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 4 **************** */
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(SystemColor.menu);
		btn1.setBounds(12, 301, 50, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(SystemColor.menu);
		btn2.setBounds(70, 301, 50, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(SystemColor.menu);
		btn3.setBounds(128, 301, 50, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBackground(SystemColor.menu);
		btnMultiply.setBounds(202, 301, 50, 50);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			if (operator.equals("")){
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
				}
			else {
				if (textField.getText().contains("*")){
						secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));
			 	        }

				
				else {
				secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));;}
				textField.setText("");
				result=Double.parseDouble(FindResult());

				firstNum=result ;
				operator="*";
				textField.setText(result+"*");
			}
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 4 **************** */
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(SystemColor.menu);
		btnDot.setBounds(12, 362, 50, 50);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(SystemColor.menu);
		btn0.setBounds(70, 362, 50, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.setBackground(SystemColor.menu);
		btnPM.setBounds(202, 362, 50, 50);
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(SystemColor.menu);
		btnDiv.setBounds(260, 301, 50, 50);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if (operator.equals("")){
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operator = "/";
					}
				else {
					if (textField.getText().contains("/")){
							secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));
				 	        }

					
					else {
					secondNum=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf(operator)+1));}
					textField.setText("");
					result=Double.parseDouble(FindResult());

					firstNum=result ;
					operator="/";
					textField.setText(result+"/");
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button = new JButton("^");
		button.setBackground(SystemColor.menu);
		button.setBounds(260, 362, 50, 50);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "^";
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnBackSpace);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btnPlus);
		frame.getContentPane().add(btnMinus);
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btnMultiply);
		frame.getContentPane().add(btnDiv);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btnPM);
		frame.getContentPane().add(button);
		frame.getContentPane().add(btnDot);
		frame.getContentPane().add(btn0);
		frame.getContentPane().add(btnEqual);
		
		JButton btnNewButton = new JButton("Log");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(202, 181, 50, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("exp");
		button_1.setBackground(SystemColor.menu);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(260, 181, 50, 50);
		frame.getContentPane().add(button_1);
	}
}