package Ej03Parte2;


public class Pinguino extends Ave {

  public Pinguino(String sexo, String edad) {
    super(sexo,edad);
  }
  public void chorreate() {
    if (this.getEdad() == "viejo") {
      System.out.println("no, que me hago daño");
    } else if (this.getSexo() == "macho") {
      System.out.println("yuuujuuuu");
    } else {
      System.out.println("vooooooy");
    }
  }

  public void lava() {
    System.out.println("voy a tirarme del iceberg");
  }

  public void caza(String animal) {
    System.out.println("es@ " + animal + " tiene buena pinta, alguien tiene un arpón?");
  }
}