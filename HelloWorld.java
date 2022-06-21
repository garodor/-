public class HelloWorld  {
    public static void main(String[] args) {
        System.out.println("Hello " + (args.length > 0? args[2] : "world"));
    }
}