import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  Colores c;
        Colores colores = new Colores();

        // para introducir un nuevo color
        String respuesta;
        do {
            System.out.println("Si quiere añadir un nuevo color a la lista de colores, escriba: true");
            respuesta = sc.next();
            if (respuesta.equals("true")) {
                System.out.println("Introduzca el color deseado: ");
                String color = sc.next();
                colores.nuevoColor(color);
            }

        } while (respuesta.equals("true"));

        System.out.println("Introduzca el numero de colores que quieres que aparezcan");
        int numColores = sc.nextInt();
        // String [] numColor= new String[numColores];
        colores.mostrarColores(numColores);
    }
}
