public class ejercicio11 {

  public static void main(String[] args) {
    System.out.println("Muestra 20 notas generadas al azar:");
    final int numNotas = 20;
    for (int i = 0; i < numNotas; i++) {
      int num = (int) (Math.random() * 5);
      switch (num) {
        case 0:
          System.out.print("suspenso");
          break;
        case 1:
          System.out.print("aprobado");
          break;
        case 2:
          System.out.print("bien");
          break;
        case 3:
          System.out.print("notable");
          break;
        case 4:
          System.out.print("sobresaliente");
          break;
      }
      System.out.println();
    }
  }
}
