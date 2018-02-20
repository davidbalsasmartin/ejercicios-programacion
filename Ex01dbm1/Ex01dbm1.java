/**
 * Ejercicio 1 examen programación 1º DAW
 * 
 * Primer turno
 * 
 * 14/11/2017
 *
 * @author David Balsas Martín
 */


public class Ex01dbm1 {
  public static void main (String[] args) {
    System.out.println("Por favor, elija un modelo: a) Ñesla 5, b) Ñesla 8");
    String modelo = System.console().readLine().toLowerCase();
    
    if ((modelo.equals("a")) || (modelo.equals("a)"))) { //si es modelo 5
      System.out.println("Por favor, selectione e tipo de batería:");
      System.out.println("a) 50 kwh, b) 70kwh");
      String bateria = System.console().readLine().toLowerCase();
      if ((bateria.equals("a")) || (bateria.equals("a)"))) { // si es bateria 50 
        double bateriaCoche = 125 * 50;
        double subvencionCoche = ((bateriaCoche + 30000) * 0.05);
        double total = 30000 + bateriaCoche - subvencionCoche;
        System.out.println("A continucación, un informe detallado de la factura:");
        System.out.println("Ñesla 5");
        System.out.printf("%-25s  %.2f \n", "precio base", 30000.00);
        System.out.printf("%-25s  %.2f \n", "batería de 50kwh", bateriaCoche);
        System.out.printf("%-25s  %.2f \n", "subvención estatal", subvencionCoche);
        System.out.printf("%-25s  %.2f \n", "total", total);
      } else  if ((bateria.equals("b")) || (bateria.equals("b)"))) { // si es bateria 70
        System.out.println("A continucación, un informe detallado de la factura:");
        System.out.println("Ñesla 5");
        double bateriaCoche = 125 * 70;
        double subvencionCoche = (bateriaCoche + 30000) * 0.05;
        double total = 30000 + bateriaCoche - subvencionCoche;
        System.out.printf("%-25s  %.2f euros \n", "precio base", 30000.00);
        System.out.printf("%-25s  %.2f euros \n", "batería de 70kwh", bateriaCoche);
        System.out.printf("%-25s  %.2f euros \n", "subvención estatal", subvencionCoche);
        System.out.printf("%-25s  %.2f euros \n", "total", total);
      }
    } else if ((modelo.equals("b")) || (modelo.equals("b)"))) { // si es modelo 8
      System.out.println("Por favor, selectione e tipo de batería:");
      System.out.println("a) 80 kwh, b) 120kwh");
      String bateria = System.console().readLine().toLowerCase();
      if ((bateria.equals("a")) || (bateria.equals("a)"))) {
        // si es bateria 80
        System.out.println("¿Querría el paquete de conducción autónoma?");
        System.out.println("a) si, b) no");
        String conduccionAu = System.console().readLine().toLowerCase();
        if ((conduccionAu.equals("a")) || (conduccionAu.equals("a)"))) {
          // si tiene conduccion autonoma
          double bateriaCoche = 125 * 80;
          double conduccion = 1800;
          double subvencionCalculo = (bateriaCoche + 36000 + conduccion) * 0.05;
          double total = 36000 + bateriaCoche + conduccion - subvencionCalculo;
          System.out.println("A continucación, un informe detallado de la factura:");
          System.out.println("Ñesla 8");
          System.out.printf("%-25s  %.2f euros \n", "precio base", 36000.00);
          System.out.printf("%-25s  %.2f euros \n", "batería de 80kwh", bateriaCoche);
          System.out.printf("%-25s  %.2f euros \n", "conducción autónoma", conduccion);
          System.out.printf("%-25s  %.2f euros \n", "subvención estatal", subvencionCalculo);
          System.out.printf("%-25s  %.2f euros \n", "total", total);
        } else  if ((conduccionAu.equals("b")) || (conduccionAu.equals("b)"))) {
          // si no tiene conduccion autonoma
          double bateriaCoche = 125 * 80;
          double conduccion = 0;
          double subvencionCalculo = (bateriaCoche + 36000 + conduccion) * 0.05;
          double total = 36000 + bateriaCoche + conduccion - subvencionCalculo;
          System.out.println("A continucación, un informe detallado de la factura:");
          System.out.println("Ñesla 8");
          System.out.printf("%-25s  %.2f euros \n", "precio base", 36000.00);
          System.out.printf("%-25s  %.2f euros \n", "batería de 80kwh", bateriaCoche);
          System.out.printf("%-25s  %.2f euros \n", "conducción autónoma", conduccion);
          System.out.printf("%-25s  %.2f euros \n", "subvención estatal", subvencionCalculo);
          System.out.printf("%-25s  %.2f euros \n", "total", total);
        }
      } else  if ((bateria.equals("b")) || (bateria.equals("b)"))) {
        // si es bateria 120
        System.out.println("¿Querría el paquete de conducción autónoma?");
        System.out.println("a) si, b) no");
        String conduccionAu = System.console().readLine().toLowerCase();
        if ((conduccionAu.equals("a")) || (conduccionAu.equals("a)"))) {
          // si tiene conduccion autonoma
          double bateriaCoche = 125 * 120;
          double conduccion = 1800;
          double subvencionCalculo = (bateriaCoche + 36000 + conduccion) * 0.05;
          double total = 36000 + bateriaCoche + conduccion - subvencionCalculo;
          System.out.println("A continucación, un informe detallado de la factura:");
          System.out.println("Ñesla 8");
          System.out.printf("%-25s  %.2f euros \n", "precio base", 36000.00);
          System.out.printf("%-25s  %.2f euros \n", "batería de 120kwh", bateriaCoche);
          System.out.printf("%-25s  %.2f euros \n", "conducción autónoma", conduccion);
          System.out.printf("%-25s  %.2f euros \n", "subvención estatal", subvencionCalculo);
          System.out.printf("%-25s  %.2f euros \n", "total", total);
        } else  if ((conduccionAu.equals("b")) || (conduccionAu.equals("b)"))) {
          // si no tiene conduccion autonoma
          double bateriaCoche = 125 * 120;
          double conduccion = 0;
          double subvencionCalculo = (bateriaCoche + 36000 + conduccion) * 0.05;
          double total = 36000 + bateriaCoche + conduccion - subvencionCalculo;
          System.out.println("A continucación, un informe detallado de la factura:");
          System.out.println("Ñesla 8");
          System.out.printf("%-25s  %.2f euros \n", "precio base", 36000.00);
          System.out.printf("%-25s  %.2f euros \n", "batería de 120kwh", bateriaCoche);
          System.out.printf("%-25s  %.2f euros \n", "conducción autónoma", conduccion);
          System.out.printf("%-25s  %.2f euros \n", "subvención estatal", subvencionCalculo);
          System.out.printf("%-25s  %.2f euros \n", "total", total);
        }
      }
    }
	}
}
