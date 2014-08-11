/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import data.ClientesDAO;
import data.CreditosDAO;
import data.TelefonoDAO;
import domain.Cliente;
import domain.Cliente_Fisico;
import domain.Cliente_Juridico;
import domain.Credito_Personal;
import domain.Credito_Predendario;
import domain.Prestamo_Hipotecario;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class CreditosBusiness {

    private CreditosDAO creditoDAO;
    
    public CreditosBusiness(){
        this.creditoDAO = new CreditosDAO();
    }
    
    public void agregarCliente(Cliente cliente)throws SQLException, Exception{
        
    }
    
    public void agregarCreditoPersonal(Credito_Personal credito_Personal)throws SQLException, Exception{
        creditoDAO.agregarCredito_personal(credito_Personal);
        
    }
    
    public void agregarCreditoPrendario(Credito_Predendario credito_Predendario)throws SQLException, Exception{
        creditoDAO.agregarCredito_predendario(credito_Predendario);
        
    }
    
    public void agregarCreditoHipotecario(Prestamo_Hipotecario prestamo_Hipotecario)throws SQLException, Exception{
        creditoDAO.agregarPrestamo_hipotecario(prestamo_Hipotecario);
        
    }
   
}
