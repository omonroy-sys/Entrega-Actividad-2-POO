public class Automóvil {

    String marca;
    int modelo;
    int motor;

    enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }
    tipoCom tipoCombustible;
    enum tipoA {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoA tipoAutomóvil;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    enum tipoColor {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }
    tipoColor color;
    int velocidadActual = 0;
    boolean automático;
    int cantidadMultas = 0;
    double valorTotalMultas = 0;
    Automóvil(String marca, int modelo, int motor, tipoCom tipoCombustible,
            tipoA tipoAutomóvil, int númeroPuertas, int cantidadAsientos,
            int velocidadMáxima, tipoColor color, boolean automático) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.automático = automático;
    }
    String getMarca() {
        return marca;
    }
    int getModelo() {
        return modelo;
    }
    int getMotor() {
        return motor;
    }
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }
    tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
    }
    int getNúmeroPuertas() {
        return númeroPuertas;
    }
    int getCantidadAsientos() {
        return cantidadAsientos;
    }
    int getVelocidadMáxima() {
        return velocidadMáxima;
    }
    tipoColor getColor() {
        return color;
    }
    int getVelocidadActual() {
        return velocidadActual;
    }
    boolean getAutomático() {
        return automático;
    }
    int getCantidadMultas() {
        return cantidadMultas;
    }
    double getValorTotalMultas() {
        return valorTotalMultas;
    }
    void setMarca(String marca) {
        this.marca = marca;
    }
    void setModelo(int modelo) {
        this.modelo = modelo;
    }
    void setMotor(int motor) {
        this.motor = motor;
    }
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }
    void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }
    void setColor(tipoColor color) {
        this.color = color;
    }
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void setAutomático(boolean automático) {
        this.automático = automático;
    }
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMáxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            cantidadMultas++;
            valorTotalMultas += 1000;
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            System.out.println("Se ha generado una multa de $1000.");
        }
    }
    void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        if (velocidadActual == 0) {
            return 0;
        }

        return (double) distancia / velocidadActual;
    }
    boolean tieneMultas() {
        return cantidadMultas > 0;
    }
    double calcularValorTotalMultas() {
        return valorTotalMultas;
    }
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
        System.out.println("Automático = " + automático);
    }
    public static void main(String[] args) {

        Automóvil auto1 = new Automóvil(
                "Ford",
                2018,
                3,
                tipoCom.DIESEL,
                tipoA.EJECUTIVO,
                5,
                6,
                250,
                tipoColor.NEGRO,
                true
        );

        auto1.imprimir();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());

        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());

        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());

        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());

        auto1.desacelerar(20);

        auto1.acelerar(300);

        System.out.println("¿Tiene multas? " + auto1.tieneMultas());
        System.out.println("Cantidad de multas = " + auto1.getCantidadMultas());
        System.out.println("Valor total de multas = $" + auto1.calcularValorTotalMultas());
    }
}
