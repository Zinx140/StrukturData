public class DoubleCircularLinkedList {
    int value;
    DoubleCircularLinkedList next;
    DoubleCircularLinkedList prev;

    DoubleCircularLinkedList head;
    DoubleCircularLinkedList tail;

    public DoubleCircularLinkedList() {
        head = null;
        tail = null;
    }

    private DoubleCircularLinkedList(int value) {
        this.value = value;
    }

    public void insert(int value) {
        DoubleCircularLinkedList newNode = new DoubleCircularLinkedList(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void remove(int value) {
        if (head == null)
            return;

        DoubleCircularLinkedList current = head;

        do {
            if (current.value == value) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                    return;
                }

                if (current == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    return;
                }

                if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    return;
                }

                current.prev.next = current.next;
                current.next.prev = current.prev;
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void show() {
        if (head == null) {
            System.out.println("(kosong)");
            return;
        }

        DoubleCircularLinkedList current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

}
