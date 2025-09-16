public class DoubleLinkedList {
    int value;

    DoubleLinkedList next;
    DoubleLinkedList prev;

    public DoubleLinkedList(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

}
