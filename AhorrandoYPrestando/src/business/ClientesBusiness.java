/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import data.ClientesDAO;
import data.TelefonoDAO;
import domain.Cliente_Fisico;
import domain.Cliente_Juridico;
import domain.Telefonos;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class ClientesBusiness {

    private ClientesDAO clientesDAO;
    private TelefonoDAO telDAO;
    
    public ClientesBusiness(){
        this.clientesDAO = new ClientesDAO();
        this.telDAO = new TelefonoDAO();
    }
    
    public void agregarClienteFisico(Cliente_Fisico cliente_Fisico)throws SQLException, Exception{
        if (!(clientesDAO.existeCliente_Fisico(cliente_Fisico))){
            cliente_Fisico.setId_cliente(clientesDAO.ultimoID());
            clientesDAO.agregarCliente_fisico(cliente_Fisico);
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
        
    }
    public void agregarTelefonos(Telefonos telefonos)throws SQLException, Exception{
        telDAO.agregarTelefonos(telefonos);
        telDAO.codigoTelefono(telefonos);
    }
    
    
   
}
