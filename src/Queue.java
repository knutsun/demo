public class Queue<T> {

    private Stack<T> StackA;      // for enqueue
    private Stack<T> StackB;     // for dequeue
    private int size;

    public Queue() {
        StackA = new Stack<>();
        StackB = new Stack<>();
    }

    public void enqueue(T e) {
        StackA.push(e);
        size++;
    }

    public T dequeue() {
        // pack StackA if StackB is empty
        if(StackB.isEmpty()){

            while(!StackA.isEmpty()){
                T e = StackA.pop();
                StackB.push(e);
            }
        }

        // unpack StackB
        T temp = null;
        if(!StackB.isEmpty()) {
            temp = StackB.pop();
            size--;
        }
        return temp;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

}