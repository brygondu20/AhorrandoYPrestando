/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import data.ClientesDAO;
import data.TelefonoDAO;
import domain.Cliente;
import domain.Cliente_Cuenta;
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
    
    public void agregarCliente(Cliente cliente)throws SQLException, Exception{
       clientesDAO.agregarCliente(cliente);
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
        clientesDAO.actualizarCliente_Fisico(cliente_Fisico);
        
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
    
    public void agregarCliente_Cuenta(Cliente_Cuenta  cliente_Cuenta)throws SQLException, Exception{
       clientesDAO.agregarCliente_cuenta(cliente_Cuenta);
    }
    
}
