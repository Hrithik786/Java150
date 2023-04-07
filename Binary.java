public class Binary {
    public static void main(String[] args) {
        //The Condition of Binary is The Array always remains Sorted

        int[] arr = {10,20,30,35,40,50,51,53,69};
        int start  = 0 , end = arr.length-1;
        int target= 51;
        int mid=0;

        while(start < end){
            if (arr[mid] == target){
                System.out.println(mid+" = Index");
                break;
            }
            mid = ( start + end ) / 2;
            if (target > arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        System.out.printf("index a& value = "+start + arr[start]);
    }
}
