public class Program
{
    //DECLARE VARIABLES

    public String name;

    private String privateName;


    public static void main(String[] args)
    {

        //_1_Instantiation inst = new _1_Instantiation();

        //_2_StaticInstanceMembers sim = new _2_StaticInstanceMembers();
        //System.out.println("myStaticString: " + _2_StaticInstanceMembers.myStaticString);
        //System.out.println("myInstanceString: " + sim.myInstanceString);

        //_3_Precedence precedence = new _3_Precedence();

        //_4_Arrays arrays  = new _4_Arrays();

        //_5_Switch switch = new _5_Switch();

        //_7_Inheritance inheritance = new _7_Inheritance();

        _8_ImplementsInterface lizard = new _8_ImplementsInterface() {
            @Override
            public void myInterfaceMethod1_idle()
            {
                System.out.println("In my unique way, I am an IDLING LIZARD.");
            }

            @Override
            public void myInterfaceMethod2_walk()
            {
                System.out.println("In my unique way, I am a WALKING LIZARD.");
            }

            @Override
            public void myInterfaceMethod3_run()
            {
                System.out.println("In my unique way, I am a RUNNING LIZARD.");
            }
        };

        lizard.myInterfaceMethod1_idle();


        //_8_ImplementsChild_Human human = new _8_ImplementsChild_Human();

        //_10_ArrayStringObjectMethods asom = new _10_ArrayStringObjectMethods();



    }

    //DECLARE METHODS


    void myMethod()
    {

    }
}
