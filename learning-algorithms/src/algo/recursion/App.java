/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.recursion;

/**
 *
 * @author engmi
 */
public class App {
    public static void main(String[] args){
    }
    
    public static void reduceByOne(int n){
        if(n!= 0){
        reduceByOne(n - 1);
        }
        System.out.println("Completed call: " + n);
    }
        
}
