public class DoubleLinkedListPrior {
    int value;
    int priority_value;

    DoubleLinkedListPrior next;
    DoubleLinkedListPrior prev;

    public DoubleLinkedListPrior(int value, int priority_value) {
        this.value = value;
        this.priority_value = priority_value;
        this.prev = null;
        this.next = null;
    }

}
