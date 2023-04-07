import java.util.Arrays;

public class Method{
    public static int sum(int[] a){ //refernce
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        a[a.length-1] = 50;
        return sum;
    }
    public static void main(String[] args) {
     int[] arr =  {10,20,30,40,55};
     int sum = sum(arr);
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}
