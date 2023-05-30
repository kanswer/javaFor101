/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++){
            ++count[s.charAt(i)-'a'];
            --count[t.charAt(i)-'a'];
        }
        for(int i = 0; i<s.length(); i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}

class kk{
    public static void main(String[] args) {
        String s = "nl", t = "cx";
        System.out.println(Solution.isAnagram(s, t));
    }
}
// @lc code=end

