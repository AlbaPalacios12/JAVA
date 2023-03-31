import java.util.Arrays;

public class Colores {

    // crear una cadena que se llame colores

    String[] colores = { "azul", "rojo", "verde", "amarillo", "naranja" };

    // crear un metodo que me permita ingresar un nuevo color
    public void nuevoColor(String color) {
        //hay que comprobar si el color existe
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals(color)) {
                System.out.println("El color ya existe");
                return;
            }
        }
        // si no existe, agregarlo
        colores = Arrays.copyOf(colores, colores.length + 1);
        colores[colores.length - 1] = color;
    }
    // mostrar colores al azar

    public void mostrarColores(int numColores) {
        int posicion = 0; //inicializamos el contador
        int nuevoString[] = new int[numColores]; //inicializamos el nuevo array
        // no podemos repetir ningun color   
        for (int i = 0; i < numColores; i++) {
            boolean yaRegistrado = false;
            for (int e = 0; e < numColores && !yaRegistrado; e++) {
                posicion = (int) (Math.random() * colores.length);
                if (nuevoString[e] != posicion) {
                    nuevoString[e] = posicion;
                    System.out.println(colores[posicion]);
                    yaRegistrado = true;
                    e++;
                } else {
                    if (i == 0) {
                        yaRegistrado = true;
                    } else {
                        i--;
                        yaRegistrado = true;
                    }
                }
            }
        }
    }
}
