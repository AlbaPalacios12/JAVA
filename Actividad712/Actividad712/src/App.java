import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
      Ecuacion e; 
      
      System.out.println("Introduzca el valor de las variables: ");     
      System.out.println("a: ");
      double a= sc.nextDouble();
      System.out.println("b: ");    
      double b= sc.nextDouble();
      System.out.println("c: ");    
      double c= sc.nextDouble();
      e= new Ecuacion(a,b,c);
      System.out.println("Es el discriminante positivo?: "+ e.discriminantePositivo());
      e.resolverEcuacion();
    }
}
