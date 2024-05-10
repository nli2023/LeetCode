
// LeetCode 1
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];

            if (hashMap.containsKey(remain)) {
                res[0] = hashMap.get(remain);
                res[1] = i;
                return res;
            }
            hashMap.put(nums[i], i);
        }

        return res;
    }
}
