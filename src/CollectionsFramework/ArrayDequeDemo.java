package CollectionsFramework;
import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10);
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         dq.pollFirst();
        
         dq.offerLast(1);
         dq.offerLast(2);
         dq.offerLast(3);
         dq.offerLast(4);
         
         System.out.println("Peek ELement"+dq.peek());
         
         dq.forEach((x)->System.out.println(x));

	}

}
