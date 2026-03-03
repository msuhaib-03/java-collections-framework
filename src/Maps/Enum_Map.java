package Maps;

import java.util.EnumMap;
import java.util.Map;

public class Enum_Map {
    public static void main(String[] args) {
        // Directly implements Map interface.
        // If we have to store some constant values, we use enum.
        // It has advantage of knowing all possible keys in advance.
        // Enum has internal array, so no need to worry about resizing and rehashing.
        // Array is unique and makes enum map unique.
        // No collisions and order is maintained here.
        // Array is of same size as enum.
        // It is faster than hashmap and memory efficient.
        // Ordinal index is used.

        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.WEDNESDAY, "Running");
        map.put(Day.MONDAY, "Gym");
        map.put(Day.TUESDAY, "Swimming");
        System.out.println(map);
        System.out.println(map.get(Day.MONDAY));
        System.out.println(map.size());
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
