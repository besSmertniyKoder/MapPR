import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String > hashMap = new HashMap<>();
        hashMap.put(3, "ivan");
        hashMap.put(4,"igor");
        hashMap.put(5,"igor");
        hashMap.put(6,"igor");
        hashMap.put(8,"igor");
        hashMap.put(3,"ivan2");
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.getOrDefault(8, "no such value!"));
        Map<Integer, String > treeMap = new TreeMap<>();
        treeMap.put(4,"test1");
        treeMap.put(5,"test2");
        treeMap.put(9,"test6");
        treeMap.put(10,"test10");
        treeMap.put(36,"test7439");
        treeMap.put(87,"test442");
        treeMap.put(43,"test38742");
        treeMap.put(88,"aaa");
        treeMap.put(11,"aaaaa");



    }
}
