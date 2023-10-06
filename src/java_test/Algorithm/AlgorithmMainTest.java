package java_test.Algorithm;

import java.lang.reflect.Array;
import java.util.*;

public class AlgorithmMainTest {
    public static void main(String[] args) {
        AlgorithmMainTest tester = new AlgorithmMainTest();
        //tester.twoSum(new int[]{2,7,11,15},9);
        ///tester.twoSumPro(new int[]{2,7,11,15},9);
//        tester.addTwoNumbers(
//                new ListNode(2,new ListNode(4,new ListNode(3))),
//                new ListNode(5,new ListNode(6,new ListNode(4)))
//        );
        //tester.addTwoNumbers2(new int[]{2,4,3},new int[]{5,6,4});
        tester.test();
    }

    private void test(){
       String name = "ABC";

    }

    //towSum
    //over than 30%
    private void twoSum(int[] nums, int target) {
        int[] answer = {};
        for(int i = 0;i < nums.length;i++){
            for(int k = i + 1;k < nums.length;k++){
                if(nums[i] + nums[k] == target){
                    answer = new int[2];
                    answer[0] = i;
                    answer[1] = k;
                    break;
                }
            }
            if (answer.length > 0){
                break;
            }
        }
        System.out.println("Answer is:[" + answer[0] + "," + answer[1] + "]");
    }

    //over than 99%
    private void twoSumPro(int[] nums, int target){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                System.out.println("Answer is:[" + result[0] + "," + result[1] + "]");
                break;
            }
            map.put(nums[i],i);
        }
    }

    private void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = head.next;
        head.next = null;
        //LinkedList list = new LinkedList<Integer>();
        //LinkedHashMap map = new LinkedHashMap<>();
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
    }

    private void addTwoNumbers2(int[] l1, int[] l2) {
        int[] result = new int[3];
        int n = l1.length;
        boolean needPlus = false;
        int current;
        for (int i = n; i > 0; i--) {
            current = l1[i-1] + l2[i-1];
            if (current >= 10) {
                current -= 10;
                result[n - i] = needPlus ? current + 1 : current;
                needPlus = true;
                continue;
            }
            result[n - i] = needPlus ? current + 1 : current;
            needPlus = false;
        }
        System.out.println("Answer is:" + Arrays.toString(result));
    }

    //准备一个单向链表
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //回文数
    //7ms/43.4mb over than 20%
    private boolean isPalindrome(int x) {
        String startChar = Integer.toString(x);
        StringBuilder result = new StringBuilder();
        for (int i = startChar.length() - 1 ; i >= 0; i--) {
            result.append(startChar.charAt(i));
        }
        return result.toString().equals(startChar);
    }

    /**
     * 思路:
     * 一个整数的位数只有奇偶两种情况，
     * 所以比如五位数的整数只需要反转后两位，
     * 并与前两位对比即可
     * */
    //4ms/42.4mb over than 100%
    private boolean isPalindromePro(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }


}
