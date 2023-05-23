public class test3{
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,1};
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
        System.out.println(nums[l]);
    }
}