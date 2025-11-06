public class ToUpperCase {
    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            String output = input.toUpperCase();
            System.out.println(output);
        } else {
            System.out.println("Please provide a string as an XXXXXXXX ");
        }
    }
}
