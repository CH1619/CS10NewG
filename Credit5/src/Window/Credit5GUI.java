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

public class Credit5GUI {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;
	private JTextField textField_2;

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
		panel.setBounds(10, 22, 555, 242);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dis = new JLabel(" ");
		dis.setBounds(10, 160, 496, 56);
		panel.add(dis);
		
		JLabel fn = new JLabel("First Name");
		fn.setBounds(10, 11, 87, 30);
		panel.add(fn);
		
		Fn = new JTextField();
		Fn.setBounds(93, 16, 103, 20);
		panel.add(Fn);
		Fn.setColumns(10);
		
		JLabel ln = new JLabel("Last Name");
		ln.setBounds(10, 52, 87, 30);
		panel.add(ln);
		
		Ln = new JTextField();
		Ln.setColumns(10);
		Ln.setBounds(93, 57, 103, 20);
		panel.add(Ln);
		
		JLabel ag = new JLabel("Age");
		ag.setBounds(10, 93, 56, 30);
		panel.add(ag);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(93, 98, 103, 20);
		panel.add(textField_2);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			String Fnn = Fn.getText();
			String Lnn = Ln.getText();
			
			dis.setText("First Name is: " + Fnn + " Last name is: " + Lnn);
			
			}
		});
		sb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sb.setBounds(208, 12, 110, 44);
		panel.add(sb);
		
		JButton cl = new JButton("Clear");
		cl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cl.setBounds(208, 73, 110, 44);
		panel.add(cl);
		
		
	}
}
