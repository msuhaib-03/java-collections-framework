package Maps;

import java.util.WeakHashMap;

class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class WeakHash_Map {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put("img1", new Image("Image 1"));
        imageCache.put("img2", new Image("Image 2"));
        System.out.println("Cache before GC: " + imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after GC: " + imageCache);
        // None of it worked because of String literals!!! String literals in string pool are strong references and even if you run System.gc() it won't remove weak reference throughout the life cycle of program.
        // In order to make it work, we can use object as Keys instead of Strings.

        System.out.println("=========== NOW WITH OBJECTS AS KEYS ===========");
        // Now we will use object as keys instead of string literals to make it work.
        imageCache.put(new String("img3"), new Image("Image 3"));
        imageCache.put(new String("img4"), new Image("Image 4"));
        System.out.println("Cache before GC: " + imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after GC: " + imageCache);
        // It printed 1 and 2 but not 3 and 4 because Keys were Object and not String literals.
    }

    private static void simulateApplicationRunning(){
        System.out.println("Application is running...");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
