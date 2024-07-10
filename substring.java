class Solution {
    public int lengthOfLongestSubstring(String s) {
        //abcabcbb
        int left=0;int max=Integer.MIN_VALUE;
        Set<Character> set=new HashSet<>();
        if(s.length()==0) return 0;
        for(int right=0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));//a,b
                max=Math.max(max,right-left+1);//0-0+0+1,
            }else{
                if(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                }
                set.add(s.charAt(right));
            }
        }
        return max;
    }
}
