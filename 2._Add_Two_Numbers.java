/**
 * ※要復習問題
 * 連結リストについてあまり理解できていない。プログラム内でも記述方法がわからず解けなかった
 * プログラム上での流れはある程度思いついたがコードに落とし込めなかった。。。
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            // l1に数字（桁）がある場合
            if(l1 != null){ 
                sum += l1.val;
                l1 = l1.next;
            }
            // l2に数字（桁）がある場合
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10; //繰り上げ
            ListNode node = new ListNode(sum % 10); 
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}