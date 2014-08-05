package domain;


public class Cliente_Juridico {
    
    private int ced_juridica;
    private String nombre_Empresa;
    private String codDireccion;
    private int cod_telefono;
    
    

    public Cliente_Juridico() {
    }

    public Cliente_Juridico(int ced_juridica, String nombre_Empresa, String direccion, int cod_telefono) {
        this.ced_juridica = ced_juridica;
        this.nombre_Empresa = nombre_Empresa;
        this.codDireccion = direccion;
        this.cod_telefono = cod_telefono;
    }

    public int getCed_juridica() {
        return ced_juridica;
    }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public String getCodDireccion() {
        return codDireccion;
    }

    

    public void setCed_juridica(int ced_juridica) {
        this.ced_juridica = ced_juridica;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        this.nombre_Empresa = nombre_Empresa;
    }

    public void setCodDireccion(String codDireccion) {
        this.codDireccion = codDireccion;
    }

    public int getCod_telefono() {
        return cod_telefono;
    }

    public void setCod_telefono(int cod_telefono) {
        this.cod_telefono = cod_telefono;
    }

    
  
    
}
