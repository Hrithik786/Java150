public class Q56 {
    public static void main(String[] args) {
        int[] arr = {12,18,02,1,36,25,14,85,96,35,46};
        int gr = Math.max(arr[0],arr[1]);
        int sg = Math.min(arr[0],arr[1]);

        for (int i = 2; i < arr.length ; i++) {
            if ( gr < arr[i]){
                gr = arr[i];
            }else if ( sg < arr[i]){
                sg = arr[i];
            }
        }
        System.out.println("greatest element = "+sg);
    }
}
