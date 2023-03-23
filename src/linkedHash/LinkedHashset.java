package linkedHash;
import java.util.LinkedHashSet;
public class LinkedHashset {
	

 
	    public static void main(String[] args) {
	        // Create a LinkedHashSet of String elements
	        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

	        // Add elements to the LinkedHashSet
	        linkedHashSet.add("apple");
	        linkedHashSet.add("banana");
	        linkedHashSet.add("orange");
	        linkedHashSet.add("pear");
	        linkedHashSet.add("banana"); // This element will not be added since it already exists in the LinkedHashSet

	        // Print the LinkedHashSet
	        System.out.println(linkedHashSet);

	        // Remove an element from the LinkedHashSet
	        linkedHashSet.remove("orange");

	        // Print the LinkedHashSet again
	        System.out.println(linkedHashSet);
	    }
	}

