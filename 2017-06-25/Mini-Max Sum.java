문제 : https://www.hackerrank.com/challenges/mini-max-sum


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long low = arr[0];
        long high = arr[0];
        long sum = 0;
        
        for(int i = 0; i<arr.length; i++) {
            long target = arr[i];
            if(target > high) {
                high = target;
            }
            if(target < low) {
                low = target;
            }
            
            sum += target;
        }
        
        System.out.print(sum - high);
        System.out.print(" ");
        System.out.print(sum - low);
    }
}
