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

public class GradeGUI {

	private JFrame frame;
	private JTextField Grr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeGUI window = new GradeGUI();
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
	public GradeGUI() {
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
		

		JLabel dis = new JLabel("");
		dis.setBounds(22, 120, 356, 50);
		panel.add(dis);
		
		JLabel titl = new JLabel("Grade Application");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titl.setBounds(135, 11, 160, 20);
		panel.add(titl);
		
		JLabel Gr = new JLabel("Please enter your grade percentage:");
		Gr.setBounds(22, 45, 186, 14);
		panel.add(Gr);
		
		Grr = new JTextField();
		Grr.setBounds(209, 42, 86, 20);
		panel.add(Grr);
		Grr.setColumns(10);
		
		JButton sub = new JButton("Submit");
		sub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade = Grr.getText();
			
					
				
					if  (grade > 89)
					{
					dis.setText("The cor");	
					}
					else if (grade > 79) && grade < 90)//create if statement
					{
						
					}
					else if (grade > 74 && grade < 80)//create else if statement
					{
						
				
					}
					else if (grade > 69 && grade < 75)//create else if statement
					{
						
					}
					else if (grade > 64 && grade < 70)//create else if statement
					{
						
				
					}
					else if (grade > 59 && grade < 65)//create else if statement
					{
						
					}
					else if (grade > 54 && grade < 60)//create else if statement
					{
						
					}
					else if (grade > 49 && grade < 55)//create else if statement
					{
						
					}
					else  
					{
					
					}
			}
			
			});
		
		sub.setBounds(22, 70, 89, 39);
		panel.add(sub);
		
		JButton clr = new JButton("Clear");
		clr.setBounds(129, 70, 89, 39);
		panel.add(clr);
		
		
	}
}
