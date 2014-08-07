package domain;

public class Credito_Predendario {

    private int cod_credito_predendario;
    private int moneda;
    private String proposito;
    private int comision;
    private int id_cliente;
    private int id_cuenta;
    
    

    public Credito_Predendario() {
    }

    public Credito_Predendario(int cod_credito_predendario, int moneda, String proposito, int comision, int id_cliente, int id_cuenta) {
        this.cod_credito_predendario = cod_credito_predendario;
        this.moneda = moneda;
        this.proposito = proposito;
        this.comision = comision;
        this.id_cliente = id_cliente;
        this.id_cuenta = id_cuenta;
    }

    public int getCod_credito_predendario() {
        return cod_credito_predendario;
    }

    public void setCod_credito_predendario(int cod_credito_predendario) {
        this.cod_credito_predendario = cod_credito_predendario;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
}
