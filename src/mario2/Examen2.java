package mario2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;

public class Examen2 {

	private JFrame frame;
	private JTextField txtCalle;
	private JTextField textField_1;
	private JTextField txtJhonDoe;
	private JTextField textField;
	private JTable table;
	private JTextField txtVerListadoDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen2 window = new Examen2();
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
	public Examen2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 446, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Factura de Java - NetBeans - ArrayList y POO");
		lblNewLabel.setBackground(new Color(10, 128, 255));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Datos del cliente");
		lblNewLabel_2.setBounds(0, 0, 83, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Dirección: ");
		lblNewLabel_1.setBounds(0, 36, 70, 13);
		panel_1.add(lblNewLabel_1);
		
		txtCalle = new JTextField();
		txtCalle.setText("calle 1 # 123");
		txtCalle.setBounds(61, 33, 96, 19);
		panel_1.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Documentos:");
		lblNewLabel_3.setBounds(0, 13, 70, 13);
		panel_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setText("12345");
		textField_1.setBounds(61, 10, 96, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombres:");
		lblNewLabel_4.setBounds(231, 13, 45, 13);
		panel_1.add(lblNewLabel_4);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Juan José");
		txtJhonDoe.setBounds(276, 10, 96, 19);
		panel_1.add(txtJhonDoe);
		txtJhonDoe.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono:");
		lblNewLabel_5.setBounds(231, 36, 45, 13);
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setText("5554433");
		textField.setBounds(276, 33, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 59, 436, 56);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Datos de factura");
		lblNewLabel_6.setBounds(0, 0, 75, 23);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("N ° Factura: 1");
		lblNewLabel_7.setBounds(0, 33, 75, 13);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha:      2021/05/21");
		lblNewLabel_8.setBounds(224, 33, 105, 13);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 116, 436, 25);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		txtVerListadoDe = new JTextField();
		txtVerListadoDe.setText("Ver listado de facturas");
		txtVerListadoDe.setBounds(0, 0, 126, 19);
		panel_3.add(txtVerListadoDe);
		txtVerListadoDe.setColumns(10);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(253, -1, 85, 21);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(341, -1, 85, 21);
		panel_3.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(0, 141, 426, 70);
		table.setModel(new DefaultTableModel(
                new Object[][] {
                    {"Producto", "Cantidad", "Valor", "Sub Total"}, 
                    {"Agua", 2, 500, 1000.0},
                    {"Cereal", 5, 1000, 5000.0},
                    {"Leche", 2, 300, 600.0},
                },
                new String[] {"Producto", "Cantidad", "Valor", "Sub Total"} 
            ));
		panel_1.add(table);
		
		JLabel lblNewLabel_9 = new JLabel("SubTotal:  6600.0");
		lblNewLabel_9.setBounds(0, 221, 83, 13);
		panel_1.add(lblNewLabel_9);
	}
}
