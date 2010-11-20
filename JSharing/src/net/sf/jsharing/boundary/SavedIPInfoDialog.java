/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SavedIPInfoDialog.java
 *
 * Created on 6 Nov, 2010, 10:50:26 AM
 */

package net.sf.jsharing.boundary;

import javax.swing.JOptionPane;
import net.sf.jsharing.components.SavedIPInfo;
import net.sf.jsharing.components.UsefulMethods;

/**
 * 
 * @author Pratik
 */
public class SavedIPInfoDialog extends javax.swing.JDialog {
	private SavedIPInfo sip;
	private String removeIP;
	private boolean saved = false;

	/** Creates new form SavedIPInfoDialog */
	private SavedIPInfoDialog(java.awt.Frame parent, SavedIPInfo sip) {
		super(parent, true);
		this.sip = sip;
		initComponents();

		loadSIP();
		this.setLocationRelativeTo(parent);
		this.setVisible(true);
	}

	public static boolean showSavedIPInfoDialog(java.awt.Frame parent,
			SavedIPInfo sip) {
		return new SavedIPInfoDialog(parent, sip).saved;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jSpinner1 = new javax.swing.JSpinner();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Save IP Info");

		jLabel1.setText("Short Name:");

		jLabel2.setText("IP:");

		jLabel3.setText("Port:");

		jSpinner1.setModel(new javax.swing.SpinnerNumberModel(21212, 1025,
				60000, 1));
		jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1,
				"#####"));

		jButton1.setText("...");
		jButton1.setFocusable(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Close");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Ok");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Edit IP");
		jButton4.setEnabled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
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
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						jLabel3))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jSpinner1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						71,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField2,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										149,
																										Short.MAX_VALUE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jButton1))
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						200,
																						Short.MAX_VALUE)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton4)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		91,
																		Short.MAX_VALUE)
																.addComponent(
																		jButton3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jSpinner1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton3)
												.addComponent(jButton4))
								.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		this.dispose();
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		String ipAddress = IPAddressForm.showIPAddressForm(MainWindow.mw,
				jTextField2.getText());

		if (ipAddress != null) {
			jTextField2.setText(ipAddress);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		if (correct() && overrideDuplicate()) {
			save();
			saved = true;
			this.dispose();
		}
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		jTextField2.setEnabled(true);
		jButton1.setEnabled(true);
		jTextField2.requestFocus();
		removeIP = sip.getIp();
	}// GEN-LAST:event_jButton4ActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JSpinner jSpinner1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;

	// End of variables declaration//GEN-END:variables

	private void loadSIP() {
		if (sip != null) {
			jTextField2.setText(sip.getIp());
			jSpinner1.setValue(sip.getPort());

			jTextField2.setEnabled(false);
			jButton1.setEnabled(false);
			if (sip.getName() != null) {
				jTextField1.setText(sip.getName());
				jButton4.setEnabled(true);
			}
		} else {
			jTextField1.setText("");
			jTextField2.setText("");
			jSpinner1.setValue(UsefulMethods.getPortNumber());
		}
	}

	private boolean correct() {
		boolean correct = !jTextField2.getText().isEmpty();
		if (!correct)
			JOptionPane.showMessageDialog(this, "IP cannot be empty.",
					"Cannot Save", JOptionPane.ERROR_MESSAGE);
		return correct;
	}

	private void save() {
		createSIP();
		if (removeIP != null)// if not null then remove the entry from Map
			UsefulMethods.savedIPs.remove(removeIP);
		UsefulMethods.savedIPs.put(sip.getIp(), sip);// save the entry
	}

	private void createSIP() {
		sip = new SavedIPInfo();

		sip.setName(jTextField1.getText());
		sip.setIp(jTextField2.getText());
		sip.setPort((Integer) jSpinner1.getValue());
	}

	private boolean overrideDuplicate() {
		SavedIPInfo oldSIP = UsefulMethods
				.getSavedIPInfo(jTextField2.getText());

		// if there is no entry saved with this ip
		if (oldSIP == null)
			return true;

		// if we are editing and SIP
		if (sip != null)
			return true;

		// ask question once a new entry is going to add
		int choice = JOptionPane.showConfirmDialog(this, "The IP Address: "
				+ oldSIP.getIp() + "\nis mapped to Name: " + oldSIP.getName()
				+ "\nDo you want to override this entry?", "Duplicate Entry",
				JOptionPane.YES_NO_OPTION);

		// returns the user choice
		return choice == JOptionPane.YES_OPTION;
	}

}
