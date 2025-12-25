import java.util.Scanner;
public class Java150 {
    public static void main(String[] args) {

        //1 - Sum of two integers
        int a = 52, b = 78;
        int sum = a + b;
        System.out.println("sum= " + sum);//1 solved

        /*
        2- Print the message a long with values and sum
        Ex - The sum of 45 & 12  = 57
        */

        System.out.println("the sum of " + a + " & " + b + " = " + sum);//2 solved

        /*
        3- Accept two integers from user and print the sum
        Ex - The sum of 45 & 12 = 57
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter Two Integers:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        sum = c + d;
        System.out.println("the sum of " + c + " & " + d + " is " + sum);//3solved

        /*
        4- Accept the User's name, age and print in following manner
        Ex - Hello Shery, you are 12 years old.
        */

        System.out.println("please Enter Your Name and Age ");
        sc.nextLine(); //dummy for clearing buffer
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("hello sir your name is " + name + " and your age is " + age);//4solved

        /*
        5- Accept the length and width of a rectangle. Calculate & print the area and perimiter.
        */

        float length, breadth;
        System.out.println("please give length and breadth");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        double area = length * breadth; //using 3rd variable
        System.out.println("area= " + area);//5solved

        //6- Solve Increment & decrement operator questions on
        //	https://javaconceptoftheday.com/quiz-on-increment-and-decrement-operators/

        /*
        7- Accept the marks of Robert in three subjects Maths, Computer, English respectively (each out of 100 ),
        Write a program to calculate his total marks and percentage marks.
        */

        int math, computer, english;
            System.out.println("Hello ROBERT please enter your marks MATH COMPUTER ENGLISH RESPECTIVELY(Each Out of 100)");
            math = sc.nextInt();
            computer = sc.nextInt();
            english = sc.nextInt();
        System.out.println("total =" + (math + computer + english) + "percentage =" + ((math + computer + english)/3.0));
        //7solved
        //8Fahrenheit & convert into Celsius.
        /*
        9- Accept the Principle amount, time & rate of interest and calculate the Simple Interest
        */

        System.out.println("SIMPLE INTREST !please enter PRINCIPLE,RATE(only int values) AND TIME(yearly) ");
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        System.out.println("SIMPLE INTREST = " + ((principal * rate * time) / 100.0));//9solved

        /* 10- Take 3 int inputs from user and check and print the result.
        all are equal
        any of two are equal
                ( use && || )
        */

        System.out.println("\n please enter 3 value  to compare which one is big");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z)
            System.out.println(x + " is greater");
        else if (y > x && y > z)
            System.out.println(y + " is greater");
        else
            System.out.println(z + " is greater");
        //10solved

        /*
        11- Accept two numbers and print the greatest between them
        already done with 3 inputs

        12- Accept the gender from the user as char and print the respective greeting message
        Ex - Good Morning Sir (on the basis of gender)

        13- Extend the previous program and handle the wrong inputs.
        Print Good Morning sir for input m or M & Good morning Maam for input F or f
      else print Wrong Input
      */

        System.out.println("hello please enter details to further continue:\n you are Male or Female");
        char gender = sc.next().charAt(0);
        if (gender == 'm' || gender == 'M') {
            System.out.println("hello sir very warm good morning");
        } else if (gender == 'f' || gender == 'F') {
            System.out.println("helloo maam very warm good morning");
        } else {
            System.out.println("please enter valid input ");
        }
        //13 solved
        /*
        14- Accept an integer and check whether it is an even number or odd.
        */

        System.out.println("please Enter number to check wheather it is Odd or Even ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("no is even");
        else
            System.out.println("no is odd");
        //14 solved

        /*
        15- Accept name and age from the user. Check if the user is a valid voter or not.
        Vaid - Hello Shery, You are a valid voter.
        Invalid - Sorry Shery, you can't cast the vote.

        Part 2 - Print after how many years the user will be eligible
        */

        System.out.println("Hello Boss plz enter name and age ");
        sc.nextLine();
        String name1 = sc.nextLine();
        int age1 = sc.nextInt();
        if (age1 >= 18) {
            System.out.println("hello " + name1 + " you are eligible to vote ");
        } else {
            System.out.println("you can vote after " + (age1 - 18));
        }//15solved

        /*
        16- Accept the parameters and calculate the Compound Interest & print it on STDOUT (Use Math class methods)
        */

        System.out.println("please enter principal rate time(respectively) for compound Intrest ");
        double cprincipal = sc.nextInt();
        double crate = sc.nextInt();
        double ctime = sc.nextInt();
        double camount = cprincipal*(Math.pow(( 1 + crate / 100),ctime));
        System.out.println("Compound Intrest = " + (camount-cprincipal));
        //16 solved

        /*
        17- Accept the three sides of triangle and calculate the area using herons formula

        18- Accept the value of a, b, c - The values in a quadratic equation and find its roots.
        */

        /*
        19- Accept a day number between 1-7 and print the corresponding dayname.
        */
        int ch;
        do {
            System.out.println("please enter 1-7 for printing day, Press 8 to terminate");
            ch = sc.nextInt();
            switch (ch) {
                case 1 : { 
                    System.out.println("monday");
                    break;
                    } // in traditional syntax we have to write break at the end of stmt other 
                    // the other obove stmts gonna execute
                case 2 -> System.out.println("tuesday");
                case 3 -> System.out.println("wednesday");
                case 4 -> System.out.println("thursday");
                case 5 -> System.out.println("friday");
                case 6 -> System.out.println("saturday");
                case 7 -> System.out.println("sunday");
                default -> System.out.println("please enter valid input");
            }
        } while (ch != 8);
        //19 solved

        /*
        20- Accept three numbers and print the greatest among them
        */
        System.out.println("\n please enter 3 value  to compare which one is big");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x > y && x > z)
            System.out.println(x + " is greater");
        else if (y > x && y > z)
            System.out.println(y + " is greater");
        else
            System.out.println(z + " is greater");
        //20 solved

        /*
        21- Accept a year and check if it a leap year or not (google to find out what's a leap year)
        */

        System.out.println("please enter a year to check it is leap year or not");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap yeaR");
        } else {
            System.out.println("not leap year");
        }//21 solved

        /*
        22.Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        Marks        Grade
        91-100         AA
        81-90           AB
        71-80           BB
        61-70           BC
        51-60           CD
        41-50           DD
        <=40           F
        */
        System.out.println("please enter your marks upto 100 to know your grade");
        n=sc.nextInt();
        if (n>90 && n<100)
            System.out.println("AA");
        else if (n>80 && n<=90) {
            System.out.println("AB");
        } else if (n>70 && n<=80) {
            System.out.println("BB");
        } else if (n>60 && n<=70) {
            System.out.println("BC");
        } else if (n>50 &&  n<=60){
            System.out.println("CD");
        } else if (n>40 && n<=50) {
            System.out.println("DD");
        } else System.out.println("Fail");
        //22 solved
        /*
        23- Shop discount - Description on Graphic
        */
        System.out.println("Enter Amount for Discount on Shop");
        int amt = sc.nextInt();
        if (amt > 0 && amt <= 5000) {
            System.out.println("payable amount " + amt);
        }else if (amt > 5000 && amt <= 7000) {//5%

            System.out.println("payable amount " + (amt * 95 / 100));
        }else if (amt > 7000 && amt <= 9000) {//8%
            System.out.println("payable amount "+ (amt * 92 / 100));
        } else if (amt > 9000 && amt <= 10000)//10%
            System.out.println("payable amount" + (amt * 90 / 100));//pending
        //23 solved

        //24- Bijli Bill - Description on Graphic
        System.out.println("please Enter Unit for Calculating Electricity Bill");
        int unit = sc.nextInt();
        amt = 0;
        if (unit > 400) {
            amt = amt + (unit - 400) * 13;
            unit = 400;
        }
        if (unit > 200) {
            amt = amt + (unit - 200) * 8;
            unit = 200;
        }
        if (unit > 100) {
            amt = amt + (unit - 100) * 6;
            unit = 100;
        }
        amt = amt + unit * 4;
        System.out.println("amt = " + amt);//24 solved

        //25- INR Denomination - Description on Graphic
        /*
        26.The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book.
     The ISBN is based upon a 10-digit code.
 	The ISBN is legal if:
 	1 × digit1 + 2 × digit2 + 3 × digit3 + 4 × digit4 + 5 × digit5 + 6 × digit6 + 7 × digit7 + 8 × digit8 + 9 × digit9 + 10 × digit10 is divisible by 11.
 	Example : For an ISBN 1401601499
 	Sum = 1×1 + 2×4 +3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is divisible by 11.
 	Write a program to :
 	(i) Input the ISBN code as a 10-digit integer.
 	(ii) If the ISBN is not a 10-digit integer, output the message, “Illegal ISBN” and terminate the program.
 	(iii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above.
 	      If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.

         */

        //27- Accept an english alphabet from user and check if it is a consonant or a vowel;
        System.out.println("please Enter Alphabet to check either it is consonant or vowel");
        a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("it is vowel");
        } else {
            System.out.println("consonant");
        }//27solved
        /*
        28- Accept two numbers from user and swap their values
        */
        System.out.println("please enter 2 value :");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swapping " + a + "  " + b + "\n");
        c = a;
        a = b;
        b = c;
        System.out.println("after swapping " + a + "  " + b + "\n");

        //Part 2 - Swap without using third variable
        a = a + b;//logic
        b = a - b;
        a = a - b;
        System.out.println("after swapping " + a + "  " + b + "\n");
        //28 solved

        //just for fun
        System.out.println("enter an int for loop");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("hy brada " + i);
        }

        //29- Accept an integer and Print hello world n time
        System.out.println("please enter how many times you want hello world");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("hello world" + i);
        }
        //29 solved

        //30- Print natural number up to n.
        System.out.println("please enter int where till want to print no.");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("numbers= " + i);
        }
        //30 solved

        //31- Reverse for loop. Print n to 1.
        for (int i = n; i > 0; i--) {
            System.out.println(" reversal numbers= " + i);
        }
        // 31 solved

        //32- Take a number as input and print its table
        //       5 * 1 = 5
        //       5 * 2 = 10 ... up to 10 terms

        System.out.println("Enter a No. for printing table:");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        //32 solved

        //33- Sum up to n terms.
        System.out.println("please enter a value where till you want to sum");
        n = sc.nextInt();
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        //33 solved

        //34- Factorial of a number

        System.out.println("please enter a value factorial");
        n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        //34 solved

        //35- Print the sum of all even & odd numbers in a range seperately.

        System.out.println("please enter value for sum of odd n even");
        n = sc.nextInt();
        int sumo = 0, sume = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sume = sume + i;
            else if (i % 2 == 1)
                sumo = sumo + i;
        }
        System.out.println("sum of odd" + sumo);
        System.out.println("sum of even" + sume);
        //35 solved

        //36- Print all the numbers which are either divisible by 3 or 5 in a range
        System.out.println("please Enter value for 3 or 5 divisibility");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println(i);
        }
        //36 solved

        //37- Print all the factors of a number.
        System.out.println("enter a Value for factors");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
        //37 solved

        //38- Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43
        System.out.println("enter a sum of ranged factors");
        n = sc.nextInt();
        int sumfac = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sumfac += i;
                System.out.println(i);
            }
        }
        System.out.println("sum of all factors " + sumfac);
        //38 solved

        /* 39- Accept a number and check if it a perfect number or not.
        // A number whose sum of factors(excluding number itself)  = Number
        Ex -  6 = 1, 2, 3 = 6
         */
        System.out.println("enter a no. for perfect no");
        n = sc.nextInt();
        sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        if (n == sum)
            System.out.println("perfect");
        else
            System.out.println("not perfect");
        //39 solved

        //40- Separate each digit of a number and print it on the new line
        System.out.println("40. enter no. for separation");
        n = sc.nextInt();
        while (n != 0) {
            int n1 = n % 10;
            System.out.println(n1);
            n = n / 10;
        }
        // 40 solved

        //41- Sum of digits of a number, 936 = 18
        System.out.println("41. enter  a no. for checking sum");
        n=sc.nextInt();
        int checknum=n;
        sum=0;
        while (n != 0) {
            checknum = n % 10;
            sum += checknum;
            n = n / 10;
        }
        System.out.println("sum " + sum);
        //41 solved check it once not working properly

        //42- Check if the number is Prime or not.
        System.out.println("42. enter a no. for check weather it is a prime or not");
        n = sc.nextInt();
        c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        System.out.println(c == 2 ? " prime " : " non prime ");
        //42 solved

        //43- Accept a number and print its reverse
        int rev = 0, lastdigit;
        System.out.println("enter  a no. for reversal");
        n = sc.nextInt();
        while (n != 0) {
            lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println("reversal " + rev);
        //43 solved

        //44- Accept a number and check if it is a palindromic number (If number and its reverse are equal)
        //       Ex - 12321 - Reverse - 12321

        rev = 0;
        System.out.println("enter  a no. for Palindrome");
        int copy;
        n = copy = sc.nextInt();
        while (n != 0) {
            lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println("reversal " + rev);
        System.out.println(rev == copy ? " palindrome " : " not palindrome ");
        //44 solved

        //45- Accept a number and check if it is a armstrong number (Sum of cube of all digits will be equal to original number)
        //       Ex - 407 = 64 + 0 + 343 = 407
        //              153 = 1 + 125 + 27 = 153

        System.out.println("QN45. please enter a no Armstrong");
        double cube;
        int temp;
        copy = n = sc.nextInt();
        do {
            temp = n % 10;
            cube = Math.pow(temp,3);
            n /= 10;
            sum += cube;
        } while (n != 0);
        System.out.println( copy == sum ? "Armstrong Number": "NON Armstrong Number");
        //45 solved

        //46- Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
        //       Ex- 145 = 1! + 4! + 5! = 145

        System.out.println("QN46. please enter a no to check is it Strong or not");
        copy=n=sc.nextInt();
        int strong;
        while (n != 0) {
            strong = n % 10;
            fact = 1;
            for (int i = 1; i <= strong; i++)
                fact = fact * i;
            sum += fact;
            n /= 10;
        }
        System.out.println( copy == sum ? "Armstrong Number": "NON Armstrong Number");
        //46 solved

        //52- Choice based Weedays
        System.out.println("please enter value 1-7 for week");
        n = sc.nextInt();
        switch (n){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> {
                System.out.println("saturday");
                System.out.println("enjoy your saturday night");
            }
            case 7 :
                System.out.println("sunday");
                System.out.println("ARAM krlo bhai");
                break; //in lamba's break doesn't required, but in old traditional case break; required
            default -> System.out.println("invalid input");
        }//52 solved

        /*
        long n = 1401601499;
        long sum = 0;
        for (int i = 10; i>=1 ; i--) {
            sum = sum + n % 10 * i;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(sum%11==0?"Legal":"not legal");//26 solved
*/
     //   denomination
        amt= 8751;
        int note2000 = amt / 2000;
        amt = amt % 2000;

        int note500 = amt / 500;
        amt += amt % 500;

        int note100 = amt / 100;
        amt += amt % 100;

        int note50 = amt / 50;
        amt += amt % 50;

        int note10 = amt / 10;
        amt += amt % 10;

        System.out.println(note2000+" "+note500+" "+note100+" "+note50+" "+note10+" "+amt);
    }

    // Anagram Qn
     String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram");
        
        // list of String and filter only palindrome strings 

        List<String> names = Arrays.asList("hri","ana","ama","nana");
        names.stream()
        .filter( str -> 
            new StringBuilder(str)
            .reverse()
            .toString()
            .equals(str)
        ).forEach(System.out::println);
}