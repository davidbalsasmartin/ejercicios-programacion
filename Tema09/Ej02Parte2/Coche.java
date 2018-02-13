package Ej02Parte2;

public class Coche extends Vehiculo {

  private String tapacubos;

  public Coche(String tapacubos) {
    this.tapacubos = tapacubos;
  }

  public String getTapacubos() {
    return tapacubos;
  }
  
  public void acelera() {
    System.out.println("BRRRRUPA BRRRRRUPA");
  }
  
  
}
