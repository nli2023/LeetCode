public class 4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
             
            if (nums[i] > 0 && nums[i] > target) { 
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {  
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {

                if (j > i + 1 && nums[j - 1] == nums[j]) {  
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;

                while(l < r) {
                    long sum = nums[i] + nums[j] +nums[l] + nums[r];

                    if(sum < target) {
                        l++;
                    } else if(sum > target) {
                        r--;
                    } else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
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

        }
        return result;
    }
}
