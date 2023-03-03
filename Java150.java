import java.util.Scanner;

public class Java150 {
    public static void main(String[] args) {
        System.out.println("hello world");

        int a=52,b=78;
        int sum=a+b;
        System.out.println("sum= " + sum);//1 solved
        System.out.println("sum of " + a + " & " + b + " = " + sum);//2 solved
        Scanner sc =  new Scanner(System.in);
        System.out.println("please enter Two Integers:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum2 = c+d;
        System.out.println("the sum of " +c+" & "+d+" is "+sum2);//3solved
        System.out.println("please enter Your name and age");
        sc.nextLine();//dummy
        String name=sc.nextLine();
        int age= sc.nextInt();
        System.out.println("hello sir your name is "+ name + " and your age is "+ age);//4solved
        float len,br;
        System.out.println("please give length and breadth");
        len=sc.nextFloat();
        br=sc.nextFloat();
        double area = len*br;
        System.out.println("area= " + area );//5solved
        //6Incriment&&decrement
        System.out.println("hello ROBERT please enter your marks MATH COMPUTER ENGLISH RESPECTIVELY(Each Out of 100)");
        int math=sc.nextInt();
        if (math>100){
            System.out.println("please enter valid INPUT UPTO 100");
        }
        int computer = sc.nextInt();
        if (computer>100){
            System.out.println("please enter valid INPUT UPTO 100");
        }
        int english= sc.nextInt();
        if (english>100){
            System.out.println("please enter valid INPUT UPTO 100");
        }
        System.out.println("total =" +(math+computer+english) + "percentage =" + ((math+computer+english)/3.0*100) );//7solved
//8Fahrenheit & convert into Celsius.

        System.out.println("SIMPLE INTREST !please enter PRINCIPLE,RATE(only int values) AND TIME(yearly) ");
        int principle=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        System.out.println("SIMPLE INTREST = "+ ((principle*rate*time)/100.0));//9solved
        System.out.println("\n please enter 3 value  to compare which one is big");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if ( x>y && x>z ){
            System.out.println("X is greater");
        } else if (y>x && y>z) {
            System.out.println("y is greater");
        }else {
            System.out.println("z is greater");
        }//10solved
        //qn10 pending
        System.out.println("hello please enter details to further continue:\n you are male or female");
        char gender = sc.next().charAt(0);
        if(gender=='m'||gender=='M'){
            System.out.println("hello sir good morning");
        }else if (gender=='f'||gender=='F'){
            System.out.println("helloo maam warm goodmorning");
        }else{
            System.out.println("please enter valid input ");
        }//13 solved
        System.out.println("please enter number ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("no is even");
        }else{
            System.out.println("no is odd");
        }//14 solved
        System.out.println("enter name and age ");
        sc.nextLine();
        String name1 = sc.nextLine();
        int age1 = sc.nextInt();
        if (age1>=18) {
            System.out.println("hello " + name1 + " you are eligible to vote ");
        }else {
            System.out.println("you can vote after "+ (age1-18));
        }//15solved
        /*System.out.println("please enter principle rate time ");
        int cprinci = sc.nextInt();
        int crate = sc.nextInt();
        int ctime= sc.nextInt();
        int m=100;
        double CI = cprinci * (1*m=(crate/m))^ctime;*/
        System.out.println("please enter a year to check it is leap year or not");
        int year = sc.nextInt();
        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("leap yeaR");
        }else {
            System.out.println("not leap year");
        }//21 solved

        //-------------------------------------------------------------------------
        System.out.println("enter amout");
        int amt= sc.nextInt();
        if(amt>0 && amt<=5000){
            System.out.println("payable amout" + (amt*0/100));
        }else if(amt>5000 && amt<=7000){
            System.out.println("payable amout" + (amt*95/100));
        }else if (amt>7000 && amt<=9000){
        }else if(amt>9000 && amt<=10000)
            System.out.println("payable amout" + (amt*90/100));
        //----------------------------------------------------------------------------
        System.out.println("enter an int for loop");
        int th =sc.nextInt();
        for (int i=1 ; i<=n ; i++){
            System.out.println("hy brada " + i );

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first alphabet");
        char a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("it is vowel");
        } else {
            System.out.println("consonant");
        }//27solved

        System.out.println("please enter 2 value :");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("before swapping " + n + "  " + n2 + "\n");
        int temp = n;
        n = n2;
        n2 = temp;
        System.out.println("after swapping " + n + "  " + n2 + "\n");

        temp = n + n2;
        n2 = n;
        n = Math.abs(n2 - temp);

        System.out.println("after swapping " + n + "  " + n2 + "\n");//28 solved

        System.out.println("please enter int for lopp n time");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("hello " + n);
        }//29 solved

        System.out.println("please enter int where till want to print no.");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("numbers= " + i);
        }//30 solved


        for (int i = n; i > 0; i--) {
            System.out.println(" reversal numbers= " + i);
        }// 31 solved
        //----------------------------------------------------

        System.out.println("Enter a No. for printing table:");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }//32 solved
//-------------------------------------------------------------
        System.out.println("please enter a value for n for sum");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);//33 solved

        System.out.println("please enter a value factorial");
        n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);//34 solved
        //-----------------------------------------------------------

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
        System.out.println("sum of even" + sume); //35 solved
//-----------------------------------------------
        System.out.println("please Enter value for 3 or 5 divisibility");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println(i);
        }//36 solved

        System.out.println("enter a value for factors");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }//37 solved
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
        System.out.println("enter no. for separtaion");
        n = sc.nextInt();
        while(n!=0){
            int n1 = n % 10;
            System.out.println(n1);
            n = n/10;
        }// 40 solved
        System.out.println("41  enter  a no. for checking sum");
        n = sc.nextInt();
        while(n!=0){
            n = n % 10;
            sum = sum + n;
            n= n/10 ;
        }//41 solved
        System.out.println("sum "+ sum );
        //-----------------------------------------------
        System.out.println("42  enter a no. for check wheater it is a prime or not");
        n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;

        }
        System.out.println( c==2 ?" prime ":" non prime ");
        //42 solved
        //------------------------------------------------------
        int rev=0;
        System.out.println("enter  a no. for reversal");
        n = sc.nextInt();

        while(n!=0){
            temp = n % 10;
            rev = rev *10 +temp;
            n= n/10 ;
        }
        System.out.println("reversal " + rev);
        //43 solved---------------------------------------------------------

        rev = 0;
        System.out.println("enter  a no. for pallindrome");
        int copy;
        n = copy = sc.nextInt();
        while(n!=0){
            temp = n % 10;
            rev = rev * 10 + temp;
            n = n/10 ;
        }
        System.out.println("reversal " + rev);
        System.out.println( rev==copy ? " palindrome ":" not palindrome ");
        //44 solved

        System.out.println("QN45. please enter a no Armstrong");
        copy=n=sc.nextInt();
        do {
            temp = n%10;
            double sq = Math.pow(temp,2);
            sum += sq;
            n/=10;
        }while(n!=0);
        //if (copy==sq)
//-------------------------------------------------------------------------
        n=0;//b'cause in switch we need to initialise it
        System.out.println("please eneter value 1-7 for week");
        n=sc.nextInt();
        switch (n) {
            case 7 ->{
                System.out.println("sunday");
                System.out.println("aram krlo bhai");
            }
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> {
                System.out.println("saturday");
                System.out.println("enjoy your saturday night");
            }
            default -> System.out.println("invalid input");
        }//52 solved

    }

}
