import java.util.Scanner;

public class _13_Exceptions
{

    //Java has built in Exceptions. Two kinds. Checked and unchecked. Checked are for compile time errors,
    //which are usually the compiler's business (aka IntelliJ). We focus on the unchecked exceptions,
    //those that are only possible to catch while program is running.

    //This one checks if the requested index in an iterable structure, such as an array actually exists in the
    //structure. It is checking if the index is in or out of bounds.

    public static void arrayIndexOutOfBounds() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an index number for the name you are seeking: ");
        int index = scnr.nextInt();
        String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };

        //Compiler in run time tries this part first
        try
        {
            System.out.println(", Name: " + names[index]);
            System.out.print("Entry was valid at index: " + index);
        }
        //This code that runs if there is an error. This part runs instead of the program crashing.
        //The catch part will trigger a text message to be sent through the excptObj.getMessage() method.
        catch(ArrayIndexOutOfBoundsException excptObj)
        {
            System.out.println("\nException! " + excptObj.getMessage());

            //This part just augments the message printout above.
            if (index < 0) {
                System.out.println("The closest name is: " + names[0]);
            }
            else {
                System.out.println("The closest name is: " + names[9]);
            }
        }
    }

    //left operand is the dividend and the right operand is the divisor.
    public static void divideByZeroCheck() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = Integer.parseInt( scnr.next() );
        System.out.print("\nEnter divisor: ");
        int divisor = Integer.parseInt( scnr.next() );

        //Compiler in run time tries this part first
        try
        {
            System.out.println("Quotient: " + dividend/divisor);
        }
        //This code that runs if there is an error. This part runs instead of the program crashing.
        //The catch part will trigger a text message to be sent through the excptObj.getMessage() method.
        catch( ArithmeticException excptObj )
        {
            System.out.println("Exception! " + excptObj.getMessage());
            System.out.println("Try again.");
            divideByZeroCheck();
        }
    }

    //Make your own Exception example.
    //Java does not have an Exception for catching value overflow for data types.
    //The method is designed for below is designed to find out if when tow numbers
    //are multiplied, the product is within the range of a byte (-128 to 127)
    static public void productValueTooLarge(byte factor, byte multiplier) throws _13_ValueTooLargeForDataType
    {
        try
        {
            //Don't fret about sign change. That's quirky feature of converting from byte to long types.
            _13_ValueManager.checkByteValue(-(factor * multiplier));
            System.out.println("factor * multiplier = " + factor * multiplier);
        }
        catch (_13_ValueTooLargeForDataType e)
        {
            System.out.print("Bad! Here is why: " + e.getMessage());
        }
    }
}

