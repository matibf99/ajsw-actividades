package collections.hashset;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        // Los elementos no están ordenados
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Argentina");
        hashSet.add("Brazil");
        hashSet.add("Colombia");
        hashSet.add("Denmark");
        hashSet.add("England");
        hashSet.add("France");

        System.out.println(hashSet);
    }
}
