/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

import connection.SQLServerDB;
import domain.Cuenta_Ahorros;
import domain.Cuenta_Corriente;
import java.awt.Image;
import java.awt.List;
import java.awt.Panel;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.edisoncor.gui.panel.PanelAvatarChooser;

/**
 *
 * @author Administrador
 */
public class CuentaConsulta extends javax.swing.JFrame {
     private  ArrayList<Cuenta_Ahorros>listaA;
     private  ArrayList<Cuenta_Corriente>listaC;
    /**
     * Creates new form Principal
     */
    public CuentaConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    public void tablaCuentaAhorroClienteFisico() throws SQLException{
        SQLServerDB sqlServerDB= new SQLServerDB();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id cuenta");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Saldo_actual");
        modelo.addColumn("Moneda");
        modelo.addColumn("Promedio diario min");
        modelo.addColumn("Cargo saldo min");
        String sql = "{call PA_CONSULTAR_VIEW_cuenta_ahorros_cliente_fisico()}";
        ResultSet res = sqlServerDB.executeQuery(sql);
        String[] datos = new String[14];
        listaA= new ArrayList();
        while (res.next()){
            Cuenta_Ahorros cuentaAhorros = new Cuenta_Ahorros();
            cuentaAhorros.setId_cuenta(res.getInt("id_cuenta"));
            listaA.add(cuentaAhorros);
            
            datos[0]= res.getString("id_cuenta");
            datos[1]= res.getString("nombre");
            datos[2]= res.getString("apellido_paterno");
            datos[3]= res.getString("apellido_materno");
            datos[4]= res.getString("saldo_actual");
            datos[5]= res.getString("moneda");
            datos[6]= res.getString("monto_min");
            datos[7]= res.getString("cargo_saldo_min");
           
            
            modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
    
    public void tablaCuentaAhorroClienteJuridico(){
        try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("id cuenta");
            modelo.addColumn("Empresa");
            modelo.addColumn("Representante");
            modelo.addColumn("Apellido1");
            modelo.addColumn("Apellido2");
            modelo.addColumn("Saldo actual");
            modelo.addColumn("Moneda");
            modelo.addColumn("Promedio diario min");
            modelo.addColumn("Cargo saldo min");
            String sql = "{call PA_CONSULTAR_VIEW_cuenta_ahorros_cliente_juridico()}";
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            listaA= new ArrayList();
            while (res.next()){
                Cuenta_Ahorros cuentaAhorros = new Cuenta_Ahorros();
                cuentaAhorros.setId_cuenta(res.getInt("id_cuenta"));
                listaA.add(cuentaAhorros);
                
                datos[0]= res.getString("id_cuenta");
                datos[1]= res.getString("nombre_Empresa");
                datos[2]= res.getString("nombre_representante");
                datos[3]= res.getString("apellido1");
                datos[4]= res.getString("apellido2");
                datos[5]= res.getString("saldo_actual");
                datos[6]= res.getString("moneda");
                datos[7]= res.getString("monto_min");
                datos[8]= res.getString("cargo_saldo_min");
               
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CuentaConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tablaCuentaCorrienteClienteFisico() throws SQLException{
        SQLServerDB sqlServerDB= new SQLServerDB();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id cuenta");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Saldo_actual");
        modelo.addColumn("Moneda");
        modelo.addColumn("Promedio diario min");
        modelo.addColumn("Cargo saldo min");
        String sql = "{call PA_CONSULTAR_VIEW_cuenta_corriente_cliente_fisico()}";
        ResultSet res = sqlServerDB.executeQuery(sql);
        String[] datos = new String[14];
        listaC= new ArrayList();
        while (res.next()){
            Cuenta_Corriente cuentaCorriente = new Cuenta_Corriente();
            cuentaCorriente.setCod(res.getInt("cod"));
            listaC.add(cuentaCorriente);
            
            datos[0]= res.getString("id_cuenta");
            datos[1]= res.getString("nombre");
            datos[2]= res.getString("apellido_paterno");
            datos[3]= res.getString("apellido_materno");
            datos[4]= res.getString("saldo_actual");
            datos[5]= res.getString("moneda");
            datos[6]= res.getString("promedio_diario_min");
            datos[7]= res.getString("cargo_saldo_min");
           
            
            modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
    
    public void tablaCuentaCorrienteClienteJuridico(){
        try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("id cuenta");
            modelo.addColumn("Empresa");
            modelo.addColumn("Representante");
            modelo.addColumn("Apellido1");
            modelo.addColumn("Apellido2");
            modelo.addColumn("Saldo actual");
            modelo.addColumn("Moneda");
            modelo.addColumn("Promedio diario min");
            modelo.addColumn("Cargo saldo min");
            String sql = "{call PA_CONSULTAR_VIEW_cuenta_corriente_cliente_juridico()}";
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            listaC= new ArrayList();
            while (res.next()){
                Cuenta_Corriente cuentaCorriente = new Cuenta_Corriente();
                cuentaCorriente.setCod(res.getInt("cod"));
                listaC.add(cuentaCorriente);
                
                datos[0]= res.getString("id_cuenta");
                datos[1]= res.getString("nombre_Empresa");
                datos[2]= res.getString("nombre_representante");
                datos[3]= res.getString("apellido1");
                datos[4]= res.getString("apellido2");
                datos[5]= res.getString("saldo_actual");
                datos[6]= res.getString("moneda");
                datos[7]= res.getString("promedio_diario_min");
                datos[8]= res.getString("cargo_saldo_min");
               
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CuentaConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAvatarChooser1 = new org.edisoncor.gui.panel.PanelAvatarChooser();
        panelAvatarChooser3 = new org.edisoncor.gui.panel.PanelAvatarChooser();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        panelReflect1 = new org.edisoncor.gui.panel.PanelReflect();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonAeroRight1 = new org.edisoncor.gui.button.ButtonAeroRight();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelReflect1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelReflect1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 700, 340));

        jButton3.setText("Consultar");
        panelReflect1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jButton2.setText("Borrar");
        panelReflect1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 79, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Cuenta:");
        panelReflect1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelReflect1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula:");
        panelReflect1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 20));
        panelReflect1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta Cuenta");
        panelReflect1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 20));

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelReflect1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        panelNice2.add(panelReflect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 600));

        getContentPane().add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 940, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CuentaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaConsulta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField8;
    private org.edisoncor.gui.panel.PanelAvatarChooser panelAvatarChooser1;
    private org.edisoncor.gui.panel.PanelAvatarChooser panelAvatarChooser3;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelReflect panelReflect1;
    // End of variables declaration//GEN-END:variables
}
