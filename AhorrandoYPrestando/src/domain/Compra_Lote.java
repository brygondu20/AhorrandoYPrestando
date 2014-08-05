/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Compra_Lote {

    private int cod_prestamo_lote;
    private int monto;
    private String direccion;
    private int topografia;
    private int cod_prestamo_hipotecario;
    
    

    public Compra_Lote() {
    }

    public Compra_Lote(int cod_prestamo_lote, int monto, String direccion, int topografia, int cod_prestamo_hipotecario) {
        this.cod_prestamo_lote = cod_prestamo_lote;
        this.monto = monto;
        this.direccion = direccion;
        this.topografia = topografia;
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }

    public int getCod_prestamo_lote() {
        return cod_prestamo_lote;
    }

    public void setCod_prestamo_lote(int cod_prestamo_lote) {
        this.cod_prestamo_lote = cod_prestamo_lote;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTopografia() {
        return topografia;
    }

    public void setTopografia(int topografia) {
        this.topografia = topografia;
    }

    public int getCod_prestamo_hipotecario() {
        return cod_prestamo_hipotecario;
    }

    public void setCod_prestamo_hipotecario(int cod_prestamo_hipotecario) {
        this.cod_prestamo_hipotecario = cod_prestamo_hipotecario;
    }
}
