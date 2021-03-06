/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

import business.CuentasBusiness;
import data.ClientesDAO;
import data.CuentasDAO;
import domain.Cliente_Cuenta;
import domain.Cuenta;
import domain.Cuenta_Ahorros;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CuentaAhorro extends javax.swing.JFrame {

    /**
     * Creates new form CuentaCorriente
     */
    public CuentaAhorro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void limpiar() {
        txtCedula.setText("");
        txtIdCuenta.setText("");
        txtSaldoActual.setText("");
        txtCargoSaldoMinimo.setText("");
        txtMontoDiarioMinimo.setText("");
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
        buttonAeroRight1 = new org.edisoncor.gui.button.ButtonAeroRight();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtIdCuenta = new javax.swing.JTextField();
        txtSaldoActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCBMoneda = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtMontoDiarioMinimo = new javax.swing.JTextField();
        txtCargoSaldoMinimo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCBTipoCliente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCurves1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelCurves1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelCurves1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cedula:");
        panelCurves1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID cuenta:");
        panelCurves1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de cliente:");
        panelCurves1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cuenta de Ahorro");
        panelCurves1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        panelCurves1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        txtIdCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCuentaActionPerformed(evt);
            }
        });
        panelCurves1.add(txtIdCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 90, -1));

        txtSaldoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActualActionPerformed(evt);
            }
        });
        panelCurves1.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Moneda:");
        panelCurves1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 20));

        jCBMoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$ Dolar", "₡ Colón" }));
        panelCurves1.add(jCBMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Monto Diario Minimo:");
        panelCurves1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 20));

        txtMontoDiarioMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoDiarioMinimoActionPerformed(evt);
            }
        });
        panelCurves1.add(txtMontoDiarioMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 110, 20));
        panelCurves1.add(txtCargoSaldoMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 110, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cargo Saldo Minimo:");
        panelCurves1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 20));

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });
        panelCurves1.add(jBActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Saldo Actual:");
        panelCurves1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 20));

        jCBTipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fisico", "Juridico" }));
        panelCurves1.add(jCBTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, -1));

        panelNice5.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActualActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSaldoActualActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void buttonAeroRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroRight1ActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAeroRight1ActionPerformed

    private void txtMontoDiarioMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoDiarioMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoDiarioMinimoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            CuentasDAO cuentas= new CuentasDAO();
            
            Cuenta cuenta= new Cuenta();
            cuenta.setId_cuenta(cuentas.ultimoIdAhorros());
            cuenta.setTipo_cuenta(1);
            cuentas.agregarCuenta(cuenta);
            
            Cuenta_Ahorros cuentaAhorros = new Cuenta_Ahorros();
            cuentaAhorros.setMonto_min(Integer.parseInt(txtMontoDiarioMinimo.getText()));
            if(jCBMoneda.getSelectedItem() == "$ Dolar"){
                cuentaAhorros.setMoneda(2);
            }else{
                cuentaAhorros.setMoneda(1);
            }
            
            cuentaAhorros.setSaldo_actual(Integer.parseInt(txtSaldoActual.getText()));
            cuentaAhorros.setCargo_saldo_min(Integer.parseInt(txtCargoSaldoMinimo.getText()));
            cuentas.agregarCuenta_ahorros(cuentaAhorros);
            
            ClientesDAO cliente= new ClientesDAO();
            int tipoCliente = jCBTipoCliente.getSelectedIndex();
            int idCliente;
            if(tipoCliente == 0){
                idCliente = cliente.idClienteFisico(Integer.parseInt(txtCedula.getText()));
            }else{
                idCliente = cliente.idClienteJuridico(Integer.parseInt(txtCedula.getText()));
            }
            
            Cliente_Cuenta clienteCuenta= new Cliente_Cuenta();
            
            clienteCuenta.setId_cliente(idCliente);
            clienteCuenta.setId_cuenta(cuenta.getId_cuenta());
            
            cliente.agregarCliente_cuenta(clienteCuenta);
            
            
            JOptionPane.showMessageDialog(panelCurves1, "La cuenta ha sido agregado correctemente ");
            
            limpiar();
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
        
        try {       
            
            CuentasBusiness cuentasBusiness = new CuentasBusiness();
            
            Cuenta_Ahorros cuentaAhorros = new Cuenta_Ahorros();
            
            cuentaAhorros.setId_cuenta(Integer.parseInt(txtIdCuenta.getText()));
            cuentaAhorros.setSaldo_actual(Integer.parseInt(txtSaldoActual.getText()));
            if(jCBMoneda.getSelectedItem() == "$ Dolar"){
                cuentaAhorros.setMoneda(2);
            }else{
                cuentaAhorros.setMoneda(1);
            }
            cuentaAhorros.setMonto_min(Integer.parseInt(txtMontoDiarioMinimo.getText()));
            cuentaAhorros.setCargo_saldo_min(Integer.parseInt(txtCargoSaldoMinimo.getText()));
    
             try {
                
                cuentasBusiness.actualizarCuentaAhorro(cuentaAhorros);
            
                JOptionPane.showMessageDialog(panelCurves1, "La cuenta ha sido actualizado correctemente ");
            
                limpiar();
                
        }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        }   catch (Exception ex) {
            Logger.getLogger(ClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void txtIdCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCuentaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIdCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaAhorro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JComboBox jCBMoneda;
    private javax.swing.JComboBox jCBTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private javax.swing.JTextField txtCargoSaldoMinimo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtIdCuenta;
    private javax.swing.JTextField txtMontoDiarioMinimo;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
