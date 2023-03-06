package interviewHazirlik;

import java.util.*;

public class MapOlusturma01 {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> classMap = new HashMap<>();
        classMap.put("Ayse Naz", 1234);
        classMap.put("Ece Naz", 1235);
        classMap.put("Nazli", 1236);
        classMap.put("Defne", 1237);
        return classMap;
    }

    public static void main(String[] args) {
        System.out.println("createMap() = " + createMap());
    }
}














