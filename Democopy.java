
pakage session9;
//import util package
import java.util.*;

//defing class
public class Democopy {
	// main mehtod
	public static void main(String[] args) {
		// creating an array list of student
		ArrayList<String> n = new ArrayList<String>();
		System.out.println(" the names of student in class");
		// adding the nammes with duplicate value
		n.add("Sakul");
		n.add("Hameedu");
		n.add("Sakul");
		n.add("rahul");
		n.add("Kumar");
		n.add("ravi");
		// iterator for keeping the pointer on array
		Iterator it = n.iterator();
		// checking next element
		while (it.hasNext()) {
			// printing the next element
			System.out.println(it.next());
		}
		System.out.println("");
		/*
		 * Hashset removes duplicate value
		 */

		HashSet<String> m = new HashSet<String>();
		System.out.println("the names of student in class");
		System.out.println("removing duplicate names");
		// adding multiple value having duplicate value
		m.add("Sakul");
		m.add("Hameedu");
		m.add("Sakul");
		m.add("rahul");
		m.add("Kumar");
		m.add("ravi");
		// maintaing the reference
		Iterator its = m.iterator();
		while (its.hasNext()) {
			// printing the next element in HashSet
			System.out.println(its.next());
		}

	}

}
---------------
sample output
sh-4.3$ javac Democopy.java                                                                                                                                                     
sh-4.3$ java Democopy                                                                                                                                                           
 the names of student in class                                                                                                                                                  
Sakul                                                                                                                                                                           
Hameedu                                                                                                                                                                         
Sakul                                                                                                                                                                           
rahul                                                                                                                                                                           
Kumar                                                                                                                                                                           
ravi                                                                                                                                                                            
                                                                                                                                                                                
the names of student in class                                                                                                                                                   
removing duplicate names                                                                                                                                                        
Hameedu                                                                                                                                                                         
Kumar                                                                                                                                                                           
rahul                                                                                                                                                                           
sakul                                                                                                                                                                           
Sakul                                                                                                                                                      
