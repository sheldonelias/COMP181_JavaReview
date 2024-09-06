import java.util.Scanner;

public class _4_Arrays
{
    //NOTICE ARRAY IS NOT A DATATYPE ITSELF. IT CONTAINS DATA OF A SPECIFIC TYPE
    //Use the name of the datatype to be contained followed by []

    //DECLARATION ONLY
    //Declare the data type, provide the square brackets []
    //Give the identifier, "names" in this case. The convention
    //is to use a plural word.
    //Provide the number of elements.
    //Declaring without assignment to element indices puts null value inside

    //Declaring an array without knowing how many elements, nor knowing their values
    String[] flowers;
    //Declaring an array knowing how many elements (4), but not know their values
    String[] names = new String[4];

    //DECLARATION AND INITIALIZATION OF ALL ELEMENTS AT SAME TIME
    //This assignment procedure can occur at the class level
    //Declaring knowing how many elements and their values.
    static String[] moreNames = {"Sam", "Ryann", "Swift", "Geri"};

    //CONSTRUCTOR
    public _4_Arrays()
    {

        for(int i = 0; i < moreNames.length; ++i )
        {
            System.out.println( moreNames[i] + " @ " + i);
        }


        //INITIALIZATION AFTER DECLARATION, ONE ELEMENT AT A TIME
        //This assignment procedure must occur in a method and not at the method definition
        // level and NOT the class level
        names[0] = "Oliver";
        names[1] = "Noa";
        names[2] = "Kohana";
        names[3] = "William";


        flowers = new String[7];
        flowers[4] = "chrysanthemum";

        moreNames[2] = "Leonard";

        System.out.println(moreNames[2]);

        //DECLARATION AND INITIALIZATION OF ALL ELEMENTS AT SAME TIME
        //This assignment procedure can occur at the class level
        String[] evenMoreNames = {"James", "Jonathan", "Emma", "Vickie"};

        //printStringArrayElements(  names  );
    }

    //METHOD DECLARATION THAT TAKES ARRAY AS ARGUMENT USING A FOREACH (ENHANCED) LOOP
    public void printStringArrayElements(String[] strArr)
    {
        //foreach AKA enhanced loop

        for(String str  :    strArr )
        {
            System.out.println(str);

            if(str.charAt(0) == 'O')
            {
                break;
            }
        }
    }
}

class Arrays1d {
    public static void removeNonAlpha() {

        Scanner scnr = new Scanner(System.in);
        String userInput;
        String userInputNoSpaces;
        int i;

        System.out.print("Enter a string mixing alpha and non-alpha characters: ");
        userInput = scnr.nextLine();
        userInputNoSpaces = "";

        for (i = 0; i < userInput.length(); ++i) {
            if ( Character.isLetter(userInput.charAt(i)) ){
                userInputNoSpaces += userInput.charAt(i);
            }
        }

        System.out.println(userInputNoSpaces);
    }

    public static void wordFrequencies() {
        Scanner scnr = new Scanner(System.in);
        int numWords;
        String currWord;
        int i;
        int j;
        int frequency;
        String[] userWords = new String[20];
        int[] wordFreq = new int[20];

        System.out.print("How many words in your array: ");
        numWords = scnr.nextInt();

        for(i = 0; i < numWords; ++i) {
            System.out.print("Word " + (i + 1) + ": ");
            currWord = scnr.next();
            userWords[i] = currWord;
        }

        for (i = 0; i < numWords; ++i) {
            frequency = 0;

            for (j = 0; j < numWords; ++j) {
                if (userWords[i].equals(userWords[j])) {
                    frequency = frequency + 1;
                }
            }
            wordFreq[i] = frequency;
        }

        for(i = 0; i < numWords; ++i) {
            System.out.println(userWords[i] + " - " + wordFreq[i]);
        }
    }
}


