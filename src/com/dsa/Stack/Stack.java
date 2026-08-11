package com.dsa.Stack;

public class Stack {

    static int[] stack = new int[5];
    static int top = -1;

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        System.out.println(pop());
        System.out.println(pop());
    }

    static void push(int value) {
        top++;
        stack[top] = value;
    }

    static int pop() {
        int value = stack[top];
        top--;
        return value;
    }
}