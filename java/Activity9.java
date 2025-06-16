package Activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Bhagya");
		arr.add("Chetan");
		arr.add("Madan");
		arr.add(1, "Neha");
		arr.add(3, "Swati");
		
		System.out.println("All the names in the list are: ");
		for(String item : arr) {
			System.out.println(item);
		}
		
		System.out.println("3rd name in the list :" +arr.get(2));
		
		System.out.println("size of the list before removing:" +arr.size());
		
		System.out.println("Value removed is :" +arr.remove(2));
		
		System.out.println("is value removed? :" +arr.remove("Swati"));
		
		System.out.println("size of the lis after the value removed:" +arr.size());
		
	}

}
