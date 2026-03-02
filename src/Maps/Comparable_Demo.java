package Maps;

import java.util.ArrayList;
import java.util.List;

class Students implements Comparable<Students>{
    String name;
    int gpa;

    public Students(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }
}
public class Comparable_Demo {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Alice", 91));
        list.add(new Students("Bob", 85));
        list.add(new Students("Charlie", 78));
        list.sort(null);
        System.out.println(list);
        // this prints in descending order of GPA because we have implemented compareTo method in Students class and we are comparing based on GPA in descending order.
        // Comparable is an interface in Java that defines a natural ordering for objects of a class. It has a single method called compareTo() that takes an object as a parameter and returns an integer value indicating the relative order of the objects. The compareTo() method returns:
        // - A negative integer if the current object is less than the specified object.
        // - Zero if the current object is equal to the specified object.
        // - A positive integer if the current object is greater than the specified object.
        // By implementing the Comparable interface and overriding the compareTo() method, you can define how objects of your class should be compared and sorted. This allows you to use sorting algorithms and data structures that rely on the natural ordering of objects, such as TreeSet or Collections.sort().

        // Comparator is outside the class and 2 things are compared and has method compare() whereas Comparable is inside the class and only 1 thing is compared and has method compareTo().
        // It is used for custom logic of comparison and sorting when the natural ordering of the objects does not meet your requirements or when you want to sort based on specific attributes. It allows you to define multiple ways to compare objects of a class, whereas Comparable only allows for one natural ordering.
    }
}
