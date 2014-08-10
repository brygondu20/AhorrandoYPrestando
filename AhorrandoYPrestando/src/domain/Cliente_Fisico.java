package domain;

public class Cliente_Fisico{
    private int id_cliente;
    private int Cedula;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String codDireccion;
    private int cod_telefonos;
    private String correo;
    private String fec_nacimiento;
    
    public Cliente_Fisico() {
    }


    public Cliente_Fisico(int id_cliente, int Cedula, String Nombre, String Apellido1, String Apellido2, String codDireccion, int cod_telefonos, String correo, String fec_nacimiento) {
        this.id_cliente = id_cliente;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.codDireccion = codDireccion;
        this.cod_telefonos = cod_telefonos;
        this.correo = correo;
        this.fec_nacimiento = fec_nacimiento;
    }
    

    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getCodDireccion() {
        return codDireccion;
    }

   

    public String getCorreo() {
        return correo;
    }

    public String getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public void setCodDireccion(String codDireccion) {
        this.codDireccion = codDireccion;
    }

   
    

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFec_nacimiento(String fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public int getCod_telefonos() {
        return cod_telefonos;
    }

    public void setCod_telefonos(int cod_telefonos) {
        this.cod_telefonos = cod_telefonos;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
    
    
}


