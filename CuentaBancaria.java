import java.util.Scanner;

public class CuentaBancaria {
    // Propiedades
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "No asignado";
    }

    // 2. Constructor parametrizado (2 parámetros)
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; // Se inicializa en 0 por defecto
    }

    // 3. Constructor sobrecargado (3 parámetros)
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método toString para mostrar los detalles
    @Override
    public String toString() {
        return "RESUMEN DE CUENTA:\n" +
                "Nº Cuenta: " + numeroCuenta + "\n" +
                "Tipo: " + tipoCuenta + "\n" +
                "Saldo Actual: $" + saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Apertura de Cuenta Bancaria ---");

        System.out.print("Ingrese el número de cuenta: ");
        String num = sc.nextLine();

        System.out.print("Ingrese el tipo de cuenta (Ahorros/Corriente): ");
        String tipo = sc.nextLine();

        System.out.print("¿Desea realizar un depósito inicial? (si/no): ");
        String respuesta = sc.nextLine();

        CuentaBancaria cuenta;

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el monto del saldo inicial: ");
            double saldoInicial = sc.nextDouble();
            // Usamos el constructor de 3 parámetros
            cuenta = new CuentaBancaria(num, saldoInicial, tipo);
        } else {
            // Usamos el constructor de 2 parámetros (saldo será 0.0)
            cuenta = new CuentaBancaria(num, tipo);
        }

        System.out.println("\n" + cuenta.toString());

        sc.close();
    }
}