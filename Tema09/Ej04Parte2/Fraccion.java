
package Ej04Parte2;

public class Fraccion {
  private int numerador;
  private int denominador;

  
  public Fraccion(int numerador, int denominador){
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  public Fraccion invierte() {
    return new Fraccion(this.denominador, this.numerador);
  }
  public Fraccion multiplica(int numerador2, int denominador2) {
    return new Fraccion(numerador2 * numerador, denominador2 * denominador);
  }
  public Fraccion divide(int numerador2, int denominador2) {
    return new Fraccion(numerador * denominador2, denominador * numerador2);
  }

  @Override
  public String toString() {
    return numerador + "/" + denominador;
  }

 
  
  
}
