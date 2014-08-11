/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import data.CuentasDAO;
import domain.Cuenta;
import domain.Cuenta_Ahorros;
import domain.Cuenta_Corriente;
import java.sql.SQLException;
import proyecto_banco.CuentaCorriente;

/**
 *
 * @author Carlosg
 */
public class CuentasBusiness {

    
    private CuentasDAO cuentasDAO;
    
    public CuentasBusiness(){
        this.cuentasDAO = new CuentasDAO();
    }
    
    public void agregarCuenta(Cuenta cuenta)throws SQLException, Exception{
        cuentasDAO.agregarCuenta(cuenta);
    }
    
    public void agregarCuentaCorriente(Cuenta_Corriente cuenta_Corriente)throws SQLException, Exception{
        
        cuenta_Corriente.setCod(cuentasDAO.ultimoIdCorriente());
        cuentasDAO.agregarCuenta_corriente(cuenta_Corriente);
        
    }
    
    public void actualizarCuentaCorriente(Cuenta_Corriente cuenta_Corriente)throws SQLException, Exception{
        cuentasDAO.actualizarCuenta_corriente(cuenta_Corriente);
        
    }
    
    public void agregarCuentaAhorro(Cuenta_Ahorros cuenta_Ahorros)throws SQLException, Exception{
        cuenta_Ahorros.setId_cuenta(cuentasDAO.ultimoIdCorriente());
        cuentasDAO.agregarCuenta_ahorros(cuenta_Ahorros);
    }
    
    public void actualizarCuentaCorriente(Cuenta_Ahorros cuenta_Ahorros)throws SQLException, Exception{
        cuentasDAO.agregarCuenta_ahorros(cuenta_Ahorros);
    }
        
    
}
