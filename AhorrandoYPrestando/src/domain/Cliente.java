/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Cliente {

    private int id_cliente;
    private int tipo_cliente;
    private int cedula;
    
    

    public Cliente() {
    }

    public Cliente(int id_cliente, int tipo_cliente, int cedula) {
        this.id_cliente = id_cliente;
        this.tipo_cliente = tipo_cliente;
        this.cedula = cedula;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(int tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
