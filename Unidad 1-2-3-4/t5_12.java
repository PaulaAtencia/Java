public class t5_12 {

  public static void main(String[] args) {
    int cifras;
    do {
      System.out.print("Introduce un número ");
      cifras = Integer.parseInt(System.console().readLine());
    } while (cifras <= 2);
    int num1 = 0;
    int num2 = 1;
    int fibo = 0;
    System.out.print("Las primeras " +cifras +" de la serie de Fibonacci son: " +num1 +" " +num2 +" ");
    for (int i = 0; i < (cifras - 2); i++) {
      fibo = num1 + num2;
      System.out.print(" " + fibo + " ");
      num1 = num2;
      num2 = fibo;
    }
  }
}
