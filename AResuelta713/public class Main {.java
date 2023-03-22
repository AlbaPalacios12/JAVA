public class Main {
    public  static void main(String[] args)
    Pila p= new Pila();
    System.out.println (p.desapilar()); //muestra null ya que esta vacia
    for (int i = 0; i < 10; i++) { //apilamos los numeros del 0 al 9
        p.apilar(i);
    }
    Integer num = p.desapilar(); //desapilamos el ultimo elemento
    while (num!= null) { //mientras no este vacio
        System.out.println(num + " "); //mostramos el elemento desapilado
        num = p.desapilar(); // lo volvemos a desapilar 
    }
}
