public class Pinguino extends Ave {

  public Pinguino(String sexo, String edad) {
    super(sexo,edad);
  }
  public void chorreate() {
    if (edad == "viejo") {
      System.out.println("no, que me hago daño");
    } else if (sexo == "macho") {
      System.out.println("yuuujuuuu");
    } else {
      System.out.println("vooooooy");
    }
  }

  public void lava() {
    System.out.println("voy a tirarme del iceberg");
  }

  public void caza() {
    System.out.println("ese pez tiene buena pinta, alguien tiene un arpón?");
  }
}