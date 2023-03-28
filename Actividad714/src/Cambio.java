import java.lang.reflect.Array;

public class Cambio {
    private Array billetes;
    private double monedas;

    public Double devolverCambio(double importe) {
        int[] billetes = { 500, 200, 100, 50, 20, 10, 5 };
        double[] monedas = { 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
        // variable para recorrer el arreglo de billetes
        double resto = 0;
        // array para guardas las monedas del cambio
        double monedasCambio[] = new double[monedas.length];
        if (importe < 5) {
            for (int i = 0; i < monedas.length; i++) {
                System.out.println(monedas[i]);
                // mientras el importe se pueda seguir dividiendo
                while (importe > monedas[i]) {
                    resto = importe - monedas[i];
                    monedasCambio[i] = monedas[i];
                    importe = resto;

                }
                return resto;
            }
            for (int i = 0; i < billetes.length; i++) {

            }
            return resto;

        }
        return resto;

    }
}
