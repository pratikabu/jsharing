/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PortNumber.java
 *
 * Created on 30 Oct, 2010, 8:10:58 PM
 */

package net.sf.jsharing.boundary;

import net.sf.jsharing.components.UsefulMethods;

/**
 * 
 * @author Pratik
 */
public class PortNumber extends javax.swing.JDialog {
	private boolean editable;

	/** Creates new form PortNumber */
	private PortNumber(java.awt.Frame parent, boolean editable) {
		super(parent, true);
		this.editable = editable;
		initComponents();

		initPort();
		setLocationRelativeTo(parent);
	}

	public static void showPortNumber(java.awt.Frame parent) {
		new PortNumber(parent, true).setVisible(true);
	}

	public static void showPortNumber(java.awt.Frame parent, boolean editable) {
		new PortNumber(parent, editable).setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jSpinner1 = new javax.swing.JSpinner();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Port No.");

		jLabel2.setText("Port Number:");

		jSpinner1.setModel(new javax.swing.SpinnerNumberModel(2021, 1025,
				60000, 1));
		jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1,
				"#####"));

		jButton1.setText("Save & Close");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel2)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSpinner1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										71,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(54, Short.MAX_VALUE)
								.addComponent(jButton1).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jSpinner1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addComponent(jButton1)
								.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if (editable)
			UsefulMethods.props.setProperty(UsefulMethods.P_PORT_NUMBER_KEY,
					jSpinner1.getValue().toString());
		this.dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JSpinner jSpinner1;

	// End of variables declaration//GEN-END:variables

	private void initPort() {
		jSpinner1.setValue(UsefulMethods.getPortNumber());

		if (!editable) {
			jButton1.setText("Close");
			this.jSpinner1.setEnabled(editable);
		}
	}

}