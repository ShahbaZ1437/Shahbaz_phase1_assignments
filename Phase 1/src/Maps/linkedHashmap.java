package Maps;

import java.util.LinkedHashMap;

public class linkedHashmap {

	public static void main(String[] args) {
		
		LinkedHashMap LHM = new LinkedHashMap();
		
		LHM.put(1, "Apple");
		LHM.put(2, "Banana");
		LHM.put(3, "Kiwi");
		LHM.put(4, "Mango");
		LHM.put(5, "Strawberry");
		LHM.put(6, "Grape");
        LHM.put(7, "Avocado");
        LHM.put(8, "Jackfruit");
        LHM.put(9, "BlueBerry");
        LHM.put(10, "Chickoo");
		
		System.out.println("Fruits of LinkedHashMap - " + LHM);
		System.out.println("\nRemove entry for key 4 - " + LHM.remove(4));
		System.out.println("\nRemove entry for key 7 - " + LHM.remove(7));
		System.out.println("After Removing 4th & 7th Fruit of LinkedHashMap - " + LHM);
		System.out.println("Fruits contains Apple as value - " + LHM.containsValue("Apple"));
		System.out.println("Fruits contains Banana as value - " + LHM.containsValue("Banana"));
		System.out.println("\nLinkedHashMap contains 4 as key? : " + LHM.containsKey(4));
		System.out.println("Hashcode -" + LHM.hashCode());
		
		LHM.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + LHM);

	}

}
