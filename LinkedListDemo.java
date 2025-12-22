//import java.util.*;

public class LinkedListDemo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        LinkedList newList=new LinkedList();
/*      
        Scanner scn=new Scanner(System.in);
        System.out.println("Insert data:");
        while (scn.hasNextInt()) { 
            int temp=scn.nextInt();
            newList.insertAtLast(temp);
            System.out.println("Added: "+temp);
        }
        scn.close();
*/              

        // populate list so deletes operate on real nodes
        newList.insertAtLast(10);
        newList.insertAtLast(20);
        newList.insertAtLast(30);
        newList.insertAtLast(40);
        newList.insertAtLast(50);

        System.out.println("Before operations:");
        newList.displayList();
        System.out.println("After operations:");
        newList.displayList();
        
}
}
