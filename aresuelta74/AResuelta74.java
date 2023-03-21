/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta74;

/**
 *
 * @author 34625
 */
public class AResuelta74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c1, c2;
        c1 = new CuentaCorriente("12345678A", "Pepe");
        c2 = new CuentaCorriente("99999999E", "Ana");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Banco Central");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Caja de Ahorros de Do-While");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
    }

}
