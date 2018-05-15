/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.LinkedList;

/**
 *
 * @author engmi
 */
public class App {
    public static void main (String args[]){
        Counter counting = new Counter("myCounter");
        counting.increment();
        counting.increment();
        counting.increment();
        counting.increment();
        counting.increment();
        
        System.out.println(counting.getCurrentValue());
        System.out.println(counting.toString());
        LinkedList mylist = new LinkedList();
    }
    
}
