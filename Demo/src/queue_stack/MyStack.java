package queue_stack;

import java.util.Stack;

public class MyStack {
    public void operationStack(){
        Stack sta = new Stack();
        sta.push( 2 );
        sta.push( 3 );
        System.out.println( sta.peek() );  //查看栈上的最上面的元素
        System.out.println( sta.pop() );
        System.out.println( sta.peek() );
    }
}
