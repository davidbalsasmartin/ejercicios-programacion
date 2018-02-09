
public class Gato extends Mamifero {

  public Gato(String sexo, String edad) {
    super(sexo, edad);
  }

  public void maulla() {
    if (edad == "viejo") {
      System.out.println("estoy ronco");
    } else if (sexo == "macho") {
      System.out.println("miiiaaaaauuuu");
    } else {
      System.out.println("miiaauuu de macho");
    }
  }

  public void lava() {
    System.out.println("sssssluuuughgt");
  }

  public void araña() {
    System.out.println("mqwmdpqwemq");
  }
}
