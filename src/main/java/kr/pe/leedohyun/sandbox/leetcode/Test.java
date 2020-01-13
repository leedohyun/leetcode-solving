package kr.pe.leedohyun.sandbox.leetcode;

public class Test {
    public static void main(String... args) {
        Test test = new Test();
        test.process();
    }

    public void process() {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        list1.next = list2;

        ListNode list3 = new ListNode(3);
        list2.next = list3;

        ListNode list4 = new ListNode(4);
        list3.next = list4;

        ListNode result = swapPairs(list1);
        print(result);
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode currentNode = fakeHead;

        while (currentNode.next != null && currentNode.next.next != null) {
            ListNode first = currentNode;
            currentNode = currentNode.next;
            first.next = currentNode.next;

            print(fakeHead);
            print(currentNode);

            ListNode next = currentNode.next.next;
            currentNode.next.next = currentNode;
            currentNode.next = next;

            print(fakeHead);
            print(currentNode);
        }

        return fakeHead.next;
    }

    public void print(ListNode head) {
        while(true) {
            System.out.print(head.val + ", ");
            head = head.next;
            if (head == null) {
                break;
            }
        }
        System.out.println();
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
