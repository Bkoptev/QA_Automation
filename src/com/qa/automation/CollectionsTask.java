package com.qa.automation;

import java.util.*;

public class CollectionsTask {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap< >();
        map.put("Test", 7);
        map.put("Class", 4.5);
        map.put("Cat", true);
        map.put("Dog", null);
        map.put("Bird", "Cat");
        map.put("Something", new Long(83));
        map.put("Mail", new Character('8'));
        map.put("Tab", '2');
        map.put("Browser", 22222222222L);
        map.put("IDE", (double) 489);
        for (Map.Entry<String, Object> integerStringEntry : map.entrySet()) {
            System.out.println("This is a key - " + integerStringEntry.getKey()
                    + "; this is a value - " + integerStringEntry.getValue());
        }
        System.out.println("---------------------------");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Lemon");
        fruits.add("Pear");
        Collections.sort(fruits);
        Collections.reverse(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        System.out.println("---------------------------");

        HashSet<String> set = new HashSet();
        set.add("pineapple");
        set.add("watermelon");
        set.add("apple");
        set.add("pear");
        set.add("quince");
        set.add("lemon");
        set.add("kiwi");
        Iterator setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
        System.out.println("---------------------------");

        LinkedList<String> list = new LinkedList();
        list.add("plum");
        list.add("nut");
        list.add("apple");
        list.add("grape");
        list.add("peach");
        list.add("pear");
        list.add("cherry");
        list.add("orange");
        list.add("watermelon");
        list.add("apricot");
        list.add("pineapple");
        Iterator listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("-------------0--------------");

        Iterator setIterator1 = set.iterator();
        Iterator listIterator1 = list.iterator();
        while (setIterator1.hasNext()) {
             if (set.contains(listIterator1.next())) {
                 System.out.println(setIterator1.next());
             }
//                 else {
//                     setIterator1.remove();
//                 }
             }

    }
}
