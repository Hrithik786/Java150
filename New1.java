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

        int n=128,rem;
        boolean ans=true;

        while (n!=0){
        rem = n % 10;
        if(rem==0) System.out.println("not divisible no.");
        else if (n % rem !=0) {
            ans = false;
            break;
        }
        n=n/10;
        }
        System.out.println(ans);
        n=10;
        for (int r=0; r<=n; r++ ){
            for (int c = 0; c <= n; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}