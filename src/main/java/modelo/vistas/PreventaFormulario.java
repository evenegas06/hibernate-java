package modelo.vistas;

import dialogTablas.RegistrosCliente;
import dialogTablas.RegistrosConsola;
import dialogTablas.RegistrosPreventa;
import dialogTablas.RegistrosVideojuegos;
import modelo.delegate.ClienteDelegate;
import modelo.delegate.VideojuegoDelegate;
import modelo.dto.Cliente;
import modelo.dto.Consola;
import modelo.dto.Videojuego;
import modelo.delegate.PreventaDelegate;
import modelo.dto.Preventa;

public class PreventaFormulario extends javax.swing.JFrame {
	
	Videojuego dtoVideojuego = new Videojuego();
	VideojuegoDelegate delVideojuego = new VideojuegoDelegate();

	int itemVideojuego;
	int itemCliente;
	
	Cliente dtoCliente= new Cliente();
	ClienteDelegate delCliente = new ClienteDelegate();
	
	Preventa dto = new Preventa();
	PreventaDelegate del = new PreventaDelegate();

	public PreventaFormulario() {
		initComponents();
		
		for (Preventa e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdPreventa()));
		}
		for (Videojuego e : delVideojuego.findAll()) {
			jComboBox2.addItem(String.valueOf(e.getIdVideojuego()));
		}
		for (Cliente e : delCliente.findAll()) {
			jComboBox3.addItem(String.valueOf(e.getIdCliente()));
		}
		
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jbBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jbBuscar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jbBuscar2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbTodos = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("idPreventa:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Anticipo: ");

        jLabel6.setText("idVideojuego:");

        jbBuscar1.setText("...");
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });

        jLabel7.setText("idCliente:");

        jbBuscar2.setText("...");
        jbBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(jTextField4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jbBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jbBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar)
                    .addComponent(jbActualizar)
                    .addComponent(jbEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>          

	private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		jTextField1.setText("" + dto.getIdVideojuego().getIdVideojuego());
		jTextField2.setText("" + dto.getIdCliente().getIdCliente());
		jTextField4.setText("" + dto.getAnticipo());
		//jComboBox2.setSelectedItem(dto.getIdConsola());
	}

	private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		RegistrosVideojuegos x = new RegistrosVideojuegos(this, true);
		x.setVisible(true);
		jComboBox2.setSelectedIndex(x.item);
		
	}

	private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dtoVideojuego = delVideojuego.findById(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
		dto.setIdVideojuego(dtoVideojuego);
		
		dto.setAnticipo(Double.parseDouble(jTextField4.getText()));
		
		dtoCliente = delCliente.findById(Integer.parseInt(jComboBox3.getSelectedItem().toString()));
		dto.setIdCliente(dtoCliente);

		del.persist(dto);

		jComboBox1.removeAllItems();

		for (Preventa e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdPreventa()));

		}
		jComboBox2.removeAllItems();

		for (Videojuego e : delVideojuego.findAll()) {
			jComboBox2.addItem(String.valueOf(e.getIdVideojuego()));

		}
		jComboBox3.removeAllItems();

		for (Cliente e : delCliente.findAll()) {
			jComboBox3.addItem(String.valueOf(e.getIdCliente()));

		}

	}

	private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// TODO add your handling code here:
		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		dtoVideojuego = delVideojuego.findById(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
		dto.setIdVideojuego(dtoVideojuego);
		
		dto.setAnticipo(Double.parseDouble(jTextField4.getText()));
		
		dtoCliente = delCliente.findById(Integer.parseInt(jComboBox3.getSelectedItem().toString()));
		dto.setIdCliente(dtoCliente);
		
		
		del.update(dto);
		
		jComboBox1.removeAllItems();

		for (Preventa e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdPreventa()));

		}
		
	}

	private void jbTodosActionPerformed(java.awt.event.ActionEvent evt) {
		RegistrosPreventa todos = new RegistrosPreventa(this, true);
		todos.setVisible(true);
		jComboBox1.setSelectedIndex(todos.item);

		dto = del.findById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));

		jTextField1.setText(""+ dto.getIdVideojuego().getIdVideojuego());
		jTextField4.setText("" + dto.getAnticipo());
		jTextField2.setText("" + dto.getIdCliente().getIdCliente());
		
		itemCliente = todos.item;
		jComboBox2.setSelectedIndex(todos.item);
	}

	private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		del.deleteById(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
		jComboBox1.removeAllItems();

		for (Preventa e : del.findAll()) {
			jComboBox1.addItem(String.valueOf(e.getIdPreventa()));
		}

		
		jTextField2.setText("");
		jTextField1.setText("");
		jTextField4.setText("");
		
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		this.setVisible(false);
	}

	private void jbBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		RegistrosCliente x = new RegistrosCliente(this, true);
		x.setVisible(true);
		jComboBox3.setSelectedIndex(x.item);
		
		
	}
	
	 private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscar1;
    private javax.swing.JButton jbBuscar2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbTodos;
    // End of variables declaration 
}
