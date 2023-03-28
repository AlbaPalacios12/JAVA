import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // creamos un array de tamaño 3
        int[] colores = new int[5];
        int[] numeros = new int[3];
        // asignar valores de un array a otros
        for (int i = 0; i < numeros.length; i++) {
            // colores[i] = (int) (Math.random() * colores.length);
            // numeros[i] = colores[i];

        }
        // asignamos valores aleatorios
        String cad; // sacamos el string del for
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * colores.length);
            // cambiamos el array a string

        }
        cad = Arrays.toString(numeros);
    

// comprobamos que el valor no se repita en el array
 if (numeros[i] == colores[i]) {
/numeros[i] = (int) (Math.random() * colores.length);

 //cad = Arrays.toString(numeros);
 int pos = cad.indexOf(numeros[i]);
 if (pos != -1) { //el problema es que siempre pos=-1
 
 numeros[i] = (int) (Math.random() * colores.length);
 
 }
 
 }
 }
/*
 * en la vez 52 hemos cambiado el array a string para poder usar el indexOf
 */