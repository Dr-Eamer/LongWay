package java_test.Algorithm;

import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

public class No169 {
    /**
     *7ms/48.92mb
     * 先排序的思路正确，但是绕了很大一圈
     * 因为最多的元素数量是n/2,所以目标每次都处于中间位置
     * 直接输出即可
     * */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        TreeMap<Integer, Integer> tMap = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            counter++;
            if (i == nums.length - 1){
                tMap.put(counter,nums[nums.length - 1]);
                break;
            }
            if (nums[i] != nums[i + 1]){
                tMap.put(counter,nums[i]);
                counter = 0;
            }
        }

        return tMap.get(tMap.lastKey());
    }

    /**
     *3ms/48.6mb
     * 所以就这么简单
     * */
    public int majorityElementPro(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 摩尔投票算法(Moore Voting Algorithm)
     * 这个很快,时间复杂度为O(n)
     * */
    public int mooreVoting(int[] nums){
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if(count == 0){
                candidate = num;
            }
            if (num == candidate) {
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }


}
