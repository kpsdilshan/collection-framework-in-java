/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapinjava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Supun Dilshan
 */
public class MapInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hash Map\n");
        getHashMap();
        System.out.println("\n\nTree Map\n");
        getTreeMap();
        System.out.println("\n\nHash table\n");
        getHashTable();
        
    }

    public static void getHashMap() {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(43, "Kasun");
        map1.put(13, "Supun");
        map1.put(63, "Saman");
        map1.put(54, "Sunil");
        map1.put(83, "Kasuni");

        map1.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static void getTreeMap() {
        Map<Integer, String> map1 = new TreeMap<Integer, String>();
        map1.put(43, "Kasun");
        map1.put(13, "Supun");
        map1.put(63, "Saman");
        map1.put(54, "Sunil");
        map1.put(83, "Kasuni");
        
        map1.forEach((k,v)->System.out.println(k+" : "+v));
    }
    
    public static void getHashTable() {
        Map<Integer, String> map1 = new Hashtable<Integer, String>();
        map1.put(43, "Kasun");
        map1.put(13, "Supun");
        map1.put(63, "Saman");
        map1.put(54, "Sunil");
        map1.put(83, "Kasuni");
        
        map1.forEach((k,v)->System.out.println(k+" : "+v));
    }

}
