import java.util.Arrays;

public class _7a_Object_Methods
{

    //Creating two String instance variables with different identifiers and the same values
    String str1 = "hello";

    String str2 = "hello";

    //Creating two object instance variables with different identifiers and same object type, but different address
    Program p1 = new Program();

    Program p2 = new Program();

    //Creating two wrapper Integer objects with the same value.
    Integer i1 = 9;

    Integer i2 = 9;

    //Creating two arrays of different data types with the same values. Both hold integers
    //But, short holds integers within a smaller range of pos and neg numbers than does int

    int[] intArr = { 20, 10, 30, 13 };

    short[] shortArr = {20, 10, 30, 13 };


    //Case of the String Wrapper
    String a = new String("hi");
    String b = new String("hi");

    //Poem fragment from Langston Hughes. The poem is called "I dream a world"
    String poemArr[] =
            {
                    "I dream a world where man",
                    "No other man will scorn,",
                    "Where love will bless the earth",
                    "And peace its paths adorn",
                    "I dream a world where all",
                    "Will know sweet freedom's way,",
                    "Where greed no longer saps the soul",
                    "Nor avarice blights our day."
            };

    _7a_Object_Methods()
    {

        //Assigning the memory address of p1 to p2, destroying access p2 by overwriting p2 memory address
        p2 = p1;

        //Testing if the address of wrapper Integer i1 is the same as i2
        //The memory address and the value are the same because IntelliJ
        //knows that such small valued primitives can share the same memory
        //if they share the same values
        System.out.println("i1.equals(i2): " + i1.equals(i2) );
        System.out.println("i1 == i2: " + (i1 == i2) );


        //Show the length of intArr[]
        System.out.println("intArr.length: " + intArr.length);

        //Makes a copy of intArr[] into intArrCopy[]
        int[] intArrCopy = Arrays.copyOf(intArr, intArr.length + 1);

        //Checks that the new array intArrCopy[] is longer
        System.out.println("intArrCopy.length: " + intArrCopy.length);

        //Creates a copy with a different range. Notice the range used in the
        //arguments is larger than the original. What will happen? Will there be an error?
        //What values will be held inside the new indices?
        short[] shortArrCopy = Arrays.copyOfRange(shortArr, 1, 6);

        //Shows the new length of the shortArrCopy[]
        System.out.println("shortArrCopy.length: " + shortArrCopy.length);

        //Shows a fast way to convert an array to String and then print it to the console
        System.out.println(Arrays.toString(shortArrCopy));

        //Another way to print the contents of the shortArrCopy[]
        for(short s: shortArrCopy)
        {
            System.out.print(s + " ");
        }

        //Sorts an array
        Arrays.sort(shortArrCopy, 0, shortArrCopy.length);

        //Proves that once sorted, the order of array shortArrCopy[] is changed. Yikes! Good, but
        //the original order is gone.
        System.out.println(Arrays.toString(shortArrCopy));

        //Shows the use of the substring() method
        String title = "J Perfect's Diary";
        title.substring(2, 9); //Will print "Perfect".
        System.out.println(title.substring(2, 9));

        //But notice that the substring() method does not change the String title.
        //To keep the substring, it return value of substring must be assigned to
        //another variable.
        String shorterTitle = title.substring(2, 9);
        //Will print "Perfect".
        System.out.println(shorterTitle);

        //Original remains intact.
        System.out.println(title);

        //Can you take poemArr[] initialized above, and use the array and string methods
        //to create this new sentence? "A world I know will dream sweet sap."

        //Use the poem knowing that each array line has an index from 0 to 7. And each line
        //consists of a string with characters (including white space and punctuation) with
        //indices from 0 to the last character count up.

        //String poemArr[] =
        //            {
        //                    "I dream a world where man",
        //                    "No other man will scorn,",
        //                    "Where love will bless the earth",
        //                    "And peace its paths adorn",
        //                    "I dream a world where all",
        //                    "Will know sweet freedom's way,",
        //                    "Where greed no longer saps the soul",
        //                    "Nor avarice blights our day."
        //            };

    }

}
