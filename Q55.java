public class Q55 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,45,20,95,25,144,25,36,550,55};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println("greatest Element = "+arr[max]+" and it's Index is "+max);
    }
}
