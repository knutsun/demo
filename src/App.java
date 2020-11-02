public class App {

    public static void main(String[] args) {

        Queue<Object> queue = new Queue<>();

        // enqueue integers 1..3
        for(int i = 0; i < 3; i++)
            queue.enqueue(i);

        // execute 2 dequeue operations
        System.out.println(queue.size());
        for(int i = 0; i < queue.size(); i++)
            System.out.println("Dequeing: " + queue.dequeue());

        // dequeue the rest
        while(!queue.isEmpty())
            System.out.println("Finally Dequeing: " + queue.dequeue());
    }

}