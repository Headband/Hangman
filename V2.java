import java.util.Scanner;
public class V1
{
    public static void main (String[] args)
    {
        String word = "canyon"; 
        String[] letters = new String[26];
        Scanner checker = new Scanner (System.in);
        boolean b = check(letters,checker,word);
        if (b == true)
            System.out.println("You win!");
        else
            System.out.println ("You lose!");
    }

    public static boolean check (String[] letters, Scanner checker, String word)
    {
        boolean WordIsGuessed = false;
        int wrongGuess = 0;
        int correctGuess = 0;
        int count = 0;	
        while(WordIsGuessed == false)
        {
            System.out.println ("Guess a letter");
            String input = checker.nextLine();
            char input1 = input.charAt(0);
            letters[count] = input;

            for (int i = 0; i < word.length(); i++)
            {
                if (input1 == word.charAt(i))
                {
                    correctGuess++;
                    break;
                }
                else 
                {
                    wrongGuess++;   
                }
            }
            count++;
            
            if (correctGuess == word.length())
                WordIsGuessed = true;
                
            else if (wrongGuess == 6)
            {
                break;
            }
        }  

        return WordIsGuessed;
    }
}
