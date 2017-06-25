문제 : https://www.hackerrank.com/challenges/time-conversion

public class Solution {

    static String timeConversion(String s) {
        String type = s.substring(8);
        String time = s.substring(0, 8);
        int hour = Integer.parseInt(time.substring(0, 2));
        
        if("AM".equals(type)) {
            if(hour != 12) {
                return time;
            }
            
            return "00" + time.substring(2, 8);
        }
        
        if("PM".equals(type)) {
            if(hour != 12) {
                hour += 12;
                return String.valueOf(hour) + time.substring(2, 8);
            }

            return time.substring(0, 8);
        }
        
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
