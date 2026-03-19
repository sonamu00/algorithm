package codingTestInflearn.week2;

public class KthNodeFromEndExample {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    static class SinglyLinkedList {
        private ListNode head;

        SinglyLinkedList(int value) {
            this.head = new ListNode(value);
        }

        public void append(int value) {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }

        public ListNode getKthNodeFromEnd(int k) {
            if (k <= 0) {
                throw new IllegalArgumentException("k는 1 이상이어야 합니다.");
            }

            ListNode fast = head;
            ListNode slow = head;

            for (int i = 0; i < k; i++) {
                if (fast == null) {
                    throw new IllegalArgumentException("k가 리스트 길이보다 큽니다.");
                }
                fast = fast.next;
            }

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList(6);
        linkedList.append(7);
        linkedList.append(8);

        System.out.println(linkedList.getKthNodeFromEnd(2).value); // 7
    }
}