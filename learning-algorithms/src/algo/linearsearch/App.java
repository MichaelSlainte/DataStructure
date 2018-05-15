/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.linearsearch;

/**
 *
 * @author engmi
 */
public class App {

    public static void main(String[] args) {

    }
    // O(n) --> linearSearch
    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static int recursiveLinearSearch(int[]a,int i, int x){
        if(i > a.length -1){ //if evaluates to true, x wa s not found in the array
            return -1;
        } else if(a[i] == x){
            return i;
        }else{
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i+1, x);
        }
    }

}
