package Ej05Parte2;

public class Pizza {

  private static int TotalPedidas;
  private static int TotalServidas;
  private String Estado;
  private String Tipo;
  private String Tamano;

  public static int getTotalPedidas() {
    return Pizza.TotalPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.TotalServidas;
  }

  public String getEstado() {
    return Estado;
  }

  public String getTipo() {
    return Tipo;
  }

  public String getTamano() {
    return Tamano;
  }
  
  public Pizza(String Tipo, String Tamano) {
    this.Tipo = Tipo;
    this.Tamano = Tamano;
    this.Estado = "pedida";
    this.TotalPedidas = TotalPedidas + 1;
  }

  public void sirve() {
    if (this.Estado == "pedida") {
      this.Estado = "servida";
    } else {
      System.out.println("esa pizza ya se ha servido");
      this.TotalServidas = TotalServidas + 1;
    }
  }

  @Override
  public String toString() {
    return "pizza " + this.Tipo + " " + this.Tamano + ", " + this.Estado;
  }
}
