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
                +",'"+clienteJuridico.getApellido1()+"','"+",'"+clienteJuridico.getApellido2()+"','"
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
        bd = new SQLServerDB();
        String sql="{call PA_CONSULTAR_CLIENTE_ultimo_id()}";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            return res.getInt("id_cliente");
        }
        return 0;
         
     }
     
     /**
     * ************UPDATES*************
     */
    public void actualizarCliente_Fisico(Cliente_Fisico clienteFisico) throws SQLException {
        bd = new SQLServerDB();
        String sql = " {call PA_MODIFICAR_Cliente_Fisico (" + clienteFisico.getId_cliente() + "," + clienteFisico.getCedula() + ",'" + clienteFisico.getNombre() + "','" + clienteFisico.getApellido1() + "','" + clienteFisico.getApellido2() + "',"
                + "'" + clienteFisico.getCodDireccion() + "'," + clienteFisico.getCod_telefonos() + ",'" + clienteFisico.getCorreo() + "','" + clienteFisico.getFec_nacimiento() + "')}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
    }

    public void actualizarCliente_Juridico(Cliente_Juridico clienteJuridico) throws SQLException {
        bd = new SQLServerDB();
        String sql = "{call PA_MODIFICAR_Cliente_Juridico (" + clienteJuridico.getCed_juridica() + ",'" + clienteJuridico.getNombre_Empresa() + "','"
                + clienteJuridico.getCodDireccion() + ",'" + clienteJuridico.getCod_telefono() + "')}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
    }
    
    /************************Eliminados**********************************/
 
     public void borrarCliente_Fisico(Cliente_Fisico clienteFisico) throws SQLException{
        bd = new SQLServerDB();
        String sql=" {call PA_CONSULTAR_ELIMINAR_Cliente_Fisico ("+clienteFisico.getCedula()+"')}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
     
     public void borrarCliente_Juridico(Cliente_Juridico clienteJuridico) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CONSULTAR_ELIMINAR_Cliente_Juridico ("+clienteJuridico.getCed_juridica()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }

    /***************CONSULTAR**************/
     
    public void consultarCliente_Fisico(Cliente_Fisico clienteFisico) throws SQLException {
        bd = new SQLServerDB();
        String sql = " {call PA_CONSULTAR_TODO_CLIENTE_FISICO (" + clienteFisico.getId_cliente() + "," + clienteFisico.getCedula() + ",'" + clienteFisico.getNombre() + "','" + clienteFisico.getApellido1() + "','" + clienteFisico.getApellido2() + "',"
                + "'" + clienteFisico.getCodDireccion() + "'," + clienteFisico.getCod_telefonos() + ",'" + clienteFisico.getCorreo() + "','" + clienteFisico.getFec_nacimiento() + "')}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
    }

    public void consultarCliente_Juridico(Cliente_Juridico clienteJuridico) throws SQLException {
        bd = new SQLServerDB();
        String sql = "{call PA_CONSULTAR_TODO_CLIENTE_Juridico (" + clienteJuridico.getCed_juridica() + ",'" + clienteJuridico.getNombre_Empresa() + "','"
                + clienteJuridico.getCodDireccion() + ",'" + clienteJuridico.getCod_telefono() + "')}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
    }
    
    /************************Comprobacion de Clientes**********************************/
     
     public boolean existeCliente_Fisico(Cliente_Fisico cliente_Fisico)throws SQLException{
        boolean exist = false;
        bd= new SQLServerDB();
        String sql= "{call PA_CONSULATAR_ID_Cliente_Fisico("+cliente_Fisico.getCedula()+")}";
        ResultSet res = bd.executeQuery(sql);
        if (res.next()){
            exist = true;
        }
        bd.closeExecuteQuery();
        return exist;
    }
   
     public boolean existeCliente_Juridico(Cliente_Juridico cliente_Juridico)throws SQLException{
        boolean exist = false;
        bd= new SQLServerDB();
        String sql= "{call PA_CONSULATAR_ID_Cliente_Juridico("+cliente_Juridico.getCed_juridica()+")}";
        ResultSet res = bd.executeQuery(sql);
        if (res.next()){
            exist = true;
        }
        bd.closeExecuteQuery();
        return exist;
    }
}
