package in.com;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String string = "aba";
        String rev =""; //  remove space, keep empty string

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            rev = ch + rev;
        }

        char ch1[] = string.toCharArray();
        char ch2[] = rev.toCharArray();

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("equals (Palindrome)");
        } else {
            System.out.println("not equals");
        }

        System.out.println("Reversed string: " + rev);
    }
}
