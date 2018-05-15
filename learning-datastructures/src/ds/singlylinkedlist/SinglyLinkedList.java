/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.singlylinkedlist;

/**
 *
 * @author engmi
 */
public class SinglyLinkedList {

    private Node first;
        
    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //used to insert at the beinning of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }

    public int listLength(Node aNode) {
        int length = 0;
        Node currentNode = aNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.next != null) {
            current = current.next; // it loops till current is not null!
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
