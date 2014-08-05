package domain;

public class Credito_Personal {

    private int cod_credto_personal;
    private int moneda;
    private int monto;
    private int cod_cliente_fisico;
    private int cod_cliente_juridico;
    
    

    public Credito_Personal() {
    }

    public Credito_Personal(int cod_credto_personal, int moneda, int monto, int cod_cliente_fisico, int cod_cliente_juridico) {
        this.cod_credto_personal = cod_credto_personal;
        this.moneda = moneda;
        this.monto = monto;
        this.cod_cliente_fisico = cod_cliente_fisico;
        this.cod_cliente_juridico = cod_cliente_juridico;
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

    public int getCod_cliente_fisico() {
        return cod_cliente_fisico;
    }

    public void setCod_cliente_fisico(int cod_cliente_fisico) {
        this.cod_cliente_fisico = cod_cliente_fisico;
    }

    public int getCod_cliente_juridico() {
        return cod_cliente_juridico;
    }

    public void setCod_cliente_juridico(int cod_cliente_juridico) {
        this.cod_cliente_juridico = cod_cliente_juridico;
    }
}
