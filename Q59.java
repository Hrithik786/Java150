import java.util.Arrays;
public class Q59 {
    public static void main(String[] args) {
        int[] arr= {10,20,30,45,48,96};
        int v = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=v;
        System.out.println(Arrays.toString(arr));
    }
}
