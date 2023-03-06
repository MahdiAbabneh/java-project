package com.company;

class Queue {
    int first = -1;//head
    int last = -1;//rear
    int[] arr = new int[10];

    public boolean empty() {
        return first == last;
    }

    public boolean full() {
        return last == arr.length - 1;
    }

    public void enqueu(int a) {
        if (full()) {
            System.out.println("queue is full");
        } else
            last++;
        arr[last] = a;

    }

    public int dequeu() {
        if (empty()) {
            System.out.println("queue is empty");
            return 0;
        } else
            first++;
        return arr[first];
    }
}

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueu(5); //5
        queue.enqueu(6); //5,6
        queue.enqueu(7); //5,6,7
        queue.dequeu();//5  queue=6,7
        queue.dequeu();//6  queue=7
        queue.dequeu();//7  queue=empty
        System.out.println(queue.dequeu());
        queue.enqueu(8);
        queue.enqueu(9);
        queue.enqueu(10);
        queue.enqueu(11);
        queue.enqueu(12);
        queue.enqueu(13);
        queue.enqueu(14);
        System.out.println(queue.full());


    }
}
