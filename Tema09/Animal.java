public class Animal {

  public Animal(String edad, String sexo) {
    this.edad = edad;
    this.sexo = sexo;
  }

  String edad;
  String sexo;
  public void come() {
    if (edad == "viejo") {
      System.out.println("que me lo traigan, que no estoy para esos trotes");
    } else if (sexo == "macho") {
      System.out.println("gasdg asas gas dgdsa ");
    } else {
      System.out.println("dasa asd  sadadsa");
    }
  }

  public void duerme() {
    System.out.println("ZZZ ZZZ ZZZZZ");
  }

  public void muere() {
    System.out.println("D.E.P.");
  }
}
