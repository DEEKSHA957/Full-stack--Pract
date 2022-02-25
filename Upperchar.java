 class Demo {
   public static void main(String []args) {
      System.out.println("Checking for Uppercase character...");
      char val = 'Z';
      System.out.println("Character: "+val);
      if (Character.isUpperCase(val)) {
         System.out.println("Character is in Uppercase!");
      } else {
         System.out.println("Character is in Lowercase!");
      }
   }
}