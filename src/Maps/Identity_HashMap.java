package Maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Identity_HashMap {
    public static void main(String[] args) {
            // IdentityHashMap is a class in Java that implements the Map interface and uses reference equality (==) instead of object equality (equals()) for comparing keys. This means that two keys are considered equal if they refer to the same object in memory, rather than if they have the same content.
            // IdentityHashMap is useful in situations where you want to use objects as keys and you want to ensure that each key is unique based on its reference, rather than its content. It can be used in scenarios such as caching, where you want to store values based on the identity of the keys rather than their content.
            // However, it is important to note that IdentityHashMap does not guarantee any specific order of the keys or values, and it may not be suitable for all use cases. It is generally recommended to use HashMap or other Map implementations unless you specifically need the behavior provided by IdentityHashMap.

        // String has its own implementation of equals() and hashCode() but identityHashMap() uses == and the hashCode() of Object class.
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> hashMap = new IdentityHashMap<>();
        hashMap.put(key1, 1);
        hashMap.put(key2, 2);
        System.out.println("HashMap: " + hashMap); // This will print {key=2} because key1 and key2 are considered equal based on their content, so the second put operation overwrites the value associated with the key "key".

        // If we implement certain methods, we can check the hashCode and object address
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
            // This will print different hash codes for key1 and key2 because they are different objects in memory, even though they have the same content.

            // Now if we use IdentityHashMap, it will treat key1 and key2 as different keys because it uses reference equality (==) instead of object equality (equals()).

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
            // This will print the same hash code for key1 and key2 because they have the same content, even though they are different objects in memory.
    }
}
