import java.io.IOException;
import java.util.List;

//test message

public class Program
{
    //DECLARE VARIABLES

    int myInstanceVariableInt = -1;

    int myInstanceVariableInClassInt = 1007;

    String myInstanceVariableString = "hello instance";

    public String name;

    private String privateName;

    //STATIC VARIABLE DECLARATION AND INITIALIZATION
    static String myStaticVariableString = "hello static";



    //MAIN DIVIDES VARIABLES FROM METHODS
    public static void main(String[] args) throws Exception {


        Program p = new Program();

        //System.out.println(p.myInstanceVariableString);


        //Getting access to instance variable values in a static context
        _1_Instantiation inst = new _1_Instantiation();
        System.out.println(inst.instanceVar);

        //Getting access to static values in static context
        System.out.println(   _1_Instantiation.staticVar    );

        //_2_StaticInstanceMembers sim = new _2_StaticInstanceMembers();
        //System.out.println("myStaticString: " + _2_StaticInstanceMembers.myStaticString);
        //System.out.println("myInstanceString: " + sim.myInstanceString);

        //_3_Precedence precedence = new _3_Precedence();

        //_4_Arrays arrays  = new _4_Arrays();

        //_5_Switch switch = new _5_Switch();

        //_7_Inheritance inheritance = new _7_Inheritance();

        //_8_ImplementsChild_Human human = new _8_ImplementsChild_Human();

        //_16_AbstractClassChild child = new _16_AbstractClassChild();
        //child.method2();
        //child.method3();

        //_10_ArrayStringObjectMethods asom = new _10_ArrayStringObjectMethods();

        //_13_Exceptions.arrayIndexOutOfBounds();
        // must cast each argument to a byte type for this example to run
        //_13_Exceptions.productValueTooLarge((byte) 50, (byte) 5);

        //_14_InputOutput.inputFile();
        //_14_InputOutput.outputFile();
        //_14_InputOutput.inputStringKeyboard();
        //_14_InputOutput.inputNonStringLiteral();

        //_15_TestDriven.tests();

        //DOES NOT WORK, AS IT IS NOT SUPPOSED TO WORK
        //_16_AbstractClass ac = new _16_AbstractClass();

        /*
        _16_AbstractClass ac = new _16_AbstractClass() {
            @Override
            public void method1() {
                super.method1();
                System.out.println("Overridden method1() from instance.");
            }
        };
        */


        //ac.method1();

        //_16_AbstractClassChild acc = new _16_AbstractClassChild();

        //acc.method3();

        //_17_Interfaces_EnglishSpeaker ies = new _17_Interfaces_EnglishSpeaker();

        //ies.sayParting();

        //_17_Interfaces_PortugueseSpeaker ips = new _17_Interfaces_PortugueseSpeaker();

        //ips.sayParting();


    }

    //DECLARE METHODS


    void myMethod()
    {

    }
}
