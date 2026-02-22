package List_Interface;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_Interface {
    public static void main(String[] args) {
        // Stack works on principle of LIFO Last In First Out.
        // Stack extends Vector which means it is synchronized and thread-safe.
        // Stack is sub-class of Vector which means it inherits all the features of dynamic array but is constrained by Stack's LIFO principle.

        Stack<Integer> stack = new Stack<>();
        stack.push(1); // adds an element to the top of the stack
        stack.push(5);
        stack.push(7); // this is the top element now.
        System.out.println("Stack: " + stack);

        stack.pop();
        System.out.println("Stack after pop: " + stack); // removes the top element from the stack and returns it, which is 7 in this case.

        stack.peek();
        System.out.println("Top element of stack: " + stack.peek()); // returns the top element of the stack without removing it, which is 5 in this case.

    // If you want to use Stack in Java, you're not limited to functionality because it extends Vector and can be therefore implement all Vector Methods.
        // stack.size(); // returns the number of elements in the stack
        // stack.isEmpty(); // returns true if the stack is empty, false otherwise

        // Stack's elements can be searched by index although real stack nature would not allow to do so.

        // Searching in Stack is started from top to bottom and it starts with index 1, not 0.
        int search = stack.search(5); // returns the 1-based position of the element from the top of the stack, which is 2 in this case as 1 is the second element from the top.
        System.out.println("Position of element 5 from top of stack: " + search); // Returns 1.

    // Stack is used either by implementing Stack class or LinkedList class as a stack. Stack class is synchronized and thread-safe but LinkedList is not synchronized and not thread-safe. So if you want to use stack in multi-threaded environment, you should use Stack class. But if you want to use stack in single-threaded environment, you can use either Stack class or LinkedList class as a stack.
        LinkedList<Integer> stack2 = new LinkedList<>();
        stack2.addLast(8); //peek
        stack2.addLast(3); // it is bottom element now.
        stack2.addLast(13);
        stack2.addLast(9); // it is top element now.
        System.out.println("Stack2: " + stack2);

        System.out.println("Stack2 Last element:"+stack2.getLast()); // peek
        stack2.removeLast(); // pop

        System.out.println("Stack2 after pop: " + stack2);
    }
}
