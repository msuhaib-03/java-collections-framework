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

    }

}
