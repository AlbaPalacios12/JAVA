/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta76;

import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class AResuelta76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        System.out.println("Hora: ");
        int valor = sc.nextInt();
        h.setHora(valor);
        System.out.println("Minuto: ");
        valor = sc.nextInt();
        h.setMinuto(valor);
        System.out.println("Segundo: ");
        valor = sc.nextInt();
        h.setSegundo(valor);
        System.out.println("Cuantos segundos quiere mostrar: ");
        int numSegundos = sc.nextInt();
        for (int i = 0; i <= numSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementaSegundo();
        }
    }

}
