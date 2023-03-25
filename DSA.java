import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner sc;  //creating a reference pointer
        sc = new Scanner(System.in);

        System.out.println("please enter size for array");
        int s = sc.nextInt(); //Input

        int[] arr = new int[s];

        int sum=0;
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println("please enter element for " + i + " th Index");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("sum = "+sum);
//---------------------------------------------+72
        System.out.println("mean = "+ (float)sum/arr.length);
//---------------------------------------------+73
        int arr2[] = {10,20,30,45,56,620};
        int max = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > arr2[max]){
                max = i;
            }
        }
        System.out.println("greatest element is "+arr2[max]+" and its index is "+max );
        //----------------------------------------------------
        int arr3[] = {10,20,30,45,5,620};
        int min = 0;
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] < arr3[min]){
                min = i;
            }
        }
        System.out.println("minimum element is "+arr3[min]+" and its index is "+min );
        //----------------------------------------------------

        int[] great2 = {25,36,96,45,4,5,4,5,4,5,4,5252,1411,786};
        int first  = Math.max(great2[0],great2[1]);
        int second = Math.min(great2[0],great2[1]);

        for (int i = 2; i < great2.length; i++) {
            if (great2[i] > first){
                second = first;
                first = great2[i];

            }else if (great2[i] >  second){
                second = great2[i];
            }
        }
        System.out.println("first greatest = " +first+" second greatest "+second);

        //77- Check if array is sorted or not.

        int arr4[] = {10,20,30,40,50,53};
        boolean ans = true;
        for (int i = 0; i < arr4.length-1; i++) {
            if (arr4[i] > arr4[i+1]){
                ans=false;
                break;
            }
        }
        System.out.println("Array is "+ans+ "ly" +" sorted");

        //pend Array Reverse Using Extra space
    }
}
