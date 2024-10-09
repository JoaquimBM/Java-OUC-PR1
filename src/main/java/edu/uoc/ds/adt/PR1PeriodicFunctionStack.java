package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR1PeriodicFunctionStack {
    public final int CAPACITY = 15;

    private Stack<Integer> stack;

    public PR1PeriodicFunctionStack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }


    public Stack<Integer> clearAllStack() {
        while (!stack.isEmpty()) {
            stack.pop();
        }
        return stack;
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }

    public void push(Integer c) {
        this.stack.push(c);
    }
}
