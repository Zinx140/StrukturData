public class PriorityQueue {
    DoubleLinkedListPrior list;
    DoubleLinkedListPrior head;

    public PriorityQueue(int value, int priority_value) {
        this.list = new DoubleLinkedListPrior(value, priority_value);
        this.head = new DoubleLinkedListPrior(value, priority_value);
    }

    public void show() {
        list = head;
        while (list.next != null) {
            System.out.print(list.value + ", ");
            list = list.next;
        }
        System.out.println(list.value);
    }

    void insert(int value, int priority_value) {
        DoubleLinkedListPrior newNode = new DoubleLinkedListPrior(value, priority_value);

        if (head == null) {
            head = newNode;
            return;
        }

        if (priority_value >= head.priority_value) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        // Cari posisi sisip
        DoubleLinkedListPrior current = head;
        while (current.next != null && current.next.priority_value >= priority_value) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }

    int extract() {
        int value = head.value;
        list = head.next;
        head = list;
        return value;
    }

    int first() {
        return head.value;
    }

}
