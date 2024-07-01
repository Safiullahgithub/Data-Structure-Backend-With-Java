public class string {
    public static void main(String[] args) {
        // Declaration and initialization
        String str = "Hello, World!";

        // Concatenation
        String hello = "Hello";
        String world = "World";
        String greeting = hello + ", " + world + "!";
        System.out.println("Greeting: " + greeting);

        // Length
        System.out.println("Length of greeting: " + greeting.length());

        // Character access
        System.out.println("First character: " + greeting.charAt(0));
        System.out.println("Last character: " + greeting.charAt(greeting.length() - 1));

        // Substring
        System.out.println("Substring from index 7: " + greeting.substring(7));
        System.out.println("Substring from index 7 to 12: " + greeting.substring(7, 12));

        // Index of
        System.out.println("Index of 'World': " + greeting.indexOf("World"));
        System.out.println("Index of 'W': " + greeting.indexOf('W'));

        // Comparison
        System.out.println("Is 'Hello' equal to 'Hello': " + hello.equals("Hello"));
        System.out.println("Comparison of 'Hello' and 'World': " + hello.compareTo("World"));

        // Case conversion
        System.out.println("Uppercase: " + hello.toUpperCase());
        System.out.println("Lowercase: " + hello.toLowerCase());

        // Trim
        System.out.println("Trimmed: '" + "  Hello, World!  ".trim() + "'");

        // Replace
        System.out.println("Replaced 'o' with '0': " + greeting.replace('o', '0'));
        System.out.println("Replaced 'World' with 'Java': " + greeting.replace("World", "Java"));

        // Split
        String[] words = greeting.split(", ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ").append("World").append("!");
        System.out.println("StringBuilder result: " + sb.toString());
    }
}
