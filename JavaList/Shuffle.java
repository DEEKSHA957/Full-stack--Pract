import java.util.*;
 
 class Shuffle {
  public static void main(String args[]){
  LinkedList<String> linkedList = new LinkedList<String>(); 
  linkedList.add("India"); 
  linkedList.add("USA");
  linkedList.add("Australia");
  linkedList.add("China");
  linkedList.add("Brazil");
  linkedList.add("London");
  System.out.println("Actual LinkedList:"+linkedList); 
        Collections.shuffle(linkedList);
        System.out.println(linkedList);       
        Collections.shuffle(linkedList); 
        System.out.println( linkedList); 
  }
 }