public class StringPractice {
    public static void main(String[] args) {
        // Insert into the string

        StringBuilder sb = new StringBuilder("GeeksGeeks");
        System.out.println(sb.insert(5, "for"));

        // Palindrome check
        String checkForPalindrome = "pop";
        int len = checkForPalindrome.length();
            found: {
                for (int i = 0; i <len/2; i++) {
                    if (checkForPalindrome.charAt(i) != checkForPalindrome.charAt(len - i - 1)) {
                        System.out.println("Not Palindrome.");
                        break found;
                    }
                } System.out.println("String is Palindrome.");
            }
    }
    
}