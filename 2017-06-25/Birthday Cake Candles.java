문제 : https://www.hackerrank.com/challenges/birthday-cake-candles


public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int high = ar[0];
        int result = 0;
        for(int i =0; i<n; i++) {
            if(high < ar[i]) {
                high = ar[i];
            }
        }
        
        for(int j=0; j<n; j++) {
            if(ar[j] == high) {
                result++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
