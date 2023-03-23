/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad711;

import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class Actividad711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Marcapagina m;

        System.out.println("Introducza el numero de paginas que tiene el libro altual");
        int numPaginas = sc.nextInt();
        System.out.println("Introduzca la pagina por la que se ha quedado leyendo");
        int paginaActual = sc.nextInt();

        m = new Marcapagina(numPaginas, paginaActual);
        int eleccion;
        do {
            System.out.println("Opciones:\n1.Si ha avanzado en la lectura");
            System.out.println("2.Si desea obtener informacion de la ultima pagina leida");
            System.out.println("3.Si necesita empezar el libro por la pagina 1");
            System.out.println("Eleccion: ");
            eleccion = sc.nextInt();

            switch (eleccion) {
                case 1 ->
                    m.incrementarPaginas();
                case 2 ->
                    m.ultimaPaginaLeida();
                case 3 ->
                    m.empezarLeer();

            }

        } while (eleccion != 0);
    }
}