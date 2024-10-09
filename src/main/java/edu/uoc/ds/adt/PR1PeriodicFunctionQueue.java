package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR1PeriodicFunctionQueue {

    public final int CAPACITY = 15;

    private Queue<Integer> queue;

    public PR1PeriodicFunctionQueue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public Queue<Integer> clearFullQueue() {
        while (!queue.isEmpty()) {
            queue.poll();
        }
        return queue;
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

    public void add(int c) {
        this.queue.add(c);
    }
}
