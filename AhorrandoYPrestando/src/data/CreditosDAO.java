/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import connection.SQLServerDB;
import domain.Compra_Casa;
import domain.Compra_Lote;
import domain.Credito_Personal;
import domain.Credito_Predendario;
import domain.Hipoteca_Casa;
import domain.Prestamo_Hipotecario;
import domain.Vehiculo_Nuevo;
import domain.Vehiculo_Usado;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */
public class CreditosDAO {
     SQLServerDB bd;
     
    public void agregarCredito_personal (Credito_Personal  creditopersonal) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_CREDITO_PERSONAL_INSERTAR ("+creditopersonal.getMonto()+"','"+creditopersonal.getMoneda()+"','"+creditopersonal.getCod_cliente_fisico()+",'"
                +creditopersonal.getCod_cliente_juridico()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }       
    
   public void agregarCredito_predendario (Credito_Predendario  creditopredendario) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_CREDITO_PRENDEDARIO_INSERTAR ("+creditopredendario.getMoneda()+"','"+creditopredendario.getProposito()+"','"
               +creditopredendario.getComision()+"','" +creditopredendario.getCod_cliente_fisico()+",'"+creditopredendario.getCod_cliente_juridico()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }       
   
      public void agregarVehiculo_nuevo (Vehiculo_Nuevo  vehiculonuevo) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_VEHICULO_NUEVO_INSERTAR ("+vehiculonuevo.getCod_motor()+",'"+vehiculonuevo.getMonto()+"','"
        +vehiculonuevo.getPlazo()+",'"+vehiculonuevo.getCod_credito_predendario()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }   
   
   public void agregarVehiculo_usado (Vehiculo_Usado  vehiculousado) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_VEHICULO_USADO_INSERTAR ("+vehiculousado.getPlaca()+",'"+vehiculousado.getMonto()+"','"
        +vehiculousado.getPlazo()+",'"+vehiculousado.getCod_credito_predendario()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     } 
     
    public void agregarPrestamo_hipotecario (Prestamo_Hipotecario  prestamohipotecario) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_PRETAMO_HIPOTECARIO_INSERTAR ("+prestamohipotecario.getValor_propiedad()+",'"+prestamohipotecario.getCod_cliente_fisico()+",'"
                +prestamohipotecario.getCod_cliente_juridico()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }    
    
   public void agregarCompra_casa(Compra_Casa compracasa) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_COMPRA_CASA_INSERTAR ("+compracasa.getTopografia()+"','"+compracasa.getMonto()+"','"
                +compracasa.getUbicacion()+",'"+compracasa.getCod_compra_casa()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     } 
     
    public void agregarCompra_lote (Compra_Lote  compralote) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_COMPRA_LOTE_INSERTAR ("+compralote.getMonto()+"','"+compralote.getDireccion()+"','"
                +compralote.getTopografia()+",'"+compralote.getCod_prestamo_hipotecario()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }    
     
   public void agregarHipoteca_casa (Hipoteca_Casa  hipotecacasa) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call    PA_HIPOTECA_CASA_INSERTAR ("+hipotecacasa.getMonto()+",'"+hipotecacasa.getUbicacion()+"','"
        +hipotecacasa.getProposito()+",'"+hipotecacasa.getCod_prestamo_hipotecario()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     } 
    
}
