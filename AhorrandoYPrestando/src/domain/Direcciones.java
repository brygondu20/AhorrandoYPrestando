/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Direcciones {

    private String cod_direccion;
    private String PROVINCIA;
    private String CANTON;
    private String DISTRITO;
    
    

    public Direcciones() {
    }

    public Direcciones(String cod_direccion, String PROVINCIA, String CANTON, String DISTRITO) {
        this.cod_direccion = cod_direccion;
        this.PROVINCIA = PROVINCIA;
        this.CANTON = CANTON;
        this.DISTRITO = DISTRITO;
    }

    public String getCod_direccion() {
        return cod_direccion;
    }

    public void setCod_direccion(String cod_direccion) {
        this.cod_direccion = cod_direccion;
    }

    public String getPROVINCIA() {
        return PROVINCIA;
    }

    public void setPROVINCIA(String PROVINCIA) {
        this.PROVINCIA = PROVINCIA;
    }

    public String getCANTON() {
        return CANTON;
    }

    public void setCANTON(String CANTON) {
        this.CANTON = CANTON;
    }

    public String getDISTRITO() {
        return DISTRITO;
    }

    public void setDISTRITO(String DISTRITO) {
        this.DISTRITO = DISTRITO;
    }
}
