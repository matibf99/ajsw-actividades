package collections.treeset;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        // Ascending order
        TreeSet<String> treeSet1 = new TreeSet<>();

        treeSet1.add("A");
        treeSet1.add("B");
        treeSet1.add("C");
        treeSet1.add("D");
        treeSet1.add("E");

        System.out.println(treeSet1);

        // Descending order
        TreeSet<String> treeSet2 = (TreeSet<String>)treeSet1.descendingSet();

        System.out.println(treeSet2);
    }
}
