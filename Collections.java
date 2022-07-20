package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		ArrayList array =new ArrayList();
        array.add(0);
        array.add(1);
        array.add(2);
		ArrayList array1 =new ArrayList();
        array1.add(3);
        array.add(4);
        array1.addAll(array);
       System.out.println(array1);
        LinkedList l1=new LinkedList();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.addFirst(100);
        l1.addLast(200);
        l1.addFirst(array1);
        System.out.println(l1);
        System.out.println(l1.contains(7));
        HashSet hm =new HashSet();
        hm.add(5);
        hm.add(6);
        hm.add(7);
        hm.add(5);
        hm.add("String");
        hm.add(8);
        hm.add(9);
        Iterator i= hm.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
	}

}
