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
    
    /*public void agregarCliente(Cliente cliente)throws SQLException, Exception{
        
    }
    
    public void agregarCreditoPersonal(Credito_Personal credito_Personal)throws SQLException, Exception{
        if (!(creditoDAO.existeCliente_Fisico(credito_Personal))){
            credito_Personal.setId_cliente(creditoDAO.ultimoID());
            creditoDAO.agregarCliente_fisico(credito_Personal);
        }else{
            throw new Exception("El cliente fisico ya existe en la base de datos");
        }
    }
    
    public void actualizarClienteFisico(Cliente_Fisico cliente_Fisico)throws SQLException, Exception{
        if (!(clientesDAO.existeCliente_Fisico(cliente_Fisico))){
            throw new Exception("El cliente fisico no existe en la base de datos");
        }else{
            clientesDAO.actualizarCliente_Fisico(cliente_Fisico);
        }
        
    }
    
    public void agregarClienteJuridico(Cliente_Juridico cliente_Juridico)throws SQLException, Exception{
        if (!(clientesDAO.existeCliente_Juridico(cliente_Juridico))){
            clientesDAO.agregarCliente_juridico(cliente_Juridico);
        }else{
            throw new Exception("El cliente juridico ya existe en la base de datos");
        }
    }
    
    public void actualizarClienteJuridico(Cliente_Juridico cliente_Juridico)throws SQLException, Exception{
        if (!(clientesDAO.existeCliente_Juridico(cliente_Juridico))){
            throw new Exception("El cliente no existe en la base de datos");
        }else{
            clientesDAO.actualizarCliente_Juridico(cliente_Juridico);
        }
        
    }*/
   
}
