import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Enter 2 numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = x/y;
                System.out.println(x + " /" +  y + " = " + z);
            }

            catch (ArithmeticException ex) {
                System.out.println("-catch block-");
                System.out.println(ex.toString());
            }

            finally {
                System.out.println("'finally block-");
                System.out.println("Application Devloped By Me");
            }
            System.out.println("DONE");
    }
}