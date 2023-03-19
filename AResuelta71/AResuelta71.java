/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta71;

import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class AResuelta71 {

    /*Queremos una clase CuentaCorriente que nos almacene los datos (DNI y el nombre del titular, ademas del saldo).
    Crear cuenta --> DNI y nombre con saldo a 0.
    Sacar dinero --> indicar si ha sido posible llevar a cabo la operacion y si hay saldo suficiente.
    Ingresar dinero --> se incrementa el saldo.
    Mostrar informacion --> muestra la info disponible de la cuenta.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo=0;
        do {
            System.out.println("Escribe tu nombre");
            String nombre = sc.next();
            System.out.println("Introduzca su DNI");
            String dni = sc.next();
            CuentaCorriente c;
            c = new CuentaCorriente(dni, nombre);
            System.out.println("Cuanto dinero deseas ingresar");
            double dineroIngresar = sc.nextDouble();
            c.ingreso(dineroIngresar);
            System.out.println("Cuanto dinero deseas sacar: ");
            double dineroSacar = sc.nextDouble();
            c.sacar(dineroSacar);
            c.mostrarInformacion();
            
        } while (saldo > 0);
    }
}
