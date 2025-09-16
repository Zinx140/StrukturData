public class App {
    public static void main(String[] args) throws Exception {

        // Linked List
        // LinkedList a = new LinkedList(1);
        // push_back(a, 3);
        // show(a);
        // push_back(a, 7);
        // push_back(a, 6);
        // push_back(a, 5);
        // push_back(a, 4);
        // push_back(a, 10);
        // push_back(a, 8);
        // show(a);
        // remove(a, 10);
        // show(a);

        // Double Linked List
        // DoubleLinkedList a = new DoubleLinkedList(0);
        // show(a);
        // push_back(a, 2);
        // push_back(a, 3);
        // push_back(a, 4);
        // push_back(a, 7);
        // push_back(a, 9);
        // show(a);
        // remove(a, 2);
        // show(a);
        // a = pop_top(a);
        // show(a);
        // pop_back(a);
        // show(a);

        // Circular Linked List
        // CircularLinkedList cll = new CircularLinkedList();
        // cll.insert(10);
        // cll.show();
        // cll.insert(10);
        // cll.show();
        // cll.remove(10);
        // cll.show();

        // Double Circular Linked List
        // DoubleCircularLinkedList dcll = new DoubleCircularLinkedList();
        // dcll.insert(10);
        // dcll.insert(20);
        // dcll.insert(30);
        // dcll.insert(40);

        // dcll.show();

        // dcll.remove(10);
        // dcll.show();
        // dcll.remove(40);
        // dcll.show();

        // Stack
        // Stack s = new Stack(0);
        // s.show();
        // s.push(5);
        // s.push(7);
        // s.push(8);
        // s.show();
        // System.out.println(s.pop());
        // s.show();

        // Queue
        // Queue q = new Queue(0);
        // q.insert(0);
        // q.insert(5);
        // q.insert(2);
        // q.show();
        // System.out.println(q.extract());
        // q.show();

        // Priotity Queue
        // PriorityQueue pq = new PriorityQueue(0, 4);
        // pq.show();
        // pq.insert(3, 2);
        // // pq.insert(10, 3);
        // pq.show();
        // System.out.println(pq.extract());
        // pq.show();
        // pq.first();

    }

    // Linked - List
    // static void show(LinkedList list) {
    // while (list.next != null) {
    // System.out.print(list.value + ", ");
    // list = list.next;
    // }
    // System.out.println(list.value);
    // }

    // static void push_back(LinkedList list, int value) {
    // while (list.next != null) {
    // list = list.next;
    // }
    // list.next = new LinkedList(value);
    // }

    // static void insert(LinkedList list, int value, int index) {
    // if (index == 0) {
    // LinkedList temp = list;
    // list = new LinkedList(value);
    // list.next = temp;
    // } else {
    // int curr_idx = 0;
    // LinkedList temp = null;
    // while (curr_idx < index) {
    // temp = list;
    // list = list.next;
    // curr_idx++;
    // }
    // temp.next = new LinkedList(value);
    // temp.next.next = list;
    // }
    // }

    // static void remove(LinkedList list, int value) {
    // LinkedList temp = list;
    // while (list.next != null && list.value != value) {
    // temp = list;
    // list = list.next;
    // }
    // if (list.value == value) {
    // temp.next = list.next;
    // list = null;
    // }
    // }

    // Double Linked List
    // static void show(DoubleLinkedList list) {
    // while (list.next != null) {
    // System.out.print(list.value + ", ");
    // list = list.next;
    // }
    // System.out.println(list.value);
    // }

    // static void push_back(DoubleLinkedList list, int value) {
    // while (list.next != null) {
    // list = list.next;
    // }
    // DoubleLinkedList new_list = new DoubleLinkedList(value);
    // new_list.prev = list;
    // list.next = new_list;
    // }

    // static void remove(DoubleLinkedList list, int value) {
    // while (list.next != null && list.value != value) {
    // list = list.next;
    // }

    // if (list.value == value) {
    // list.prev.next = list.next;
    // list.next.prev = list.prev.next;

    // list = null;
    // }
    // }

    // static DoubleLinkedList pop_top(DoubleLinkedList list) {
    // return list.next;
    // }

    // static void pop_back(DoubleLinkedList list) {
    // while (list.next != null) {
    // list = list.next;
    // }

    // list.prev.next = null;
    // list = null;
    // }
}
