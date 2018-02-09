public class Perro extends Mamifero {

  public Perro(String sexo, String edad) {
    super(sexo,edad);
  }
  public void pelea() {
    if (edad == "viejo") {
      System.out.println("estoy ronco");
    } else if (sexo == "macho") {
      System.out.println("que pase el gato a la arena");
    } else {
      System.out.println("ROUND ONE, FIGHT");
    }
  }

  public void ladra() {
    System.out.println("GUAU GUAU GUAU");
  }

  public void damelapatita() {
    System.out.println("aasashahsahsha");
  }
}
