/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author william
 */
public class Cliente_Cuenta {
    private int id_cliente;
    private int id_cuenta;

    public Cliente_Cuenta() {
    }

    public Cliente_Cuenta(int id_cliente, int id_cuenta) {
        this.id_cliente = id_cliente;
        this.id_cuenta = id_cuenta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    
    
    
}
