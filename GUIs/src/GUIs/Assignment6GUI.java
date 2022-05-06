package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Assignment6GUI {

	private JFrame frame;
	private JTextField Fnn;
	private JTextField Lnn;
	private JTextField Grr;
	private JTextField Schoo;
	private JTextField Hobb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment6GUI window = new Assignment6GUI();
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
	public Assignment6GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Fn = new JLabel("First Name:");
		Fn.setBounds(10, 5, 112, 34);
		panel.add(Fn);
		
		JLabel Scho = new JLabel("School:");
		Scho.setBounds(237, 5, 112, 34);
		panel.add(Scho);
		
		JLabel Hob = new JLabel("Favourite Hobby:");
		Hob.setBounds(237, 50, 146, 34);
		panel.add(Hob);
		
		JLabel Gr = new JLabel("Grade:");
		Gr.setBounds(10, 95, 112, 34);
		panel.add(Gr);
		
		JLabel Ln = new JLabel("Last Name:");
		Ln.setBounds(10, 50, 112, 34);
		panel.add(Ln);
		
		Fnn = new JTextField();
		Fnn.setBounds(92, 12, 135, 20);
		panel.add(Fnn);
		Fnn.setColumns(10);
		
		Lnn = new JTextField();
		Lnn.setColumns(10);
		Lnn.setBounds(92, 57, 135, 20);
		panel.add(Lnn);
		
		Grr = new JTextField();
		Grr.setColumns(10);
		Grr.setBounds(92, 102, 135, 20);
		panel.add(Grr);
		
		Schoo = new JTextField();
		Schoo.setColumns(10);
		Schoo.setBounds(338, 12, 135, 20);
		panel.add(Schoo);
		
		Hobb = new JTextField();
		Hobb.setColumns(10);
		Hobb.setBounds(338, 57, 135, 20);
		panel.add(Hobb);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 140, 692, 97);
		panel.add(dis);
		
		JButton Sub = new JButton("Submit");
		Sub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String fn = Fnn.getText();
				
				String ln = Lnn.getText();
				
				String gr = Grr.getText();
				
				String scho = Schoo.getText();
				
				String hob2 = Hobb.getText();
				
				dis.setText("Hello, your name is " + fn + " " + ln + ". You are currently in Grade " + gr + " at " + scho + ". Your Favourite hobby is " + hob2);
			}
		});
		Sub.setBounds(237, 101, 112, 23);
		panel.add(Sub);
		
		JButton Clr = new JButton("Clear");
		Clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			dis.setText("");
			}
		});
		Clr.setBounds(357, 101, 116, 23);
		panel.add(Clr);
		
		JLabel titl = new JLabel("Assignment 6");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titl.setBounds(483, -9, 178, 55);
		panel.add(titl);
		
		JLabel dis2 = new JLabel("");
		dis2.setBounds(483, 50, 219, 79);
		panel.add(dis2);
	}
}
