import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int count = 0;
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();

        if(first.euqal(last)) {
            System.out.println("It's a Palindrome!");
        }
        else{
            System.out.println("Not a Palindrome!");
        }

        String one = first(inputText);
        String two = last(inputText);
        for(int i = 0; i < inputText.length(); i++ ) {
            if (inputText.isLetter(inputText.charAt(i))) {
                inputText.charAt(i) = inputText.charAt(i).toLowerCase();
                count++;
            }
        }
        public static String first(string x) {
            int mid = count / 2;
            for (int index = 0; index <= mid; index++) {
                if (char.IsLetterOrDigit(x[index])) {
                    Console.WriteLine(text[index]);
                }
            }
        }
        public static String last(String x) {
            for (int index = x.length; index > mid; index--) {
                if (char.IsLetterOrDigit(x[index])) {
                    Console.WriteLine(text[index]);
                }
            }
        }

    }
}

