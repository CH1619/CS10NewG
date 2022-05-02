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

public class ChangeGUI {

	private JFrame frame;
	private JTextField Chh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeGUI window = new ChangeGUI();
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
	public ChangeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titl = new JLabel("Change Application");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titl.setBounds(10, 11, 145, 42);
		panel.add(titl);
		
		JLabel Ch = new JLabel("Change in cents:");
		Ch.setBounds(10, 62, 105, 14);
		panel.add(Ch);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 111, 375, 42);
		panel.add(dis);
		
		Chh = new JTextField();
		Chh.setBounds(125, 59, 97, 20);
		panel.add(Chh);
		Chh.setColumns(10);
		
		JButton sub = new JButton("Submit");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String chg = Chh.getText();
		
			int change = Integer.parseInt(chg);
			
			int quarters = change / 25;
			
			int dimes = (change % 25)/10;
		
			int nickels = ((change % 25)%10)/5;
	
			dis.setText("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels);
			
			}
		});
		sub.setBounds(258, 23, 89, 23);
		panel.add(sub);
		
		JButton clr = new JButton("Clear");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			Chh.setText("");
			dis.setText("");
			}
		});
		clr.setBounds(258, 58, 89, 23);
		panel.add(clr);
		
		
	}

}
