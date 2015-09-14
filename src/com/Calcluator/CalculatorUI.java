package com.Calcluator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.UIManager;

public class CalculatorUI {

	private JFrame frmCalculator;
	private JTextField calcDisplay;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnSix;
	private JButton btnFive;
	private JButton btnFour;
	private JButton btnThree;
	private JButton btnTwo;
	private JButton btnOne;
	private JButton btnZero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI window = new CalculatorUI();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(null, e.getKeyCode());
			}
		});
		frmCalculator.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				JOptionPane.showMessageDialog(null, arg0.getKeyCode());
			}
		});
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 306, 435);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		calcDisplay = new JTextField();
		calcDisplay.setForeground(UIManager.getColor("Button.focus"));
		calcDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calcDisplay.setText("0.0");
		calcDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		calcDisplay.setBounds(0, 0, 300, 60);
		frmCalculator.getContentPane().add(calcDisplay);
		calcDisplay.setColumns(10);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDisplay((JButton) arg0.getSource());
			}
		});
		btnSeven.setBounds(10, 102, 58, 44);
		frmCalculator.getContentPane().add(btnSeven);
		
		btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDisplay((JButton) arg0.getSource());
			}
		});
		btnEight.setBounds(123, 102, 58, 44);
		frmCalculator.getContentPane().add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnNine.setBounds(232, 102, 58, 44);
		frmCalculator.getContentPane().add(btnNine);
		
		btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnSix.setBounds(232, 185, 58, 44);
		frmCalculator.getContentPane().add(btnSix);
		
		btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnFive.setBounds(123, 185, 58, 44);
		frmCalculator.getContentPane().add(btnFive);
		
		btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnFour.setBounds(10, 185, 58, 44);
		frmCalculator.getContentPane().add(btnFour);
		
		btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnThree.setBounds(232, 268, 58, 44);
		frmCalculator.getContentPane().add(btnThree);
		
		btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnTwo.setBounds(123, 268, 58, 44);
		frmCalculator.getContentPane().add(btnTwo);
		
		btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnOne.setBounds(10, 268, 58, 44);
		frmCalculator.getContentPane().add(btnOne);
		
		btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay((JButton) e.getSource());
			}
		});
		btnZero.setBounds(123, 352, 58, 44);
		frmCalculator.getContentPane().add(btnZero);
		frmCalculator.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnFive}));
	}
	
	private void setDisplay(JButton btn)
	{
		char btnVal = btn.getText().charAt(0);
		switch(btnVal)
		{
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			if(calcDisplay.getText().equals(0.0))
			{
				calcDisplay.setText("");
			}
			calcDisplay.setText(calcDisplay.getText() + btnVal);
		}
		calcDisplay.grabFocus();
	}
}
