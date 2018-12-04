package HomeWork16_21;

import java.util.*;

public class PreorityQueue {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        List<Double> arr = new ArrayList<>();
        while (!queue.isEmpty()) {
            arr.add(queue.poll());
        }
        arr.sort(Collections.reverseOrder());
        System.out.println(arr);

        Queue<Double> queue2 = new PriorityQueue<>(arr.size(),Collections.reverseOrder());
        queue2.addAll(arr);
        System.out.println(queue2);
    }
}
