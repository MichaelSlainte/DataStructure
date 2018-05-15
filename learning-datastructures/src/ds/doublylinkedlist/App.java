/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.doublylinkedlist;

/**
 *
 * @author engmi
 */
public class App {

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertLast(55);
        theList.insertLast(10);
        theList.displayForward();
        theList.displayBackward();
        theList.insertAfter(44, 24);
        theList.displayForward();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(24);
        theList.displayForward();
        theList.displayBackward();

    }
}
