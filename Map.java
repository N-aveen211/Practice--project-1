package collection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(1,"naveen");  
	      ht.put(2,"kumar");  
	      ht.put(3,"Jack");  
	      ht.put(4,"kumar");
	     System.out.println( ht.keySet());
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }


	}

}
