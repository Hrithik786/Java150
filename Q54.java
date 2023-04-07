import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {

        //ARRAY
        //qn54
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter size to create array");
        int size = sc.nextInt();
        int[] arr = new int[size];  //declaration of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("please Enter Element for "+i+"th Index");
            arr[i]=sc.nextInt();
            sum += arr[i]; //addition at a time of Input
        }
        System.out.println("sum =" +sum);
        System.out.println("mean ="+ (double)sum / arr.length);
    }
}