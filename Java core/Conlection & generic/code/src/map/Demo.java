package map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, String> hashMap = new HashMap<>();

        // Thêm value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        hashMap.put(1, "One");
        hashMap.put(0, "Zero");
        hashMap.put(2, "Two");

        hashMap.put(4, "Four");
        // Thêm value vào trong linkedHashMap với key tương ứng
        linkedHashMap.put(1, "One");
        linkedHashMap.put(0, "Zero");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(21, "Twenty first");
        // Thêm value vào trong treeMap với key tương ứng
        treeMap.put(1, "One");
        treeMap.put(0, "Zero");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(21, "Twenty first");
        treeMap.put(5, "Five");

        System.out.println();
        System.out.println("HashMap vs TreeMap");
        System.out.println("Các phần tử có trong linkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("Các phần tử có trong treeMap: ");
        System.out.println(treeMap);

        Map<String, Boolean> map1 = new TreeMap<>();

        map1.put("Tom", true );
        map1.put("Jerry", true);
        map1.put("Man", false);
        map1.put("Dog", false);
        System.out.println("map1: " + map1);
    }
}
