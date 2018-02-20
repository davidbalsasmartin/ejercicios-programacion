package Ex01dbm;

public class Movil extends Terminal {
  String tarifa;
  double total = 0;
  double min = 0;
  
  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.min += min;
    this.total += total;
  }

  @Override
  public void llama(Terminal contrario, int tiempoT) {
    super.llama(contrario, tiempoT);
    min = (this.getTiempo() / 60);
    if (this.tarifa == "rata") {
      this.total += this.min * 0.06;
      } else if (this.tarifa == "mono") {
      this.total += this.min * 0.12;
    } else if (this.tarifa == "bisonte") {
      this.total += this.min * 0.3;
    } else;
  }
    
  

    @Override
  public String toString() {
    return "Nº " + this.getNumero() + " – " + getTiempo() + "s de conversación – tarificados " + this.total + " euros";
  }
}
