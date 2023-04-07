public class Q62 {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50,60,70,80,90 };
        int target = 90;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                System.out.println("index = "+i);
                System.out.println(arr[i]);
                break;
            }
        }
        //System.out.println("-1");

    }
}
