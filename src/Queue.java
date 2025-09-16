public class Queue {
    DoubleLinkedList list;
    DoubleLinkedList head;

    public Queue(int value) {
        this.list = new DoubleLinkedList(value);
        this.head = list;
    }

    public void show() {
        list = head;
        while (list.next != null) {
            System.out.print(list.value + ", ");
            list = list.next;
        }
        System.out.println(list.value);
    }

    public void insert(int value) {
        while (list.next != null) {
            list = list.next;
        }
        DoubleLinkedList new_list = new DoubleLinkedList(value);
        new_list.prev = list;
        list.next = new_list;
    }

    public int extract() {
        int value = head.value;
        list = head.next;
        head = list;
        return value;
    }

    public int first() {
        return head.value;
    }

}
