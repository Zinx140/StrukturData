public class CircularLinkedList {
    int value;

    CircularLinkedList head;
    CircularLinkedList tail;
    CircularLinkedList next;

    public CircularLinkedList(int value) {
        this.value = value;
        this.head = this;
        this.tail = this;
        this.next = this;
    }
}
