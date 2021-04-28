package modelo.vistas;

import modelo.dto.Cliente;
import modelo.dto.Consola;
import modelo.dto.Videojuego;
import dialogTablas.RegistrosCliente;
import modelo.delegate.ClienteDelegate;

public class ClienteFormulario extends javax.swing.JFrame {

	Cliente dto = new Cliente();
	ClienteDelegate del = new ClienteDelegate();
	
	public ClienteFormulario() {
		initComponents();
		
		for (Cliente e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdCliente()));
		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jbBuscar = new javax.swing.JButton();
		jbRegistrar = new javax.swing.JButton();
		jbTodos = new javax.swing.JButton();
		jbActualizar = new javax.swing.JButton();
		jbEliminar = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("idCliente:");

		jLabel2.setText("Nombre: ");

		jbBuscar.setText("Buscar");
		jbBuscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbBuscarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addGap(12, 12, 12).addComponent(jTextField2))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(34, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbBuscar))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2).addComponent(jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jbRegistrar.setText("Registrar");
		jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbRegistrarActionPerformed(evt);
			}
		});

		jbTodos.setText("Mostrar Registros");
		jbTodos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbTodosActionPerformed(evt);
			}
		});

		jbActualizar.setText("Actualizar");
		jbActualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbActualizarActionPerformed(evt);
			}
		});

		jbEliminar.setText("Eliminar");
		jbEliminar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbEliminarActionPerformed(evt);
			}
		});

		jButton1.setText("Salir");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jbTodos, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jButton1)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbRegistrar).addComponent(jbActualizar).addComponent(jbEliminar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jbTodos)
						.addGap(18, 18, 18).addComponent(jButton1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	
	private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		jTextField2.setText("" + dto.getNombre());		
	}

	private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dto.setNombre(jTextField2.getText());

		del.persist(dto);

		jComboBox1.removeAllItems();

		for (Cliente e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdCliente()));
		}
	}

	private void jbTodosActionPerformed(java.awt.event.ActionEvent evt) {

		RegistrosCliente todos = new RegistrosCliente(this, true);
		todos.setVisible(true);
		jComboBox1.setSelectedIndex(todos.item);

		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		// jTextField1.setText(""+ dto.getIdConsola());
		jTextField2.setText("" + dto.getNombre());

	}

	private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {

		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		dto.setNombre(jTextField2.getText());
		

		del.update(dto);
		jComboBox1.removeAllItems();

		for (Cliente e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdCliente()));

		}
	}

	private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {

		del.deleteById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
		jComboBox1.removeAllItems();

		for (Cliente e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdCliente()));
		}

		jTextField2.setText("");
		
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.setVisible(false);

	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JButton jbActualizar;
	private javax.swing.JButton jbBuscar;
	private javax.swing.JButton jbEliminar;
	private javax.swing.JButton jbRegistrar;
	private javax.swing.JButton jbTodos;
	// End of variables declaration
}
