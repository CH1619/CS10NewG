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

public class GuessGameGUI {

	private JFrame frame;
	private JTextField guess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessGameGUI window = new GuessGameGUI();
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
	public GuessGameGUI() {
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
		
		JLabel titl = new JLabel("Guessing Game");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titl.setBounds(144, 11, 120, 20);
		panel.add(titl);
		
		JLabel subt = new JLabel("Take a shot! Can you guess right?");
		subt.setBounds(119, 34, 200, 14);
		panel.add(subt);
		
		JLabel Gu = new JLabel("Enter a number from 1 to 20:");
		Gu.setBounds(49, 62, 188, 14);
		panel.add(Gu);
		
		guess = new JTextField();
		guess.setBounds(214, 59, 86, 20);
		panel.add(guess);
		guess.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(49, 97, 270, 39);
		panel.add(dis);
		
		JLabel dis2 = new JLabel("");
		dis2.setBounds(49, 147, 251, 39);
		panel.add(dis2);
		
		JButton sub = new JButton("Submit");
		sub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String Pnum = guess.getText();
			
				int numG = Integer.parseInt(Pnum);
			
				int randomnum = 1 + (int) (Math.random() * 20);
			
				dis.setText("Your number is: " + numG + " Computer's number is: " + randomnum);
			
			
				if(numG == randomnum)
				{
					dis2.setText("Congrats! You were correct!");	
				}
				else
				{
					dis2.setText("Better luck next time.");	
				}
			
			}
		});
		sub.setBounds(329, 30, 89, 35);
		panel.add(sub);
		
		JButton clr = new JButton("Clear");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			dis.setText("");	
			guess.setText("");
			dis2.setText("");	
			}
		});
		clr.setBounds(329, 76, 89, 35);
		panel.add(clr);
		
		
	}
}
