import java.util.Scanner;

//creamos un programa que nos devuelva el cambio de monedas y billetes
public class App {

    public static void main(String[] args) {
        // lo primero es introducir el precio
        double precio = (5.36);
        // lo segundo es introducir la cantidad que se paga
        double cantidad = (10);
        // tercero, se nos calcula el cambio
        double importe = cantidad - precio;
        // ahora creamos un metodo para mostrar el cambio
        final Cambio c = new Cambio();
        c.devolverCambio(importe);
        System.out.println(c.devolverCambio(importe));

    }
}
