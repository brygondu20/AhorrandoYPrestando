
package domain;

public class Cuenta_Corriente {
    
    private int cod;
    private int saldo_actual;
    private int moneda;
    private int promedio_diario_min;
    private int cargo_saldo_min;
    
    

    public Cuenta_Corriente() {
    }

    public Cuenta_Corriente(int cod, int saldo_actual, int moneda, int promedio_diario_min, int cargo_saldo_min) {
        this.cod = cod;
        this.saldo_actual = saldo_actual;
        this.moneda = moneda;
        this.promedio_diario_min = promedio_diario_min;
        this.cargo_saldo_min = cargo_saldo_min;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getPromedio_diario_min() {
        return promedio_diario_min;
    }

    public void setPromedio_diario_min(int promedio_diario_min) {
        this.promedio_diario_min = promedio_diario_min;
    }

    public int getCargo_saldo_min() {
        return cargo_saldo_min;
    }

    public void setCargo_saldo_min(int cargo_saldo_min) {
        this.cargo_saldo_min = cargo_saldo_min;
    }
    
    
    
}
