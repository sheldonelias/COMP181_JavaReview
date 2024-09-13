import java.util.Arrays;

public class _7a_Object_Methods
{

    String str1 = "hello";

    String str2 = "hello";


    Program p1 = new Program();

    Program p2 = new Program();

    Integer iWrapped = 1;
    Integer jWrapped = 1;


    int[] intArr = { 10, 20, 30, 13 };

    short[] shortArr = { 10, 20, 30, 13 };




    _7a_Object_Methods()
    {


        p2 = p1;

        int i = 1;
        int j = 1;



        System.out.println(iWrapped == jWrapped);

        System.out.println(iWrapped.equals(jWrapped));


        int[] intArrCopy = Arrays.copyOf(intArr, intArr.length + 1);

        short[] shortArrCopy = Arrays.copyOfRange(shortArr, 1, 6);



    }

}
