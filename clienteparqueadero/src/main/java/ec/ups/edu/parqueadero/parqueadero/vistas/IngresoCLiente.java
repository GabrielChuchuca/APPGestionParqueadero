package ec.ups.edu.parqueadero.parqueadero.vistas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ec.ups.edu.parqueadero.parqueadero.modelos.Cliente;
import ec.ups.edu.parqueadero.parqueadero.negocio.GestionTicketONRemoto;

public class IngresoCLiente extends JFrame {
	private JPanel contenedor;
	private JTextField txtNombre;
	private JTextField txtDNI;
	private JTextField txtEmail;
  /// SE APLICA EL METODO QUE CONTIENE LOS METODOS REMOTOS
	
	private  GestionTicketONRemoto on;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoCLiente frame = new IngresoCLiente();
					frame.instanciaONCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

	}
	
	public  void instanciaONCliente() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "admin");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "admin");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/parqueadero/GestionTicketON!ec.ups.edu.parqueadero.parqueadero.negocio.GestionTicketONRemoto";  
              
            this.on = (GestionTicketONRemoto) context.lookup(lookupName);  
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
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
		c.setDni(txtDNI.getText());
		c.setEmail(txtEmail.getText());
		c.setNombre(txtNombre.getText());
		c.setTipoDocumento(1);
		System.out.println(c.toString());
		
		try {
			on.registrarCliente(c);
			System.out.println("Guardar OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("NO SE HA GUARDADO");
			e.printStackTrace();
		}
		
		
	}
}