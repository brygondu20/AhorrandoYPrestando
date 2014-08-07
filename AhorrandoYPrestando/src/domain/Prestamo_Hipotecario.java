/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Prestamo_Hipotecario {

    private int cod_prestamo_hipotecario;
    private int valor_propiedad;
    private int id_cliente;
    private int id_cuenta;
    
    

    public Prestamo_Hipotecario() {
    }

    public Prestamo_Hipotecario(int cod_prestamo_hipotecario, int valor_propiedad, int id_cliente, int id_cuenta) {
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
        this.valor_propiedad = valor_propiedad;
        this.id_cliente = id_cliente;
        this.id_cuenta = id_cuenta;
    }

    public int getCod_prestamo_hipotecario() {
        return cod_prestamo_hipotecario;
    }

    public void setCod_prestamo_hipotecario(int cod_prestamo_hipotecario) {
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }

    public int getValor_propiedad() {
        return valor_propiedad;
    }

    public void setValor_propiedad(int valor_propiedad) {
        this.valor_propiedad = valor_propiedad;
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
