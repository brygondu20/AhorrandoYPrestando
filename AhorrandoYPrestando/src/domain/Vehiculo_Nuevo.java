package domain;

public class Vehiculo_Nuevo {

    private int cod_motor;
    private int monto;
    private int plazo;
    private int cod_credito_predendario;
    
    

    public Vehiculo_Nuevo() {
    }

    public Vehiculo_Nuevo(int cod_motor, int monto, int plazo, int cod_credito_predendario) {
        this.cod_motor = cod_motor;
        this.monto = monto;
        this.plazo = plazo;
        this.cod_credito_predendario = cod_credito_predendario;
    }

    public int getCod_motor() {
        return cod_motor;
    }

    public void setCod_motor(int cod_motor) {
        this.cod_motor = cod_motor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getCod_credito_predendario() {
        return cod_credito_predendario;
    }

    public void setCod_credito_predendario(int cod_credito_predendario) {
        this.cod_credito_predendario = cod_credito_predendario;
    }
}
