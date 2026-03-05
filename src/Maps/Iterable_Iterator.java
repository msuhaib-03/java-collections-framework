package Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Iterable_Iterator {
    public static void main(String[] args) {
        // Iterable and Iterator are two interfaces in Java that are used to traverse collections of objects.
        // Iterable is a functional interface that represents a collection of objects that can be iterated over. It has a single method, iterator(), which returns an Iterator object.
        // Iterator is an interface that provides methods for traversing a collection of objects. It has three main methods: hasNext(), next(), and remove().

        // The main difference between Iterable and Iterator is that Iterable is used to represent a collection of objects, while Iterator is used to traverse that collection. Iterable provides a way to get an Iterator, while Iterator provides the actual traversal mechanism.

        // In practice, you would typically use an Iterable when you want to create a collection of objects that can be iterated over, and you would use an Iterator when you want to traverse that collection.

        // Iterable has method iterator which returns an Iterator to traverse over collection one by one.

        List<Integer> list = new ArrayList<>();
//        for (int i : list) {
//            System.out.println(i);
//        }
        // The above code will not print anything because the list is empty. However, if we add some elements to the list, it will print those elements one by one.
        // This has some internal working which looks like this:

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        // The above code will also not print anything because the list is empty. However, if we add some elements to the list, it will print those elements one by one using the Iterator.

        // But the thing here is that if we want to traverse over elements, add or even remove at the same time, we can use ListIterator which is a subinterface of Iterator and it has additional methods for adding, removing and traversing in both directions (forward and backward) over the list.
        // lets add elements to the list and run the loop:

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(37);
        list.add(26);
        list.add(91);
        list.add(50);
        list.add(10);

       Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if(number % 2==0){
                iterator.remove(); // this will remove the even numbers from the list while traversing it using the Iterator.
            }
            System.out.println("Iterable adding, traversing and after removal: " + list);
        }
    }
}