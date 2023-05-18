/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 * 考虑两次出现，同样先找到一个结果，再进行更新
 * 1. 第一次出现，找到后判断条件>=，然后设为上届，继续，l等于r了，说明r左边没有更小的了
 * 2. 最后一次出现，找到后判断条件>，然后设为上届，左边开始加，同理，l等于r，说明r就是临界条件了
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[]{-1,-1};
        int lower = getLower(nums, target);
        int upper = getUpper(nums, target);
        if(lower == nums.length || nums[lower] != target){
            return answer; //已经包含了empty()的情况了
        }
        answer[0] = lower;
        answer[1] = upper;
        return answer;
    }
    public int getLower(int[] nums, int target){
        int l=0,r=nums.length,mid;
        while(l < r){
            mid = l + (r - l) / 2;
            if(nums[mid] >= target){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
    public int getUpper(int[] nums, int target){
        int l=0,r=nums.length,mid;
        while(l < r){
            mid = l + (r - l) / 2;
            if(nums[mid] > target){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l - 1;
    }
}
// @lc code=end

