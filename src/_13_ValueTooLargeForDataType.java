// Class that extends an existing Exception class as super-class with a constructor that inherits
// the members of the suepr-class using the super(arg) built-in method
public class _13_ValueTooLargeForDataType extends IllegalArgumentException
{
    //This contructor of 1 String parameter will match its parent parameter constructor
    //super(errMsg) inherits all code in the constructor and all instance members required
    public _13_ValueTooLargeForDataType(String errMsg)
    {
        super(errMsg);
    }
}
