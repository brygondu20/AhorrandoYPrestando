/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import connection.SQLServerDB;
import domain.Telefonos;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */
public class TelefonoDAO {
    SQLServerDB bd;
    
    public void agregarTelefonos (Telefonos  telefono) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_TELEFONOS_INSERTAR ('"+telefono.getTelefono1()+"','"+telefono.getTelefono2()+"','"+telefono.getTelefono3()+"','"
        +telefono.getCelular1()+"','"+telefono.getCelular2()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
    
    public void actualizarTelefonos(Telefonos  telefono) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_TELEFONOS_ACTUALIZAR("+telefono.getCod_telefono()+",'"+telefono.getTelefono1()+"','"+telefono.getTelefono2()+"','"+telefono.getTelefono3()+"','"
        +telefono.getCelular1()+"','"+telefono.getCelular2()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
    
    public void codigoTelefono(Telefonos  telefono) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CONSULTAR_TELEFONOS_codigo() }";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            telefono.setCod_telefono(res.getInt("cod_telefono"));
        }
    }
        
        
        public void obtenerDatosTelefonos (Telefonos telefono) throws SQLException{
         bd =new SQLServerDB();
         String sql= "{call PA_CONSULTAR_TELEFONO('"+telefono.getCod_telefono()+"')}";
        ResultSet res =bd.executeQuery(sql);
         while(res.next()){
             telefono.setTelefono1(res.getString("telefono1"));
             telefono.setTelefono2(res.getString("telefono2"));
             telefono.setTelefono3(res.getString("telefono3"));
             telefono.setCelular1(res.getString("celular1"));
             telefono.setCelular2(res.getString("celular2"));
         }
    }
         
    }

