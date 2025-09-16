public class Stack {
    DoubleLinkedList list;
    DoubleLinkedList head;

    public Stack(int value) {
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

    public void push(int value) {
        while (list.next != null) {
            list = list.next;
        }
        DoubleLinkedList new_list = new DoubleLinkedList(value);
        new_list.prev = list;
        list.next = new_list;
    }

    public int pop() {
        int value = 0;
        while (list.next != null) {
            list = list.next;
        }

        value = list.value;
        list.prev.next = null;
        list = null;
        return value;
    }

    public int top() {
        while (list.next != null) {
            list = list.next;
        }

        return list.value;
    }
}
