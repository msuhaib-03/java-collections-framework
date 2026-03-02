package Maps.legacy;

import java.util.Hashtable;

public class Hash_Table {
    public static void main(String[] args) {

        // HashTable is a legacy class in Java that was part of the original Java Collections Framework in Java 1.0. It is a synchronized implementation of the Map interface and is based on a hash table data structure. However, it has been largely replaced by the HashMap class, which is not synchronized and offers better performance in most cases and even slower if reading something get().
        // HashTable is synchronized, which means that it is thread-safe and can be used in multi-threaded environments without the need for external synchronization. However, this synchronization comes with a performance overhead, and in most cases, it is recommended to use HashMap instead of HashTable unless you specifically require thread safety.
        // HashTable does not allow null keys or null values, and it will throw a NullPointerException if you try to insert a null key or value. HashMap, on the other hand, allows one null key and multiple null values.
        // HashTable is considered a legacy class and is not recommended for new code. It is generally recommended to use HashMap or other Map implementations from the java.util package for new code, as they offer better performance and more features than HashTable. However, if you are working with legacy code that uses HashTable.
        // Not used now because it is replaced by ConcurrentHashMap.
        // It is slower than Hashmap.
        // Same bucket system is used like hashmap.
        // Only linkedlist is used in case of collision in hashtable but in hashmap, we can use balanced tree as well if the number of elements in bucket exceeds a certain threshold.

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 5);
        hashtable.put("Banana", 10);
        System.out.println("Hashtable: " + hashtable); // This will print {Apple=5, Banana=10} because the entries are stored in a hash table and the order of the entries is not guaranteed.


        Hashtable<String, Integer> hashtables = new Hashtable<>();
        // Now lets run threads to see if they are thread-safe.
        Thread t1 = new Thread(() -> {
            for (int i=0; i<2000; i++){
                hashtables.put("Thread1", i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=1000; i<2000; i++){
                hashtables.put("Thread2", i);
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of hashtable: " + hashtables.size());
    }
}
