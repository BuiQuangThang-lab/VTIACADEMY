import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class objectMethod {
	
     public static void main(String[] args) {
    	 Person person1 = new Person(1, "Thắng");
    	 Person person2 = new Person(2, "Khuyên");
    	 Person person3 = new Person(3, "Mai");
    	 Person person4 = new Person(4, "Minh");
    	 Person person5 = new Person(5, "Ngọc");
    	 
    	 Person[] persons = new Person[] {person1,person2,person3,person4,person5};
    	 	 for(int i = 0; i < persons.length; i++) {
    	     for(int j = i+1; j<persons.length-1; j++) {
    	    	 if(persons[i].getName().charAt(0) > persons[j].getName().charAt(0)) {
    	    		 Person temp = persons[j];
    	    		 persons[j] = persons[i];
    	    		 persons[i] = temp;
    	    	 }
    	    	 if(persons[i].getName().charAt(0) == persons[j].getName().charAt(0)) {
    	    		 continue;
    	    	 }
    	     }	 
    	 }
    	 
          for(int i = 0; i<persons.length; i++) {
        	  System.out.println(persons[i].getId() + " " + persons[i].getName());
          } 	 
   }
}
