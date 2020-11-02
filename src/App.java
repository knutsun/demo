public class App {

    public static void main(String[] args) {

        Queue<Object> queue = new Queue<>();

        // enqueue Objects: in this case, the integers 0, 1, 2
        for(int i = 0; i < 3; i++)
            queue.enqueue("Iteration number: " + i);

        // execute 2 dequeue operations
        System.out.println("Size of queue: " + queue.size());

        for(int i = 0; i < queue.size(); i++)
            System.out.println("Dequeuing: " + queue.dequeue());

        // dequeue the rest
        while(!queue.isEmpty())
            System.out.println("Finally Dequeuing: " + queue.dequeue());
    }

}