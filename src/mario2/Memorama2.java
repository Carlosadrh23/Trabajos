package mario2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Memorama2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama2 window = new Memorama2();
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
	public Memorama2() {
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
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("MEMORAMA");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_2);

		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setIcon(new ImageIcon(Memorama2.class.getResource("/img2/poke2.jpg")));
		panel_3.add(btnNewButton_15);
		
	}

}
