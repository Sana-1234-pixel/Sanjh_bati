public class UC7 {

    /**
     * Inner static class CharacterPatternMap
     * Encapsulates a character and its 7-line pattern
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character represented
         * @param pattern   the 7-line string pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return the 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern definitions
    public static String[] getOPattern() {
        return new String[] {
            "  *******  ",
            " *       * ",
            " *       * ",
            " *       * ",
            " *       * ",
            " *       * ",
            "  *******  "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " *******   ",
            " *      *  ",
            " *      *  ",
            " *******   ",
            " *         ",
            " *         ",
            " *         "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  *******  ",
            " *         ",
            " *         ",
            "  *******  ",
            "        *  ",
            "        *  ",
            "  *******  "
        };
    }

    public static void main(String[] args) {
        // Create CharacterPatternMap objects
        CharacterPatternMap O = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap P = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap S = new CharacterPatternMap('S', getSPattern());

        // Array of objects for OOPS
        CharacterPatternMap[] bannerChars = { O, O, P, S };

        // Build banner lines using StringBuilder
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPatternMap cp : bannerChars) {
                sb.append(cp.getPattern()[i]);
            }
            banner[i] = sb.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
