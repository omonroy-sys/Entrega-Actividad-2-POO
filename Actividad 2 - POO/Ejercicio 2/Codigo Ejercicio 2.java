public class Planeta {
    String nombre = null;
    int cantidadSatélites = 0;
    double masa = 0;
    double volumen = 0;
    int diámetro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
    tipoPlaneta tipo;
    boolean esObservable = false;
    double periodoOrbital = 0;
    double periodoRotacion = 0;
    Planeta(String nombre, int cantidadSatélites, double masa,
            double volumen, int diámetro, int distanciaSol,
            tipoPlaneta tipo, boolean esObservable,
            double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatélites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diámetro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Periodo orbital = " + periodoOrbital + " años");
        System.out.println("Periodo de rotación = " + periodoRotacion + " días");
    }
    double calcularDensidad() {
        return masa / volumen;
    }
    boolean esPlanetaExterior() {
        double límite = 149597870 * 3.4;

        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Planeta p1 = new Planeta(
                "Tierra",
                1,
                5.9736E24,
                1.08321E12,
                12742,
                150000000,
                tipoPlaneta.TERRESTRE,
                true,
                1.0,
                1.0
        );

        p1.imprimir();

        System.out.println("Densidad del planeta = " +
                p1.calcularDensidad());

        System.out.println("Es planeta exterior = " +
                p1.esPlanetaExterior());

        System.out.println();

        Planeta p2 = new Planeta(
                "Júpiter",
                79,
                1.899E27,
                1.4313E15,
                139820,
                750000000,
                tipoPlaneta.GASEOSO,
                true,
                11.86,
                0.41
        );

        p2.imprimir();

        System.out.println("Densidad del planeta = " +
                p2.calcularDensidad());

        System.out.println("Es planeta exterior = " +
                p2.esPlanetaExterior());
    }
}
