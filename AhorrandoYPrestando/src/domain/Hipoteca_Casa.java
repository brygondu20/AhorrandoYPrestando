/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Hipoteca_Casa {

    private int cod_hipoteca_casa;
    private int monto;
    private String ubicacion;
    private String proposito;
    private int cod_prestamo_hipotecario;
    
    

    public Hipoteca_Casa() {
    }

    public Hipoteca_Casa(int cod_hipoteca_casa, int monto, String ubicacion, String proposito, int cod_prestamo_hipotecario) {
        this.cod_hipoteca_casa = cod_hipoteca_casa;
        this.monto = monto;
        this.ubicacion = ubicacion;
        this.proposito = proposito;
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }

    public int getCod_hipoteca_casa() {
        return cod_hipoteca_casa;
    }

    public void setCod_hipoteca_casa(int cod_hipoteca_casa) {
        this.cod_hipoteca_casa = cod_hipoteca_casa;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public int getCod_prestamo_hipotecario() {
        return cod_prestamo_hipotecario;
    }

    public void setCod_prestamo_hipotecario(int cod_prestamo_hipotecario) {
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }
}
