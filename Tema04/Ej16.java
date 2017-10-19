/**
 * Capítulo 4, Ejercicio 16
 *
 * @author David.B.M.
 */

public class Ej16 {
  public static void main(String[] args) {
    System.out.println("Esto es un test de infidelidad");
    System.out.println("Por favor, responda a las siguientes afirmaciones con si o no");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal");
    System.out.println("sin ningún motivo aparente.");
    String test1 = System.console().readLine().toLowerCase();
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    String test2 = System.console().readLine().toLowerCase();
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    String test3 = System.console().readLine().toLowerCase();
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre)");
    System.out.println("o se arregla el pelo y se asea con más frecuencia (si es mujer)");
    String test4 = System.console().readLine().toLowerCase();
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    String test5 = System.console().readLine().toLowerCase();
    System.out.println("6. A veces tiene llamadas que dice no querer contestar");
    System.out.println("cuando estás tú delante");
    String test6 = System.console().readLine().toLowerCase();
    System.out.println("7. Últimamente se preocupa más en cuidar la línea");
    System.out.println("y/o estar bronceado/a");
    String test7 = System.console().readLine().toLowerCase();
    System.out.println("8. Muchos días viene tarde después de trabajar");
    System.out.println("porque dice tener mucho más trabajo");
    String test8 = System.console().readLine().toLowerCase();
    System.out.println("9. Has notado que últimamente se perfuma más");
    String test9 = System.console().readLine().toLowerCase();
    System.out.println("10. Se confunde y te dice que ha estado en sitios");
    System.out.println("donde no ha ido contigo");
    String test10 = System.console().readLine().toLowerCase();

    int nota = 0;
    
    if ((test1.equals("si")) || (test1.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test2.equals("si")) || (test2.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test3.equals("si")) || (test3.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test4.equals("si")) || (test4.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test5.equals("si")) || (test5.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test6.equals("si")) || (test6.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test7.equals("si")) || (test7.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test8.equals("si")) || (test8.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test9.equals("si")) || (test9.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((test10.equals("si")) || (test10.equals("sí"))) {
    nota++ ;
    nota++ ;
    nota++ ;
    }
    if ((nota >= 0) && (nota <= 10)) {
    System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel." + nota);
    } else if ((nota > 11) && (nota <= 22)) {
    System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,");
    System.out.println("aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if ((nota > 22) && (nota <= 30)) {
    System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance");
    System.out.println(" con otra persona. Te aconsejamos que indagues un poco más");
    System.out.println("y averigües que es lo que está pasando por su cabeza.");
    }
  }
}
