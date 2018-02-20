package Ex01dbm;

/**
 *
 * @author David
 */
public class Terminal {

  private String numero;
  private int tiempo = 0;

  public Terminal(String numero) {
    this.numero = numero;
    this.tiempo = tiempo;
  }

  public String getNumero() {
    return numero;
  }

  public int getTiempo() {
    return tiempo;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public void llama(Terminal contrario, int tiempoT) {
    this.tiempo += tiempoT;
    contrario.tiempo += tiempoT;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " – " + tiempo + "s de conversación";
  }

}
