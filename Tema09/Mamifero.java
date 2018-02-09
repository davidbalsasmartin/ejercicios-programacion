
public class Mamifero extends Animal {

  public Mamifero(String sexo, String edad) {
    super(sexo,edad);
  }
  public void amamanta() {
    if (edad == "viejo") {
      System.out.println("no puedo");
    } else if (sexo == "macho") {
      System.out.println("no puedo");
    } else {
      System.out.println("lo que sea por mis crias");
    }
  }
}
