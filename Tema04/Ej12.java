/**
 * Capítulo 4, Ejercicio 12
 *
 * @author David.B.M.
 */

public class Ej12 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula lo que sabes sobre el curso 1ºDAW");
    System.out.println("Escribe si o no");
    System.out.println("¿Damos la asignatura de programación?");
    String preg1 = System.console().readLine().toLowerCase();
    System.out.println("¿Damos la asignatura de bases de datos?");
    String preg2 = System.console().readLine().toLowerCase();
    System.out.println("¿Damos la asignatura de sistemas informáticos?");
    String preg3 = System.console().readLine().toLowerCase();
    System.out.println("¿Damos la asignatura de fol?");
    String preg4 = System.console().readLine().toLowerCase();
    System.out.println("¿Damos la asignatura de conocimiento del medio?");
    String preg5 = System.console().readLine().toLowerCase();
    System.out.println("¿Hay mas alumnos que sillas en el aula?");
    String preg6 = System.console().readLine().toLowerCase();
    System.out.println("¿El profesor de programación se llama Luis Alberto?");
    String preg7 = System.console().readLine().toLowerCase();
    System.out.println("¿El profesor de conocimiento del medio se llama Ignacio?");
    String preg8 = System.console().readLine().toLowerCase();
    System.out.println("¿El profesor de sistemas informáticos se llama Antonio?");
    String preg9 = System.console().readLine().toLowerCase();
    System.out.println("¿La profesora de lenguajes se llama Pilar?");
    String preg10 = System.console().readLine().toLowerCase();
    
    int puntos = 0; 
    
    /** x++ primero operas con x y en resultado se incrementa
    ++x primero incremento y luego opero
    (en este caso es igual **/
    
    if (preg1.equals("si")) {
      puntos++ ;
    }
    if (preg2.equals("si")) {
      puntos++ ;
    }
    if (preg3.equals("si")) {
      puntos++ ;
    }
    if (preg4.equals("si")) {
      puntos++ ;
    }
    if (preg5.equals("no")) {
      puntos++ ;
    }
    if (preg6.equals("si")) {
      puntos++ ; 
    }
    if (preg7.equals("no")) {
      puntos++ ;
    }
    if (preg8.equals("no")) {
      puntos++ ;
    }
    if (preg9.equals("si")) {
      puntos++ ;
    }
    if (preg10.equals("si")) {
      puntos++ ;
    } else {
    }
    System.out.println("el resultado es = " + puntos);
	}
}
