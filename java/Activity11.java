package Activities;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> colors = new HashMap<>();
		
		colors.put(1, "Green");
		colors.put(2, "Yellow");
		colors.put(3, "Red");
		colors.put(4, "Blue");
		colors.put(5, "Pink");
		
		
		
		
		System.out.println("Key value pairs are:");
		
		System.out.println(colors.entrySet());
		
		System.out.println("color removed is :" +colors.remove(2));
		
		System.out.println("does green exist in the map? :" +colors.containsValue("Green"));
		
		System.out.println("number of pairs in the map:" +colors.size());
		
		System.out.println(colors.entrySet());
		}


	}


