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

    }

}
