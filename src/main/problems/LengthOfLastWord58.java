package main.problems;

public class LengthOfLastWord58 {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("luffy is still joyboy  1  "));

    }

    public static int lengthOfLastWord(String s) {

        boolean character = true;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ' && count != 0) {
                character = false;
            } else if (s.charAt(i) != ' ') {
                character = true;
                count++;
            }

            if (!character) {
                break;
            }
        }

        return count;

    }

    public static int lengthOfLastWord2(String s) {

        String[] strings = s.split("\\s+");

        return strings[strings.length - 1].length();
    }

    public static int lengthOfLastWord3(String s) {

        s = s.trim();
        int l = s.lastIndexOf(" ");
        if (l == -1) {
            return s.length();
        }
        return s.substring(l).trim().length();
    }
}
