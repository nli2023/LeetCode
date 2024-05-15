// LeetCode 15
public class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
             
            if (nums[i] > 0) { 
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {  
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum < 0) {
                    l++;
                } else if(sum > 0) {
                    r--;
                } else{
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (r > l && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    while (r > l && nums[l] == nums[l + 1]) {
                        l++;
                    } 
                    r--;
                    l++;
                }
            }

        }
        return result;
    }
}
