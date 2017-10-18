/**
 * Capítulo 4, Ejercicio 10
 *
 * @Author David.B.M.
 */

public class Ej10 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula tu horóscopo");
    System.out.print("Por favor, indica tu dia de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, indica tu mes: ");
    String mes = System.console().readLine().toLowerCase();
    
    String result = "";
    
    switch(mes) {
      case "enero":
        if (dia < 21) {
          result = "capricornio";
        } else {
          result = "acuario";
        }
        break;
      case "febrero":
        if (dia < 20) {
          result = "acuario";
        } else {
          result = "piscis";
        }
        break;
      case "marzo":
        if (dia < 21) {
          result = "piscis";
        } else {
          result = "aries";
        }
        break;
      case "abril":
        if (dia < 21) {
          result = "aries";
        } else {
          result = "tauro";
        }
        break;
      case "mayo":
        if (dia < 20) {
          result = "tauro";
        } else {
          result = "géminis";
        }
        break;
      case "junio":
        if (dia < 22) {
          result = "géminis";
        } else {
          result = "cáncer";
        }
        break;
      case "julio":
        if (dia < 22) {
          result = "cáncer";
        } else {
          result = "Leo";
        }
        break;
      case "agosto":
        if (dia < 24) {
          result = "leo";
        } else {
          result = "virgo";
        }
        break;
      case "septiembre":
        if (dia < 23) {
          result = "virgo";
        } else {
          result = "libra";
        }
        break;
      case "octubre":
        if (dia < 23) {
          result = "libra";
        } else {
          result = "escorpio";
        }
        break;
      case "noviembre":
        if (dia < 23) {
          result = "escorpio";
        } else {
          result = "sagitario";
        }
        break;
      case "diciembre":
        if (dia < 21) {
          result = "sagitario";
        } else {
          result = "capricornio";
        }
        break;
      default:
    }

    System.out.print("Su horóscopo es " + result);

  }
}
