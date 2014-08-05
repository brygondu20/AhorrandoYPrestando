package domain;


public class Cuenta_Ahorros {
    
    private int id_cuenta;
    private int saldo_actual;
    private int moneda;
    private int monto_min;
    private int cargo_saldo_min;
    
    

    public Cuenta_Ahorros() {
    }

    public Cuenta_Ahorros(int id_cuenta, int saldo_actual, int moneda, int monto_min, int cargo_saldo_min) {
        this.id_cuenta = id_cuenta;
        this.saldo_actual = saldo_actual;
        this.moneda = moneda;
        this.monto_min = monto_min;
        this.cargo_saldo_min = cargo_saldo_min;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public int getSaldo_actual() {
        return saldo_actual;
    }

    public int getMoneda() {
        return moneda;
    }

    public int getMonto_min() {
        return monto_min;
    }

    public int getCargo_saldo_min() {
        return cargo_saldo_min;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public void setMonto_min(int monto_min) {
        this.monto_min = monto_min;
    }

    public void setCargo_saldo_min(int cargo_saldo_min) {
        this.cargo_saldo_min = cargo_saldo_min;
    }
    
    
}
