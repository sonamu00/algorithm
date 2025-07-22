package codingTestInflearn.week2;

import java.util.*;

class LinkedListAppend {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListAppend(int value) {
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

}

public class append_linked_list_02_02 {

    public static void main(String[] args) {
        LinkedListAppend.Node node = new LinkedListAppend.Node(5);
        System.out.println(node.data + " " + node.next);

        LinkedListAppend linkedList = new LinkedListAppend(5);

        System.out.println(linkedList.head.data);
        linkedList.append(12);
        linkedList.append(8);

        linkedList.printAll();
    }

}


