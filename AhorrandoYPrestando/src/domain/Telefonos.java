/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Telefonos {

    private int cod_telefono;
    private String telefono1;
    private String telefono2;
    private String telefono3;
    private String celular1;
    private String celular2;
    
    

    public Telefonos() {
    }

    public Telefonos(int cod_telefono, String telefono1, String telefono2, String telefono3, String celular1, String celular2) {
        this.cod_telefono = cod_telefono;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.telefono3 = telefono3;
        this.celular1 = celular1;
        this.celular2 = celular2;
    }

    public int getCod_telefono() {
        return cod_telefono;
    }

    public void setCod_telefono(int cod_telefono) {
        this.cod_telefono = cod_telefono;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }
}
