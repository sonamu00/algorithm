package codingTestInflearn.week2;

public class GetLinkedListSum {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        LinkedList(int value) {
            this.head = new Node(value);
        }

        void append(int value) {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(value);
        }
    }

    public static int getLinkedListSum(LinkedList linkedList1) {
        /*
         * 입력: linkedList1 = 678, linkedList2 = 358
         * 출력: linkedList1 과 linkedList2 를 각각 첫번째부터 순회한 값을 덧셈 = 1032
         * 문제 정의: 연결리스트가 각 노드에 한 자리수로 저장한 숫자를 연결된 노드 개수만큼 n의 자리 수로 만들어서 덧셈하기
         */
        Node node = linkedList1.head;
        int nodeDataSum = 0;

        while (node.next != null) {
            nodeDataSum = nodeDataSum * 10 + node.data;
            node = node.next;
        }

        nodeDataSum = nodeDataSum * 10 + node.data;

        return nodeDataSum;
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(6);
        linkedList1.append(7);
        linkedList1.append(8);

        LinkedList linkedList2 = new LinkedList(3);
        linkedList2.append(5);
        linkedList2.append(4);

        System.out.println(getLinkedListSum(linkedList1) + getLinkedListSum(linkedList2));

    }
}
