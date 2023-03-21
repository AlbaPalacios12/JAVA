/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta75;

/**
 *
 * @author 34625
 */
public class AResuelta75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
CuentaCorriente c1, c2, c3;
//se crean dos gestores
Gestor g1= new Gestor("Antonio Gonzalez", "666555444");
Gestor g2= new Gestor("Bea Rodriguez", "987654321", 12000.0);
//creamos varias cuentas
c1= new CuentaCorriente("12345678A", "Pepita", g1);
c2= new CuentaCorriente("98765432Z", "Ana", g1);
c3= new CuentaCorriente("11222333B", "Sancho"); 
c1.mostrarInformacion ();
c2.mostrarInformacion ();
c3.mostrarInformacion ();
c1.setGestor (g2);
c1.mostrarInformacion ();

    }
    
}
