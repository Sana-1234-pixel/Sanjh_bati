public class UC6 {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[] {
            "  ******* ",
            " *       *",
            " *       *",
            " *       *",
            " *       *",
            " *       *",
            "  ******* "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[] {
            "  *******  ",
            " *       * ",
            " *       * ",
            " ********  ",
            " *        ",
            " *        ",
            " *        "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[] {
            " *******  ",
            "*         ",
            "*        ",
            " ******  ",
            "        *  ",
            "        *  ",
            " ******  "
        };
    }

    public static void main(String[] args) {
        // Build banner lines by combining patterns
        String[] banner = new String[7];
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        for (int i = 0; i < 7; i++) {
            banner[i] = O[i] + O[i] + P[i] + S[i];
        }

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}