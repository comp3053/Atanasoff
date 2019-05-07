package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MaintainRecipePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaintainRecipePage frame = new MaintainRecipePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaintainRecipePage() {
		setTitle("Maintain Recipe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setBounds(94, 139, 75, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setForeground(new Color(50, 205, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(166, 139, 88, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(251, 139, 88, 31);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("*press the buttons!*");
		lblNewLabel.setBounds(145, 77, 133, 16);
		contentPane.add(lblNewLabel);
	}
}