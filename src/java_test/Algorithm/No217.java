package java_test.Algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No217 {

    /**
     *16ms/56.99mb
     *想到了hashSet是正确的,但是不熟悉Set的常用方法
     * 所以能更快
     * */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mSet = new HashSet<>();
        int l = nums.length;
        for (int num : nums) {
            mSet.add(num);
        }
        return mSet.size() == l;
    }

    /**
     *10ms/54.84mb
     *使用contains方法会更有效率
     * */
    public boolean containsDuplicatePro(int[] nums) {
        Set<Integer> mSet = new HashSet<>();
        for (int num : nums) {
            if (mSet.contains(num)){
                return true;
            }
            mSet.add(num);
        }
        return false;
    }

    /**
     *6ms/55.5mb
     *直接利用add方法的返回值好像更快
     * */
    public boolean containsDuplicateProo(int[] nums) {
        Set<Integer> mSet = new HashSet<>();
        for (int num : nums) {
            if (!mSet.add(num)){
                return true;
            }
        }
        return false;
    }
}
