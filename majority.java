import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}