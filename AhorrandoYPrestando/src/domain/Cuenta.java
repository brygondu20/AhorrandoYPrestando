/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Cuenta {

    private int id_cuenta;
    private int tipo_cuenta;
    
    

    public Cuenta() {
    }

    public Cuenta(int id_cuenta, int tipo_cuenta) {
        this.id_cuenta = id_cuenta;
        this.tipo_cuenta = tipo_cuenta;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(int tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }
}
