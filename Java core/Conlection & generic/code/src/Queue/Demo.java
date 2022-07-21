package Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Demo {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

       // TRIỂN KHAI CLASS LINKEDLIST

        // Chèn phần tử chỉ định vào Queue bằng phương thức offer
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Truy cập các phần tử trong Queue
        int accessedNumber = numbers.peek();
        System.out.println("Truy cập phần tử: " + accessedNumber);

        // Loại bỏ các phần tử tron Queue
        int removedNumber = numbers.poll();
        System.out.println("Loại bỏ phần tử: " + removedNumber);

        System.out.println("Cập nhật Queue: " + numbers);


        //TRIỂN KHAI CLASS PRIORITYQUEUE
        Queue<Integer> numberss = new PriorityQueue<>();

        // Chèn phần tử vào Queue bằng phương thức offer
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);

        // Truy cập phần tử trong Queue
        int accessedNumbers = numbers.peek();
        System.out.println("Truy cập phần tử: " + accessedNumber);

        // Loại bỏ phần tử trong Queue
        int removedNumbers = numbers.poll();
        System.out.println("Loại bỏ phần tử: " + removedNumber);

        System.out.println("Cập nhật Queue: " + numbers);
    }
}
