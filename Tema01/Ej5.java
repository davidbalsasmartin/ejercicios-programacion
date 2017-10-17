/**
 * Capítulo 1, Ejercicio 5
 *
 * @Author David.B.M.
 */

public class Ej5 {
  public static void main(String[] args) {
    String bln = "\033[37m";
    String az = "\033[34m";
    String nar = "\033[33m";
    String ver = "\033[32m";
    String ro = "\033[31m";
    String mor = "\033[35m";
    String cyan = "\033[36m";
    String pr = "\033[39m";
    
    System.out.println( pr + "  L     M     X     J     V  ");
    System.out.println("----------------------------------");
    System.out.printf("%-8s    %-6s    %-6s    %-6s    %-6s\n", nar + "SIST", ro + "PROG", nar + "SIST", ro + "PROG", ro + "PROG");
    System.out.printf("%-8s    %-6s    %-6s    %-6s    %-6s\n", nar + "SIST", ro + "PROG", nar + "SIST", ro + "PROG", ro + "PROG");
    System.out.printf("%-8s    %-6s    %-6s    %-6s    %-6s\n", nar + "SIST", ro + "PROG", nar + "SIST", ro + "PROG", mor + "ENTO");
    System.out.println( cyan + "   R       E       C       R       E      O ");
    System.out.printf("%-8s    %-6s    %-6s    %-6s    %-6s\n", bln + "FOL",  az + "BASE", mor + "ENTO", az + "BASE", ver + "LENG");
    System.out.printf("%-8s    %-6s    %-6s    %-6s    %-6s\n", bln + "FOL",  az + "BASE", mor + "ENTO", az + "BASE", ver + "LENG");
    System.out.printf("%-8s    %-6s    %-6s    %-6s    %-6s\n", bln + "FOL",  az + "BASE", ver +"LENG", az + "BASE", ver + "LENG");
  }
}
