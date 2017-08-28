/*
 * SetDemo.java 1.1 28-AUG-2017
 */
//package declaration

package session92;

//importing java.util package to use HashSet class and Set interface of Collection framework

import java.util.*;

/**
 * This class illustrates the Hashset class of Collection framework.
 * This class depicts the program to copy all the elements from set2 to set1 so that the set1 becomes the union
 * of set1 and set2.
 *
 * HashSet class extends AbstractSet class which implements Set interface.
 * Hashset class contains unique elements only.
 * Hashset class uses Hash Table for storage of elements.
 * 
 * @author chhaya yadav
 * 
 * version 1.1
 * 
 * dated 28-Aug-2017
 *
 */
//public class declaration

public class SetDemo {

//main method declaration
	
	public static void main(String[] args) {
		
//declaration of HashSet class instance hs1 with values of String stored in Hash Table		
		
		Set<String> hs1 = new HashSet<String>();
		
//Populating the HashSet		
		
		hs1.add("SET1-CHHAYA");
		
		hs1.add("SET1-MANOJ");
		
		hs1.add("SET1-AKSHAY");
		
//declaration of HashSet class instance hs2 with values of String stored in Hash Table		
		
        Set<String> hs2 = new HashSet<String>();
        
//Populating the HashSet        
		
		hs2.add("SET2-VARSHA");
		
		hs2.add("SET2-RITU");
		
		hs2.add("SET2-RASHI");
		
//Adding one collection to another, to create a union for both of them.
		
//Below method inserts the specified collection elements in the invoking collection.		
		
		hs1.addAll(hs2);

//Declaration of iterator for HashSet class instance hs1
		
		Iterator li = hs1.iterator();
	
//Traversing through the HashSet class in forward direction if it is non-empty.	
		
		if(!hs1.isEmpty()){
			
			System.out.println("Union of SET1 & SET2 is displayed below :");
			
			System.out.println("-------------------------------------------------------");
		
//hasNext() method returns true if iterator has more elements.
			
//next() method returns the element and moves the cursor pointer to the next element.
			
		    while(li.hasNext()) {
		
			   System.out.println(li.next());
		    }
		}
//if HashSet is empty then display appropriate message		
		
		else{
			
			System.out.println("SET is empty, what's the point in traversing through it");
		}
			

	}

}
