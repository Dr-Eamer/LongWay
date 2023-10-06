package java_test.Algorithm;

import java.util.HashMap;

public class No13 {

    /**
     *2ms/43.53mb 100%
     * 虽然很快，但是不够优雅
     * */
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i != s.length() -1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                        result -= 1;
                    else
                        result += 1;
                    break;

                case 'V':
                    result += 5;
                    break;

                case 'X':
                    if (i != s.length() -1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                        result -= 10;
                    else
                        result += 10;
                    break;

                case 'L':
                    result += 50;
                    break;

                case 'C':
                    if (i != s.length() -1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
                        result -= 100;
                    else
                        result += 100;
                    break;

                case 'D':
                    result += 500;
                    break;

                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }

    /**
     *5ms/43.4mb 100%
     * 这题好像没啥别的好方法，直接做即可
     * 用map虽然优雅，但是不快
     * */
    public int romanToIntPro(String s) {
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                result -= map.get(s.charAt(i));
            else
                result += map.get(s.charAt(i));
        }

        return result;
    }
}
