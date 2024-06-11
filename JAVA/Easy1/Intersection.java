
// LeetCode 349
import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            count1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            count2[nums2[i]]++;
        }

        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] > 0 && count2[i] > 0) {
                resList.add(i);
            }
        }
        int res[] = new int[resList.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}
