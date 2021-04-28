package dialogTablas;

import javax.swing.table.DefaultTableModel;

import modelo.delegate.ConsolaDelegate;
import modelo.dto.Consola;

public class RegistrosConsola extends javax.swing.JDialog {
	
	ConsolaDelegate del = new ConsolaDelegate();
	public int idConsolaForm;
	public int item;

	public RegistrosConsola(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.setLocationRelativeTo(parent);

		crearModeloDeTabla();

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jScrollPane1.setViewportView(jTable1);

		jButton1.setText("Aceptar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(316, Short.MAX_VALUE).addComponent(jButton1).addGap(20, 20, 20)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton1)
						.addContainerGap(15, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		int registroSeleccionado=-1;
		registroSeleccionado = jTable1.getSelectedRow();
		
		this.setVisible(false);
		if (registroSeleccionado==-1) {
			registroSeleccionado=0;
		}
		item=registroSeleccionado;
		idConsolaForm = Integer.parseInt(jTable1.getValueAt(registroSeleccionado, 0).toString());
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration

	private void crearModeloDeTabla() {

		String columnNames[] = { "idConsola", "Nombre", "Costo" };
		DefaultTableModel modelo = new DefaultTableModel(columnNames, 0);

		for (Consola consola : del.findAll()) {
			Object row[] = new Object[3];
			row[0] = consola.getIdConsola();
			row[1] = consola.getNombre();
			row[2] = consola.getCosto();

			modelo.addRow(row);

			jTable1.setModel(modelo);
			// jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		}
	}
}
