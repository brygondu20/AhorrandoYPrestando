package domain;

public class Credito_Predendario {

    private int cod_credito_predendario;
    private int moneda;
    private String proposito;
    private int comision;
    private int cod_cliente_fisico;
    private int cod_cliente_juridico;
    
    

    public Credito_Predendario() {
    }

    public Credito_Predendario(int cod_credito_predendario, int moneda, String proposito, int comision, int cod_cliente_fisico, int cod_cliente_juridico) {
        this.cod_credito_predendario = cod_credito_predendario;
        this.moneda = moneda;
        this.proposito = proposito;
        this.comision = comision;
        this.cod_cliente_fisico = cod_cliente_fisico;
        this.cod_cliente_juridico = cod_cliente_juridico;
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
