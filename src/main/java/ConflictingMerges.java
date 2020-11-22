public class ConflictingMerges {

    public static void main() {
         sayhello();
   
        System.out.println("Hello Marci"); // Names!! :D
        System.out.println(welcome());
    }
  
    private static String getHelloMessage() {
        return "Hello, World!";
    }

    private static void sayhello() {
        String message = getHelloMessage();
        System.out.println(message);
    }
}
