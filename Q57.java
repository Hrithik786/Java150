public class Q57 {
    public static void main(String[] args) {
        int[] arr={10,20,12,30,25,40,50,60,25};
        boolean ans=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]){
                ans=true;
            }else {
                ans=false;
                break;
            }
        }
        System.out.println("array is "+ans+"ly sorted");
    }
}
