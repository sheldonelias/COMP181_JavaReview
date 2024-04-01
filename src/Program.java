import java.io.IOException;
import java.util.ArrayList;

public class Program
{
    //DECLARE VARIABLES

    public String name;

    private String privateName;


    //MAIN DIVIDES VARIABLES FROM METHODS
    public static void main(String[] args) throws IOException {

        //_1_Instantiation inst = new _1_Instantiation();

        //_2_StaticInstanceMembers sim = new _2_StaticInstanceMembers();
        //System.out.println("myStaticString: " + _2_StaticInstanceMembers.myStaticString);
        //System.out.println("myInstanceString: " + sim.myInstanceString);

        //_3_Precedence precedence = new _3_Precedence();

        //_4_Arrays arrays  = new _4_Arrays();

        //_5_Switch switch = new _5_Switch();

        //_7_Inheritance inheritance = new _7_Inheritance();

        //_8_ImplementsChild_Human human = new _8_ImplementsChild_Human();

        //_9_AbstractClassChild child = new _9_AbstractClassChild();
        //child.method2();
        //child.method3();

        //_10_ArrayStringObjectMethods asom = new _10_ArrayStringObjectMethods();

        //_11A_ArrayLists_Generics alg = new _11A_ArrayLists_Generics();



        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(5); //index 0
        integerArrayList.add(4); //index 1
        integerArrayList.add(3); //index 2
        integerArrayList.add(2); //index 3
        integerArrayList.add(1); //index 4

        //_12_Recursion.sumMyList(integerArrayList, integerArrayList.size());

        //_12_Recursion.iterateWordReverse("Hello!");

        //_12_Recursion.recurseWordReverse("Hello!");

        //_12_Recursion.sumIteratePos(5);

        //_12_Recursion.sumRecursePos(5);

        //_13_Exceptions.arrayIndexOutOfBounds();
        // must cast each argument to a byte type for this example to run
        //_13_Exceptions.productValueTooLarge((byte) 5, (byte) 5);

        //_14_InputOutput.inputFile();
        //_14_InputOutput.outputFile();
        //_14_InputOutput.inputStringKeyboard();
        //_14_InputOutput.inputNonStringLiteral();

        _15_TestDriven.test();
    }

    //DECLARE METHODS


    void myMethod()
    {

    }
}
