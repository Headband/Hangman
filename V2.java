import java.util.Scanner;
public class V2
{
    public static void main (String[] args)
    {
        String word = "asdfghjklqwer"; 
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
            boolean u = false;

            for (int i = 0; i < word.length(); i++)
            {
                for (int k = 0; k < word.length(); k++)
                {
                    if (input1 == word.charAt(k))
                    {
                        correctGuess++;
                        u = false;
                        break;
                    }   
                    else
                        u = true;
                }
                if (u == true)
                {
                    wrongGuess++;  
                    break;
                }
                else if (u == false)
                    break;
            }
            count++;
            System.out.println ("Number of correct guesses: " + correctGuess);
            System.out.println ("Number of wrong guesses: " + wrongGuess);

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
