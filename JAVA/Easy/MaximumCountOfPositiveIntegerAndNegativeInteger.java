// leetCode 2529
class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {

        int pointer = 0;
        int neg = 0;
        int pos = 0;

        while (pointer < nums.length) {
            if (nums[pointer] < 0) {
                neg++;
                pointer++;
            } else if (nums[pointer] > 0) {
                pos++;
                pointer++;
            } else {
                pointer++;
            }
        }

        if (neg > pos) {
            return neg;
        } else {
            return pos;
        }

    }
}