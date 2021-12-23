import java.util.LinkedList;

class LL2 {
  public static void main(String[] args){
   
    LinkedList<String> animals = new LinkedList<>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println(animals);
    animals.add(1, "Horse");
    System.out.println(animals);
  }
}