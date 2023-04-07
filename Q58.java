import java.util.Arrays;
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc; //reference
        sc = new Scanner(System.in);
        int size;
        System.out.println("please enter size");
        size = sc.nextInt();
        int[] arr = new int[size];
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Please Enter Element for "+i+"th Element");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)+" before");
        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--,j++) {
                brr[j] = arr[i];
        }
        System.out.println(Arrays.toString(brr)+ "before");
    }
}
