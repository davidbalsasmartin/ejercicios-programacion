package Ej03Parte2;

/**
 * Capítulo 9, Ejercicio 3
 *
 * @author David.B.M.
 */
public class Ej03 {


  public static void main(String[] args) {
    
    Pinguino skipper = new Pinguino("macho", "joven");
    Gato gatoConBotas = new Gato("macho", "viejo");
    skipper.duerme();
    skipper.come();
    skipper.caza("tortuga ninja");
    gatoConBotas.maulla();
    
  }
  
}
