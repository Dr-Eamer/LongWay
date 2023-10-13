package java_test.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class No14 {

    /**
     *2ms/40.13mb 28%
     * 想不到别的方法，难受
     * 暴力拆解
     * */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) {
            return strs[0];
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        int total = strs[0].length();
        String result = "";
        for (int k = 0; k < total; k++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(k) != strs[0].charAt(k)) {
                   return result;
                }
            }
            result += String.valueOf(strs[0].charAt(k));
        }
        return result;
    }

    /**
     *1ms/40.2mb 82.92%
     * 思路；
     * 利用Arrays.sort进行排序，因为要找出共同的前缀，
     * 所以排序后只需要比较头尾两个字符传即可
     * */
    public String longestCommonPrefixPro(String[] strs) {
        if (strs.length < 2) {
            return strs[0];
        }
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

}
