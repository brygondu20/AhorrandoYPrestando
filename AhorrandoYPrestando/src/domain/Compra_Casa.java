/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Compra_Casa {

    private int cod_compra_casa;
    private int topografia;
    private int monto;
    private String ubicacion;
    private int cod_prestamo_hipotecario;
    
    

    public Compra_Casa() {
    }

    public Compra_Casa(int cod_compra_casa, int topografia, int monto, String ubicacion, int cod_prestamo_hipotecario) {
        this.cod_compra_casa = cod_compra_casa;
        this.topografia = topografia;
        this.monto = monto;
        this.ubicacion = ubicacion;
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }

    public int getCod_compra_casa() {
        return cod_compra_casa;
    }

    public void setCod_compra_casa(int cod_compra_casa) {
        this.cod_compra_casa = cod_compra_casa;
    }

    public int getTopografia() {
        return topografia;
    }

    public void setTopografia(int topografia) {
        this.topografia = topografia;
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

    public int getCod_prestamo_hipotecario() {
        return cod_prestamo_hipotecario;
    }

    public void setCod_prestamo_hipotecario(int cod_prestamo_hipotecario) {
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }
}
