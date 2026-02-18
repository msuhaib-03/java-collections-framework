package List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        // ArrayList is a resizable array implementation of the List interface in Java. It allows us to store and manipulate a collection of elements.
        // Its default capacity is 10 and it automatically resizes itself when the number of elements exceeds its capacity. It provides methods to add, remove, and access elements in the list.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        System.out.println("Specific index element of a list: "+list.get(0));

        // It returns number of elements in the list
        System.out.println("Size of list: "+list.size());

        // It prints all the elements in the list
        System.out.println("Elements of list:");
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        // Now the above for loop can be written in a more concise way using the enhanced for loop (also known as the for-each loop):
        System.out.println("Elements of list using enhanced for loop:");
        for(Integer i: list){
            System.out.println(i);
        }
        // i is not a pointer but an element itself here and "list"; a variable over which you want to run the loop on.

        // Statements to check if the list contains a specific element
        System.out.println(list.contains(6)); // returns false as 6 is not present in the list
        System.out.println(list.contains(5)); // returns true as 5 is present in the

        list.remove(0); // removes the element at index 0 (which is 1 in this case)

        // It adds the specified element at the specified index in the list. In this case, it adds the element 10 at index 1.
        list.add(1,10);
        System.out.println(list);
        // currently list has 2 elements, 5 and 10.

        // Now we can even replace elements.
        list.set(0,22); // replaces the element at index 0 (which is 5) with 22
        System.out.println(list);
    }

}
