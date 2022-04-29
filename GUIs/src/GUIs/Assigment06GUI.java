package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assigment06GUI {

	private JFrame frame;
	private JTextField Fnn;
	private JTextField Lnn;
	private JTextField Grr;
	private JTextField Scho;
	private JTextField Hob2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assigment06GUI window = new Assigment06GUI();
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
	public Assigment06GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Ttl = new JLabel("Assingment 6");
		Ttl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Ttl.setBounds(193, 11, 142, 45);
		panel.add(Ttl);
		
		JLabel Fn = new JLabel("First Name");
		Fn.setBounds(27, 60, 89, 14);
		panel.add(Fn);
		
		JLabel Sch = new JLabel("School");
		Sch.setBounds(291, 60, 89, 14);
		panel.add(Sch);
		
		JLabel Ln = new JLabel("Last Name");
		Ln.setBounds(27, 107, 89, 14);
		panel.add(Ln);
		
		JLabel Hob = new JLabel("Favourite Hobby");
		Hob.setBounds(291, 107, 89, 14);
		panel.add(Hob);
		
		JLabel Gr = new JLabel("Grade");
		Gr.setBounds(27, 156, 89, 14);
		panel.add(Gr);
		
		Fnn = new JTextField();
		Fnn.setBounds(96, 57, 86, 20);
		panel.add(Fnn);
		Fnn.setColumns(10);
		
		Lnn = new JTextField();
		Lnn.setColumns(10);
		Lnn.setBounds(96, 104, 86, 20);
		panel.add(Lnn);
		
		Grr = new JTextField();
		Grr.setColumns(10);
		Grr.setBounds(96, 153, 86, 20);
		panel.add(Grr);
		
		Scho = new JTextField();
		Scho.setColumns(10);
		Scho.setBounds(387, 57, 86, 20);
		panel.add(Scho);
		
		Hob2 = new JTextField();
		Hob2.setColumns(10);
		Hob2.setBounds(387, 104, 86, 20);
		panel.add(Hob2);
		
		JButton Sub = new JButton("Submit");
		Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String Fnn = Fn.getText();
			
			String Lnn = Ln.getText();
			
			String Grr = Gr.getText();
			
			int Grade = Integer.parseInt(Grr);
			
			String Scho = Sch.getText();
			
			String Hob2 = Hob.getText();
			}
			
		});
		Sub.setBounds(291, 152, 89, 23);
		panel.add(Sub);
		
		JButton Clr = new JButton("Clear");
		Clr.setBounds(390, 152, 89, 23);
		panel.add(Clr);
	}
}
