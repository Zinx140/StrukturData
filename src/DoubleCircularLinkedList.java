public class DoubleCircularLinkedList {
    int value;

    DoubleCircularLinkedList head;
    DoubleCircularLinkedList tail;
    DoubleCircularLinkedList next;
    DoubleCircularLinkedList prev;

    public DoubleCircularLinkedList(int value) {
        this.value = value;
        this.head = this;
        this.tail = this;
        this.next = this;
        this.prev = this;
    }
}
