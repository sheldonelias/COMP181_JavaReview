import java.util.Arrays;

//Exceptions
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;

//IO Classes
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class _14_InputOutput
{
    static String[] poemLineArr;
    public _14_InputOutput()
    {

    }


    public static void inputStringKeyboard()
    {
        //create scanner for input capture
        Scanner scnr = new Scanner(System.in);
        //Above is functionally the same as below. The empty space could
        //allow for a string up to the first instance of a space or other char
        //Scanner scnr = new Scanner(System.in).useDelimiter("\\s* \\s*");

        //saves next word
        String usrWordInput;

        //save next line
        String usrLineInput;

        int loopCount = 3;
        //save words and lines to array
        String[] wordArr = new String[loopCount];
        String[] linesArr = new String[loopCount];

        for(; loopCount > 0; --loopCount)
        {
            //captures next word
            System.out.print("Enter one word: ");
            usrWordInput = scnr.next();
            wordArr[loopCount-1] = usrWordInput;
            //renew the scanner
            scnr = new Scanner(System.in);
            //captures next line
            System.out.print("Enter more than one word: ");
            usrLineInput = scnr.nextLine();
            linesArr[loopCount-1] = usrLineInput;
        }
        //prints out the contents of array as a list
        System.out.println(Arrays.stream(wordArr).toList());
        System.out.println(Arrays.stream(linesArr).toList());
    }

    public static void inputNonStringLiteral()
    {
        //create scanner for input capture
        Scanner scnr = new Scanner(System.in);

        //saves next int
        Integer usrIntInput;
        Integer loopCount;

        //Gets from user how many numbers to enter
        System.out.print("Enter how many numbers would you like to enter: ");

        //sets how many loops to get numbers
        loopCount = scnr.nextInt();

        //save words and lines to array
        Integer[] intArr = new Integer[loopCount];
        try {
            for (; loopCount > 0; --loopCount) {
                //captures next word
                System.out.print("Enter one number: ");
                usrIntInput = scnr.nextInt();
                intArr[loopCount - 1] = usrIntInput;
            }
            //prints out the contents of array as a list
            System.out.println(Arrays.stream(intArr).toList());
        }catch(InputMismatchException exception)
        {
            System.out.println("Invalid input. Try again." + exception);
            inputNonStringLiteral();
            //do not put any more code after the recursion call!
        }
    }

    public static void inputFile() throws IOException
    {
        //counts lines of input file to load array later
        int lineCount = 0;
        //declare empty files to hold input lines from txt file.
        //file scans only get read once, so need two for repeat purpose
        Scanner fileScan;
        //creates stream from file
        FileInputStream fis = null;
        try {
            //this is the part that could throw an exception if file does not exist
            //this block shows use of while loop
            fis = new FileInputStream("fileInput/aLightInTheMoon.txt");
            fileScan = new Scanner(fis);
            //loop to get line count
            while (true) {
                if (!fileScan.hasNext()) {
                    break;
                }
                ++lineCount;
                //fileScan like all scanned files, must be spent once
                System.out.println(lineCount + ". " + fileScan.nextLine());
            }

            //reassign stream and scan values to load scanned lines into array
            fis = new FileInputStream("fileInput/aLightInTheMoon.txt");
            fileScan = new Scanner(fis);
            //declare string array
            poemLineArr = new String[lineCount];
            //assign lines as strings to array
            for(int i = 0; i < lineCount; i++)
            {
                poemLineArr[i] = i + 1 + ". " + fileScan.nextLine();
                System.out.println(poemLineArr[i]);
            }
            //close stream and scanner
            fis.close(); fileScan.close();
            //catch error if file name wrong
        } catch (IOException exception) {
            System.out.println("File is missing. Check again.");
            inputFile();
        }
    }

    public static void outputFile() throws FileNotFoundException
    {
        try {
            //create output stream object
            FileOutputStream fileOut = new FileOutputStream("fileOutput/outputFile.txt");
            //assign stream data to printwriter object
            PrintWriter pw = new PrintWriter(fileOut);
            //write contents of each array item to external output file
            for (String line : poemLineArr) {
                pw.println(line);
            }
            //close stream
            pw.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("\"Output file not found. Try again.");
            outputFile();
        }
    }
}
