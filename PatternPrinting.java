import java.util.Arrays;
import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {/*
        Scanner sc = new Scanner(System.in);
        int amt=0,ch=0,ch1=0;
        do{
            System.out.println("Hello Restaurant");
            System.out.println("1.INDIAN\n 2.Italian\n3.Chinese");
            ch=sc.nextInt();
            switch(ch){
            case 1 -> {
                System.out.println("1 for laptea \n 2. butter paneer masala kulcha \n3.");
                ch1 = sc.nextInt();
            }
            case 2-> {
                    System.out.println("Enter 1. itimatoata\n2.nanankao");
                    ch1 = sc.nextInt();
            }

            case 3-> {
                System.out.println("1. noodles\n2.manchurian");
                ch1=sc.nextInt();
            }
            default -> System.out.println("press valid input");
        }
    }while (ch!=3);
        switch (ch1){
            amt+=150;
            case 1-> System.out.println("");
        }*/
        //pattern printing
        /*
        int n=10;
         /*
        int c=1;
        int r=1;

        for (r=1;r<=n;r++){ //square
            for (c =1; c <= n; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (r=n;r>=1;r--){ //ulta wala triangle
            for (c =1; c<=r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (r=1;r<=n;r++){ //sidha wala triangle
            for (c =1; c<=r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (r=1;r<=n;r++){ //ulta wala triangle
            for (c =1; c<=r+1-c; c++) {
                System.out.print((char)(64+r));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (r=1;r<=n;r++){ //ulta wala triangle
            for (c =1; c<=r+1-c; c++) {
                System.out.print((char)(64+r));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (r=1;r<=n;r++)
        for (r=1;r<=n-1;r++){ //ulta wala triangle
            System.out.println(" ");
            for (c =1; c<=r; c++) {
                System.out.print((char)(64+r));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (r=n;r>=1;r++){
            for (c=1; c<=n-r;c++){
                System.out.println(" ");
            }
            for (c=1;c<=r;c++){
                 if (r==c || r+c==r+1){
                    System.out.println("*");
                }else System.out.println("0");
            }
        }
        */
        int a=64,b=36;
        int i;
        int ans = Math.min(a,b);
        for(i = ans ;i>=1;i--) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans + " ");
        //68 solved H.C.F

        a=12;
        b=6;
        for(i = Math.max(a, b) ;i <= a*b ;i++) {
            if (i%a == 0 && i%b == 0) {
                break;
            }
        }
        System.out.println(i);
        //69 solved L.C.M

        int n=10;
        int prev1=1,prev2=0;
        System.out.print("0  1  ");
        for(i=2; i<=n ;i++){
            ans = prev1 + prev2;
            System.out.print(ans+ "  ");

            prev2=prev1;
            prev1=ans;
        }//70 solved

        //array
        Scanner sc = new Scanner(System.in);
        System.out.println("\nplease enter a size\n");
        n=sc.nextInt();

        int[] arr = new int[n];
        //arr is basically a reference variable

        for (i=0; i < arr.length; i++) {
            System.out.println("\nenter element "+i+"th index");
            arr[i] = sc.nextInt();
        }//input

        int sum=0,mean=0;
        for(i=0; i < arr.length; i++) {
            sum = sum + arr[i];
        }//sum

        for(i=0; i < arr.length ;i++){
            System.out.println("data =  "+arr[i]);
        }//output
        mean=sum/n;
        System.out.println("sum= "+sum);
        System.out.println("mean = "+mean);
//-----------
        //73qn
        System.out.println("Qn 53 please Enter Size");
        int size = sc.nextInt();
        int[] brr = new int[size];
        for (i=0; i<brr.length ;i++){
            System.out.println("please enter input ");
            brr[i]=sc.nextInt();
            sum += brr[i];//sum
        }//input

        System.out.println("sum = "+sum);
        System.out.println("mean = "+(float)sum/n);

        //74
        int crr[] = {12,25,236,56,89,8,99,909};
        int max =0;
        for (int j = 1; j < crr.length; j++) {
            if (crr[i] > crr[max]) {
                max = i;
            }
        }
        System.out.println("max element "+crr[max]+" found at "+max);
        //-------------------------------------------
         
        int[] xrr= {2,96,69,77,145,20};
        int firstMax  = Math.max(xrr[0], xrr[1]);
        int secondMax = Math.min(xrr[0], xrr[1]);

        for (int j = 2; j < xrr.length; j++) {
            if (xrr[j] > firstMax){
                secondMax = firstMax;
                firstMax  = xrr[j];
            } else if (xrr[j] > secondMax) {
                secondMax=xrr[j];
            }
        }
        System.out.println("second greatest = "+secondMax);
        
        Arrays.stream(xrr).boxed().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
//------------------------------------------------------
        /*
        int[] hrr={1,5,7,8,9};
        boolean answ = true;
        for (int j = 0; j < hrr.length-1; j++) {
            if (hrr[j]  >  hrr[j+1]){
                answ=false;1
                break;
            }
        }
        System.out.println(answ);
        */
        //-------------------------------------
        int[] array = {1, 2, 1};
        int[] temp = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = array[i];
        }

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(array));
        
        System.out.println(
            Arrays.equals(array, temp) ? "palindrome" : "non plaindrome");
    }
}
