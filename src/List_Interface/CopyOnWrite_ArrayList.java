package List_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite_ArrayList {
    public static void main(String[] args) {
            // CopyOnWriteArrayList is a thread-safe variant of ArrayList in Java. It is designed to provide better performance in concurrent environments where multiple threads are reading from the list while others are modifying it. The main idea behind CopyOnWriteArrayList is that it creates a new copy of the underlying array every time a modification is made to the list, allowing readers to access the list without blocking.

            // When a thread modifies the list (e.g., adding or removing elements), it creates a new copy of the underlying array with the changes applied. This means that readers can continue to access the old array without being affected by the modifications, ensuring thread safety without the need for synchronization.

            // However, this approach can lead to increased memory usage and reduced performance when there are frequent modifications to the list, as each modification requires creating a new copy of the array. Therefore, CopyOnWriteArrayList is best suited for scenarios where there are many more reads than writes, such as in event handling or caching scenarios.

        // "Copy on Write" means that whenever a write operation in performed like adding removing, instead directly modifying the list, a new copy of list is created and modification is applied to that copy.
        // This ensures that other threads reading the list while it is being modified are unaffected.

        // --> Read Operations: are fast and direct because they happen on a stable list without interference from modification.

        // --> Write Operations: are slower because a new copy of list is created for every modification. The reference to the list is then updated so that subsequent reads use this new list.

        // It is used in "read intensive" scenarios because memory is consumed at each write.

        // We read and modify at the same time.
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Eggs");
        list.add("Milk");
        list.add("Bread");
        System.out.println("Initial List: " + list);

        for (String item: list){
            System.out.println("Reading item: " + item);
            if (item.equals("Milk")){
                list.add("Butter"); // This will not affect the current iteration as it is working on a copy of the list.
                System.out.println("Added item: " + item);
            }
        }
        System.out.println("Final List: " + list);

        // BUT IF WE DO IT ON ARRAYLIST, IT THROWS ERROR
        List<String> list2 = new ArrayList<>();
        list2.add("Eggs");
        list2.add("Milk");
        list2.add("Bread");
        System.out.println("Initial List: " + list2);

        for (String item: list2){
            System.out.println("Reading item: " + item);
            if (item.equals("Milk")){
                list.add("Butter"); // This will throw ConcurrentModificationException because we are modifying the list while iterating over it.
                System.out.println("Added item: " + item);
            }
        }
        System.out.println("Final List: " + list2);
    }
}
