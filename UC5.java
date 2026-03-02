public class UC5 {

    public static void main(String[] args) {
        // Declaring and initializing the array in a single statement.
        // String.join(" ", ...) adds a single space between each character segment.
        String[] banner = {
            String.join(" ", "*********",   "*********",       "*********", "*********"), // Line 1
            String.join(" ", "*    ","  *", "*    ","  *",     "*      ","*", "*"), // Line 2
            String.join(" ", "*    ","  *", "*    ","  *",     "*      ","*", "*"), // Line 3
            String.join(" ", "*    ","  *", "*    ","  *",     "*********", "*********"), // Line 4
            String.join(" ", "*    ","  *", "*    ","  *",     "*        ", "         *       "), // Line 5
            String.join(" ", "*    ","  *", "*    ","  *",     "*        ", "         * "), // Line 6
            String.join(" ", "*********",   "*********",       "*        ", "*********" )  // Line 7
        };

        // Enhanced For Loop (For-Each) to iterate and print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
