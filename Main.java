import java.util.Scanner;
public class Main{
    public static void Main(String args[]){
        int count = 0;
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        for(int i = 0; i < inputText.length(); i++ ) {
            if (character.isLetter(inputText.charAt(i))) {
                count++
            }
        }
            int mid = count/2;
        for(int index = 0; index <=mid; index++ )
            if (char.IsLetterOrDigit(inputText[index])) {
                Console.WriteLine(text[index]);
            }
        for(int index = inputText.length; index >mid; index--){
            if (char.IsLetterOrDigit(inputText[index])){
                Console.WriteLine(text[index]);
            }

        }
    }
}
