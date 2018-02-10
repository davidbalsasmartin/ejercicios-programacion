package Ej03Parte2;
public class Lagarto extends Animal {

  public Lagarto(String sexo, String edad) {
    super(sexo,edad);
  }
  public void pelea() {
    if (this.getEdad() == "viejo") {
      System.out.println("no estoy para esos trotes, yo quiero tomar el sol");
    } else if (this.getSexo() == "macho") {
      System.out.println("en otro momento pelearé");
    } else {
      System.out.println("");
    }
  }

  public void lava() {
    System.out.println("me voy al agua");
  }

  public void tomaelsol() {
    System.out.println("voy a esa piedra calentita de alli");
  }
}
