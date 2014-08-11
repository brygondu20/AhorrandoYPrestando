/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

import connection.SQLServerDB;
import domain.Credito_Personal;
import domain.Credito_Predendario;
import domain.Prestamo_Hipotecario;
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
public class CreditoConsulta extends javax.swing.JFrame {
    private  ArrayList<Credito_Personal>listaPER;
    private  ArrayList<Credito_Predendario>listaPRE;
    private  ArrayList<Prestamo_Hipotecario>listaHIPO;
    private int tipoCliente=1;
    /**
     * Creates new form Principal
     */
    public CreditoConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            cargatTabla();
        } catch (SQLException ex) {
            Logger.getLogger(CreditoConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void cargatTabla() throws SQLException{
        if(tipoCliente==1){
            tablaCreditoClienteFisico();
        }else{
            tablaCreditoClienteJuridico();
        }
    }
    
    
    
    public void tablaCreditoClienteFisico() throws SQLException{
        SQLServerDB sqlServerDB= new SQLServerDB();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Monto");
        modelo.addColumn("Moneda");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido1");
        modelo.addColumn("Apellido2");
        modelo.addColumn("id cuenta");
        String sql = "{call PA_CONSULTAR_VIEW_consultar_creditos_cliente_fisico()}";
        ResultSet res = sqlServerDB.executeQuery(sql);
        String[] datos = new String[14];
        listaPER= new ArrayList();
        while (res.next()){
            Credito_Personal creditoPersonal = new Credito_Personal();
            creditoPersonal.setCod_credto_personal(res.getInt("cod_credto_personal"));
            listaPER.add(creditoPersonal);
            
            datos[0]= res.getString("cod_credto_personal");
            datos[1]= res.getString("monto");
            datos[2]= res.getString("moneda");
            datos[3]= res.getString("cedula");
            datos[4]= res.getString("nombre");
            datos[5]= res.getString("apellido_paterno");
            datos[6]= res.getString("apellido_materno");
            datos[7]= res.getString("id_cuenta");
           
            
            modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
    
  
    public void tablaCreditoClienteJuridico(){
        try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Monto");
            modelo.addColumn("Moneda");
            modelo.addColumn("Ced_juridica");
            modelo.addColumn("Empresa");
            modelo.addColumn("Representante");
            modelo.addColumn("Apellido1");
            modelo.addColumn("Apellido2");
            modelo.addColumn("id cuenta");
    
            String sql = "{call PA_CONSULTAR_VIEW_consultar_creditos_cliente_juridico()}";
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            listaPER= new ArrayList();
            while (res.next()){
                Credito_Personal creditoPersonal = new Credito_Personal();
                creditoPersonal.setCod_credto_personal(res.getInt("cod_credto_personal"));
                listaPER.add(creditoPersonal);
                    
                datos[0]= res.getString("cod_credto_personal");
                datos[1]= res.getString("monto");
                datos[2]= res.getString("moneda");
                datos[3]= res.getString("ced_juridica");
                datos[4]= res.getString("nombre_Empresa");
                datos[5]= res.getString("nombre_Representante");
                datos[6]= res.getString("apellido1");
                datos[7]= res.getString("apellido2");
                datos[8]= res.getString("id_cuenta");
                
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CreditoConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    /**************/
        public void tablaCreditoPredendarioClienteFisico() throws SQLException{
        SQLServerDB sqlServerDB= new SQLServerDB();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("cod_credito_predendario");
        modelo.addColumn("proposito");
        modelo.addColumn("moneda");
        modelo.addColumn("comision");
        modelo.addColumn("cedula");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido_paterno");
        modelo.addColumn("apellido_materno");
        modelo.addColumn("id_cuenta");
        String sql = "{call V_consultar_creditos_predendario_cliente_fisico()}";
        ResultSet res = sqlServerDB.executeQuery(sql);
        String[] datos = new String[14];
        listaPRE= new ArrayList();
        while (res.next()){
            Credito_Predendario creditoPredendario = new Credito_Predendario();
            creditoPredendario.setId_cliente(res.getInt("id_cliente"));
            listaPRE.add(creditoPredendario);
            
            datos[0]= res.getString("cod_credito_predendario");
            datos[1]= res.getString("proposito");
            datos[2]= res.getString("moneda");
            datos[3]= res.getString("comision");
            datos[4]= res.getString("cedula");
            datos[5]= res.getString("nombre");
            datos[6]= res.getString("apellido_paterno");
            datos[7]= res.getString("apellido_materno");
            datos[8]= res.getString("id_cuenta");
           
            
            modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
     
     public void tablaCreditoPrendarioClienteJuridico(){
        try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("cod_credito_predendario");
            modelo.addColumn("proposito");
            modelo.addColumn("moneda");
            modelo.addColumn("comision");
            modelo.addColumn("ced_juridica");
            modelo.addColumn("nombre_Empresa");
            modelo.addColumn("nombre_Representante");
            modelo.addColumn("apellido1");
            modelo.addColumn("apellido2");
            modelo.addColumn("id_cuenta");
    
            String sql = "{call V_consultar_creditos_predendario_cliente_juridico()}";
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            listaPER= new ArrayList();
            while (res.next()){
                Credito_Predendario creditoPredendario = new Credito_Predendario();
                creditoPredendario.setId_cliente(res.getInt("id_cliente"));
                listaPRE.add(creditoPredendario);
                    
                datos[0]= res.getString("cod_credito_predendario");
                datos[1]= res.getString("proposito");
                datos[2]= res.getString("moneda");
                datos[3]= res.getString("comision");
                datos[4]= res.getString("ced_juridica");
                datos[5]= res.getString("nombre_Empresa");
                datos[6]= res.getString("nombre_Representante");
                datos[7]= res.getString("apellido1");
                datos[8]= res.getString("apellido2");
                datos[9]= res.getString("id_cuenta");
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CreditoConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/************/
     
       public void tablaPrestamoHipotecarioClienteFisico() throws SQLException{
        SQLServerDB sqlServerDB= new SQLServerDB();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("cod_prestamo_hipotecario");
        modelo.addColumn("valor_propiedad");
        modelo.addColumn("cedula");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido_paterno");
        modelo.addColumn("apellido_materno");
        modelo.addColumn("id_cuenta");
        String sql = "{call V_consultar_creditos_hipotecarios_cliente_fisico()}";
        ResultSet res = sqlServerDB.executeQuery(sql);
        String[] datos = new String[14];
        listaHIPO= new ArrayList();
        while (res.next()){
            Prestamo_Hipotecario prestamoHipotecario = new Prestamo_Hipotecario();
            prestamoHipotecario.setId_cliente(res.getInt("id_cliente"));
            listaHIPO.add(prestamoHipotecario);
            
            datos[0]= res.getString("cod_prestamo_hipotecario");
            datos[1]= res.getString("valor_propiedad");
            datos[2]= res.getString("cedula");
            datos[3]= res.getString("nombre");
            datos[4]= res.getString("apellido_paterno");
            datos[5]= res.getString("apellido_materno");
            datos[5]= res.getString("id_cuenta");
            
           
            
            modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }

     public void tablaPrestamoHipotecarioClienteJuridico(){
        try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("cod_prestamo_hipotecario");
            modelo.addColumn("valor_propiedad");
            modelo.addColumn("ced_juridica");
            modelo.addColumn("nombre_Empresa");
            modelo.addColumn("nombre_Representante");
            modelo.addColumn("apellido1");
            modelo.addColumn("apellido2");
            modelo.addColumn("id_cuenta");
             
            String sql = "{call V_consultar_creditos_hipotecarios_cliente_juridico()}";
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            listaHIPO= new ArrayList();
            while (res.next()){
                Prestamo_Hipotecario prestamoHipotecario = new Prestamo_Hipotecario();
                prestamoHipotecario.setId_cliente(res.getInt("id_cliente"));
                listaHIPO.add(prestamoHipotecario);
                    
                datos[0]= res.getString("cod_prestamo_hipotecario");
                datos[1]= res.getString("valor_propiedad");
                datos[2]= res.getString("ced_juridica");
                datos[3]= res.getString("nombre_Empresa");
                datos[4]= res.getString("nombre_Representante");
                datos[5]= res.getString("apellido1");
                datos[6]= res.getString("apellido2");
                datos[7]= res.getString("id_cuenta");
                
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CreditoConsulta.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoCliente = new javax.swing.JComboBox();

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

        panelReflect1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 700, 340));

        jButton3.setText("Consultar");
        panelReflect1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jButton2.setText("Borrar");
        panelReflect1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 79, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("tipo cliente");
        panelReflect1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelReflect1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula:");
        panelReflect1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, 20));
        panelReflect1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta Credito");
        panelReflect1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 20));

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelReflect1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Cliente:");
        panelReflect1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 20));

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "fisico", "juridico" }));
        jComboBoxTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoClienteActionPerformed(evt);
            }
        });
        panelReflect1.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        panelNice2.add(panelReflect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 600));

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

    private void jComboBoxTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoClienteActionPerformed
        if(jComboBoxTipoCliente.getSelectedIndex()==0){
            try {
                tipoCliente=1;
                tablaCreditoClienteFisico();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            tipoCliente=2;
            tablaCreditoClienteJuridico();
        }
    }//GEN-LAST:event_jComboBoxTipoClienteActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(CreditoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditoConsulta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBoxTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
