package queue_stack;

import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    Stack<Character> stack;
    LinkedList<Character> list;
    public Solution(){
        this.stack = new Stack<Character>();
        this.list = new LinkedList<Character>();
    }
    public void pushCharacter(char ch){
        this.stack.push( ch );
    }
    public void enqueueCharacter(char ch){
        this.list.add( ch );
    }
    public char popCharacter(){
        return this.stack.pop();
    }
    public char dequeueCharacter(){
        return this.list.removeFirst();
    }
    public void printListInfo(){
        while (!this.list.isEmpty()){
            System.out.println( this.list.removeFirst() );
        }
    }
    public void  printStackInfo(){
        while (!this.stack.isEmpty()){
            System.out.println( this.stack.pop() );
        }
    }
}
