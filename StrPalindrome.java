import java.util.*;
public class StrPalindrome {
    public static void main(String[] args) {
        String str = "Mad:am";
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                s.append(ch);
            }
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != stack.pop()) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}