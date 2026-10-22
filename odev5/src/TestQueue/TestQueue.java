package TestQueue;

import odev5.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // 1'den 20'ye kadar ekleme
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Kuyruktan çıkarma ve ekrana yazdırma
        System.out.println("Kuyruktan çıkarılan elemanlar:");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}