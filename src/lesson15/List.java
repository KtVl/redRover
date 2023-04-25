package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println(arrayList + "  размер листа " + arrayList.size());
        System.out.println("элемент под индексом 1: " + arrayList.get(1));

        arrayList.remove(1); //убрать элемент

        System.out.println("размер листа: " + arrayList.size());

        System.out.println(arrayList.contains("A")); //поиск по листу
        System.out.println(arrayList.contains("a"));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);

        Generic<String> str = new Generic<>("TEST");
        System.out.println(str.getField());

        java.util.List<Integer> arrI = new LinkedList<>();
        arrI.add(1);
        arrI.add(4);
        arrI.add(8);
        System.out.println(arrI.get(2));
    }
}
