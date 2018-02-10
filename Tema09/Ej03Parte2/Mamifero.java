package Ej03Parte2;
public class Mamifero extends Animal {

  public Mamifero(String sexo, String edad) {
    super(sexo,edad);
  }
  
  public void amamanta() {
    if (this.getEdad() == "viejo") {
      System.out.println("no puedo");
    } else if (this.getSexo() == "macho") {
      System.out.println("no puedo");
    } else {
      System.out.println("lo que sea por mis crias");
    }
  }
}
