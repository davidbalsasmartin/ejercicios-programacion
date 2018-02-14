package Ej02Parte2;

public class Vehiculo {

  private static int vehiculosCreados = 0;
  private static int kilometrostotales = 0;
  private int kilometrosRecorridos = 0;

  public Vehiculo() {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  public void recorre(int k) {
    this.kilometrosRecorridos = kilometrosRecorridos + k;
    Vehiculo.kilometrostotales = kilometrostotales + k;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static int getKilometrostotales() {
    return kilometrostotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static void setKilometrostotales(int kilometrostotales) {
    Vehiculo.kilometrostotales = kilometrostotales;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  
  
}
