/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.BadConsequence;

/**
 *
 * @author usuario
 */
public class BadConsequenceView extends javax.swing.JPanel {

	private BadConsequence badConsequenceModel;
	
	public void setBadConsequence(BadConsequence badConsequence){
		badConsequenceModel = badConsequence;
		badConsequenceLabel.setText(badConsequenceModel.getText());
		repaint();
	}
	/**
	 * Creates new form BadConsequenceView
	 */
	public BadConsequenceView() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        badConsequenceLabel = new javax.swing.JTextArea();

        badConsequenceLabel.setEditable(false);
        badConsequenceLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.disabledBackground"));
        badConsequenceLabel.setColumns(20);
        badConsequenceLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        badConsequenceLabel.setLineWrap(true);
        badConsequenceLabel.setRows(3);
        badConsequenceLabel.setText("Esto es un texto que tiene que ocupar más de una línea.");
        badConsequenceLabel.setWrapStyleWord(true);
        jScrollPane2.setViewportView(badConsequenceLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea badConsequenceLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
