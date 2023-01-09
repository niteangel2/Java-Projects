package Electricity;

import java.awt.event.ActionListener;
import java.awt.event.*;

import java.awt.*;  // awt swing framework

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

	public class About extends JFrame implements ActionListener {
		// Manage our output window
		JButton b1;
		JLabel l1;
		Font f, f1, f2;  //instances
		TextArea t1;
		String s;
		
		public About() {
			setLayout(null);
			JButton b1 = new JButton("Exit");
			add(b1);
			b1.setBounds(180, 430, 120, 20);  //rectangular button
			b1.addActionListener(this); // button will handle any events so actionlistener will handle those events
			
			Font f = new Font("RAILWAY", Font.BOLD, 180);//initialising font to be bold and its size
			setFont(f);
			
			s = "                     About Projects                \n"
					+ "\nElectricity Billing System is a software-based application"
					+ " developed in Java programming language.  The project aims at serving"
					+ " the department of electricity by computerizing the billing system"
					+ " It mainly focuses on the calculation of Units consumed during the "
					+ " specified time and the money to be paid to electricity offices"
					+ " accessible, comfortable and effective for consumers.\n\n";
			
			TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);// textarea: it will be vertically scrollable
			t1.setEditable(false);  // we have setEditable so it will not be editable
			t1.setBounds(20, 100, 450, 300);
			
			add(t1);
			
			Font f1 = new Font("RAILWAY", Font.BOLD,16);// setting fonts to our text area
			t1.setFont(f1);
			
			Container contentPane = this.getContentPane(); // getting the content from jpane
			t1 = new TextArea(); // initialising new text area
			
			JLabel l1 = new JLabel("About Project"); // Adding the label and setting font bounds
			add(l1);
			l1.setBounds(170, 10, 180, 80);
			l1.setForeground(Color.red);
			
			Font f2 = new Font("Railway", Font.BOLD, 20);
			l1.setFont(f2);
			
			setBounds(700, 220, 500,550);
			
			setLayout(null);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			dispose(); //on the press of exit button one thing will be closed
		}
		
		public static void main(String[] args) {
			new About().setVisible(isDefaultLookAndFeelDecorated());
		}
}
