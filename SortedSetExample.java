import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Create a SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();

        // Add elements to the set
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Cherry");
        sortedSet.add("Date");

        // Print the SortedSet
        System.out.println("SortedSet: " + sortedSet);

        // Check if the set contains an element
        System.out.println("Contains 'Banana'? " + sortedSet.contains("Banana"));

        // Remove an element
        sortedSet.remove("Date");
        System.out.println("After removing 'Date': " + sortedSet);

        // Get the first and last elements
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());

        // Get a subset
        SortedSet<String> subSet = sortedSet.subSet("Apple", "Cherry");
        System.out.println("Subset from 'Apple' to 'Cherry': " + subSet);
    }
}
