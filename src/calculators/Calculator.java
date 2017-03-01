package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	private double firstNum = 0.0;
	private double secondNum = 0.0;
	private double result = 0.0;
	private String operator;
	private String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 251, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 219, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/* **************** Row 1 **************** */
		
		JButton btnBackSpace = new JButton("Bckspc");
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
		btnBackSpace.setBounds(10, 75, 105, 50);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(120, 75, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				secondNum = Double.parseDouble(textField.getText());
				switch(operator){
					case("+"): 	result = firstNum + secondNum;
								break;
					case("-"): 	result = firstNum - secondNum;
								break;
					case("*"): 	result = firstNum * secondNum;
								break;
					case("/"): 	result = firstNum / secondNum;
								break;
				}
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(175, 75, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		/* **************** Row 2 **************** */
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 130, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(65, 130, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(120, 130, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(175, 130, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		/* **************** Row 3 **************** */
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 185, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(65, 185, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(120, 185, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(175, 185, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		/* **************** Row 4 **************** */
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(65, 240, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(120, 240, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(175, 240, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		/* **************** Row 4 **************** */
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(10, 295, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(65, 295, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(120, 295, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(175, 295, 50, 50);
		frame.getContentPane().add(btnDiv);
	}
}
