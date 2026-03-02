import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Banner Printing using HashMap for Character Patterns
 */
public class UC8 {

    /**
     * Builds and returns a HashMap of character patterns.
     * @return HashMap<Character, String[]> mapping characters to their ASCII art patterns
     */
    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        // O pattern
        patternMap.put('O', new String[] {
            "  *******  ",
            " *       * ",
            " *       * ",
            " *       * ",
            " *       * ",
            " *       * ",
            "  *******  "
        });

        // P pattern
        patternMap.put('P', new String[] {
            " *******   ",
            " *      *  ",
            " *      *  ",
            " *******   ",
            " *         ",
            " *         ",
            " *         "
        });

        // S pattern
        patternMap.put('S', new String[] {
            "  *******  ",
            " *         ",
            " *         ",
            "  *******  ",
            "        *  ",
            "        *  ",
            "  *******  "
        });

        return patternMap;
    }

    /**
     * Renders the banner for a given message using stored patterns.
     * @param message the word to render (e.g., "OOPS")
     * @param patternMap the HashMap of character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {
        // Each character pattern has 7 rows
        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (char c : message.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[row]);
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        String message = "OOPS";
        renderBanner(message, patternMap);
    }
}