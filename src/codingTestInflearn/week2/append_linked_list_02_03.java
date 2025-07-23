package codingTestInflearn.week2;

class linkedListAppend2 {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public linkedListAppend2(int value) {
        this.head = new Node(value);
    }

    public void append(int value) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(value);
    }

    public void printAll() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public void printIndexNode (int index) {
        Node cur = this.head;
        int count = 0;
        while (count <= index && cur != null) {
            if (count == index) {
                System.out.println(cur.data);
                return;
            }
            cur = cur.next;
            count++;
        }
    }


}

public class append_linked_list_02_03 {

    public static void main(String[] args) {
        linkedListAppend2 linkedList = new linkedListAppend2(5);
        linkedList.append(12);
        linkedList.append(8);

        //linkedList.printAll();
        linkedList.printIndexNode(0);
        linkedList.printIndexNode(1);
        linkedList.printIndexNode(2);

    }

}


