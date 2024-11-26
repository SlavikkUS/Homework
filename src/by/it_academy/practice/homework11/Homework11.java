package by.it_academy.practice.homework11;

import java.util.*;

public class Homework11 {
    public static void main(String[] args) {
        findCopy();
        MyStack<Integer> myStack = new MyStack<>();
        addItems(myStack);
        popMyStack(myStack);
        isEmpty(myStack);
        pick(myStack);
    }
    //one

    public static void addItems(MyStack<Integer> myStack) {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack);
    }

    public static void popMyStack(MyStack<Integer> myStack) {
        System.out.printf("Last number is: %s", myStack.pop() + "\n");
        System.out.println(myStack);
    }

    public static void isEmpty(MyStack<Integer> myStack) {
        System.out.println(myStack.isEmpty());
    }

    public static void pick(MyStack<Integer> myStack) {
        System.out.println(myStack.pick());
    }

    public static void findCopy() {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 4, 5, 2);
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, i) == 2) {
                Collections.addAll(list1, i);
            }
        }
        System.out.printf("Copies have numbers %s", list1 + "\n");
    }
}