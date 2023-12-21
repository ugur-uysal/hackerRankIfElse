import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı değer giriniz : ");
        n = input.nextInt();

        if (n >= 1 && n <= 100) {
            if (n % 2 == 0) {
                if (n >= 2 && n <= 5)
                    System.out.println("Not Weird");
                else if (n >= 6 && n <= 20)
                    System.out.println("Weird");
                else System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }

    }
}