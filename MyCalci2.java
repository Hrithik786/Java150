//Mycalci2 using Switch(__)
import java.util.Scanner;
public class MyCalci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, ch;
        do {
            System.out.println("enter a operation:");
            System.out.println("1. Add\n2. Sub\n3. multiply\n4. divide ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter a Two nos. to Add");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Addition of No. is " + (a + b));
                }
                case 2 -> {
                    System.out.println("enter a Two nos. to subtract ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("subtraction is " + (a - b));
                }
                case 3 -> {
                    System.out.println("enter a Two nos. to multiply ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("multiplication is " + (a * b));
                }
                case 4 -> {
                    System.out.println("enter a Two nos. to divide ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    double c = (double) a / b;
                    System.out.println("divide is " + c);
                    System.out.println("do you wanna continue please press y or yes to continue ");
                    sc.nextLine();
                    char x = sc.nextLine().charAt(0);
                    if (x == 'y') {
                        ch = 3;
                    }
                }
                default -> System.out.println("please enter a valid input");
            }
        } while (ch != 4);
    }
}