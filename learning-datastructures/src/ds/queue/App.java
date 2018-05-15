/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.queue;

/**
 *
 * @author engmi
 */
public class App {

    public static void main(String args[]) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(400);
        myQueue.insert(500);
        myQueue.view();
    }
}
