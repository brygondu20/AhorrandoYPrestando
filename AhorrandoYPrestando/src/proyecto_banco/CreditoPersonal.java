/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

import business.CreditosBusiness;
import data.CreditosDAO;
import domain.Cliente_Cuenta;
import domain.Credito_Personal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CreditoPersonal extends javax.swing.JFrame {
     private ArrayList <Cliente_Cuenta>  lista;

    /**
     * Creates new form CuentaCorriente
     */
    public CreditoPersonal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void cargarCombobox() throws SQLException, Exception{
        lista=new ArrayList();
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        
        CreditosDAO cre = new CreditosDAO();
        int id_cliente=  Integer.parseInt(txtIdCliente.getText());
        lista=cre.obtenerId(id_cliente);
        int id;
        for(Cliente_Cuenta c: lista){
            id=c.getId_cuenta();
            modelo.addElement(id);
            
        }
        jComboBox1.setModel(modelo);
        
    }
    
    public void limpiar() {
        txtIdCliente.setText("");
        txtMonto.setText("");
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
        txtIdCliente = new javax.swing.JTextField();
        jCBMoneda = new javax.swing.JComboBox();
        txtMonto = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        buttonAeroRight1 = new org.edisoncor.gui.button.ButtonAeroRight();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCurves1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        panelCurves1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 100, -1));

        jCBMoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$ Dolar", "₡ Colón" }));
        jCBMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMonedaActionPerformed(evt);
            }
        });
        panelCurves1.add(jCBMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 130, -1));
        panelCurves1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 130, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelCurves1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 80, -1));

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Credito Personal");
        panelCurves1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Cuenta:");
        panelCurves1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Monto:");
        panelCurves1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Moneda:");
        panelCurves1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Cliente:");
        panelCurves1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        panelCurves1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, -1));

        panelNice5.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAeroRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroRight1ActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAeroRight1ActionPerformed

    private void jCBMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMonedaActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        try {
            cargarCombobox();
        } catch (SQLException ex) {
            Logger.getLogger(CreditoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CreditoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            
            CreditosBusiness creditosBusiness = new CreditosBusiness();
            
            Credito_Personal creditoPersonal= new Credito_Personal();
            
            if(jCBMoneda.getSelectedItem() == "$ Dolar"){
                    creditoPersonal.setMoneda(2);
            }else{
                    creditoPersonal.setMoneda(1);
            }
            int cuenta = (int) jComboBox1.getSelectedItem();
            creditoPersonal.setId_cuenta(cuenta);
            creditoPersonal.setMonto(Integer.parseInt(txtMonto.getText()));
            creditoPersonal.setId_cliente(Integer.parseInt(txtIdCliente.getText()));
            
            creditosBusiness.agregarCreditoPersonal(creditoPersonal);
            
            JOptionPane.showMessageDialog(panelCurves1, "El credito ha sido agregado correctemente ");
            
            limpiar();
            
        } catch (SQLException ex) {
            Logger.getLogger(CreditoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
             Logger.getLogger(CreditoPersonal.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(CreditoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditoPersonal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JComboBox jCBMoneda;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
