/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta72;

/**
 *
 * @author 34625
 */
public class AResuelta72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
CuentaCorriente c;
c = new CuentaCorriente("12345678A", "Pepe");
c.ingreso(1000);
c.sacar(300);
c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: "+ c.sacar(700));
        System.out.println("Puedo sacar 500 euros: "+ c.sacar(500));
        //PROBAMOS EL CONSTRUCTOR QUE USA EL DNI Y EL SALDO
        c = new CuentaCorriente("98765432Z", 2000);
        //el anterior queda sin referencia
        c.mostrarInformacion();
    }
    
}
