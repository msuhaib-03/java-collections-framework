package Maps;

import org.w3c.dom.ls.LSOutput;

import java.lang.ref.WeakReference;

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class Garbage_CollectionBeforeWeakHashMap {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "iPhone 13 Pro Max");
        System.out.println(phone);
        // this above object created is strong reference and it will not be eligible for garbage collection until the reference variable "phone" is set to null or goes out of scope.
        // Object takes memory and space.
        // This can only be null if we use weak reference or if we set the reference variable to null or if it goes out of scope.
        //phone = null; // Now the phone object is eligible for garbage collection because there are no strong references to it. The garbage collector can reclaim the memory used by the phone object when it runs.

        System.gc(); // This is a request to the JVM to run the garbage collector, but it does not guarantee that the garbage collector will actually run or that it will reclaim the memory used by the phone object. The garbage collector runs on its own schedule and may choose to ignore this request if it determines that it is not necessary to run at that time.
        // if we dont use phone = null and use system.gc() to call garbage collector, the phone object will not be eligible for garbage collection because it still has a strong reference to it through the variable "phone". The garbage collector will not reclaim the memory used by the phone object as long as there is a strong reference to it. Therefore, calling System.gc() in this case will not have any effect on the phone object, and it will remain in memory until the program ends or until the reference variable "phone" is set to null or goes out of scope.
        System.out.println(phone); // This will print null because the reference variable "phone" is now set to null, indicating that it no longer points to any object in memory.


        // But then there's a class of WeakReference which allows us to create objects that can be garbage collected even if they are still referenced by a variable. This is useful in situations where we want to allow the garbage collector to reclaim memory used by an object when it is no longer needed, without having to explicitly set the reference variable to null or wait for it to go out of scope. Weak references are commonly used in caching and memory-sensitive applications where we want to avoid memory leaks and ensure that unused objects are properly cleaned up by the garbage collector.
        WeakReference<Phone> weakPhone = new WeakReference<>(new Phone("Samsung", "Galaxy S21"));
        System.out.println(weakPhone.get()); // This will print the phone object because it is still strongly reachable through the weak reference.
        //System.gc(); // This is a request to the JVM to run the garbage collector, but it does not guarantee that the garbage collector will actually run or that it will reclaim the memory used by the phone object. The garbage collector runs on its own schedule and may choose to ignore this request if it determines that it is not necessary to run at that time.
        // but we try thread here
        try{
            System.out.println("Requesting garbage collection...");
            Thread.sleep(5000); // Sleep for 5 seconds to give the garbage collector time to run and potentially reclaim the memory used by the phone object.
        }catch (Exception ignored){

        }
        System.out.println(weakPhone.get()); // This may print null if the garbage collector has reclaimed the memory used by the phone object, or it may still print the phone object if it has not been collected yet. The behavior of weak references can be unpredictable, as it depends on the timing of garbage collection and the memory usage of the application.
        // It doesnot print null because of String literals!!!
        // String literals in string pool are strong references and even if you run System.gc() it won't remove weak reference throughout the life cycle of program.
    }

}
