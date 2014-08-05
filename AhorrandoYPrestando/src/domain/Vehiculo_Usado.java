/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Vehiculo_Usado {

    private int placa;
    private int monto;
    private int plazo;
    private int cod_credito_predendario;
    
    

    public Vehiculo_Usado() {
    }

    public Vehiculo_Usado(int placa, int monto, int plazo, int cod_credito_predendario) {
        this.placa = placa;
        this.monto = monto;
        this.plazo = plazo;
        this.cod_credito_predendario = cod_credito_predendario;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getCod_credito_predendario() {
        return cod_credito_predendario;
    }

    public void setCod_credito_predendario(int cod_credito_predendario) {
        this.cod_credito_predendario = cod_credito_predendario;
    }
}
