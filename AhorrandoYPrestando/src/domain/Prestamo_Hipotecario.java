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
    private int cod_cliente_fisico;
    private int cod_cliente_juridico;
    
    

    public Prestamo_Hipotecario() {
    }

    public Prestamo_Hipotecario(int cod_prestamo_hipotecario, int valor_propiedad, int cod_cliente_fisico, int cod_cliente_juridico) {
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
        this.valor_propiedad = valor_propiedad;
        this.cod_cliente_fisico = cod_cliente_fisico;
        this.cod_cliente_juridico = cod_cliente_juridico;
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

    public int getCod_cliente_fisico() {
        return cod_cliente_fisico;
    }

    public void setCod_cliente_fisico(int cod_cliente_fisico) {
        this.cod_cliente_fisico = cod_cliente_fisico;
    }

    public int getCod_cliente_juridico() {
        return cod_cliente_juridico;
    }

    public void setCod_cliente_juridico(int cod_cliente_juridico) {
        this.cod_cliente_juridico = cod_cliente_juridico;
    }
}
