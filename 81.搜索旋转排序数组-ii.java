/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 * 分成两步：
 * 1. 找旋转点，并不用
 * 2. 二分查找？
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l++;
                r--;
            }
            else if(nums[l] <= nums[mid]){//就算有翻转点最多也是相等
                if(nums[l] <= target && target <= nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{//没有问题，只要l大于mid，说明右边是好的
                if(nums[mid] <= target && target <= nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

