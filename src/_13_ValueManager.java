// Class for checking if value is an error or not (a boolean condition)
public class _13_ValueManager
{
    static public _13_ValueManager checkByteValue(long l)
    {
        // Check for byte size
        if(l >= -128 && l <= 127)
        {
            System.out.println("Value is a byte.");
            return null;
        }else
        {
            throw new _13_ValueTooLargeForDataType("Value out of range for byte: " + l);
        }
    }

}
