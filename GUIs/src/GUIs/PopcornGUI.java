package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PopcornGUI {

	private JFrame frame;
	
	ImageIcon img13 = new ImageIcon("C:\\Users\\16192005\\git\\CS10NewG\\GUIs\\src\\Pics\\img13.jpg");
	ImageIcon img11 = new ImageIcon("C:\\Users\\16192005\\git\\CS10NewG\\GUIs\\src\\Pics\\img11.jpg");
	ImageIcon img12 = new ImageIcon("C:\\Users\\16192005\\git\\CS10NewG\\GUIs\\src\\Pics\\img12.jpg");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopcornGUI window = new PopcornGUI();
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
	public PopcornGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titl = new JLabel("Concession Machine");
		titl.setVerticalAlignment(SwingConstants.TOP);
		titl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titl.setHorizontalAlignment(SwingConstants.CENTER);
		titl.setBounds(139, 11, 217, 23);
		panel.add(titl);
		
		JLabel subtitl = new JLabel("Welcome to the Kinmount theatre! If you wish to buy popcorn or a soft drink, use the window below.");
		subtitl.setHorizontalAlignment(SwingConstants.LEFT);
		subtitl.setBounds(10, 28, 579, 14);
		panel.add(subtitl);
		
		JLabel pop = new JLabel("Popcorn");
		pop.setBounds(59, 53, 107, 14);
		panel.add(pop);
		
		JLabel lblNewLabel_2 = new JLabel("Pop");
		lblNewLabel_2.setBounds(343, 53, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel sze = new JLabel("Size:");
		sze.setBounds(10, 79, 46, 14);
		panel.add(sze);
		
		JLabel sze2 = new JLabel("Size:");
		sze2.setBounds(310, 78, 46, 14);
		panel.add(sze2);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 154, 293, 28);
		panel.add(dis);
		
		JComboBox Size1 = new JComboBox();
		Size1.setModel(new DefaultComboBoxModel(new String[] {"Small($3)", "Medium($5)", "Large($7)"}));
		Size1.setBounds(47, 78, 107, 19);
		panel.add(Size1);
		
		JComboBox Size2 = new JComboBox();
		Size2.setModel(new DefaultComboBoxModel(new String[] {"Small($2)", "Medium($4)", "Large($6)"}));
		Size2.setBounds(366, 75, 107, 18);
		panel.add(Size2);
		
		JLabel dis2 = new JLabel("");
		dis2.setVerticalAlignment(SwingConstants.TOP);
		dis2.setBounds(10, 205, 428, 33);
		panel.add(dis2);
		
		JLabel pic = new JLabel("");
		pic.setBounds(393, 101, 293, 351);
		panel.add(pic);
		
		JCheckBox Butter = new JCheckBox("Add Butter?($1)");
		Butter.setBounds(6, 114, 148, 23);
		Butter.setSelected(true);
		panel.add(Butter);
		
		JButton ent = new JButton("Enter");
		ent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
		    double price;	
			
		    double price2;
			
		    if(Size1.getSelectedItem().equals("Small($3)"))
			{
			price = 3.00;
			
			}
			else if(Size1.getSelectedItem().equals("Medium($5)"))
			{
			price = 5.00;
			
			}
			else
			{
			price = 7.00;
			}	
			
			
		    if(Size2.getSelectedItem().equals("Small($2)"))
			{
			price2 = 2.00;
			
			}
			else if(Size2.getSelectedItem().equals("Medium($4)"))
			{
			price2 = 4.00;
			
			}
			else
			{
			price2 = 6.00;
			}
			 
		    double cost = price + price2;
			 
		    if (Butter.isSelected()) {
		    	 
		    cost = cost +1;
		     
		    } 
		    else 
		    {
		     
		    }
		   
			
		    dis.setText("Your total price is $" + cost + "0");
			
		    
		    int day = 1 + (int) (Math.random() * 3);
		    
		   
		    switch (day)
			{
				case 1: 
					pic.setIcon(img13);
					dis2.setText("Tonights viewing is Spider-Man: No Way Home");
					
					break;
		
				case 2:
					pic.setIcon(img11);
					dis2.setText("Tonights viewing is Avengers: Infinity War");
					
					break;
		
				case 3:
					pic.setIcon(img12);
					dis2.setText("Tonights viewing is Doctor Strange In The Multiverse Of Madness");
					
					break;
		
				
					}
			}
		});
		ent.setBounds(193, 53, 89, 40);
		panel.add(ent);
		
		JButton clr = new JButton("Clear");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			dis.setText("");
			dis2.setText("");
			pic.setText("");
			}
		});
		clr.setBounds(193, 98, 89, 39);
		panel.add(clr);
		
		
		
		
		
	}
}
