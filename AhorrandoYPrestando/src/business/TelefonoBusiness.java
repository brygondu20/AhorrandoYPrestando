/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import data.TelefonoDAO;
import domain.Telefonos;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class TelefonoBusiness {
    
    TelefonoDAO telefonoDAO;
    
    public TelefonoBusiness(){
        this.telefonoDAO = new TelefonoDAO();
    }
    
    public void agregarTelefonos(Telefonos telefonos)throws SQLException, Exception{
        telefonoDAO.agregarTelefonos(telefonos);
        telefonoDAO.codigoTelefono(telefonos);
    }
}
