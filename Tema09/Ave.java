
public class Ave extends Animal {

  public Ave(String sexo, String edad) {
    super(sexo,edad);
  }
  public void pia() {
    if (edad == "viejo") {
      System.out.println("piogd pioagh piogh");
    } else if (sexo == "macho") {
      System.out.println("PIIOO PIIOO PIOO");
    } else {
      System.out.println("PIIIOOO PIIIOOOO");
    }
  }
}
