import java.util.*;
 
 class Sort {
 
    public static void main(String[] args) {

        LinkedList<Integer> linkedListNumbers = new LinkedList<Integer>();
        linkedListNumbers.add(23);
        linkedListNumbers.add(45);
        linkedListNumbers.add(12);
        linkedListNumbers.add(37);
        linkedListNumbers.add(49);
        Collections.sort( linkedListNumbers );
         System.out.println(linkedListNumbers);
    }
}