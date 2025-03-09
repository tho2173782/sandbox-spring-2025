package org.example.sandbox.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T>  {

    private List<T> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }

    @Override
    public T peek() {
        return stack.get(stack.size() - 1);
    }

    @Override
    public T pop() {
        return stack.remove(stack.size() - 1);
    }

    @Override
    public void push(T item) {
        stack.add(item);

    }

    @Override
    public int search(T t) {
        int indexOfElement = stack.lastIndexOf(t);
        if (indexOfElement == -1) {
            return -1;
        }
        int topOfStack = stack.size() - 1;
        return topOfStack - indexOfElement;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayListStack");
        sb.append(stack);
        return sb.toString();
    }
}
