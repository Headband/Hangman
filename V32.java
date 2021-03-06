import java.util.Random;
import java.util.Scanner;
public class V32
{
    public static void main (String[] args)
    {       
        String word = wordBank();
        String[] letters = new String[26];

        instructions();

        Scanner checker = new Scanner (System.in);
        boolean b = check(letters,checker,word);
        if (b == true)
            System.out.println("*** [You win!] ***");
        else
            System.out.println ("D; [You lose!]");
    }

    public static void instructions()
    {
        System.out.println ("|      - Please scale the window to fit this box.      |");
        System.out.println ("|      - Make sure to inlclude the text at the bottom. |");
        System.out.println ("|      - You have 7 guesses to get the word.           |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|      - Now you can type a letter.                    |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
        System.out.println ("|                                                      |");
    }

    public static boolean check (String[] letters, Scanner checker, String word)
    {
        System.out.println ();
        boolean WordIsGuessed = false;
        int wrongGuess = 0;
        int correctGuess = 0;
        int count = 0;  
        while(WordIsGuessed == false)
        {
            //System.out.println ("\f");
            String[] correctLetter = new String[26];
            System.out.println ();
            System.out.println ("--- Guess a letter ---");
            String input = checker.nextLine();
            input = input.toLowerCase();

            boolean validGuess = true;
            for(int i = 0; i <= word.length(); i++)
            {
                if(input.equals(letters[i]) || input.equals(" ") || input.equals("") || input.matches("^\\d+(\\.\\d+)?"))
                    validGuess = false;
            }

            if(validGuess == true)
            {
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
                            correctLetter[count] = input;
                            u = false;
                            break;
                        }   
                        else
                        {
                            u = true;
                        }
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
            }

            image(wrongGuess);

            for(int j = 0; j < word.length(); j++)
            {
                for(int k = 0; k < correctLetter.length; k++)
                {
                    if(correctLetter[k].equals(word.charAt(j)))
                    {
                        System.out.print ("_");
                    }
                    else
                        System.out.print (word.charAt(j));
                }
            }

            if (correctGuess == word.length())
                WordIsGuessed = true;
            else if (wrongGuess == 7)
            {
                break;
            }
        }
        return WordIsGuessed;
    }

    public static void image(int wrongGuess)
    {
        if (wrongGuess == 1)
        {

            System.out.println("   +----------------------------------+  ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                  | ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        else if (wrongGuess == 2)
        {
            System.out.println("   +----------------------------------+  ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                 _     ");
            System.out.println("   |                               /   \\ ");
            System.out.println("   |                              (     ) ");
            System.out.println("   |                                \\ / ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        else if (wrongGuess == 3)
        {
            System.out.println("   +----------------------------------+  ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                 _     ");
            System.out.println("   |                               /   \\ ");
            System.out.println("   |                              (     ) ");
            System.out.println("   |                                \\ / ");
            System.out.println("   |                               __|__ ");
            System.out.println("   |                                 |   ");
            System.out.println("   |                                 |   ");
            System.out.println("   |                                 |");
            System.out.println("   |                                 | ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        else if (wrongGuess == 4)
        {
            System.out.println("   +----------------------------------+  ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                 _     ");
            System.out.println("   |                               /   \\ ");
            System.out.println("   |                              (     ) ");
            System.out.println("   |                                \\ / ");
            System.out.println("   |                               __|__ ");
            System.out.println("   |                                 |  \\ ");
            System.out.println("   |                                 |   \\ ");
            System.out.println("   |                                 |    \\");
            System.out.println("   |                                 |     \\");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        else if (wrongGuess == 5)
        {
            System.out.println("   +----------------------------------+  ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                 _     ");
            System.out.println("   |                               /   \\ ");
            System.out.println("   |                              (     ) ");
            System.out.println("   |                                \\ / ");
            System.out.println("   |                               __|__ ");
            System.out.println("   |                              /  |  \\ ");
            System.out.println("   |                             /   |   \\ ");
            System.out.println("   |                            /    |    \\");
            System.out.println("   |                           /     |     \\");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        else if (wrongGuess == 6)
        {
            System.out.println("   +----------------------------------+  ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                  | ");
            System.out.println("   |                                 _     ");
            System.out.println("   |                               /   \\ ");
            System.out.println("   |                              (     ) ");
            System.out.println("   |                                \\ / ");
            System.out.println("   |                               __|__ ");
            System.out.println("   |                              /  |  \\ ");
            System.out.println("   |                             /   |   \\ ");
            System.out.println("   |                            /    |    \\");
            System.out.println("   |                           /     |     \\");
            System.out.println("   |                                  \\ ");
            System.out.println("   |                                   \\");
            System.out.println("   |                                    \\");
            System.out.println("   |                                     \\");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        else if (wrongGuess == 7)
        {
            System.out.println("   +---------------------------+  ");
            System.out.println("   |                           | ");
            System.out.println("   |                           | ");
            System.out.println("   |                           _     ");
            System.out.println("   |                         /   \\ ");
            System.out.println("   |                        (     ) ");
            System.out.println("   |                          \\ / ");
            System.out.println("   |                         __|__ ");
            System.out.println("   |                        /  |   \\");
            System.out.println("   |                       /   |    \\ ");
            System.out.println("   |                      /    |     \\ ");
            System.out.println("   |                     /     |      \\ ");
            System.out.println("   |                          / \\ ");
            System.out.println("   |                         /   \\");
            System.out.println("   |                        /     \\");
            System.out.println("   |                       /       \\ ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println(" --^-- "); 

        }
        return;
    }

    public static String wordBank()
    {
        String[] wordList = {"wolf", "dog", "zebra", "cat", "eagle", "fox", "crow", "ant", "caterpillar", "sloth", "monkey", "hawk", "elephant"};
        int idx = new Random().nextInt(wordList.length);
        String word = (wordList[idx]);
        return word;
    }
}