package java_test.Algorithm;

import java.util.HashMap;
import java.util.Stack;

public class No20 {

    /**
     * 这题不会
     * */
    public boolean isValid(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('(',1);
        map.put(')',-1);
        map.put('{',10);
        map.put('}',-10);
        map.put('[',5);
        map.put(']',-5);
        char[] charArray = s.toCharArray();
        if (map.get(charArray[0]) < 0) {
            return false;
        }

        for (int i = 0; i < charArray.length; i++) {
            if ((map.get(charArray[i]) < 0) &&
                    (map.get(charArray[i - 1]) + map.get(charArray[i]) != 0)
            ){
                return false;
            }
        }
        return true;
    }


    /**
     * 思路；
     * 用栈来解，准备一个空栈，
     * 每当读到一个左括号的时候就让相应的右括号入栈，
     * 当读到右括号的时候则进行判断↓
     * →如果此时的栈是空的
     * →或者此时让当前的栈顶出栈，如果不等于当前的字符
     * 说明在此之前没有相应的左括号
     * */
    public boolean isValidPro(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
           if(c == '('){
               stack.push(')');
           } else if(c == '['){
               stack.push(']');
           } else if(c == '{'){
               stack.push('}');
           } else if(stack.isEmpty() || stack.pop() != c){
               return false;
           }
        }
        return stack.isEmpty();
    }


}
