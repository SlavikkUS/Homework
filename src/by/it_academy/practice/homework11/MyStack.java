package by.it_academy.practice.homework11;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> myStack;
    private int top;

    public MyStack() {
        myStack = new ArrayList<>();
        top = -1;
    }

    public Boolean isEmpty() {
        return myStack.isEmpty();
    }

    public void push(T item) {
        myStack.add(item);
    }

    public T pop() {
        var lastElement = myStack.get(myStack.size() - 1);
        var lastIndex = myStack.lastIndexOf(lastElement);
        myStack.remove(lastIndex);
        return lastElement;
    }

    public T pick() {
        if (isEmpty()) {
            throw new MyOwnExemption("Stack is null!");
        }
        return myStack.get(myStack.size() - 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyStack{");
        sb.append("").append(myStack);
        sb.append('}');
        return sb.toString();
    }
}