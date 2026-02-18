package List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
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

        // As we know that initial capacity of an ArrayList is 10 by default but when we add elements
        // to an arraylist, the following steps occur:
        // 1) Check capacity: If the current number of elements in the ArrayList exceeds its capacity, it needs to resize itself to accommodate more elements.
        // 2) Resize the array: The ArrayList creates a new array with a larger capacity (usually doubling the current capacity) and copies the existing elements to the new array.
        // 3) Add Element : After resizing (if necessary), the new element is added to the ArrayList at the appropriate index.

        // ===> RESIZING THE ARRAY:
        // 1) Initial Capacity : 10
        // 2) Growth Factor: 1.5 times the old array
        // 3) Copying Elements: 0(n) operation

        // ===> Removing Elements:
        // 1) Check bounds: If index is valid range
        // 2) Reduce Elements: Shift elements to left to fill the gap created by removed element
        // 3) Reduce Size: Decrease size of ArrayList by 1

        List<Integer> list2 = new ArrayList<>(1000);
        // This creates an ArrayList with an initial capacity of 1000. This means that the ArrayList
        // can hold up to 1000 elements before it needs to resize itself. This can be useful if you
        // know in advance that you will be adding a large number of elements to the list, as it can
        // help to avoid the overhead of resizing the array multiple times as elements are added.

        // Internally ArrayList doesnot shrink in size even tho if elements are removed, so to shrink
        // the capacity, we do:
        // list2.trimToSize(); --> It is not functional here, maybe method not available or vresion issue.

        // NOW AN ARRAYLIST CAN BE INITIALIZED WITH STRING VALUES AS WELL:
        List<String> list3 = Arrays.asList("Monday","Tuesday", "Wednesday");
        System.out.println("Simple String List");
        System.out.println(list3);

        // In Java, you can do List.of() but it is immutable, meaning you cannot add or remove elements
        // from it after it is created. It is a convenient way to create a fixed-size list of
        // elements without the need for an ArrayList or other mutable collection. For example:
        List<Integer> list4 = List.of(3,5,7,9,13,17,19);
        System.out.println("List of immutable elements: "+list4);
        // So now if I try to replace or set a value, it won't let me do it.
        //list4.set(4,55); // throws UnsupportedOperationException as list4 is immutable and does not support modification
        //System.out.println(list4);

        // Now we are passing a string array to arraylist
        String[] arr = {"Apple", "Banana", "Mango"};
        List<String> list5 = Arrays.asList(arr);
       // list5.add("Cherry");
        System.out.println("Printing list5: "+list5);
        // throws UnsupportedOperationException as list5 is backed by the original array and does not support modification

        // SORTING OF A LIST
        List<Integer> list6 = new ArrayList<>();
        list6.add(9);
        list6.add(0);
        list6.add(5);
        list6.add(2);
        list6.add(7);
        list6.sort(null);
        System.out.println("Sorted list: "+list6);

        // Now if you want to remove an element, you can do it using wrapper.
        // Provide the element and not the index to remove the element.
        list6.remove(Integer.valueOf(7));
        System.out.println("List after removing element 7: "+list6);


        // Stringpool constant:
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2); // true because both s1 and s2 refer to the same string literal in the string pool.
    }


}
