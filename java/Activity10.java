package Activities;


import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Bhagya");
		hs.add("Chetan");
		hs.add("Madan");
		hs.add("Neha");
		hs.add("Swati");
		hs.add("Nachi");
		
		
		System.out.println("size of the set before removing:" +hs.size());
		
		System.out.println("Value removed is :" +hs.remove("Chetan"));
		
		System.out.println("is value removed? :" +hs.remove("Ananya"));
		
		System.out.println("does Swati exist :" +hs.contains("Swati"));
		
		System.out.println("All the names in the set are: ");
		for(String item : hs) {
			System.out.println(item);
		}
		
		

	}

}
