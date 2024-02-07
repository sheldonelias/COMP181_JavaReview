public class _2_VariablesMethods
{
    //INSTANCE VARIABLE DECLARATION AND INITIALIZATION
    int myInstanceVariableInt = -1;

    int myInstanceVariableInClassInt = 1007;

    String myInstanceVariableString = "hello instance";

    //STATIC VARIABLE DECLARATION AND INITIALIZATION
    static String myStaticVariableString = "hello static";

    //INSTANCE METHOD EXAMPLE
    void myInstanceMethod()
    {
        //LOCAL VARIABLE DECLARATION AND INITIALIZATION
        int myLocalVariableInt = 1;
        String myLocalVariableString = "hello we are in an instance method";

        System.out.println(myLocalVariableString);

    }

    static void myStaticMethod()
    {
        //LOCAL VARIABLE DECLARATION AND INITIALIZATION
        int myLocalVariableInt = 1;
        String myLocalVariableString = "hello we are inside a static method";

        System.out.println(myLocalVariableString);
    }

    //CONSTRUCTOR METHOD
    //When parameter parenthesis are empty, called a default constructor
    //If no default is written, the compiler creates automatically
    _2_VariablesMethods()
    {
        System.out.println("I am in the Default Constructor");
    }

    _2_VariablesMethods(String str)
    {
        System.out.println("I am in the Alternative Constructor and here is my parameter: " + str);
    }
}
