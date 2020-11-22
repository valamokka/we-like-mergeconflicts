public class ConflictingMerges {

    public static void main() {
       sayhello();
    }
    private static String getHelloMessage() {
        return "Hello, World!";
    }

    private static void sayhello() {
        String message = getHelloMessage();
        System.out.println(message);
    }
}
