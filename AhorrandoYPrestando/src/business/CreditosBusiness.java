/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import data.CreditosDAO;

/**
 *
 * @author Administrador
 */
public class CreditosBusiness {

    private CreditosDAO creditoDAO;
    
    public CreditosBusiness(){
        this.creditoDAO = new CreditosDAO();
    }
    
    
   
}
