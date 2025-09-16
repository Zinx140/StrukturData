public class CircularLinkedList {
    int value;

    CircularLinkedList head;
    CircularLinkedList tail;

    CircularLinkedList next;

    public CircularLinkedList(int value) {
        this.value = value;
    }

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int value) {
        CircularLinkedList newNode = new CircularLinkedList(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void show() {
        if (head == null)
            return;

        CircularLinkedList current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void remove(int value) {
        if (head == null)
            return;
        CircularLinkedList current = head;
        CircularLinkedList prev = tail;

        do {
            if (current.value == value) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                    return;
                }

                if (current == head) {
                    head = head.next;
                    tail.next = head;
                    return;
                }

                if (current == tail) {
                    tail = prev;
                    tail.next = head;
                    return;
                }

                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

}
