package HashMap;

import java.util.HashSet;

public class Sets_STL {
	public static void main(String []args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(77); set.add(65); set.add(21); set.add(2);
	    System.out.println(set.size());
	    System.out.println(set.contains(21));
	    System.out.println(set.remove(77));
	    System.out.println(set.contains(77));
	    System.out.println(set.size());
	}

}
