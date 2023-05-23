/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
 * 二分法找正序
 * mid
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1, mid=0;
        while(l < r){
            mid = l + (r - l) / 2;
            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l++;
                r--;
            }
            else if(nums[l] <= nums[mid]){
                if(nums[mid] <= nums[r]){
                    r = mid;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                r = mid;
            }
        }
        return nums[l];
    }
}
// @lc code=end

