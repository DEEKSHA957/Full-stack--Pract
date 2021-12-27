import java.util.HashMap;

class Demo {
  public static void main(String[] args) {
    HashMap<String, Integer> prices = new HashMap<>();
    prices.put("Shoes", 200);
    prices.put("Bag", 300);
    prices.put("Pant", 150);
    System.out.println( prices);
    System.out.println( prices.entrySet());
  }
}