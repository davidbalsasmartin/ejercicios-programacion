package Ej03Parte2;
public class Animal {

  private String edad;
  private String sexo;

  public Animal(String edad, String sexo) {
    this.edad = edad;
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "edad=" + edad + ", sexo=" + sexo;
  }
  
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public void come() {
    if (this.getEdad() == "viejo") {
      System.out.println("que me lo traigan, que no estoy para esos trotes");
    } else if (this.getSexo() == "macho") {
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
