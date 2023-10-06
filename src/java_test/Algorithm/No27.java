package java_test.Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class No27 {

    /**
     * 多调用了一次sort方法产生了不必要的开销
     * */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if(nums[i] == val){
                nums[i] = 1000;
                k++;
            }
        }
        Arrays.sort(nums);
        return l - k;
    }

    /**
     * ...
     * */
    public int removeElementPro(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
