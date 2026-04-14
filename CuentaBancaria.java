public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // 2. Constructor parametrizado (2 parámetros)
    // Útil cuando abres una cuenta sin depósito inicial
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; // Saldo inicial predeterminado
    }

    // 3. Constructor sobrecargado (3 parámetros)
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Tipo: " + tipoCuenta + " | Saldo: $" + saldo);
    }
}