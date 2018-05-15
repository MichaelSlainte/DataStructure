/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.circularlinkedlist;

import ds.singlylinkedlist.*;

/**
 *
 * @author engmi
 */
public class App {

    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(2);
        myList.insertFirst(50);
        myList.insertFirst(100);
        myList.insertFirst(88);
        myList.insertLast(899998);
        myList.displayList();
        
    }

}
