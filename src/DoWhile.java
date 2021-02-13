import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int value;
         do {
              System.out.println("introduceti 4");
              value = scanner.nextInt();
         } while (value != 4);
         System.out.println("ati introdus 4");
    }
}
