public class quicksort{
    public static void main(String[] args) {
        int[] nums = new int[]{10,7,2,4,7,62,3,4,2,1,8,9,19};
        quick_sort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void quick_sort(int[] nums, int l, int r){
        if(l > r){
            return;
        }
        int first = l, last = r, key = nums[first];
        while(first < last){
            while(first < last && nums[last] >= key){
                --last;
            }
            while(first < last && nums[first] <= key){
                ++first;
            }
            if(first < last){
                int temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
            }
        }
        nums[l] = nums[first];
        nums[first] = key;
        quick_sort(nums, l, first-1);
        quick_sort(nums, first+1, r);
    }
}