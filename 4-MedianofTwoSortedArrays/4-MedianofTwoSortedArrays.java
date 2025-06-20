// Last updated: 20/06/2025, 10:06:06
class Solution {
    public int romanToInt(String s) {
       //Iterate through string backwards
       //Check char against char map -> add value to current value
       //Look ahead to previous to check for I (VX), X (LC), C (DM)
       //-> adjust value

       Map<Character, Integer> charMap = new HashMap<>();

       charMap.put('I',1);
       charMap.put('V', 5);
       charMap.put('X', 10);
       charMap.put('L',50);
       charMap.put('C',100);
       charMap.put('D', 500);
       charMap.put('M',1000);
        int total =0;
       for (int i =0 ; i<s.length();i++){
        if(i<s.length()-1&&charMap.get(s.charAt(i))<charMap.get(s.charAt(i+1))){
            total+=charMap.get(s.charAt(i+1))-charMap.get(s.charAt(i));
            i++;
        }
        else{
            total+=charMap.get(s.charAt(i));
        }
    }
       return total; 

}
}