import java.util.Iterator;
import java.util.LinkedHashSet;
class LinkedHashSetDemo {
    void linkedHashSetMethod() {
        LinkedHashSet<Integer> marksSet = new LinkedHashSet<>();
        
        
        marksSet.add(85);
        marksSet.add(90);
        marksSet.add(75);
        marksSet.add(90);  
        marksSet.add(60);
        marksSet.add(100);
        
 
        int sum = 0;
        for (int mark : marksSet) {
            sum += mark;
        }
        
        System.out.println("Sum of marks: " + sum);

       
        System.out.println("Marks in LinkedHashSet:");
        Iterator<Integer> iterator = marksSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

public class demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashSetMethod();
    }
}
