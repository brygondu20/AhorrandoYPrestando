package domain;

public class Credito_Personal {

    private int cod_credto_personal;
    private int moneda;
    private int monto;
    private int id_cliente;
    private int id_cuenta;
    
    

    public Credito_Personal() {
    }

    public Credito_Personal(int cod_credto_personal, int moneda, int monto, int id_cliente, int id_cuenta) {
        this.cod_credto_personal = cod_credto_personal;
        this.moneda = moneda;
        this.monto = monto;
        this.id_cliente = id_cliente;
        this.id_cuenta = id_cuenta;
    }

    public int getCod_credto_personal() {
        return cod_credto_personal;
    }

    public void setCod_credto_personal(int cod_credto_personal) {
        this.cod_credto_personal = cod_credto_personal;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
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
