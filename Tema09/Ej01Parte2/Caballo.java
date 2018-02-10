package Ej01Parte2;
/**
 * Capítulo 9, Ejercicio 1
 *
 * @author David.B.M.
 */

public class Caballo {

  String color;
  String raza;
  double peso;
  int altura;
  int velocidad;
  
  Caballo (String c, String r, double p, int a, int v) {
    this.color = c;
    this.raza = r;
    this.peso = p;
    this.altura = a;
    this.velocidad = v;
  }

  @Override
  public String toString() {
    return "Caballo: " + "color " + color + ", raza " + raza + ", peso " + peso + ", altura " + altura + ", velocidad " + velocidad + "km/h";
  }

  
  public void cabalga() {
    System.out.println("tocotocotoco tocotocotocoto");
  }
  
  public void relincha() {
    System.out.println("iiiiiiiiiiiiiiighththg");
  }
  
}