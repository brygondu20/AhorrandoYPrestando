/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

/**
 *
 * @author Administrador
 */
public class ClienteJuridico extends javax.swing.JFrame {

    /**
     * Creates new form CuentaCorriente
     */
    public ClienteJuridico() {
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
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        buttonAeroRight1 = new org.edisoncor.gui.button.ButtonAeroRight();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCurves1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula Juridica:");
        panelCurves1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 20));
        panelCurves1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Empresa:");
        panelCurves1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 20));
        panelCurves1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 100, -1));

        jButton4.setText("Actualizar");
        panelCurves1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jButton1.setText("Agregar");
        panelCurves1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 80, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente Juridico");
        panelCurves1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        panelCurves1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));
        panelCurves1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelCurves1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 80, 20));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panelCurves1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Segundo Apellido:");
        panelCurves1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Primer Apellido:");
        panelCurves1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 20));
        panelCurves1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 80, -1));
        panelCurves1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 60, -1));
        panelCurves1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 60, -1));
        panelCurves1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 60, -1));

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Cliente:");
        panelCurves1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefonos:");
        panelCurves1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 20));
        panelCurves1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 60, -1));
        panelCurves1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 60, -1));

        panelNice5.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void buttonAeroRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroRight1ActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAeroRight1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteJuridico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteJuridico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    // End of variables declaration//GEN-END:variables
}
