package ec.ups.edu.parqueadero.parqueadero.vistas;

import ec.ups.edu.parqueadero.parqueadero.dao.ClienteDAO;
import ec.ups.edu.parqueadero.parqueadero.modelos.Cliente;
import ec.ups.edu.parqueadero.parqueadero.negocio.GestionTicketON;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class IngresoCLiente extends JFrame {
	private JPanel contenedor;
	private JTextField txtNombre;
	private JTextField txtDNI;
	private JTextField txtEmail;
	
	private GestionTicketON on;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoCLiente frame = new IngresoCLiente();
					frame.setVisible(true);

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

	}

	public IngresoCLiente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedor.setLayout(null);
		setContentPane(contenedor);

		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setBounds(18, 27, 61, 16);
		contenedor.add(lblnombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(112, 22, 130, 26);
		txtNombre.setColumns(10);
		contenedor.add(txtNombre);
		
		JLabel lbldni = new JLabel("DNI");
		lbldni.setBounds(18, 64, 61, 16);
		contenedor.add(lbldni);
		txtDNI = new JTextField();
		txtDNI.setBounds(112, 59, 130, 26);
		contenedor.add(txtDNI);
				
		JLabel lblcorreo = new JLabel("CORREO");
		lblcorreo.setBounds(18, 111, 61, 16);
		contenedor.add(lblcorreo);
		txtEmail = new JTextField();
		txtEmail.setBounds(112, 106, 130, 26);
		contenedor.add(txtEmail);
		
		JButton btnAceptar = new JButton("GUARDAR");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				guardarCliente();
				
			}

			
		});
		btnAceptar.setBounds(100, 159, 117, 29);
		contenedor.add(btnAceptar);
		
		
	}
	
	
	public void guardarCliente() {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		on = new GestionTicketON();
		c.setDni(txtDNI.getText());
		c.setEmail(txtEmail.getText());
		c.setNombre(txtNombre.getText());
		c.setTipoDocumento(1);

		try {
			on.registrarCliente(c);
			System.out.println("Guardar OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println(c.toString());
			System.out.println("NO SE HA GUARDADO");
			e.printStackTrace();
		}
		
		
	}
}