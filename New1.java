import java.util.Scanner;

public class New1 {
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
        int n=10;
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
    }
}