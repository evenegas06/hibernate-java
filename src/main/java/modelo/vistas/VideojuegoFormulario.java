package modelo.vistas;

import dialogTablas.RegistrosConsola;
import dialogTablas.RegistrosVideojuegos;
import modelo.delegate.ConsolaDelegate;
import modelo.delegate.VideojuegoDelegate;
import modelo.dto.Consola;

import modelo.dto.Videojuego;

public class VideojuegoFormulario extends javax.swing.JFrame {

	Videojuego dto = new Videojuego();
	VideojuegoDelegate del = new VideojuegoDelegate();

	int itemConsola;
	Consola dtoConsola = new Consola();
	ConsolaDelegate delConsola = new ConsolaDelegate();

	public VideojuegoFormulario() {
		initComponents();
		for (Consola e : delConsola.findAll()) {
			jComboBox2.addItem(String.valueOf(e.getIdConsola()));
		}
		for (Videojuego v : del.findAll()) {
			jComboBox1.addItem(String.valueOf(v.getIdVideojuego()));
		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jbRegistrar = new javax.swing.JButton();
		jbActualizar = new javax.swing.JButton();
		jbTodos = new javax.swing.JButton();
		jbEliminar = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jbBuscar = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jbBuscar1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Salir");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jbRegistrar.setText("Registrar");
		jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbRegistrarActionPerformed(evt);
			}
		});

		jbActualizar.setText("Actualizar");
		jbActualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbActualizarActionPerformed(evt);
			}
		});

		jbTodos.setText("Mostrar Registros");
		jbTodos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbTodosActionPerformed(evt);
			}
		});

		jbEliminar.setText("Eliminar");
		jbEliminar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbEliminarActionPerformed(evt);
			}
		});

		jLabel1.setText("idVideojuego");

		jLabel2.setText("Nombre: ");

		jLabel3.setText("Genero:");

		jbBuscar.setText("Buscar");
		jbBuscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbBuscarActionPerformed(evt);
			}
		});

		jLabel4.setText("Lanzamiento: ");

		jLabel5.setText("Costo:");

		jLabel6.setText("idConsola:");

		jbBuscar1.setText("...");
		jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbBuscar1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
												154, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(6, 6, 6)
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout
														.createSequentialGroup()
														.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
																61, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 91,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE,
																28, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout
														.createSequentialGroup()
														.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
																70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jDateChooser1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														jPanel1Layout.createSequentialGroup().addComponent(jLabel3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jTextField3,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 154,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jTextField2,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 155,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbBuscar))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2)
										.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel4)
										.addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5)
										.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel6)
										.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addGap(266, 266, 266).addComponent(jButton1))
								.addComponent(jbTodos, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbRegistrar).addComponent(jbActualizar).addComponent(jbEliminar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jbTodos)
						.addGap(9, 9, 9).addComponent(jButton1).addContainerGap(21, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.setVisible(false);

	}

	private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dto.setNombre(jTextField2.getText());
		dto.setGenero(jTextField3.getText());
		dto.setFechaLanzamiento(new java.sql.Date(jDateChooser1.getDate().getTime()));
		dto.setCosto(Double.parseDouble(jTextField4.getText()));

		dtoConsola = delConsola.findById(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
		dto.setIdConsola(dtoConsola);

		del.persist(dto);

		jComboBox1.removeAllItems();

		for (Videojuego e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdVideojuego()));

		}
		jComboBox2.removeAllItems();

		for (Consola e : delConsola.findAll()) {
			jComboBox2.addItem(String.valueOf(e.getIdConsola()));

		}
	}

	private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		dto.setNombre(jTextField2.getText());
		dto.setGenero(jTextField3.getText());
		dto.setFechaLanzamiento(new java.sql.Date(jDateChooser1.getDate().getTime()));
		dto.setCosto(Double.parseDouble(jTextField4.getText()));

		dtoConsola = delConsola.findById(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
		dto.setIdConsola(dtoConsola);

		del.update(dto);
		jComboBox2.removeAllItems();

		for (Videojuego e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdConsola()));

		}
	}

	private void jbTodosActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
		RegistrosVideojuegos todos = new RegistrosVideojuegos(this, true);
		todos.setVisible(true);
		jComboBox1.setSelectedIndex(todos.item);

		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		// jTextField1.setText(""+ dto.getIdConsola());
		jTextField2.setText("" + dto.getNombre());
		jTextField3.setText("" + dto.getGenero());
		jDateChooser1.setDate(dto.getFechaLanzamiento());
		jTextField4.setText("" + dto.getCosto());
		itemConsola = todos.item;
		jComboBox2.setSelectedIndex(todos.item);
	}

	private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:

		del.deleteById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
		jComboBox1.removeAllItems();

		for (Videojuego e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdConsola().getIdConsola()));
		}

		
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jDateChooser1.setDate(null);

	}

	private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		jTextField2.setText("" + dto.getNombre());
		jTextField3.setText("" + dto.getGenero());
		jDateChooser1.setDate(dto.getFechaLanzamiento());
		jTextField4.setText("" + dto.getCosto());
		jComboBox2.setSelectedItem(dto.getIdConsola());
	}

	private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		RegistrosConsola r = new RegistrosConsola(this, true);
		r.setVisible(true);
		jComboBox2.setSelectedIndex(r.item);

		

	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JButton jbActualizar;
	private javax.swing.JButton jbBuscar;
	private javax.swing.JButton jbBuscar1;
	private javax.swing.JButton jbEliminar;
	private javax.swing.JButton jbRegistrar;
	private javax.swing.JButton jbTodos;
	// End of variables declaration
}
