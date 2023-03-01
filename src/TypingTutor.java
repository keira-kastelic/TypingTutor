
import java.util.Scanner;
public class TypingTutor {
    public static void main(String[] args) {
        Dictionary dictionaryFile = new Dictionary(); // declaring the dictionary class
        System.out.println("Enter your name"); // prompting the user for their name
        Scanner word = new Scanner(System.in); // creating a scanner
        String username = word.nextLine(); // reading in the users response
        System.out.println("Enter a date in MMDDYY form"); // prompting the user for the date
        Scanner num = new Scanner(System.in); // creating a new scanner
        int birthday = num.nextInt(); // storing the users response
        String randomWord1 = dictionaryFile.randomWord(); // creating a random word string
        String randomWord2 = dictionaryFile.randomWord();
        String randomWord3 = dictionaryFile.randomWord();
        String randomWord4 = dictionaryFile.randomWord();
        String randomWord5 = dictionaryFile.randomWord();
        System.out.println("Type the following"); // prompting the user to type the words
        String randomSentence = randomWord1+" "+randomWord2+" "+randomWord3+" "+randomWord4+" "+randomWord5; // creating five random words for the user to type
        System.out.println(randomSentence); // printing out the random words
        long startTime = System.currentTimeMillis(); // starting the time for the user to type the words
        Scanner type = new Scanner (System.in); // creating a new scanner
        String typed = type.nextLine(); // reading in the users response
        long stopTime = System.currentTimeMillis(); // stopping the time after the line is finished
        boolean isCorrect = randomSentence.equals(typed); // creating a boolean to check and see if they typed the line correct
        System.out.println("Did you print the correct line?"); // prompting the user
        System.out.println(isCorrect); // printint out the boolean
        System.out.print("Words per minute (WPM) = "); // prompting the user
        double wordsPerMin = (stopTime-startTime)*1.66667e-5; // finding the words per second
        int wpm = typed.length(); // finding the length of the string typed
        int amountOfWords = wpm/5; // finding the words
        double time = amountOfWords/wordsPerMin; // finding the time taken to type the amount of words
        System.out.println("Your speed is:"); // prompting the user
        System.out.println(time+" seconds"); // printing the time
        System.out.println("Next Goal:"); // prompting the user
        double nextTime = time-3; // creating a goal of three seconds faster
        System.out.println(nextTime+" seconds faster"); // printing out the users new goal

    }
}
