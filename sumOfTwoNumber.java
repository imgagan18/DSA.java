import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("food");
                break;
            case 2:
                System.out.println("drinks");
                break;
            default:
                System.out.println("fake");
                break;
        }
    }
}
