import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if(hMap.containsKey(x)){
                return new int[]{hMap.get(x), i};
            }
            hMap.put(nums[i], i);
        }

        return new int[]{};
    }
}