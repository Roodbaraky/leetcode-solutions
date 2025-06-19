// Last updated: 19/06/2025, 09:11:51
class Solution {
    public int reverse(int x) {
        int reversedNumber = 0;

        while(x != 0){

            if(reversedNumber < Integer.MIN_VALUE / 10 || reversedNumber > Integer.MAX_VALUE / 10){
                return 0;
            }

            int lastDigit = x % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            x /= 10;
        }

        return reversedNumber;
    }
}