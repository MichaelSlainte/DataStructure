/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author engmi
 */
public class Counter {
    private int value = 0;
    private String name = null;
    
    public Counter(String srt){
        this.name = srt;
    }
    
    public void increment(){
        value++;
    }
    
    public int getCurrentValue(){
        return value;
    }
    
    public String toString(){
        return name + ": " + value;
    }
}
