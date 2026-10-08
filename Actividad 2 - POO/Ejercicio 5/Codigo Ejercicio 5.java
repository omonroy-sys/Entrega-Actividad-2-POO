public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int númeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    float porcentajeInteresMensual;

    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta, float porcentajeInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + númeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Porcentaje de interés mensual = " + porcentajeInteresMensual + "%");
    }

    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }

    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }

    void aplicarInteresMensual() {
        saldo = saldo + (saldo * (porcentajeInteresMensual / 100));
        System.out.println("Se ha aplicado el interés mensual del " + porcentajeInteresMensual + "%. El nuevo saldo es $" + saldo);
    }

    public static void main(String args[]) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789, tipo.AHORROS, 1.5f);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.aplicarInteresMensual();
        cuenta.consultarSaldo();
    }
}