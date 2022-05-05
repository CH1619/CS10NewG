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

public class PrintingGUI {

	private JFrame frame;
	private JTextField cops;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintingGUI window = new PrintingGUI();
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
	public PrintingGUI() {
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
		
		JLabel titl = new JLabel("Printing Application");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titl.setBounds(139, 11, 174, 20);
		panel.add(titl);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 119, 371, 25);
		panel.add(dis);
		
		JLabel cop = new JLabel("Enter the the number of copies: ");
		cop.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cop.setBounds(10, 54, 206, 14);
		panel.add(cop);
		
		cops = new JTextField();
		cops.setBounds(240, 52, 93, 20);
		panel.add(cops);
		cops.setColumns(10);
		
		JButton sub = new JButton("Submit ");
		sub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String cop = cops.getText();
				
				int copies = Integer.parseInt(cop);
				
				double price = 0;
				
				if (copies < 100)
				{
					price = 0.30;
			
				}
				else if (copies > 99 && copies < 500)
				{
					price = 0.28;	
			
				}
				else if (copies > 499 && copies < 750)
				{
					price = 0.27;	
			
				}
				else if (copies > 749 && copies < 1000)
				{
					price = 0.26;
			
				}
				else 
				{
					price = 0.25;
			
				}
		
				double cost = copies*price;
			
				dis.setText("The Price per copy is: $" + price + "0, The cost is: $" + cost + "0");
			
			
			}	
		});
		sub.setBounds(240, 79, 98, 35);
		panel.add(sub);
		
		JButton clr = new JButton("Clear");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dis.setText("");
				cops.setText("");
			}
		});
		clr.setBounds(331, 215, 93, 35);
		panel.add(clr);
		
		
	}
}
