class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Queue:
    def __init__(self):
        self.head = None  # dequeue 쪽 (앞)
        self.tail = None  # enqueue 쪽 (뒤)

    def enqueue(self, value):
        new_node = Node(value)
        if self.tail is None:          # 빈 큐
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node  # 기존 tail 뒤에 연결
            self.tail = new_node       # tail 포인터 이동

    def dequeue(self):
        if self.is_empty():
            raise IndexError("dequeue from empty queue")
        value = self.head.data
        self.head = self.head.next     # head 포인터 이동
        if self.head is None:          # 큐가 비었으면 tail도 정리
            self.tail = None
        return value

    def peek(self):
        if self.is_empty():
            raise IndexError("peek from empty queue")
        return self.head.data

    def is_empty(self):
        return self.head is None