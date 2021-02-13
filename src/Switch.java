import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti varsta");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("te-ai nascut");
                break;
            case 8 :
                System.out.println("mergi la scoale");
                break;
            case 18 :
                System.out.println("ai terminat scoala");
                break;
            default:
                System.out.println("nu este indeplinita nici o conditie");
        }
    }
}
