import java.util.Scanner;

public class Palindrome {

    // 1. Palindrome String (Reverse Method)
    static void stringPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(str.equals(rev) ? "Palindrome String" : "Not Palindrome String");
    }

    // 2. Palindrome Number
    static void numberPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num, rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println(original == rev ? "Palindrome Number" : "Not Palindrome Number");
    }

    // 3. Palindrome using StringBuilder
    static void stringBuilderPalindrome() {
        String str = "level";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "Palindrome (StringBuilder)" : "Not Palindrome");
    }

    // 4. Palindrome using Two Pointer
    static void twoPointerPalindrome() {
        String str = "radar";
        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome ? "Palindrome (Two Pointer)" : "Not Palindrome");
    }

    // 5. Palindrome ignoring case & spaces
    static void ignoreCaseSpacePalindrome() {
        String str = "A man a plan a canal Panama";
        str = str.replaceAll("\\s+", "").toLowerCase();

        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome ? "Palindrome (Ignore case & space)" : "Not Palindrome");
    }

    public static void main(String[] args) {
        stringPalindrome();
        numberPalindrome();
        stringBuilderPalindrome();
        twoPointerPalindrome();
        ignoreCaseSpacePalindrome();
    }
}
