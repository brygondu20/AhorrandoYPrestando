package domain;


public class Cliente_Juridico {
    private int id_cliente;
    private int ced_juridica;
    private String nombre_Empresa;
    private String nombre_Representante;
    private String apellido1;
    private String apellido2;
    private String codDireccion;
    private int cod_telefono;
    
    

    public Cliente_Juridico() {
    }

    

    public Cliente_Juridico(int id_cliente, int ced_juridica, String nombre_Empresa, String nombre_Representante, String apellido1, String apellido2, String codDireccion, int cod_telefono) {
        this.id_cliente = id_cliente;
        this.ced_juridica = ced_juridica;
        this.nombre_Empresa = nombre_Empresa;
        this.nombre_Representante = nombre_Representante;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.codDireccion = codDireccion;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre_Representante() {
        return nombre_Representante;
    }

    public void setNombre_Representante(String nombre_Representante) {
        this.nombre_Representante = nombre_Representante;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    
}
