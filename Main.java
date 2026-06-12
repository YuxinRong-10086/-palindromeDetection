import java.util.Scanner;

/**
* Determines whether a user-entered phrase is a palindrome.
* Spaces, punctuation, and capitalization are ignored.
*/
public class Main {

    /**
    * Reads a string from the user, removes non-alphanumeric
    * characters, reverses the filtered string, and determines
    * whether it is a palindrome.
    *
    * @param args command-line arguments (not used)
    */
        public static void main(String[] args) {
            
            System.out.println("Enter a string to check if it's a palindrome");
            Scanner input = new Scanner(System.in);
            String inputText = input.nextLine();

            String filteredInputText = "";

            // Remove spaces and punctuation
            for (int i = 0; i < inputText.length(); i++) {

            char ch = inputText.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
            filteredInputText += Character.toLowerCase(ch);
                }
            }

            // Build reversed string
            String reversedText = "";

            for (int i = filteredInputText.length() - 1; i >= 0; i--) {
            reversedText += filteredInputText.charAt(i);
            }
    
            // Compare strings
                if (filteredInputText.equals(reversedText)) {
                System.out.println("It's a Palindrome!");
                } 
                else {
                System.out.println("Not a Palindrome!");
                }

                input.close();
            }
}
