import java.util.ArrayList;

public class _12_Recursion
{
    //Summation of a list of numbers by recursion from slides
    static int recursionCountIn = 0;
    static int sumList = 0;
    static int sumMyList(ArrayList<Integer> myList, int size)
    {
        //Base case, runs last going down the recursion, and first coming out of the recursion
        //pulling off of the stack in Last In First Out order aka LIFO
        if(size <= 0)
        {
            return 0;
            //Recursive case, runs every recursive time except for the last time before the stack is unstacked
        } else
            sumList += myList.get(size - 1);
            System.out.println("recursionCount: " + recursionCountIn++ + ", myList.get(" + (size-1) + "): "
            + myList.get(size - 1) + ", sum: " + sumList);

            return myList.get(size - 1) + sumMyList(myList, size-1);
    }

    //Define iteration count externally to method
    static int iterationCount = 0;
    static String iterateWordReverse(String str)
    {
        //Define returnable value
        String reverseStr = "";

        //Report first iteration going into loop when returnable value is empty
        System.out.println("iterationCount: " + iterationCount + " | " + reverseStr);

        //ITERATIVE CASE: As long as i >= 0 evaluates true, loop iterates. A false state stops it.
        for(int i = str.length()-1; i >= 0; --i)
        {
            //Report each iteration into loop as returnable value fills
            iterationCount++;
            reverseStr += str.charAt(i);
            System.out.println("iterationCount: " + iterationCount + " | " + reverseStr);

        }

        //Return final value
        return reverseStr;
    }

    //Define iteration count externally to method
    //NOTICE: Print out IS IN REVERSE OF EXECUTION becuase of LIFO
    static int recurseCount = 0;
    static String recurseWordReverse(String str)
    {
        //Define returnable value
        String reverseStr = "";

        //NOTICE: BASE CASE is opposite of the condition that permits continuing iterative loop above
        //This case runs last! But prints first. Proving LIFO. Last In First Out.
        //str.length starts with 5 characters and goes down to 0

        //DEFINE BASE CASE that will terminate recursion. BASE CASE is a HALTING CASE
        if(str.length() <= 0) //same as if (str.isEmpty())
        {
            reverseStr += str;

            System.out.println("A | recurseCount: " + recurseCount + " | " + reverseStr);
            recurseCount++;
        //RECURSIVE CASE calls on itelf leaving a marker in the cache stack before completing the call.
        }else
        {
            //Calling Function Recursively
            System.out.println("-----");
            System.out.println("System.out.println(str.substring(1)): " + str.substring(1));
            System.out.println("str.charAt(0): " + str.charAt(0));
            //Notice the substring keeps getting shorter with each recursion
            reverseStr += recurseWordReverse(  str.substring(1)  ) + str.charAt(0);

            //System.out.println("reverseStr: " + reverseStr);
            System.out.println("B | recurseCount: " + recurseCount  + " | reverseStr: " + reverseStr);
            recurseCount++;
        }
        return reverseStr;
    }


    public static int sumIteratePos(int k)
    {
        //Initializes the return variable value
        int sum = 0;
        //Loops through a summation from 0 to k inclusive.
        for(int i = k; i > 0; --i)
        {
            sum += i;
            System.out.println("sumIteratePos() i=" + i + " | sum: " + sum);
        }

        return sum;
    }



    static int sum = 0;
    public static int sumRecursePos(int k)
    {
        //Sets the RECURSIVE CASE to be repeated for each recursion
        if (k > 0) {
            sum += k;
            System.out.println("sumRecursePos() k=" + k + " | sum:  " + sum);
            int nextInt = k - 1;
            return k + sumRecursePos(nextInt);

        //Sets the BASE CASE when to stop the recursion and consecutively
        //complete the postponed code for each recursion in last in first out
        //LIFO order.
        } else
        {
            return 0;
        }
    }
}

