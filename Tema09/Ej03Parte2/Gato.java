package Ej03Parte2;
public class Gato extends Mamifero {

  public Gato(String sexo, String edad) {
    super(sexo, edad);
  }

  public void maulla() {
    if (this.getEdad() == "viejo") {
      System.out.println("estoy ronco");
    } else if (this.getSexo() == "macho") {
      System.out.println("miiiaaaaauuuu de macho");
    } else {
      System.out.println("miiaauuu");
    }
  }

  public void lava() {
    System.out.println("sssssluuuughgt");
  }

  public void araña() {
    System.out.println("mqwmdpqwemq");
  }
}
