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
    
    
    
    public void codigoTelefono(Telefonos  telefono) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CONSULTAR_TELEFONOS_codigo() }";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            telefono.setCod_telefono(res.getInt("cod_telefono"));
        }
         
    }
}
