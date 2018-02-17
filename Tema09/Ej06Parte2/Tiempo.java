package Ej06Parte2;

/**
 *
 * @author David.B.M.
 */
public class Tiempo {

  private int h = 0;
  private int m = 0;
  private int s = 0;

  public Tiempo(int h, int m, int s) {
    this.h = h;
    this.m = m;
    this.s = s;
  }

  public int getH() {
    return h;
  }

  public int getM() {
    return m;
  }

  public int getS() {
    return s;
  }

  public void setH(int h) {
    this.h = h;
  }

  public void setM(int m) {
    this.m = m;
  }

  public void setS(int s) {
    this.s = s;
  }

  @Override
  public String toString() {
    return "h=" + h + ", m=" + m + ", s=" + s;
  }
  

  public void suma(Tiempo rival) {
    int tiempo1 = (this.h * 3600) + (this.m * 60) + this.s;
    int tiempo2 = (rival.h * 3600) + (rival.m * 60) + rival.s;
    int horas = (tiempo1 + tiempo2) / 3600;
    int minutos = ((tiempo1 + tiempo2) % 3600)/60;
    int segundos = ((tiempo1 + tiempo2) % 3600)%60;
    System.out.println("h = " + horas + " , m = " + minutos + " , s = " + segundos);
  }

  public void resta(Tiempo rival) {
    int tiempo1 = (this.h * 3600) + (this.m * 60) + this.s;
    int tiempo2 = (rival.h * 3600) + (rival.m * 60) + rival.s;
    int horas = (tiempo1 - tiempo2) / 3600;
    int minutos = ((tiempo1 - tiempo2) % 3600)/60;
    int segundos = ((tiempo1 - tiempo2) % 3600)%60;
    
    System.out.println("h = " + horas + " , m = " + minutos + " , s = " + segundos);
  }

}
