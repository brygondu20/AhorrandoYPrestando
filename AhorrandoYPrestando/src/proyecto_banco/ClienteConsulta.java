/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_banco;

import connection.SQLServerDB;
import data.ClientesDAO;
import domain.Cliente_Fisico;
import domain.Direcciones;
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
public class ClienteConsulta extends javax.swing.JFrame {
    private  ArrayList<Cliente_Fisico>lista;
    private int tipoCliente=1;

    /**
     * Creates new form Principal
     */
    public ClienteConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public void cargarTabla() throws SQLException{
        if(tipoCliente==1){
            tablaClienteFisico();
        }else{
            tablaClienteJuridico();
        }
    }
    
    public void tablaClienteFisico() throws SQLException{
        SQLServerDB sqlServerDB= new SQLServerDB();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido1");
        modelo.addColumn("Apellido2");
        modelo.addColumn("Correo");
        modelo.addColumn("Fecha nacimiento");
        modelo.addColumn("Provincia");
        modelo.addColumn("Canton");
        modelo.addColumn("Distrito");
        modelo.addColumn("Tel 1");
        modelo.addColumn("Tel 2");
        modelo.addColumn("Tel 3");
        modelo.addColumn("Cel 1");
        modelo.addColumn("Cel 2");
        String sql = "{call PA_CONSULTAR_VIEW_CLIENTE_FISICO()}";
        ResultSet res = sqlServerDB.executeQuery(sql);
        String[] datos = new String[14];
        lista= new ArrayList();
        while (res.next()){
            Cliente_Fisico clienteFisico = new Cliente_Fisico();
            clienteFisico.setCedula(res.getInt("cedula"));
            lista.add(clienteFisico);
            
            datos[0]= res.getString("cedula");
            datos[1]= res.getString("nombre");
            datos[2]= res.getString("apellido_paterno");
            datos[3]= res.getString("apellido_materno");
            datos[4]= res.getString("correo");
            datos[5]= res.getString("fec_nacimiento");
            datos[6]= res.getString("PROVINCIA");
            datos[7]= res.getString("CANTON");
            datos[8]= res.getString("DISTRITO");
            datos[9]= res.getString("telefono1");
            datos[10]= res.getString("telefono2");
            datos[11]= res.getString("telefono3");
            datos[12]= res.getString("celular1");
            datos[13]= res.getString("celular2");
            
            modelo.addRow(datos);
        }
        jTable1.setModel(modelo);
    }
    
    public void tablaClienteJuridico(){
        try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cedula");
            modelo.addColumn("Empresa");
            modelo.addColumn("Representante");
            modelo.addColumn("Apellido1");
            modelo.addColumn("Apellido2");
            modelo.addColumn("Provincia");
            modelo.addColumn("Canton");
            modelo.addColumn("Distrito");
            modelo.addColumn("Tel 1");
            modelo.addColumn("Tel 2");
            modelo.addColumn("Tel 3");
            modelo.addColumn("Cel 1");
            modelo.addColumn("Cel 2");
            String sql = "{call PA_CONSULTAR_VIEW_cliente_juridico()}";
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            lista= new ArrayList();
            while (res.next()){
                Cliente_Fisico clienteFisico = new Cliente_Fisico();
                clienteFisico.setCedula(res.getInt("ced_juridica"));
                lista.add(clienteFisico);
                    
                datos[0]= res.getString("ced_juridica");
                datos[1]= res.getString("nombre_empresa");
                datos[2]= res.getString("nombre_representante");
                datos[3]= res.getString("apellido1");
                datos[4]= res.getString("apellido2");
                datos[5]= res.getString("PROVINCIA");
                datos[6]= res.getString("CANTON");
                datos[7]= res.getString("DISTRITO");
                datos[8]= res.getString("telefono1");
                datos[9]= res.getString("telefono2");
                datos[10]= res.getString("telefono3");
                datos[11]= res.getString("celular1");
                datos[12]= res.getString("celular2");
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
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
        jBConsultar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonAeroRight1 = new org.edisoncor.gui.button.ButtonAeroRight();
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

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        panelReflect1.add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });
        panelReflect1.add(jBBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 79, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        panelReflect1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id Cliente:");
        panelReflect1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 20));
        panelReflect1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta Cliente");
        panelReflect1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        buttonAeroRight1.setBackground(new java.awt.Color(102, 102, 102));
        buttonAeroRight1.setText("Regresar");
        buttonAeroRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRight1ActionPerformed(evt);
            }
        });
        panelReflect1.add(buttonAeroRight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente Fisico", "Cliente Juridico" }));
        jComboBoxTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoClienteActionPerformed(evt);
            }
        });
        panelReflect1.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, -1));

        panelNice2.add(panelReflect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 600));

        getContentPane().add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 940, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void buttonAeroRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroRight1ActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAeroRight1ActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        try {
            if(tipoCliente==1){
                int seleccionado= jTable1.getSelectedRow();
                int cedula = lista.get(seleccionado).getCedula();
                ClientesDAO clienteDAO = new ClientesDAO();
                clienteDAO.borrarCliente_Fisico(cedula);
                tablaClienteFisico();
            
            }else{
                int seleccionado= jTable1.getSelectedRow();
                int cedula = lista.get(seleccionado).getCedula();
                ClientesDAO clienteDAO = new ClientesDAO();
                clienteDAO.borrarCliente_Juridico(cedula);
                tablaClienteJuridico();
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        if(tipoCliente==1){
        
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido1");
            modelo.addColumn("Apellido2");
            modelo.addColumn("Correo");
            modelo.addColumn("Fecha nacimiento");
            modelo.addColumn("Provincia");
            modelo.addColumn("Canton");
            modelo.addColumn("Distrito");
            modelo.addColumn("Tel 1");
            modelo.addColumn("Tel 2");
            modelo.addColumn("Tel 3");
            modelo.addColumn("Cel 1");
            modelo.addColumn("Cel 2");

            String sql;
            if(!"".equals(txtCedula.getText())){
                sql = "{call PA_CONSULTAR_VIEW_cliente_fisico_cedula("+Integer.parseInt(txtCedula.getText())+")}";
            }else{
                sql = "{call PA_CONSULTAR_VIEW_cliente_fisico_id_cliente("+Integer.parseInt(txtIdCliente.getText())+")}";
            }
            ResultSet res;
            try {
            res = sqlServerDB.executeQuery(sql);

            String[] datos = new String[14];
            lista= new ArrayList();
            while (res.next()){
                Cliente_Fisico clienteFisico = new Cliente_Fisico();
                clienteFisico.setCedula(res.getInt("cedula"));
                lista.add(clienteFisico);

                datos[0]= res.getString("cedula");
                datos[1]= res.getString("nombre");
                datos[2]= res.getString("apellido_paterno");
                datos[3]= res.getString("apellido_materno");
                datos[4]= res.getString("correo");
                datos[5]= res.getString("fec_nacimiento");
                datos[6]= res.getString("PROVINCIA");
                datos[7]= res.getString("CANTON");
                datos[8]= res.getString("DISTRITO");
                datos[9]= res.getString("telefono1");
                datos[10]= res.getString("telefono2");
                datos[11]= res.getString("telefono3");
                datos[12]= res.getString("celular1");
                datos[13]= res.getString("celular2");

                modelo.addRow(datos);

            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(modelo);
        
        }else{
            
            try {
            SQLServerDB sqlServerDB= new SQLServerDB();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cedula");
            modelo.addColumn("Empresa");
            modelo.addColumn("Representante");
            modelo.addColumn("Apellido1");
            modelo.addColumn("Apellido2");
            modelo.addColumn("Provincia");
            modelo.addColumn("Canton");
            modelo.addColumn("Distrito");
            modelo.addColumn("Tel 1");
            modelo.addColumn("Tel 2");
            modelo.addColumn("Tel 3");
            modelo.addColumn("Cel 1");
            modelo.addColumn("Cel 2");
            
            String sql;
            if(!"".equals(txtCedula.getText())){
                sql = "{call PA_CONSULTAR_VIEW_cliente_juridico_cedula("+Integer.parseInt(txtCedula.getText())+")}";
            }else{
                sql = "{call PA_CONSULTAR_VIEW_cliente_juridico_id_cliente("+Integer.parseInt(txtIdCliente.getText())+")}";
            }
            
            ResultSet res = sqlServerDB.executeQuery(sql);
            String[] datos = new String[14];
            lista= new ArrayList();
            while (res.next()){
                Cliente_Fisico clienteFisico = new Cliente_Fisico();
                clienteFisico.setCedula(res.getInt("ced_juridica"));
                lista.add(clienteFisico);
                datos[0]= res.getString("ced_juridica");
                datos[1]= res.getString("nombre_empresa");
                datos[2]= res.getString("nombre_representante");
                datos[3]= res.getString("apellido1");
                datos[4]= res.getString("apellido2");
                datos[5]= res.getString("PROVINCIA");
                datos[6]= res.getString("CANTON");
                datos[7]= res.getString("DISTRITO");
                datos[8]= res.getString("telefono1");
                datos[9]= res.getString("telefono2");
                datos[10]= res.getString("telefono3");
                datos[11]= res.getString("celular1");
                datos[12]= res.getString("celular2");
                    
                modelo.addRow(datos);
                
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jComboBoxTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoClienteActionPerformed
        if(jComboBoxTipoCliente.getSelectedIndex()==0){
            try {
                tipoCliente=1;
                tablaClienteFisico();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteConsulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            tipoCliente=2;
            tablaClienteJuridico();
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
            java.util.logging.Logger.getLogger(ClienteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteConsulta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAeroRight buttonAeroRight1;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JComboBox jComboBoxTipoCliente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.panel.PanelAvatarChooser panelAvatarChooser1;
    private org.edisoncor.gui.panel.PanelAvatarChooser panelAvatarChooser3;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelReflect panelReflect1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}
