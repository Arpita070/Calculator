package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {
	String display="";
	String value="";
	ArrayList<Double> val = new ArrayList<>();
	ArrayList<Character> op = new ArrayList<>();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(10, 11, 264, 27);
		contentPane.add(lblNewLabel);
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"9";
				value = value+"9";
				lblNewLabel.setText(display);
				
			}
		});
		num9.setBounds(10, 49, 51, 44);
		contentPane.add(num9);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"8";
				value = value+"8";
				lblNewLabel.setText(display);
			}
		});
		num8.setBounds(65, 49, 51, 44);
		contentPane.add(num8);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"4";
				value = value+"4";
				lblNewLabel.setText(display);
			}
		});
		num4.setBounds(10, 93, 51, 44);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"5";
				value = value+"5";
				lblNewLabel.setText(display);
			}
		});
		num5.setBounds(65, 93, 51, 44);
		contentPane.add(num5);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"7";
				value = value+"7";
				lblNewLabel.setText(display);
			}
		});
		num7.setBounds(118, 49, 51, 44);
		contentPane.add(num7);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"6";
				value = value+"6";
				lblNewLabel.setText(display);
			}
		
		});
		num6.setBounds(118, 93, 51, 44);
		contentPane.add(num6);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"1";
				value = value+"1";
				lblNewLabel.setText(display);
			}
		});
		num1.setBounds(10, 138, 51, 44);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"2";
				value = value+"2";
				lblNewLabel.setText(display);
			}
		});
		num2.setBounds(65, 138, 51, 44);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"3";
				value = value+"3";
				lblNewLabel.setText(display);
			}
		});
		num3.setBounds(118, 138, 51, 44);
		contentPane.add(num3);
		
		JButton point = new JButton(".");
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+".";
				value = value+".";
				lblNewLabel.setText(display);
			}
		});
		point.setBounds(10, 183, 51, 44);
		contentPane.add(point);
		
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"0";
				value = value+"0";
				lblNewLabel.setText(display);
			}
		});
		num0.setBounds(65, 183, 51, 44);
		contentPane.add(num0);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val.clear();
				op.clear();
				value="";
				display="";
				lblNewLabel.setText(display);
			}
		});
		clear.setBounds(118, 183, 51, 44);
		contentPane.add(clear);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"/";
				val.add(Double.valueOf(value));
				value="";
				lblNewLabel.setText(display);
				op.add('/');
			}
		});
		divide.setBounds(223, 49, 51, 44);
		contentPane.add(divide);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"*";
				val.add(Double.valueOf(value));
				value="";
				lblNewLabel.setText(display);
				op.add('*');
			}
		});
		multiply.setBounds(223, 93, 51, 44);
		contentPane.add(multiply);
		
		JButton subtraction = new JButton("-");
		subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"-";
				val.add(Double.valueOf(value));
				value="";
				lblNewLabel.setText(display);
				op.add('-');
			}
		});
		subtraction.setBounds(223, 138, 51, 44);
		contentPane.add(subtraction);
		
		JButton addition = new JButton("+");
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"+";
				val.add(Double.valueOf(value));
				value="";
				lblNewLabel.setText(display);
				op.add('+');
				
			}
		});
		addition.setBounds(223, 183, 51, 44);
		contentPane.add(addition);
		
		
		
		JButton squareroot = new JButton("SQRT");
		squareroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(val.isEmpty()&&op.isEmpty()) {
					display= String.valueOf(Math.sqrt(Double.valueOf(value)));
					lblNewLabel.setText(display);
				}
				else {
					lblNewLabel.setText("Invalid Operation");
				}
			}
		});
		squareroot.setBounds(172, 49, 51, 44);
		contentPane.add(squareroot);
		
		JButton square = new JButton("SQR");
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(val.isEmpty()&&op.isEmpty()) {
					display= String.valueOf(Math.pow(Double.valueOf(value),2));
					lblNewLabel.setText(display);
				}
				else {
					lblNewLabel.setText("Invalid Operation");
				}
			}
		});
		square.setBounds(172, 93, 51, 44);
		contentPane.add(square);
		
		JButton percentage = new JButton("%");
		percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = display+"%";
				val.add(Double.valueOf(value));
				value="";
				lblNewLabel.setText(display);
				op.add('%');
				
			}
		});
		percentage.setBounds(172, 138, 51, 44);
		contentPane.add(percentage);
		
		JButton delete = new JButton("DEL");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display =display.substring(0,display.length()-1);
				value = value.substring(0,value.length()-1);
				lblNewLabel.setText(display);
			}
		});
		delete.setBounds(172, 183, 51, 44);
		contentPane.add(delete);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(value!="") {
					val.add(Double.valueOf(value));
				}
				
				value="";
				result(lblNewLabel);
			}
		});
		equal.setBounds(75, 234, 129, 36);
		contentPane.add(equal);
		
	
	}
	private void result(JLabel panel) {
		double result = val.get(0);
		for(int i =0;i<op.size();i++) {
			switch(op.get(i)) {
			case '+':
				result = result+val.get(i+1);
				break;
			case '-':
				result = result-val.get(i+1);
				break;
			case '*':
				result = result*val.get(i+1);
				break;
			case '/':
				result = result/val.get(i+1);
				break;
			case '%':
				if(val.size()>1){
					result = ((double)(result/100))*val.get(i+1);
				}
				else if(val.size()==1) {
					result=((double)(result/100));
				}
				
				break;
			default:
				break;
			}
		}
		val.clear();
		op.clear();
		display=String.valueOf(result);
		value = String.valueOf(result);
		panel.setText(display);
	}
		
	
}