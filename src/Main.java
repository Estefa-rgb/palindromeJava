public class Main {

    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World michis!");

        // Write a word and check if is palindrome
        String word = "anitalavalatina";
        System.out.println("The word " + word + " is palindrome? " + isPalindrome(word));
    }
}