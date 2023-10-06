package java_test.Algorithm;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class No26 {

    /**
     * 4ms/44.37mb/10%
     * 想太多，反而没效率
     * */
    public int removeDuplicates(int[] nums) {
        Set<Integer> s1 = new LinkedHashSet<>();
        for (int num : nums) {
            s1.add(num);
        }
        int result = s1.size();
        int index = 0;
        for (int item : s1) {
            nums[index++] = item;
        }
        return result;
    }

    /**
     * 1ms/43.7mb/96.68%
     * 思路：
     * 没啥思路，正常遍历就行了
     * */
    public int removeDuplicatesPro(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
