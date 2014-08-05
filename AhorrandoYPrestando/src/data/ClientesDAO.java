/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import connection.SQLServerDB;
import domain.Cliente;
import domain.Cliente_Cuenta;
import domain.Cliente_Fisico;
import domain.Cliente_Juridico;
import domain.Padron;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ClientesDAO {
     SQLServerDB bd;
     
     
       public void agregarCliente(Cliente cliente) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CLIENTE_INSERTAR ("+cliente.getTipo_cliente()+")}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
       
     public void agregarCliente_fisico(Cliente_Fisico clienteFisico) throws SQLException{
        bd = new SQLServerDB();
        String sql=" {call PA_CLIENTE_FISICO_INSERTAR ("+clienteFisico.getId_cliente()+","+clienteFisico.getCedula()+",'"+clienteFisico.getNombre()+"','"+clienteFisico.getApellido1()+"','"+clienteFisico.getApellido2()+"',"
                + "'"+clienteFisico.getCodDireccion()+"',"+clienteFisico.getCod_telefonos()+",'"+clienteFisico.getCorreo()+"','"+clienteFisico.getFec_nacimiento()+"')}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
            
     public void agregarCliente_juridico(Cliente_Juridico clienteJuridico) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CLIENTE_JURIDICO_INSERTAR ("+clienteJuridico.getCed_juridica()+",'"+clienteJuridico.getNombre_Empresa()+"','"
                +clienteJuridico.getCodDireccion()+",'"+clienteJuridico.getCod_telefono()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
        
     
     public void agregarCliente_cuenta(Cliente_Cuenta clienteCuenta) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CLIENTE_CUENTA_INSERTAR ("+clienteCuenta.getId_cliente()+","+clienteCuenta.getId_cuenta()+")}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
     
     
     
     
     public void obtenerDatos(Padron padron) throws SQLException{
         bd =new SQLServerDB();
         String sql= "{call PA_CONSULTAR_PADRON('"+padron.getCEDULA()+"')}";
        ResultSet res =bd.executeQuery(sql);
         while(res.next()){
             padron.setNOMBRE(res.getString("nombre"));
             padron.setAPELLIDO_1(res.getString("APELLIDO_1"));
             padron.setAPELLIDO_2(res.getString("APELLIDO_2"));
             padron.setCODELEC(res.getString("CODELEC"));
         }
    }
     
     
     public int idClienteFisico(int cedula) throws SQLException{
        bd =new SQLServerDB();
        String sql="{call PA_CONSULTAR_CLIENTE_FISICO_id_cliente("+cedula+")}";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            return res.getInt("id_cliente");
        }
        return 0;
         
     }
     
     
     public int ultimoID() throws SQLException{
        bd =new SQLServerDB();
        String sql="{call PA_CONSULTAR_CLIENTE_ultimo_id()}";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            return res.getInt("id_cliente");
        }
        return 0;
         
     }
   
}
