package Window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Credit5GUI {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit5GUI window = new Credit5GUI();
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
	public Credit5GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 22, 555, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox g2 = new JComboBox();
		g2.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		g2.setBounds(93, 93, 145, 22);
		panel.add(g2);
		
		JLabel dis = new JLabel(" ");
		dis.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		dis.setBounds(10, 212, 496, 56);
		panel.add(dis);
		
		JLabel fn = new JLabel("First Name");
		fn.setBounds(10, 11, 87, 30);
		panel.add(fn);
		
		Fn = new JTextField();
		Fn.setBounds(93, 16, 145, 20);
		panel.add(Fn);
		Fn.setColumns(10);
		
		JLabel ln = new JLabel("Last Name");
		ln.setBounds(10, 52, 87, 30);
		panel.add(ln);
		
		Ln = new JTextField();
		Ln.setColumns(10);
		Ln.setBounds(93, 57, 145, 20);
		panel.add(Ln);
		
		JLabel ag = new JLabel("Grade");
		ag.setBounds(10, 93, 56, 30);
		panel.add(ag);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			String Fnn = Fn.getText();
			String Lnn = Ln.getText();
			int grade;
			if(g2.getSelectedItem().equals("10"))
			{
			grade = 10;
			}
			else if(g2.getSelectedItem().equals("11"))
			{
			grade = 11;
			}
			else
			{
			grade = 12;
			}
			dis.setText("First Name is: " + Fnn + " Last name is: " + Lnn + " Grade is: " + grade );
			
			}
		});
		sb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sb.setBounds(248, 11, 116, 56);
		panel.add(sb);
		
		JButton cl = new JButton("Clear");
		cl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Fn.setText(" ");
				Ln.setText(" ");
				
			}
		});
		cl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cl.setBounds(248, 78, 116, 50);
		panel.add(cl);
		
		
		
		
	}
}
