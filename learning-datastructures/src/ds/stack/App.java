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
public class App {

    public static void main(String args[]) {
        Stack theStack = new Stack(1);
       /* theStack.push(20);
        theStack.push(40);
        theStack.push(30);
        theStack.push(100);
        theStack.push(20);
        theStack.push(40); 
      

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        } */
        System.out.println(reverseString("HELLO"));     
    }
    
    public static String reverseString (String str){
        int stackSize = str.length();  //get the max stack size
        Stack theStack = new Stack(stackSize);  // we make the stack
        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);  // getting a char from the input string
            theStack.push(ch);
                       
        }
        String result = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result+ ch;
        }
        return result;
    }
    
}
