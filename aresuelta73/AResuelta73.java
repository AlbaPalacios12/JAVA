/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta73;
/*PROBAMOS LA VISIBILIDAD DE LOS ATRIBUTOS*/
/**
 *
 * @author 34625
 */
public class AResuelta73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c;
        c = new CuentaCorriente("12345678A", "Pepe");
        //c.saldo= 2000; Nos da error porque no nos puede mostrar un atributo que es privado
        c.dni= "32165478T"; //como el main es una clase vecina si es visible
        // si fuera una clase externa no nos dejaria
        c.nombre= "Antonio"; // como el nombre es publico lo podemos ver desde la clase que sea
    }

}
