/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;

/**
 *
 * @author engmi
 */
public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j) {
        if (isFull()) {
            System.out.println("Stack already full");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!!");
            return '0';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
    
}
