package Ej03Parte2;
public class Canario extends Ave {

  public Canario(String sexo, String edad) {
    super(sexo,edad);
  }
  public void canta() {
    if (this.getEdad() == "viejo") {
      System.out.println("estoy ronco");
    } else if (this.getSexo() == "macho") {
      System.out.println("kiiikiiiriiikiiiii");
    } else {
      System.out.println("pio pio pio pio pio");
    }
  }

  public void vuela() {
    System.out.println("volandooooooo");
  }

  public void caza() {
    System.out.println("me encanta comer gusanos");
  }
}
