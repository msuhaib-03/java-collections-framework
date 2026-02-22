package List_Interface;

import java.util.Arrays;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
            // LinkedList is a data structure that consists of a sequence of nodes, where each node contains data and a reference (or link) to the next node in the sequence. It is a dynamic data structure that allows for efficient insertion and deletion of elements.

            // In a LinkedList, each node typically contains two parts: the data (which can be of any type) and a reference to the next node in the list. The first node is called the head, and the last node is called the tail. The tail's next reference is usually set to null to indicate the end of the list.

            // LinkedLists are often used when you need to frequently add or remove elements from the list, as they can be more efficient than arrays for these operations. However, they may require more memory than arrays due to the additional references stored in each node.

            // Java provides a built-in LinkedList class in the java.util package, which implements the List interface and provides various methods for manipulating linked lists.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println("Specific index element of a list: "+linkedList.get(0)); // this operation perfom in O(n) time complexity as we have to traverse the list to reach the specific index.

        linkedList.addFirst(7); // adds 7 at the beginning of the list and this operation performs in O(1) time complexity as we just have to update the head reference to point to the new node and the new node's next reference to point to the old head.
        linkedList.addLast(0); // adds 9 at the end of the list and 0(1) too as we just have to update the tail reference to point to the new node and the new node's next reference to null.
        System.out.println(linkedList);

        linkedList.add(3,10);// adds 10 at index 3 and this operation performs in O(n) time complexity as we have to traverse the list to reach the specific index and then update the references of the nodes accordingly.
        System.out.println(linkedList);
        linkedList.removeIf( x -> x%2==0); // removes all the even numbers from the list and this operation performs in O(n) time complexity as we have to traverse the entire list to check for even numbers and remove them.
        System.out.println(linkedList);


        // There's another method to remove elements and it can be done in String too.
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("cat", "dog", "bat"));
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("cat", "elephant", "rat"));
        linkedList1.removeAll(linkedList2); // removes all the elements from linkedList1 that are also present in linkedList2 and this operation performs in O(n*m) time complexity as we have to traverse both lists to check for common elements and remove them.
        System.out.println(linkedList1);
    }
}
