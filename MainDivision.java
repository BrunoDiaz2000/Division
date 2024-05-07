import java.util.Scanner;

class MainDivision {
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
      System.out.print("\nDeme la primer variable: ");
      int X = op.nextInt();
      System.out.print("Deme la segunda variable: ");
      int Y = op.nextInt();

      Division primera = new Division();
      primera.setX(X);
      primera.setY(Y);      
      System.out.println("\nEl resultado es: " + primera.mostrarDivision());
      
      System.out.println(primera);
   }
}