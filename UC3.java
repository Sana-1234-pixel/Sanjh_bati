public class UC3 {
    public static void main(String[] args) {
        // Using String.join(" ", ...) to build each line
        // Empty string delimiter ensures no extra spaces between segments

        System.out.println(String.join(" ",
            "  *****   ", "  *****   ", "  *****   ", " ******* "));
        System.out.println(String.join(" ",
            " *     *  ", " *     *  ", " *     *  ", " *       "));
        System.out.println(String.join(" ",
            "*       * ", "*       * ", "*       * ", " *       "));
        System.out.println(String.join(" ",
            "*       * ", "*       * ", "*       * ", " ******* "));
        System.out.println(String.join(" ",
            "*       * ", "*       * ", "* *****   ", "       * "));
        System.out.println(String.join(" ",
            " *     *  ", " *     *  ", "*         ", "       * "));
        System.out.println(String.join(" ",
            "  *****   ", "  *****   ", "*         ", "  ****** "));
    }
}