import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class index {

	private JFrame frame;
	private JTextField nombre;
	private JTextField calleppal;
	private JTextField Numero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
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
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(83, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(27, 21, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		nombre = new JTextField();
		nombre.setBounds(103, 18, 86, 20);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		JLabel lblCallePrinc = new JLabel("Calle princ.");
		lblCallePrinc.setBounds(27, 58, 53, 14);
		frame.getContentPane().add(lblCallePrinc);
		
		calleppal = new JTextField();
		calleppal.setBounds(103, 55, 86, 20);
		frame.getContentPane().add(calleppal);
		calleppal.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(27, 101, 46, 14);
		frame.getContentPane().add(lblNumero);
		
		Numero = new JTextField();
		Numero.setBounds(103, 98, 86, 20);
		frame.getContentPane().add(Numero);
		Numero.setColumns(10);
	}
}
