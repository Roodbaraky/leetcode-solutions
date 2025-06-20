class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>(); 
        backTrack(arr, "", 0,0,n);
        return arr;
    }

    public void backTrack(List<String> arr,String s, int left, int right, int max){
        if(s.length()==max*2){
            arr.add(s);
            return;
        }

        if(left<max) backTrack(arr,s+"(", left+1,right,max);
        if(right<left) backTrack(arr,s+")", left,right+1,max);

    }
}