/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Padron {

    private String CEDULA;
    private String CODELEC;
    private int SEXO;
    private String NOMBRE;
    private String APELLIDO_1;
    private String APELLIDO_2;
    
    

    public Padron(String CEDULA, String CODELEC, int SEXO,  String NOMBRE, String APELLIDO_1, String APELLIDO_2) {
        this.CEDULA = CEDULA;
        this.CODELEC = CODELEC;
        this.SEXO = SEXO;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_1 = APELLIDO_1;
        this.APELLIDO_2 = APELLIDO_2;
    }

    

    public Padron() {
    }

    public String getCEDULA() {
        return CEDULA;
    }

    public void setCEDULA(String CEDULA) {
        this.CEDULA = CEDULA;
    }

    public String getCODELEC() {
        return CODELEC;
    }

    public void setCODELEC(String CODELEC) {
        this.CODELEC = CODELEC;
    }

    public int getSEXO() {
        return SEXO;
    }

    public void setSEXO(int SEXO) {
        this.SEXO = SEXO;
    }

   

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO_1() {
        return APELLIDO_1;
    }

    public void setAPELLIDO_1(String APELLIDO_1) {
        this.APELLIDO_1 = APELLIDO_1;
    }

    public String getAPELLIDO_2() {
        return APELLIDO_2;
    }

    public void setAPELLIDO_2(String APELLIDO_2) {
        this.APELLIDO_2 = APELLIDO_2;
    }
}
