package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person{
    String name;
    Integer id;
    Person(String name,Integer id){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if( getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Name" + name + " " + "id" + id;
    }
}

public class Hash_Map {
    public static void main(String[] args) {
            // HashMap is a class in Java that implements the Map interface and provides a hash table-based implementation of the Map data structure. It allows us to store key-value pairs, where each key is unique and maps to a specific value. HashMap uses a hash function to compute an index for each key, which allows for efficient retrieval of values based on their corresponding keys.

            // HashMap does not maintain any order of its elements, meaning that the order of key-value pairs is not guaranteed. It allows one null key and multiple null values. HashMap is not synchronized, which means it is not thread-safe and should be used in single-threaded environments or with external synchronization when used in multi-threaded environments.

            // HashMap provides constant-time performance for basic operations such as get() and put(), assuming the hash function disperses the elements properly across the buckets. However, in cases where there are many collisions (i.e., multiple keys hashing to the same index), the performance can degrade to O(n) in the worst case.

            // To use a HashMap, you can create an instance of it and use its methods to add, retrieve, and manipulate key-value pairs. For example:
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Sobi");
        map.put(2,"Taha");
        map.put(3,"Baba");
        System.out.println(map);

        // To retrieve a value based on its key, you can use the get() method:
        String student = map.get(2); // returns "Taha" as it is the value associated with the key 2 in the map.
        System.out.println("Student with ID 2: " + student);

        System.out.println(map.containsKey(1)); // returns true as the key 1 is present in the map.
        System.out.println(map.containsValue("Taha")); // returns true.

        // There's no order in HashMap, and if you want to iterate over it, you have to use Set, which is a list interface and doesn't contain dulicates.
        Set<Integer> integers = map.keySet();
        for(Integer key: integers){
            System.out.println(map.get(key));
        }


        // Now if you want to print both key and value, you can use entrySet() method which returns a set of key-value pairs in the map.
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
            System.out.println(integerStringEntry.getValue().toUpperCase());
        }

        System.out.println("===============================================================");

        // MOST OF WRITTEN NOTES IN REGISTER. IF HAD TIME I'D TYPE IT HERE, ELSE YOU CAN CHECK THE NOTES WHEN I UPLOAD!
        // Now we  are going to work on custom object keys in Hasnap because they can cause problem by not updating something when error occurs or you want correction.

        // String has it own hashCode() method but object plays with memory. So in order to make them work, we add hascode and equals method in custom class, here we created above Person class.
        // You can write cases in equals method and in hashcode you can pass arguments to generate hashcode based on those arguments. So when you create a new object with same values, it will generate same hashcode and equals method will return true, so it will not add the new object in the map as it is already present.
        HashMap<Person, String> personStringHashMap = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        personStringHashMap.put(p1, "Engineer");
        personStringHashMap.put(p2, "Doctor");
        personStringHashMap.put(p3, "Artist"); // this will not be added in the map as it is considered equal to p1 based on the equals and hashCode methods we implemented in the Person class. It will override the String in Alice that is Engineer.

        // Let print to check its size nad value of 1 and 3 person.
        System.out.println("Size of personStringHashMap: " + personStringHashMap.size()); // returns 2 as p1 and p3 are considered equal and only one of them is added in the map.
        System.out.println("Value associated with p1: " + personStringHashMap.get(p1)); // returns "Artist" as it is the value associated with p1 in the map.
        System.out.println("Value associated with p3: " + personStringHashMap.get(p3)); // returns "Artist" as it is the value associated with p3 in the map, which is the same as p1.

        // Now you can see that object reference remains same but the value is updated as p1 and p3 are considered equal based on the equals and hashCode methods we implemented in the Person class. So when we put p3 in the map, it overrides the value associated with p1, which is "Engineer", with the new value "Artist". This is because HashMap uses the hashCode and equals methods to determine if two keys are considered equal, and in this case, p1 and p3 are considered equal because they have the same name and id. Therefore, only one entry is stored in the map for both p1 and p3, and the value associated with that entry is "Artist".
    }
}
