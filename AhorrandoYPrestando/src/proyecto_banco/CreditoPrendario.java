/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

/**
 *
 * @author Administrador
 */
public class CreditoPrendario extends javax.swing.JFrame {

    /**
     * Creates new form CuentaCorriente
     */
    public CreditoPrendario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice5 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        txtCodigoCredito = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBoxProposito = new javax.swing.JComboBox();
        txtComision = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonAeroRight1 = new org.edisoncor.gui.button.ButtonAeroRight();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCurves1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCreditoActionPerformed(evt);
            }
        });
        panelCurves1.add(txtCodigoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, -1));
        panelCurves1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$ Dolar", "₡ Colón" }));
        panelCurves1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 130, -1));

        jComboBoxProposito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vehiculo Nuevo", "Vehiculo Usado" }));
        jComboBoxProposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPropositoActionPerformed(evt);
            }
        });
        panelCurves1.add(jComboBoxProposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, -1));
        panelCurves1.add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Moneda:");
        panelCurves1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comision:");
        panelCurves1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Proposito:");
        panelCurves1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Cliente:");
        panelCurves1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo Credito");
        panelCurves1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 20));

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Credito Prendario");
        panelCurves1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        jButton1.setText("Agregar");
        panelCurves1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 80, -1));

        jButton4.setText("Actualizar");
        panelCurves1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        panelNice5.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCreditoActionPerformed

    private void buttonAeroRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroRight1ActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAeroRight1ActionPerformed

    private void jComboBoxPropositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPropositoActionPerformed
        // TODO add your handling code here:
        int proposito = jComboBoxProposito.getSelectedIndex();
        switch(proposito){
            case 0:
                CreditoPrendarioVehiculoNuevo creditoPrendarioVehiculoNuevo = new CreditoPrendarioVehiculoNuevo();
                creditoPrendarioVehiculoNuevo.setVisible(true);
            break;
            case 1:
                CreditoPrendarioVehiculoUsado creditoPrendarioVehiculoUsado = new CreditoPrendarioVehiculoUsado();
                creditoPrendarioVehiculoUsado.setVisible(true);
            break;  
        }
    }//GEN-LAST:event_jComboBoxPropositoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreditoPrendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditoPrendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditoPrendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditoPrendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditoPrendario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBoxProposito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private javax.swing.JTextField txtCodigoCredito;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}
