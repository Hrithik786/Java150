import java.util.Arrays;
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

        //bug Array Reverse Using Extra space
        int[] temp = new int[arr4.length];   //2 pointer algorithm
        for (int i = arr4.length-1; i >= 0 ; i--) {
            for (int j = 0; j < temp.length-1; j++) {
                temp[j] = arr4[i];
            }
        }
        for (int data : temp) {
            System.out.println(data+" ");
         }
        //rotate array left by 1
        int left[]={1,2,3,4,5};
        int t=left[0];
        for (int i = 0; i < left.length-1; i++) {
            left[i] = left[i+1];
        }
        left [left.length-1] = t;
        System.out.println(Arrays.toString(left));
        for ( int data : left) {
            System.out.print(data + " ");
        }
        //----------------- pending

        int[] rot={1,2,3,4,5};
        int k=4000;
        k= k % rot.length;
        for (int i = 0; i < rot.length ; i++);
    //---------------------------------
        int swap[] = {1,2,3,4,5};   //Inspace + auxilliary space also called as Inspace Algorithm
         int i=0, j = swap.length-1;
        System.out.println("before " + Arrays.toString(swap));
        while(i<j){
            int temp1 = swap[i];
            swap[i]=swap[j];
            swap[j]=temp1;
            i++;
            j--;

        }
        System.out.println("After " + Arrays.toString(swap));

        //linear search




        //binary search
        System.out.println("hello");

        int array[]={12,25,56,68,69,64,89,95};
        int start =0 , end = array.length-1;
        int midindex = (start+end)/2;
        int target=89;
        int answer = -1;
        while (start < end){
            if (target==arr[start]) {
                answer = start;
                break;
            }
            if (target == array[midindex]) {
                    answer = midindex;
                    break;
                }
            }
            if (target > array[midindex])
                start = midindex + 1;
            else
                end = midindex-1;
            }
 //       System.out.println("(Binary search)answer is " +array[answer]);
   //     System.out.println("hello bhai madad krdo");
        }

