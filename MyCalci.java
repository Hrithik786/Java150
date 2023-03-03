import java.util.Scanner;

public class MyCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        do {
            System.out.println("enter a operation:");
            System.out.println("1. Add, 2.sub, 3. multiply, 4. divide ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter a no. to Add");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Addition of No. is " + (a + b));
            } else if (ch == 2) {
                System.out.println("enter a no. to subtract ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("subtraction is " + (a - b));
            } else if (ch == 3) {
                System.out.println("enter a no. to multiply ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("multiply is " + (a * b));
            } else if (ch == 4) {
                System.out.println("enter a no. to divide ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("divide times is " + (a / b));
            /*System.out.println("do you wanna continue please press y to continue ");
            sc.nextLine();
            char x = sc.nextLine().charAt(0);
            if (x=='y')
                continue;*/
            } else
                System.out.println("please enter a valid input");
        }while(ch!=4);
    }
}
