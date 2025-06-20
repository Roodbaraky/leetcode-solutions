// Last updated: 20/06/2025, 09:57:40
class Solution {
    public int romanToInt(String s) {
       //Iterate through string backwards
       //Check char against char map -> add value to current value
       //Look ahead to previous to check for I (VX), X (LC), C (DM)
       //-> adjust value

       Map<String, Integer> charMap = new HashMap<>();

       charMap.put("I",1);
       charMap.put("IV",4);
       charMap.put("IX",9);
       charMap.put("V", 5);
       charMap.put("X", 10);
       charMap.put("XL",40);
       charMap.put("XC",90);
       charMap.put("L",50);
       charMap.put("C",100);
       charMap.put("CD",400);
       charMap.put("CM",900);
       charMap.put("D", 500);
       charMap.put("M",1000);
        int total =0;
       for (int i = s.length()-1; i>-1;i--){
        if(i>0&&charMap.containsKey(""+s.charAt(i-1)+s.charAt(i))){
            total+= charMap.get(""+s.charAt(i-1)+s.charAt(i));
            i--;
        }
        else{
            total+= charMap.get(""+s.charAt(i));
        }
       }
       return total; 
    }
}