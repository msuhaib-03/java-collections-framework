package List_Interface;

// Using a separate class:

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<String> {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length(); // Compare based on string length
                }
}

// lets do one more thing to understand it even clearly
class Student{
    private String name;
    private float gpa;
    Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}


public class Comparators {
    public static void main(String[] args){
            // A Comparator is an interface in Java that defines a method for comparing two objects of a specific type. It is used to provide a custom ordering for objects when sorting or comparing them. The Comparator interface has a single method called compare() that takes two objects as parameters and returns an integer value indicating their relative order.

            // The compare() method returns:
            // - A negative integer if the first object is less than the second object.
            // - Zero if the first object is equal to the second object.
            // - A positive integer if the first object is greater than the second object.

            // Comparators are often used in conjunction with sorting algorithms or data structures that require ordering, such as TreeSet or PriorityQueue. They allow you to define your own criteria for comparing objects, which can be useful when you want to sort based on specific attributes or when the natural ordering of the objects does not meet your requirements.

            // To use a Comparator, you can either implement the Comparator interface in a separate class or use lambda expressions to define the comparison logic inline. For example:
            // example class above

        List<String> list = Arrays.asList("Cherry", "Guava", "Banana", "Apple");
        list.sort(new MyComparator());
        System.out.println(list); // Output: [Apple, Guava, Cherry, Banana]
        // It prints based on the length of the string in descending order.


        // Using a lambda expression:
        list.sort(((o1, o2) -> o1.length() - o2.length()));
        System.out.println(list); // Output: [Apple, Guava, Cherry, Banana]
        // It prints based on the length of the string in ascending order.



    }
}
