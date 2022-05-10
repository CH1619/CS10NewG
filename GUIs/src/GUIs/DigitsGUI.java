package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitsGUI {

	private JFrame frame;
	private JTextField dig;
	
	ImageIcon img4 = new ImageIcon("C:\\Users\\16192005\\git\\CS10NewG\\GUIs\\src\\Pics\\img4.png");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitsGUI window = new DigitsGUI();
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
	public DigitsGUI() {
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
		
		JLabel titl = new JLabel("Digits Application");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titl.setBounds(82, 11, 134, 32);
		panel.add(titl);
		
		JLabel Dig = new JLabel("Enter a three digit number:");
		Dig.setBounds(10, 54, 190, 14);
		panel.add(Dig);
		
		dig = new JTextField();
		dig.setBounds(171, 54, 86, 20);
		panel.add(dig);
		dig.setColumns(10);
		
		JLabel pic = new JLabel("");
		pic.setBounds(267, 11, 157, 119);
		panel.add(pic);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 141, 403, 50);
		panel.add(dis);
		
		JButton btnNewButton = new JButton("Sumbit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			
				String threedig = dig.getText();
					
				int number = Integer.parseInt(threedig);
			
				int hundreds = number/100;
		
				int tens = (number%100)/10;
			
				int ones = ((number%100)%10)/1;
			
				dis.setText("The hundreds digit: " + hundreds + " The tens digits: " + tens + " The ones digit: " + ones);
			
				pic.setIcon(img4);
			}
		});
		btnNewButton.setBounds(10, 84, 105, 50);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			dig.setText("");
			dis.setText("");
			}
		});
		btnClear.setBounds(125, 84, 105, 50);
		panel.add(btnClear);
		
		
	}

}
