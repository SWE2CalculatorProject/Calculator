package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		frame.setBounds(100, 100, 329, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		textField = new JTextField();
		textField.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		
		/* **************** Row 1 **************** */
		
		JButton btnBackSpace = new JButton("<-");
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
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				secondNum = Double.parseDouble(textField.getText());
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
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 2 **************** */
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 3 **************** */
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 4 **************** */
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		/* **************** Row 4 **************** */
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnMod = new JButton("Mod");
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		
		JButton button = new JButton("^");
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "^";
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnBackSpace, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
							.addGap(6)
							.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(6)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn7, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn8, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn9, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(24)
							.addComponent(btnPlus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(btnMinus, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn4, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn5, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn6, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(24)
							.addComponent(btnMultiply, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(btnDiv, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(24)
							.addComponent(btnPM, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnDot, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btn0, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(btnEqual, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(24)
							.addComponent(btnMod, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
					.addGap(13))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnBackSpace, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(2))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(2))
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn8, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn9, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnPlus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnMinus, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn4, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn5, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn6, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnMultiply, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnDiv, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnPM, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDot, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btn0, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnEqual, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
						.addComponent(btnMod, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(9))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}