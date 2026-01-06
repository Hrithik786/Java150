import java.util.Arrays;
import java.util.Scanner;

public class Algo {
    public static int linearSearch(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter Target:\n");
        int target= sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        System.out.println(" Not Found ");
        return -1;
    }
    public static boolean checkSort(int[] arr) {
        boolean ans = true;
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ans = false;
                return ans;
            } else if (arr[i] < arr[i + 1])
                ans = true;
        }
        return ans;
    }

    public static int binarySearch(int[] arr) {
        int target;
        int left = 0, right = arr.length - 1;
        int mid = (left + right) / 2;
        Scanner sc = new Scanner(System.in);

        System.out.println("please Enter Target");
        target = sc.nextInt();

        while (left < right) {
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
    public  static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]  =  arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));//print
        }
    }

    public static void main(String[] args) {
        int choice,target,i,x;
        Scanner sc = new Scanner(System.in);
        int[] arr ={10,20,30,40,52,14,36,47,85,96,25};

        do {
            System.out.println("1.Printing Array\n2.Linear Search\n3.Binary Search\n4.Check Sort\n5.BubbleSort\n6.Inspace Auxilliary arry Reersl Algo\n");
            choice = sc.nextInt();
            switch(choice){

                case 1 -> System.out.println(Arrays.toString(arr));

                case 2-> {
                    x = linearSearch(arr);
                    if (x!=-1)
                        System.out.println("Element Found at "+x+" Position");
                }
                case 3-> {
                    x = binarySearch(arr);
                    System.out.println("Element Found at "+x+" Position");
                }
                case 4-> System.out.println("array is "+checkSort(arr)+"ly sorted");
                case 5-> bubbleSort(arr);
                //case 6-> inspaceAlgo(arr); //array reversal

                default -> System.out.println("please ENTER VALiD INPUT");
            }
        }while (choice!=10);
    }
}
