import java.util.Scanner;
public class V1
{
    public static void main (String[] args)
    {
        String word = "canyon"; 
        System.out.println ("Guess the first letter");
        String[] letters = new String[26];
        Scanner checker = new Scanner (System.in);
        int count = 0;
        boolean WordIsGuessed = false;
        int wrongGuess = 0;
        int correctGuess = 0;
        check(count,WordIsGuessed,letters,checker,word,wrongGuess,correctGuess);
        if (WordIsGuessed == true)
        System.out.println("You win!");
    }
    
    public static boolean check (int count, boolean WordIsGuessed, String[] letters, Scanner checker, String word, int wrongGuess, int correctGuess)
    {
        while(WordIsGuessed = false)
        {
            System.out.println ("Guess the first letter");
            String input = checker.nextLine();
            letters[count] = input;
            count++;
            for (int i = 0; i < word.length(); i++)
            {
                if (input == word.substring(i))
                {
                    System.out.println("Correct");
                    correctGuess++;
                }
                else 
                {
                    System.out.println("Try again");
                    wrongGuess++;
                }
            }
            if (correctGuess == word.length())
                WordIsGuessed = true;
            
            if (wrongGuess == 6)
            {
                System.out.println("You lose");
                break;
            }
        }  
        return WordIsGuessed;
    }
}
