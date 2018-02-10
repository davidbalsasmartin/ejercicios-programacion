package Ej03Parte2;
public class Ave extends Animal {

  public Ave(String sexo, String edad) {
    super(sexo,edad);
  }
  public void pia() {
    if (this.getEdad() == "viejo") {
      System.out.println("piogd pioagh piogh");
    } else if (this.getSexo() == "macho") {
      System.out.println("PIIOO PIIOO PIOO");
    } else {
      System.out.println("PIIIOOO PIIIOOOO");
    }
  }
}
