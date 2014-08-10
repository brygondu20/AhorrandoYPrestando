/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import connection.SQLServerDB;
import domain.Cuenta;
import domain.Cuenta_Ahorros;
import domain.Cuenta_Corriente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class CuentasDAO {
    SQLServerDB bd;
    
    public void agregarCuenta(Cuenta cuenta) throws SQLException{
        bd = new SQLServerDB();
        String sql="{call PA_CUENTA_INSERTAR ("+cuenta.getId_cuenta()+",'"+cuenta.getTipo_cuenta()+"')}";  
        bd.callStatement(sql);
        bd.closeExecuteQuery();
    }
    
    public void agregarCuenta_ahorros(Cuenta_Ahorros cuentaahorros) throws SQLException{
        bd = new SQLServerDB();
        String sql=" {call PA_CUENTA_AHORRO_INSERTAR ("+cuentaahorros.getSaldo_actual()+","+cuentaahorros.getMoneda()+","
                +cuentaahorros.getMonto_min()+","+cuentaahorros.getCargo_saldo_min()+")}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
    
    public void actualizarCuenta_ahorros(Cuenta_Ahorros cuentaahorros) throws SQLException{
        bd = new SQLServerDB();
        String sql=" {call PA_CUENTA_AHORRO_ACTUALIZAR ("+cuentaahorros.getSaldo_actual()+","+cuentaahorros.getMoneda()+","
                +cuentaahorros.getMonto_min()+","+cuentaahorros.getCargo_saldo_min()+")}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }

    
    public void agregarCuenta_corriente(Cuenta_Corriente cuentacorriente) throws SQLException{
        bd = new SQLServerDB();
        String sql=" {call PA_CUENTA_CORRIENTE_INSERTAR ("+cuentacorriente.getSaldo_actual()+","+cuentacorriente.getMoneda()+","
        +cuentacorriente.getPromedio_diario_min()+","+cuentacorriente.getCargo_saldo_min()+")}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
    
    public void actualizarCuenta_corriente(Cuenta_Corriente cuentacorriente) throws SQLException{
        bd = new SQLServerDB();
        String sql=" {call PA_CUENTA_CORRIENTE_ACTUALIZAR ("+cuentacorriente.getSaldo_actual()+","+cuentacorriente.getMoneda()+","
        +cuentacorriente.getPromedio_diario_min()+","+cuentacorriente.getCargo_saldo_min()+")}";
        bd.callStatement(sql);
        bd.closeExecuteQuery();
     }
    
    
    
    public int ultimoIdAhorros() throws SQLException{
        bd =new SQLServerDB();
        String sql="{call PA_CONSULTAR_CUENTA_AHORROS_ultimo_id()}";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            return res.getInt("id_cuenta")+1;
        }
        return 0;
     }
    
    
    public int ultimoIdCorriente() throws SQLException{
        bd =new SQLServerDB();
        String sql="{call PA_CONSULTAR_CUENTA_CORRIENTE_ultimo_id()}";
        ResultSet res =bd.executeQuery(sql);
        while(res.next()){
            return res.getInt("id_cuenta")+1;
        }
        return 0;
     }
    
    
}
