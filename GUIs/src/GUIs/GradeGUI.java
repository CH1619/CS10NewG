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

public class GradeGUI {

	private JFrame frame;
	private JTextField Grr;
	
	ImageIcon img5 = new ImageIcon("C:\\Users\\16192005\\git\\CS10NewG\\GUIs\\src\\Pics\\img5.jpg");
	
	ImageIcon img6 = new ImageIcon("C:\\Users\\16192005\\git\\CS10NewG\\GUIs\\src\\Pics\\img6.jpg");
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
		frame.setBounds(100, 100, 493, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		

		JLabel dis = new JLabel("");
		dis.setBounds(22, 120, 253, 39);
		panel.add(dis);
		
		JLabel pic = new JLabel("");
		pic.setBounds(222, 113, 245, 163);
		panel.add(pic);
		
		JLabel titl = new JLabel("Grade Application");
		titl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titl.setBounds(135, 11, 160, 20);
		panel.add(titl);
		
		JLabel Gr = new JLabel("Please enter your grade percentage:");
		Gr.setBounds(22, 45, 253, 14);
		panel.add(Gr);
		
		Grr = new JTextField();
		Grr.setBounds(244, 42, 83, 20);
		panel.add(Grr);
		Grr.setColumns(10);
		
		JButton sub = new JButton("Submit");
		sub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade = Grr.getText();
			
				int Gradep = Integer.parseInt(grade);//get the integer part	
				
					if  (Gradep > 89)
					{
						dis.setText("The corresonding letter grade is A+");
						pic.setIcon(img5);
					}
					else if (Gradep > 79 && Gradep < 90)
					{
						dis.setText("The corresonding letter grade is A");	
						pic.setIcon(img5);
					}
					else if (Gradep > 74 && Gradep < 80)
					{
						dis.setText("The corresonding letter grade is B+");
						pic.setIcon(img5);
					}
					else if (Gradep > 69 && Gradep < 75)
					{
						dis.setText("The corresonding letter grade is B");
						pic.setIcon(img5);
					}
					else if (Gradep > 64 && Gradep < 70)
					{
						dis.setText("The corresonding letter grade is C+");
						pic.setIcon(img5);
				
					}
					else if (Gradep > 59 && Gradep < 65)
					{
						dis.setText("The corresonding letter grade is C");
						pic.setIcon(img5);
					}
					else if (Gradep > 54 && Gradep < 60)
					{
						dis.setText("The corresonding letter grade is D+");	
						pic.setIcon(img5);
					}
					else if (Gradep > 49 && Gradep < 55)
					{
						dis.setText("The corresonding letter grade is D");
						pic.setIcon(img5);
						
					}
					else  
					{
						dis.setText("The corresonding letter grade is F");
						pic.setIcon(img6);
					}
			}
			
			});
		
		sub.setBounds(62, 70, 115, 39);
		panel.add(sub);
		
		JButton clr = new JButton("Clear");
		clr.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dis.setText("");
				Grr.setText("");
			}
		});
		clr.setBounds(212, 70, 115, 39);
		panel.add(clr);
		
		
		
	}
}
