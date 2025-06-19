// Last updated: 19/06/2025, 09:11:50
import java.util.regex.*;

class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
       

            long result = 0;
            int i =0;
            while (i < s.length()-1 && s.charAt(i) == ' ') {
                i++;
            }
            
            boolean isNegative = false;
            boolean isPositive = false;
         if(s.charAt(i) == '-'){
                    isNegative = true;
                    if(i<s.length()-1)i++;
                } 
                if(s.charAt(i) == '+'){
                    isPositive = true;
                    if(i<s.length()-1)i++;
                } 
                if(isPositive&&isNegative){
                    return 0;
                }
            for (i=i; i < s.length(); i++) {
                
                
                if(!Character.isDigit(s.charAt(i))) {
                    break;
                }              
                result = result * 10 + (s.charAt(i) - '0');

                if (result > Integer.MAX_VALUE) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }

            
            return isNegative ? (int) -result : (int) result;
    }
}
