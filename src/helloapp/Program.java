package helloapp;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program {
	  public static void main(String[] args) {
		  
		  //Не используя сортировку, написать метод который возвращает 3ий list в отсортированном виде
		  
		  List<Integer> list1 = new ArrayList<Integer>(){};
	        list1.add(1);
	        list1.add(5);
	        list1.add(10);
	        list1.add(12);
	        list1.add(15);
	        list1.add(20);
	        list1.add(21);
	        list1.add(22);

	      List<Integer> list2 = new ArrayList<Integer>(){};
	        list2.add(-5);
	        list2.add(-1);
	        list2.add(9);
	        list2.add(15);
	        list2.add(100);
	        
	        System.out.println("Первый массив : ");
	        
		    for(Integer  i : list1){
				  
			    System.out.println(i);
			}
		    System.out.println("Второй массив : ");
		    
		    for(Integer  i : list2){
				  
			    System.out.println(i);
			}
		    
		    SortedSet<Integer> list3 = new TreeSet<Integer>(list1);
		    list3.addAll(list2);
		    
            System.out.println("Третий массив : ");
		    
		    for(Integer  i : list3){
				  
			    System.out.println(i);
			}
		   
	  }
}



