package Special2Dig;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigGUI {

	private JFrame frame;
	private JTextField td;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigGUI window = new DigGUI();
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
	public DigGUI() {
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
		dis.setBounds(30, 160, 330, 68);
		panel.add(dis);
		
		JLabel lblNewLabel = new JLabel("Enter two digit number:");
		lblNewLabel.setBounds(30, 36, 129, 38);
		panel.add(lblNewLabel);
		
		td = new JTextField();
		td.setBounds(30, 72, 102, 38);
		panel.add(td);
		td.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String twoDigit = td.getText();
			int twoD = Integer.parseInt(twoDigit);
			
			int firstD = twoD/10;
			
			int secondD = twoD%10;
			
			
			dis.setText(Integer.toString(firstD));
			}
		});
		btnNewButton.setBounds(185, 36, 122, 56);
		panel.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(185, 103, 122, 56);
		panel.add(btnNewButton_1);
	}
}
