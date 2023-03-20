/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aresuelta72b;

/**
 *
 * @author 34625
 */
class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente(String dni, String nombre) {
     
        //otra alternativa seria poner this( dni, saldo) y luego asignar el nombre
        this (dni, 0);
        this.nombre= nombre;
    }

    boolean sacar(double cant) {
        boolean operacionPosible;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible = true;
        } else {
            operacionPosible = false;
            System.out.println("No hay dinero suficiente");

        }
        return (operacionPosible);
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrarInformacion() {
        System.out.println("Nombre " + nombre);
        System.out.println("DNI " + dni);
        System.out.println("Saldo " + saldo + " euros");
    }

    CuentaCorriente(String dni, double saldo) {
    this (dni, saldo);
    this.nombre= "Sin asignar";
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this( dni, nombre, saldo) ;
        this.nombre = nombre;
        this.saldo = saldo;
    }
}