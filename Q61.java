import java.util.Arrays;

public class Q61 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,55};
        int left,right;
        left = 0;
        right = arr.length-1;
        while(left < right){
            int temp   = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
