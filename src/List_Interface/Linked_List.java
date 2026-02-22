package List_Interface;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;

// SOME NOTES ON LINKED LIST:
// A linear data structure in which every block which is called a node contains 2 things, data and a pointer.
// data is value of the node and pointer is the address of the next node in the list. The last node has a pointer to null which indicates the end of the list.
// In Singly linked list, each node has only one pointer which points to the next node in the list. In Doubly linked list, each node has two pointers, one points to the next node and the other points to the previous node in the list.
// In doubly linked list, the first node's first pointer points to null and the list's last node's last pointer also points to null, in between its forward and backward both.
// There's no null in circular linked list as the last node's pointer points to the first node of the list and the first node's pointer also points to the last node of the list.

// Now if it had to be implemented it would be like this:
// class Node{
//        int data;
//        Node next;
//}
// And it is called or used like this:
// Node node1 = new Node();
// Node node2 = new Node();
// node1.data = 5;
// node2.data = 8;
// node2.next = null;
// node1.next = node2; // this means that node1 is pointing to node2 and node2 is the next node of node1 in the list.

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

    // But there's one thing to note here that the LinkedList class in Java is implemented as a doubly linked list, which means that each node contains a reference to both the next and previous nodes in the list. This allows for efficient traversal in both directions and makes it easier to perform certain operations, such as adding or removing elements from the middle of the list.
    // In order to traverse, you can use loop to iterate.
    // When deleting a node, you cancel out the pointer reference to that node and update to one forward to it.
}
