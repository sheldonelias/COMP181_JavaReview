import javax.xml.datatype.DatatypeConfigurationException;
import java.util.zip.DataFormatException;

public class _15_TestDriven
{
    //tests() contains all tests for the class
    public static void tests() throws Exception {
        //System.out.println(absValIntTest());
        System.out.println(arithmeticOperationsTest());

    }
    //absValIntTest() will run the test for absValInt()
    public static String absValIntTest()
    {
        String result = "Unexpected error";
        //expected desired result
        if (absValInt(-1) >= 0)
        {
            result = "Pass";
            //If there are some possible "Unexpected errors," send that to else case
            //and then move up Expected error to case
        } else //if there are more than one expected error, use else ifs
            result = "Expected error";
        return result;
    }

    public static String arithmeticOperationsTest() throws Exception {
        String result = "Unexpected error";

        //TEST VALUES HERE: Try inputing combos of positive and negative values to test.
        int i = -1, j = -1, k = -2;

        if (arithmeticOperations(i, j, k) >= 0 &&
                arithmeticOperations(i, j, k) % 1 == 0)
        {
            result = "Pass";
            //If there are some possible "Unexpected errors," send that to else case
            //and then move up Expected error to case
        } else //if there are more than one expected error, use else ifs
            result = "Expected error";
        return result;
    }

    //absValInt() is the method that will hold the final code
    //in the class for the operation
    public static int absValInt(int i)
    {
        //Notice the preset result is set to error val -1
        //Start with a guaranteed fail value
        int result = -1;
        //result = Math.abs(i); //uncomment when ready to test expected values
        return result;
    }

    //More advanced version
    //Operation must take the sum of square root of i and k,
    //to the kth power. arithmeticOperations() MUST return
    //Positive number that is not a fraction.
    public static float arithmeticOperations(int i, int j, int k) throws Exception {
        float result = -.1f;

        //TODO: Add code that will notify invalid parameters... use Exceptions
        try
        {
            if (i < 0 || j < 0)
            {
                throw new Exception();
            }

        } catch(Exception ex)
        {
            System.out.println("i or j value is not > 0");
        }

        try
        {
            if(k < 0)
            {
                throw new Exception();
            }
        }catch(Exception ex)
        {
            System.out.println("k value is not a Natural number");
        }

        //TODO: ADD code that will process arithmetically correct

        float subResult = (float) (Math.sqrt(i) + Math.sqrt(j));
        result = (float) Math.pow(subResult,k);

        return result;
    }

}