/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import connection.SQLServerDB;
import domain.Direcciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author william
 */
public class DireccionesDAO {
    SQLServerDB bd;
    
    

    public DireccionesDAO() {
    }
    
    public ArrayList obtenerCanton(String provincia) throws SQLException{
        
        bd =new SQLServerDB();
        String sql= "{call PA_CONSULTAR_DIRECCIONES_CANTON('"+provincia+"')}";
        ResultSet res =bd.executeQuery(sql);
        ArrayList<Direcciones> a= new ArrayList();
        while(res.next()){
            Direcciones direccion= new Direcciones();
            direccion.setCANTON(res.getString("canton").trim());
            a.add(direccion);
        }
        bd.closeExecuteQuery();
        return a;
        
    }
    
    
    
    public ArrayList obtenerDistrito(String provincia, String canton) throws SQLException{
        
        bd =new SQLServerDB();
        String sql= "{call PA_CONSULTAR_DIRECCIONES_DISTRITO('"+provincia+"','"+canton+"')}";
        ResultSet res =bd.executeQuery(sql);
        ArrayList<Direcciones> a= new ArrayList();
        while(res.next()){
            Direcciones direccion= new Direcciones();
            direccion.setDISTRITO(res.getString("distrito").trim());
            a.add(direccion);
        }
        bd.closeExecuteQuery();
        return a;
        
        
        
    }
    
    
    public void obtenerDireccion(Direcciones direccion) throws SQLException{
        bd =new SQLServerDB();
        String sql= "{call PA_CONSULTAR_DIRECCIONES_CODIGO('"+direccion.getPROVINCIA()+"','"+direccion.getCANTON()+"','"+direccion.getDISTRITO()+"' )}";
        ResultSet res =bd.executeQuery(sql);
         while(res.next()){
             direccion.setCod_direccion(res.getString("cod_direccion"));
         }
         bd.closeExecuteQuery();
    }
    
    
    public void consultarDireccion(Direcciones direccion) throws SQLException{
        bd =new SQLServerDB();
        String sql ="{call PA_CONSULTAR_Direccion('"+direccion.getCod_direccion()+"')}";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
             direccion.setPROVINCIA(res.getString("provincia"));
             direccion.setCANTON(res.getString("canton"));
             direccion.setDISTRITO(res.getString("distrito"));
        }
        bd.closeExecuteQuery();
    }
    
}
