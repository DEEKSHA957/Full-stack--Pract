import java.io.*;
import java.util.LinkedList;
 class  Remove {
  public static void main(String args[])
    {
  
        LinkedList<String> list = new LinkedList<String>();
  list.add("Hi");
        list.add("Hello");
        list.add("World");
        list.add("10");
        list.add("20");
  
        
        System.out.println(list);
  
        list.remove();
  System.out.println(list);
    }
}
