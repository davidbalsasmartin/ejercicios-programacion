package Ej07Parte2;

import java.util.Scanner;

/**
 * Capítulo 9, Ejercicio 7
 *
 * @author David.B.M.
 */
public class Ej07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    boolean salir = false;
    do {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      int respuesta = s.nextInt();
      switch (respuesta) {
        case 1:
          System.out.println("Zona principal = " + principal.getEntradasPorVender());
          System.out.println("Zona compraVenta = " + compraVenta.getEntradasPorVender());
          System.out.println("Zona vip = " + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.println("1. Zona principal");
          System.out.println("2. Zona compraVenta");
          System.out.println("3. Zona vip");
          int respuesta2 = s.nextInt();
          System.out.println("¿Cuántas entradas?");
          int vende = s.nextInt();
          switch (respuesta2) {
            case 1:
              principal.vender(vende);
              break;
            case 2:
              compraVenta.vender(vende);
            case 3:
              vip.vender(vende);
          }
          break;
        case 3:
          salir = true;
          break;
      }

    } while (salir == false);
  }

}
