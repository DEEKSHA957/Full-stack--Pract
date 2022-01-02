import java.util.*;
  
 class ListDemo {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>(5);
        list.add("Hey");
        list.add("There");
        list.add("Its me!!!");
        System.out.println(list);
  
        // Remove all elements from the List
        list.clear();
        System.out.println(list);
    }
}