import java.util.HashMap;
 class Example 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    
        hashMap.put(1, "Indeed.com");
        hashMap.put(2, "Welcomee!");
        hashMap.put(3, "Website");
        
        String value = hashMap.get(1);
        System.out.println("Value of key 1: "+value);
        
        value = hashMap.get(5);
        System.out.println("Value of key 5: "+value);
    }
}